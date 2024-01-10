class TwoDShape{
    private double width;
    private double height;

    TwoDShape(double w,double h){
        width=w;
        height=h;
    }

    // Методы доступа к переменным экземпляра width и height.
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    public void setWidth(double  w) {
       width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    void showDim(){
        System.out.println("Width and height are "+ width + " and " + height);
    }
}

class Triangle extends TwoDShape{
    String style;

    // Конструктор.
    Triangle(String s,double w,double h){
        super(w,h);
        style = s;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }
    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}


public class Main {
    public static void main(String[] args) {

        Triangle t1 = new Triangle( "isoscales",4.0,4.0);
        Triangle t2 = new Triangle("right",8.0,12.0);


        System.out.println("info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Ingo for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

    }
}