package com.boot.ember.api;

import com.boot.ember.model.Short;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class SampleResource {

    @RequestMapping(value = "/api/shorts", method = RequestMethod.GET)
    public List<Short> getShorts() {
        return dummy_movies();
    }

    private List<Short> dummy_movies() {
      List<Short> list = new ArrayList<>();
      list.add(pennywise());
      return list;
    }

    private Short pennywise() {
      return new Short(1, "It", "https://images-na.ssl-images-amazon.com/images/I/51n0RsXCQqL.jpg",
        "In 1960, seven pre-teen outcasts fight an evil demon who poses as a child-killing clown. Thirty years later, they reunite to stop the demon once and for all when it returns to their hometown.",
        6.9, "http://www.imdb.com/title/tt0099864/", 1990, Arrays.asList("Drama", "Fantasy", "Horror"), "3h 12min",
        Arrays.asList("Stephen King"), Arrays.asList("Richard Thomas" , "Tim Reid", "Annette O`Toole"), Arrays.asList("Andy Muschietti"),
        "https://www.youtube.com/embed/Vv6MZ8piuUY");
    }
}
