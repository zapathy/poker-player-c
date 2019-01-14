package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Player {

    static final String VERSION = "0.3" ;

    public static int betRequest(JsonElement request) {
        System.err.println(request.toString());
        JsonObject rootObject = request.getAsJsonObject();
        System.err.println(rootObject.get("tournament_id"));
        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
