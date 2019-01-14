package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Player {

    static final String VERSION = "1.0";

    public static int betRequest(JsonElement request) {
        System.err.println("new version 21ht190h3490h90gth3w-5g09h3904");
        boolean play = false;
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
                    ranks+=rank.getAsString();
                }
            }
        }

        System.err.println(ranks);

        StartingHands hands = new StartingHands();
        for (String hand: hands.higher
             ) {
            if(hand.equals(ranks)) {
                play = true;
            }
        }
        for (String hand: hands.second
             ) {
            if(hand.equals(ranks)) {
                play = true;
            }
        }

        if (play) {
            return 1000;
        } else {
            return 0;
        }
    }

    public static void showdown(JsonElement game) {
    }
}
