public abstract class Triangle extends Shape{
    double Side1= 5;
    double Side2 = 6;
    double Side3 = 8;

    @Override
    public double Perimeter() {
        return Side1+Side2+Side3;
    }
}
