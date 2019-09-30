import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            rectangular();

    }
    public static void rectangular(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Width");
        double width = sc.nextDouble();
        System.out.println("Enter the height:");
        double height =sc.nextDouble();
        Rectangular rectangular = new Rectangular(width,height);
        String displlay = rectangular.display();
        double area =rectangular.getArea();
        double perimeter =rectangular.getPerimeter();
        System.out.println(displlay);
        System.out.println("Diện tích :"+area);
        System.out.println("Chu Vi :"+perimeter);

    }
}
