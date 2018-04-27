package edu.illinois.cs.cs125.movieguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public static class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
private List<Movie> mMovieList;
private LayoutInflater mInflater;
private Context mContext;

public MoviesAdapter(Context context) {
    mContext = context;
    mInflater = LayoutInflater.from(context);
    mMovieList = new ArrayList<>();
}
    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = mInflater.inflate(R.layout.displayrow_movie, parent, false);
    MovieViewHolder viewHolder = new MovieViewHolder(view);
    return viewHolder;

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = mMovieList.get(position);
        // Use Picasso to load images from internet.
            Picasso.with(mContext)
                    .load(movie.getPoster())
                    .placeholder(R.color.colorAccent)
                    .into(holder.imageView);
        }
        public int getItemCount() {

        return (mMovieList == null) ?0: mMovieList.size();

    }
    public void setMovieList(List<Movie>setMovieList) {
        mMovieList.clear();
        mMovieList.addAll(movieList);
    //adapater needs to know data has changed. Else, app will crash.
    notifyDataSetChanged();
    }
    }
}
