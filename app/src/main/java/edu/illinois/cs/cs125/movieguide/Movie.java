package edu.illinois.cs.cs125.movieguide;

import com.google.gson.annotations.SerializedName;

public class Movie {
private String title;
private String poster;
private String description;
private String backdrop;

public String getTitle() {
    return title;
}
public void setTitle(String SetTitle) {
    SetTitle = title;
}
public String getPoster() {
    return poster;
}
public void setPoster (String Setposter) {
    Setposter = poster;
}
public String getDescription() {
    return description;
}
public void setDescription(String Setdescription) {
    Setdescription = description;
}
public String getBackdrop() {
    return backdrop;
}
public void setBackdrop (String Setbackdrop) {
    Setbackdrop = backdrop;
}
public static class MovieResult {
    private List<Movie> Results;
    public List<Movie> getResults() {
        return Results;
    }

    public static final TMDB_IMAGE_PATH = "http://image.tmdb.org/t/p/w500";
    private String title;
    @SerializedName("poster_path")
    private String poster;

    @SerializedName("overview")
    private String description;

    @SerializedName("backdrop_path")
    private String backdrop;

    public Movie() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster {
        return TMDB_IMAGE_PATH + poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBackdrop() {
        return TMBD_IMAGE_PATH + backdrop;
    }

    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }

    public static class MovieResult {

    }

}
}
