import java.util.Scanner;
class FullCourse{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        double x;
        double y;
        double z;

        System.out.print("Enter side x: ");
        x = reader.nextDouble();
        System.out.print("Enter side y: ");
        y = reader.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.print("La Hipotenusa es: "+z);

        reader.close();
    }
}
