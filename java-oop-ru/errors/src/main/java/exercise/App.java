package exercise;

// BEGIN
public class App {
    public static void printSquare(Circle circle) {
        try {
            double square = circle.getSquare();
            int roundedSquare = (int) Math.round(square);
            System.out.println(String.valueOf(roundedSquare));
        } catch (NegativeRadiusException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Вычисление окончено");
        }
    }

}
// END
