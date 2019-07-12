package com.cinder;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import sun.misc.Request;

import java.util.List;
import java.util.ArrayList;

@RestController
public class DatingController {
    private int dislikeId = 1;
    private int peopleId = 1;
    private List<Dislikes> dislikeList= new ArrayList<>();
    private List<People> peopleList = new ArrayList<>();
    private Profile profile;

    public DatingController() {
        this.dislikeList.add(new Dislikes(dislikeId++, 1));
        this.dislikeList.add(new Dislikes(dislikeId++, 3));
        this.peopleList.add(new People(peopleId++, "Sam", 25, "I am Sam"));
        this.peopleList.add(new People(peopleId++, "Sue", 27, "I like Reiki and beach yoga. I love my cat and all energies on all ephemeral planes."));
        this.peopleList.add(new People(peopleId++, "Tony", 24, "I fix cars, weld, and do jazzercise."));
        this.peopleList.add(new People(peopleId++, "Simone", 33, "I am a jazz singer and travel extensively to perform. Looking for someone who can keep up with my schedule."));
        this.peopleList.add(new People(peopleId++, "Tara", 25, "I am super energetic. Always hiking, biking, skating, running, and on adventures. Come join me!"));
        this.peopleList.add(new People(peopleId++, "Selena", 25, "I am from Ecuador and am new to town. I would love a friend to explore the city with."));
        this.profile = new Profile(1, 3, 5, 2, 1, 5, 2, 4, 3, 4, 1);
    }

// GET /api/match
// Update your GET /api/match route such that it returns all people who are not in the dislike list.
    @RequestMapping(value="/api/match", method= RequestMethod.GET)
    public List<People> getMatch() {
        List<People> likedPeople = new ArrayList<>();
        for(int x = 0; x < this.peopleList.size(); x++) {
            for(int y = 0; y < this.dislikeList.size(); y++) {
                if(!(this.peopleList.get(x).getId() == this.dislikeList.get(y).getPersonId())) {
                    likedPeople.add(this.peopleList.get(x));
                }
            }
        }
        return likedPeople;
    }

    @RequestMapping(value="/api/profile", method=RequestMethod.GET)
    public Profile getProfile() {
        return this.profile;
    }

    @RequestMapping(value="/api/dislike", method= RequestMethod.POST)
    @ResponseStatus(value=HttpStatus.CREATED)
    public Dislikes addDislike(@RequestBody Dislikes dislike) {
        dislike.setId(this.dislikeId++);
        dislikeList.add(dislike);
        return dislike;
    }

    @RequestMapping(value="/api/profile", method=RequestMethod.PUT)
    @ResponseStatus(value=HttpStatus.NO_CONTENT)
    public Profile updateProfile(@RequestBody Profile profile1) {
        this.profile = profile1;
        return this.profile;
    }
}
