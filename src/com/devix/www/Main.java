package com.devix.www;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> fruit = new HashMap<>();
        fruit.put("manzana", "rojo");
        fruit.put("naranja", "anaranjado");
        fruit.put("limon", "verde");

        if (fruit.containsValue("rojo")) {
            System.out.println("Fruta roja detectada");

            for (String key : fruit.keySet()) {
                if (fruit.get(key) == "rojo") {
                    System.out.println(key);
                }
            }
        }
    }
}
