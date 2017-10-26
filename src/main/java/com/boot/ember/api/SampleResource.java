package com.boot.ember.api;

import com.boot.ember.model.Director;
import com.boot.ember.model.ShortFilm;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class SampleResource {

    @RequestMapping(value = "/api/shorts", method = RequestMethod.GET)
    public List<ShortFilm> getShorts() {
        return dummy_movies();
    }

    private List<ShortFilm> dummy_movies() {
      List<ShortFilm> list = new ArrayList<>();
      list.add(comeTogether());
      list.add(theGarden());
      list.add(olafsFrozen());
      list.add(zygote());
      list.add(deadpool());
      return list;
    }

    private ShortFilm comeTogether() {
    	
      return new ShortFilm("Come Together: A Fashion Picture in Motion", "https://images-na.ssl-images-amazon.com/images/M/MV5BZDc3M2VkZWMtM2NkNS00N2NmLTgxNzMtZGY5MGZiMjgyNjJlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNTk5MDMzODc@._V1_UY268_CR116,0,182,268_AL_.jpg",
        "Lone passengers are traveling to join their loved ones for the Christmas holiday, but winter weather conspires to way-lay them.",
        7.5, "http://www.imdb.com/title/tt6282412/", 2016, Arrays.asList("Drama", "Comedy", "History"), "4min",
        Arrays.asList("Wes Anderson"), Arrays.asList("Richard Thomas" , "Tim Reid", "Annette O`Toole"),
        directors(Arrays.asList(directorFromString("Wes Anderson"))),
        "https://www.youtube.com/embed/VDinoNRC49c?modestbranding=1");
    }
    private ShortFilm theGarden() {
        return new ShortFilm("The Garden", "https://images-na.ssl-images-amazon.com/images/M/MV5BNDQyZTU1ZmMtNTg2Yy00ZTlmLTgxMzAtMmJkOTE3YzBmNmY2XkEyXkFqcGdeQXVyNDgyNDU4NDI@._V1_SY1000_CR0,0,714,1000_AL_.jpg",
          "In the Garden, humans get converted into A.I. constructs to survive. But Luc - a rebellious ballerina - would rather die than conform.",
          6.9, "http://www.imdb.com/title/tt5097916/", 2016, Arrays.asList("Fantasy", "Mistery"), "14min",
          Arrays.asList("Dmitry Iyudin, Natalia Iyudin"), Arrays.asList("Ginger Eckert, Shruti Ganguly, Heather Hollingsworth"), 
          directors(Arrays.asList(directorFromString("Natalia Iyudin"))),
          "https://www.youtube.com/embed/gI2Jy2DcKMQ?modestbranding=1");
      }
    private ShortFilm olafsFrozen() {
        return new ShortFilm("Olaf's Frozen Adventure", "https://images-na.ssl-images-amazon.com/images/M/MV5BMjQzNzA5NDEwOF5BMl5BanBnXkFtZTgwNTU0MjE2MjI@._V1_UX182_CR0,0,182,268_AL_.jpg",
          "A Christmas-themed special featuring characters from the Walt Disney Pictures film, 'Frozen'.",
          7.9, "http://www.imdb.com/title/tt5452780/", 2017, Arrays.asList("Animation", "Adventure"), "22min",
          Arrays.asList("Chris Buck"), Arrays.asList(" Kristen Bell, Josh Gad, Jonathan Groff"), 
          directors(Arrays.asList(directorFromString("Kevin Deters"), directorFromString("Stevie Wermers"))),
          "https://www.youtube.com/embed/hb8WDATVB6A?modestbranding=1");
      }
    private ShortFilm zygote() {
        return new ShortFilm("Zygote", "https://images-na.ssl-images-amazon.com/images/M/MV5BYzE2NDdlODYtMTc4My00OTljLTlmZTktNjM2NjA3YzliZTMyXkEyXkFqcGdeQXVyNjMxMDgyNzQ@._V1_UY268_CR3,0,182,268_AL_.jpg",
          "Stranded in an Arctic mine, two lone survivors are forced to fight for their lives, evading and hiding from a new kind of terror.",
          6.2, "http://www.imdb.com/title/tt7078780/", 2017, Arrays.asList("Sci-Fi", "Horror"), "23min",
          Arrays.asList("Neill Blomkamp, Thomas Sweterlitsch"), Arrays.asList("Jose Pablo Cantillo, Dakota Fanning"), 
          directors(Arrays.asList(directorFromString("Neill Blomkamp"))),
          "https://www.youtube.com/embed/pKWB-MVJ4sQ?modestbranding=1");
      }
    private ShortFilm deadpool() {
        return new ShortFilm("Deadpool: No Good Deed", "https://images-na.ssl-images-amazon.com/images/M/MV5BODAxNDFhNGItMzdiMC00NDM1LWExYWUtZjNiMGIzYTc0MTM5XkEyXkFqcGdeQXVyMjYzMjA3NzI@._V1_UY268_CR3,0,182,268_AL_.jpg",
          "Deadpool sees an opportunity to save the day, but it doesn't go entirely as planned.",
          8.2, "http://www.imdb.com/title/tt6612630/", 2017, Arrays.asList("Comedy", "Sci-Fi"), "4min",
          Arrays.asList("Rhett Reese"), Arrays.asList("Stan Lee, Ryan Reynolds"), 
          directors(Arrays.asList(directorFromString("David Leitch"))),
          "https://www.youtube.com/embed/Z5ezsReZcxU?modestbranding=1");
      }
    
    private Director directorFromString(String string){
    	return new Director(string);
    }
    
    private Set<Director> directors(List<Director> dir){
    	return new HashSet<Director>(dir);
    }
}
