package org.example.Repository;

import java.util.TreeMap;

public interface PlaylistRepository {
    void findByAmountListen(TreeMap<String, Integer> first, TreeMap<String, Integer> second, TreeMap<String, Integer> third);


}
