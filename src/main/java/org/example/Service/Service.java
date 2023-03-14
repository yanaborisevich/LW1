package org.example.Service;

import org.example.Repository.PlaylistRepository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Service implements PlaylistRepository {

    @Override
    public void findByAmountListen(TreeMap<String, Integer> first,
                                   TreeMap<String, Integer> second,
                                   TreeMap<String, Integer> third) {

        TreeMap <String,Integer> result = new TreeMap<>();
        result.put("1 плейлист", first.firstEntry().getValue());
        result.put("2 плейлист", second.firstEntry().getValue());
        result.put("3 плейлист",third.firstEntry().getValue());

        List<Map.Entry<String, Integer>> list = result.entrySet().stream()
                .sorted((e1, e2) -> -e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toList());

        System.out.println(list);



    }

}
