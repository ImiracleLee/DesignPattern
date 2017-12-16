package com.imiracle.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        HandsetBrand brand = new HandsetBrandM();
        brand.setSoft(() -> System.out.println("game"));
        brand.run();

        brand.setSoft(() -> System.out.println("addressLiat"));
        brand.run();
    }
}
