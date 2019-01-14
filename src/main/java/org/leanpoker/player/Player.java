package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class Player {

    static final String VERSION = "0.3" ;

    public static int betRequest(JsonElement request) {
        System.err.println(request.toString());
        JsonObject rootObject = request.getAsJsonObject();
        System.err.println(rootObject.get("tournament_id"));
        JsonArray players = rootObject.getAsJsonArray("players");
        System.err.println("players: "+players);


        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
