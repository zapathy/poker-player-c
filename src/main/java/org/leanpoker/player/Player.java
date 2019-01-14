package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Player {

    static final String VERSION = "0.4";

    public static int betRequest(JsonElement request) {
//        System.err.println(request.toString());
        JsonObject rootObject = request.getAsJsonObject();
//        System.err.println(rootObject.get("tournament_id"));
        JsonArray players = rootObject.getAsJsonArray("players");
//        System.err.println("players: " + players);
        for (JsonElement playersElement : players
        ) {
            JsonObject playersObject = playersElement.getAsJsonObject();
//            System.err.println("current player: "+playersObject);
//            System.err.println("c. player name"+playersObject.getAsJsonPrimitive("name"));
            if (playersObject.getAsJsonPrimitive("name").getAsString().equals("C")) {
                JsonElement cardsElement = playersObject.getAsJsonArray("hole_cards");
                JsonObject cardsObject = cardsElement.getAsJsonObject();
//                System.err.println("as element: " + cardsElement);
//                System.err.println("as object: " + cardsObject);
                JsonArray cardsArray = cardsElement.getAsJsonArray();
                for (JsonElement card: cardsArray
                     ) {
                    JsonObject cardAsObject = card.getAsJsonObject();
                    JsonPrimitive rank = cardAsObject.getAsJsonPrimitive("rank");
                    System.err.println("rank: " + rank);
                }
            }
        }



        return 1000;
    }

    public static void showdown(JsonElement game) {
    }
}
