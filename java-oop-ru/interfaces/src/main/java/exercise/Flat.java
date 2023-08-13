package exercise;

// BEGIN
class Flat implements Home {
    private final double area;
    private final double balconyArea;
    private final int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home home) {
        return Double.compare(getArea(), home.getArea());
    }

    @Override
    public String toString() {
        return "Квартира площадью " + area + " метров на " + floor + " этаже";
    }
}
// END
