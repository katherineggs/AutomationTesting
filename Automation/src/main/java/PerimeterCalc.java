public class PerimeterCalc {
    public double Perimeter(Shape[] shapes){
        double perim = 0;
        for (Shape shape: shapes){
            perim += shape.Perimeter();

        }
        return perim;
    }
}
