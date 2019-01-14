package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "0.1" ;

    public static int betRequest(JsonElement request) {
        System.err.println(request.getAsJsonArray());
        System.err.println(request.getAsJsonObject());
        System.err.println(request.getAsJsonPrimitive());
        System.err.println(request.getAsJsonNull());

        return 1500;
    }

    public static void showdown(JsonElement game) {
    }
}
