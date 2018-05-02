package edu.illinois.cs.cs125.movieguide;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {
public static final String EXTRA_MOVIE = "movie";
private Movie mMovie;
ImageView backdrop;
ImageView poster;
TextView title;
TextView description;

protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.displayrow_movie);
    if (getIntent().hasExtra(EXTRA_MOVIE)) {
        mMovie = getIntent().getParcelableExtra(EXTRA_MOVIE);
    }
    else {
        throw new IllegalArgumentException("Detail activity must recieve a movie parcelable");
    }
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    CollapsingToolbarLayout toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
    toolbarLayout.setTitle(mMovie.getTitle());
    backdrop = findViewById(R.id.backdrop);
    title = findViewById(R.id.movie_title);
    description = findViewById(R.id.movie_description);
    poster = findViewById(R.id.movie_poster);
    title.setText(mMovie.getTitle());
    description.setText(mMovie.getDescription());
    Picasso.with(this)
            .load(mMovie.getPoster())
            .into(poster);
    Picasso.with(this)
            .load(mMovie.getBackdrop())
            .into(backdrop);
}
}
