import java.util.Scanner;
public class PiCircle {
    public static void main(String[] args){
        int radius;
        double area;
        int inputCheck = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        radius = Input.nextInt();
        while (inputCheck <= 0) {
            if (radius < 0) {
                System.out.println("Please enter a positive number\n");
                System.out.print("Enter the radius of the circle : ");
                radius = Input.nextInt();
            } else {
                area = (radius * radius) * Math.PI;
                System.out.println("Area of the circle is : " + area);
                inputCheck = 1;
            }
        }
    }
}
