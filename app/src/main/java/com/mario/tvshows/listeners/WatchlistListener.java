package com.mario.tvshows.listeners;

import com.mario.tvshows.models.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist (TVShow tvShow , int position);
}
