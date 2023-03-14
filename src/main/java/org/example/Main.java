package org.example;

import org.example.Service.Service;
import org.example.domain.Playlist;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> russian = new TreeMap<>();
        russian.put("Instasamka-За деньги да", 1000000);
        russian.put("Dj Smash - Позвони", 930000);
        russian.put("Anna Asti - По барам", 900000);
        russian.put("ЛСП - Курточка", 910000);
        russian.put("Anna Asti - Повело", 890000);
        russian.put("1,",russian.values().stream().mapToInt(Integer::intValue).sum());


        TreeMap<String, Integer> popMusic = new TreeMap<>();
        popMusic.put("Miley Syrus - Flowers", 3000000);
        popMusic.put("GAYLE - abcdefu", 2900000);
        popMusic.put("The Weeknd - Is There Someone Else", 2990000);
        popMusic.put("Juice WRLD - Wandered To LA", 2800000);
        popMusic.put("Adele - Easy On Me", 2100000);
        popMusic.put("2,",popMusic.values().stream().mapToInt(Integer::intValue).sum());


        TreeMap<String, Integer> favourite = new TreeMap<>();
        favourite.put("Juice WRLD - Wandered To LA", 2800000);
        favourite.put("Instasamka-За деньги да", 1000000);
        favourite.put("Juice WRLD - In My Head", 2000000);
        favourite.put("LOVV66 -10М ОТ ДОМА ", 500000);
        favourite.put("YNW Melly - Suicidal", 800000);
        favourite.put("3,",favourite.values().stream().mapToInt(Integer::intValue).sum());




        Playlist russianPlaylist = new Playlist(russian);
        Playlist popPlaylist = new Playlist(popMusic);
        Playlist favouritePlaylist = new Playlist(favourite);


        Service result = new Service();
        result.findByAmountListen(russianPlaylist.getPlaylist(),popPlaylist.getPlaylist(),favouritePlaylist.getPlaylist());



    }
}