package edu.illinois.cs.cs125.movieguide;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.TooltipCompat;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import retrofit.RestAdapter;
import retrofit.RetrofitError;


public class MainActivity extends AppCompatActivity{
    private static final String TAG = "MP7:MovieGuide";

private RecyclerView mRecyclerView;
private MoviesAdapter mAdapter;
private Toolbar mtoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // starts app
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mRecyclerView= findViewById(R.id.recyclerView);
        //
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mAdapter = new MoviesAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        List<Movie> movies = new ArrayList<>();
        // gets top 25 movies
        for (int i = 0; i< 25; i++) {
            movies.add(new Movie());
        }

        RestAdapter restAdapter = new RestAdapter.Builder();
        .setEndpoint("http://api.themovieb.org/3");
        .setRequestInterceptor(); {
            @Override
            public void intercept(RequestFacade request) {
                request.addEncodedQueryParam("api_Key", "7cf96f91c757016564c0f13821773bbf");
            }
        })
        .SetLogLevel(RestAdapter.Loglevel.FULL)
        .build();
         MoviesApiService service = restAdapter.create(MoviesApiService.class);
         service.getPopularMovies(new Callback<Movie.MovieResult>() {
                                      @Override
                                      public void success(Movie.MovieResult movieResult, Resonse response) {
                                          mAdapter.setMovieList(mvoieResult.getResults());
                                      }

                                      @Override
                                      public void failure(RetrofitError error) {
                                          error.printStackTrace();
                                      }
                                  });

    mAdapter.setMovieList(movies);
    }
    }

public static class MovieViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public MovieViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
