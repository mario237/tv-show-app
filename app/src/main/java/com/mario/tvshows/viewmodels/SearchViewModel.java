package com.mario.tvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mario.tvshows.repositories.SearchTVShowRepository;
import com.mario.tvshows.responses.TVShowResponse;

public class SearchViewModel extends ViewModel {

    private SearchTVShowRepository searchTVShowRepository;

    public SearchViewModel(){
        searchTVShowRepository = new SearchTVShowRepository();
    }

    public LiveData<TVShowResponse> searchTVShow(String query , int page){
        return searchTVShowRepository.searchTVShow(query , page);
    }
}
