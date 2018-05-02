package edu.illinois.cs.cs125.movieguide;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;

    public class Movie {
        private String title;
        private String poster;
        private String description;
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
            return "http://t2.gstatic.com/images?q=tbn:ANd9GcQW3LbpT94mtUG1PZIIzJNxmFX399wr_NcvoppJ82k7z99Hx6in";
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