import java.util.Scanner;
public class PiCircle {
    public static void main(String[] args){
        int radius;
        double area;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        radius = Input.nextInt();;
        area = (radius*radius)*Math.PI;
        System.out.println("Area of the circle is : " + area);
    }
}
