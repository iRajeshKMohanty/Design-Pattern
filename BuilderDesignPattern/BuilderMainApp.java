package src.test.BuilderDesignPattern;

public class BuilderMainApp {
    public static void main(String[] args) {
        Bird bird = new Bird.BirdBuider()
                .setFly("high")
                .setLeg("Long")
                .setWing("wide")
                .build();
        System.out.println(bird.getFly() + " " + bird.getLeg() + " " + bird.getWing());
    }
}