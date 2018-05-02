package edu.illinois.cs.cs125.movieguide;
import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.picasso.Picasso;
import java.util.List;

public  class MoviesAdapter extends RecyclerView.Adapter<MainActivity.MovieViewHolder> {

    private List<Movie> mMovieList;
private LayoutInflater mInflater;
private Context mContext;

public MoviesAdapter(Context context) {
    mContext = context;
    mInflater = LayoutInflater.from(context);
}
    @Override
    public MainActivity.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = mInflater.inflate(R.layout.displayrow_movie, parent, false);
        MainActivity.MovieViewHolder viewHolder = new MainActivity.MovieViewHolder(view);
    return viewHolder;
}
    @Override
    public void onBindViewHolder(MainActivity.MovieViewHolder holder, int position) {
        Movie movie = mMovieList.get(position);
            Picasso.with(mContext)
                    .load(movie.getPoster())
                    .placeholder(R.color.colorAccent)
                    .into(holder.imageView);
        }
        @Override
        public int getItemCount() {
        return (mMovieList == null) ?0: mMovieList.size();
        }
    public void setMovieList(List<Movie>movieList){
        mMovieList.clear();
        mMovieList.addAll(movieList);
    notifyDataSetChanged();
    }
}