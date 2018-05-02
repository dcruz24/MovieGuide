package edu.illinois.cs.cs125.movieguide;

import com.google.gson.annotations.SerializedName;
import java.util.List;

    public class Movie {
        private String title;
        @SerializedName("poster_path")
        private String poster;
        @SerializedName("overview")
        private String description;
        @SerializedName("backdrop_path")
        private String backdrop;

        public Movie() {
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getPoster(){
            return "https://image.tmdb.org/t/p/w500" + poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }

        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public String getBackdrop() {
            return "https://image.tmdb.org/t/p/w500" + backdrop;
        }

        public void setBackdrop(String backdrop) {
            this.backdrop = backdrop;
            }
            public static class MovieResult {
            private List<Movie> results;
            public List<Movie> getResults() {
                return results;
            }
    }
}