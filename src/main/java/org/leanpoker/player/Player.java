package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Player {

    static final String VERSION = "1.2";

    public static int betRequest(JsonElement request) {
        System.err.println("new version 21ht190h3490h90gth3w-5g09h3904");
        String ranks = "";
        int money = 0;
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
                JsonElement moneyElement = playersObject.getAsJsonPrimitive("stack");
                JsonPrimitive moneyPrimitive = moneyElement.getAsJsonPrimitive();
                money = moneyPrimitive.getAsInt();
            }
        }

        System.err.println("cards: "+ranks);
        System.err.println("money: "+money);

        StartingHands hands = new StartingHands();
        for (String hand: hands.newHigher
             ) {
            if(hand.equals(ranks)) {
                return money;
            }
        }

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
