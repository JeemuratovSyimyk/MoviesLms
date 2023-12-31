package org.example.Service;

import org.example.Entity.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movie> movies);
    //-from A to Z
//-from Z to A
    void sortByYear(List<Movie>movies);
    //-Ascending
//-Descending
    void sortByDirector(List<Movie>movies);
}
