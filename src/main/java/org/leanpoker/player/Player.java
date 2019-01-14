package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Player {

    static final String VERSION = "0.5";

    public static int betRequest(JsonElement request) {
        System.err.println("new version 21ht190h3490h90gth3w-5g09h3904");
        String ranks = "";
        JsonObject rootObject = request.getAsJsonObject();
        JsonArray players = rootObject.getAsJsonArray("players");
        for (JsonElement playersElement : players
        ) {
            JsonObject playersObject = playersElement.getAsJsonObject();
            if (playersObject.getAsJsonPrimitive("name").getAsString().equals("C")) {
                JsonElement cardsElement = playersObject.getAsJsonArray("hole_cards");
                JsonArray cardsArray = cardsElement.getAsJsonArray();
                for (JsonElement card: cardsArray
                     ) {
                    JsonObject cardAsObject = card.getAsJsonObject();
                    JsonPrimitive rank = cardAsObject.getAsJsonPrimitive("rank");
//                    System.err.println("rank: " + rank);
                    ranks+=rank.getAsString();
                }
            }
        }
        System.err.println(ranks);


        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
