package patterns;

public class House {
    private int rooms;
    private int floors;

    private House(Builder builder) {
        this.rooms = builder.rooms;
        this.floors = builder.floors;

    }


    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", floors=" + floors +
                '}';
    }

    public static class Builder {
        private int rooms;
        private int floors;


        public Builder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
