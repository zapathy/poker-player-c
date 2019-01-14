package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

public class Player {

    static final String VERSION = "0.4";

    public static int betRequest(@NotNull JsonElement request) {
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
