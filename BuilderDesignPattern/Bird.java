package src.test.BuilderDesignPattern;

public class Bird {
    private final String wing;
    private final String fly;
    private final String leg;

    private Bird(BirdBuider birdBuider) {
        this.wing = birdBuider.wing;
        this.fly = birdBuider.fly;
        this.leg = birdBuider.leg;
    }

    public String getWing() {
        return wing;
    }

    public String getFly() {
        return fly;
    }

    public String getLeg() {
        return leg;
    }

    static class BirdBuider {
        private String wing;
        private String fly;
        private String leg;

        public BirdBuider() {
        }

        public BirdBuider setWing(String wing) {
            this.wing = wing;
            return this;
        }

        public BirdBuider setFly(String fly) {
            this.fly = fly;
            return this;
        }

        public BirdBuider setLeg(String leg) {
            this.leg = leg;
            return this;

        }

        public Bird build() {
            Bird bird = new Bird(this);
            return bird;
        }
    }

}