package org.example.domain;

import org.example.Repository.PlaylistRepository;


import java.util.*;
import java.util.stream.Collectors;

public class Playlist  {

    private TreeMap<String, Integer> playlist = new TreeMap<>();

    public TreeMap<String, Integer> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(TreeMap<String, Integer> playlist) {
        this.playlist = playlist;
    }

    public Playlist(TreeMap<String, Integer> playlist) {
        this.playlist = playlist;
    }

    public Playlist() {
    }






}
