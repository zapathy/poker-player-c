package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "0.1" ;

    public static int betRequest(JsonElement request) {
        System.err.println(request);

        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
