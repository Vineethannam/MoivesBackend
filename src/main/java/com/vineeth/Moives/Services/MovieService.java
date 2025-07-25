package com.vineeth.Moives.Services;

import com.vineeth.Moives.Model.Movie;
import com.vineeth.Moives.Repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }
    public Movie singleMovie(String id){
        Optional<Movie> movie = movieRepository.findMovieByImdbId(id);
        return movie.orElse(null);
    }

}
