package builderPattern;
public class Restaurant {
    private String ate;
    private boolean withSpice;
    private String drink;
    private String sweet;

    public Restaurant(Builder builder) {
        this.ate = builder.ate;
        this.withSpice = builder.withSpice;
        this.drink = builder.drink;
        this.sweet = builder.sweet;
    }

    static class Builder {
        private String ate;
        private boolean withSpice;
        private String drink;
        private String sweet;

        public Builder(String ate) {
            this.ate = ate;
        }

        public Builder ate(String ate) {
            this.ate = ate;
            return this;
        }

        public Builder withSpice(boolean withSpice) {
            this.withSpice = withSpice;
            return this;
        }

        public Builder drink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder sweet(String sweet) {
            this.sweet = sweet;
            return this;
        }

        public Restaurant builder() {
            return new Restaurant(this);
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ate='" + ate + '\'' +
                ", withSpice=" + withSpice +
                ", drink='" + drink + '\'' +
                ", sweet='" + sweet + '\'' +
                '}';
    }
}
