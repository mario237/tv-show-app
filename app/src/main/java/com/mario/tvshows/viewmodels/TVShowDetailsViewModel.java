package com.mario.tvshows.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.mario.tvshows.repositories.TVShowDetailsRepository;
import com.mario.tvshows.responses.TVShowDetailsResponse;
import com.mario.tvshows.responses.TVShowResponse;

public class TVShowDetailsViewModel extends ViewModel {

    private TVShowDetailsRepository tvShowDetailsRepository;

    public TVShowDetailsViewModel() {
        tvShowDetailsRepository = new TVShowDetailsRepository();
    }

    public LiveData<TVShowDetailsResponse> getTVShowDetails (String tvShowId){
        return tvShowDetailsRepository.getTVShowDetails(tvShowId);
    }

}
