package exercise;

// BEGIN
class Cottage implements Home {

    private final double area;
    private final int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public int getFloor() {
        return floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home home) {
        return Double.compare(getArea(), home.getArea());
    }

    public String toString() {
        return  floorCount + " этажный коттедж площадью " + area + " метров";
    }

}
// END
