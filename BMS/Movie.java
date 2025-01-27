package BMS;
//import statement for the Localdate cls.
import java.time.LocalDate;

public class Movie {//movie pojo class
    private Show show;//Show instance
    private Screen screen;//Screen Insatnce
    private Theatre theatre;//theatre instance
//    private int duration;//duration of the movie
    private String movieName;//name of the movie
    private LocalDate startDate;//starting date of the movie
    private String loc;//location of the movie

    //construction to initialize the moviename, location,duration,startdate,theatre,screen,show .
    public Movie(String movieName, String loc, LocalDate startDate,Theatre theatre,Screen screen,Show show){
        this.movieName=movieName;
        this.loc=loc;
//      this.duration=duration;
        this.startDate=startDate;
        this.theatre=theatre;
        this.screen=screen;
        this.show=show;
    }


    //gettors for the moviename, location,duration,startdate,theatre,screen,show .
    public Screen getScreen() {
        return screen;
    }

    public Show getShow() {return show;}

    public Theatre getTheatre() {
        return theatre;
    }

//    public int getDuration() {
//        return duration;
//    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getLoc() {
        return loc;
    }
}
