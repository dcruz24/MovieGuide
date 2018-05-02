package edu.illinois.cs.cs125.movieguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity{

    private RecyclerView mRecyclerView;
    private MoviesAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        mRecyclerView= findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mAdapter = new MoviesAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
//        getPopularMovies();
        List<edu.illinois.cs.cs125.movieguide.Movie> movies = new ArrayList<>();
        for (int i = 0; i < 25; i++){
            movies.add(new edu.illinois.cs.cs125.movieguide.Movie());
        }
        mAdapter.setMovieList(movies);
        }


//        private void getPopularMovies() {
//RestAdapter restAdapter = new RestAdapter.Builder()
//        .setEndpoint("http://api.themovieb.org/3")
//        .setRequestInterceptor(new RequestInterceptor() {
//            @Override
//            public void intercept(RequestFacade request) {
//            request.addEncodedPathParam("api_Key", "7cf96f91c757016564c0f13821773bbf");
//            }
//            })
//        .setLogLevel(RestAdapter.LogLevel.FULL)
//                    .build();
//            MoviesApiService service = restAdapter.create(MoviesApiService.class);
//            service.getPopularMovies(new Callback<edu.illinois.cs.cs125.movieguide.Movie.MovieResult>() {
//                @Override
//                public void success(edu.illinois.cs.cs125.movieguide.Movie.MovieResult movieResult, Response response) {
//                 mAdapter.setMovieList(movieResult.getResults());
//                }
//                @Override
//                public void failure(RetrofitError error) {
//                 error.printStackTrace();
//                }
//            });
//        }
//        @Override
//            public boolean onCreateOptionsMenu (Menu menu) {
//getMenuInflater().inflate(R.menu.menu_main, menu);
//    return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if(id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

public static class MovieViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public MovieViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
}
