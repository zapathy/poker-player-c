package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Player {

    static final String VERSION = "0.2" ;

    public static int betRequest(JsonElement request) {
        System.err.println(request.toString());
        JsonParser parser = new JsonParser();
        System.err.println(parser);
        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
