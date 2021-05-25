import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        System.out.println("Welcome, I am Sathvik");
        Scanner s = new Scanner(System.in);
        System.out.println("0. Exit" + "\n" + "1. kilometers to miles"  + "\n" + "2. centimeter to millimeter"  + "\n" + "3. kilograms to grams");
        System.out.println("Enter ur choice >>>");
        int sw = s.nextInt();
        switch(sw) {
            case 0:
                    System.exit(0);
                    break;
            case 1:
            double km, miles;
            System.out.println("Enter the distance in kilometers");
            km = s.nextDouble();
            s.close();
            miles = (km * 0.621371);
            System.out.printf("%f kilometers = %f miles", km,miles);
            break;
            case 2:
            double cm, mm;
            System.out.println("Enter the length in centimeter");
            cm = s.nextDouble();
            s.close();
            mm = (cm * 10);
            System.out.printf("%f cm = %f mm", cm,mm);
            break;
            case 3:
            double kg, grams;
            System.out.println("Enter the weight in kilograms");
            kg = s.nextDouble();
            s.close();
            grams = (kg * 1000);
            System.out.printf("%f kg = %f grams", kg,grams);
            break;
        }
        s.close();
    }    
}
