import java.util.Scanner;

public class leapyearprinter{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start Year:");
        int startYear = scanner.nextInt();
        System.out.println("Enter End Year:");
        int endYear = scanner.nextInt();   
        System.out.println("Leap Years:");
        for(int year = startYear; year<=endYear; year++){
            if((year%4==0&&year%100!=0)||(year%400==0)){
                System.out.println(year);
            }
        }
    }
}
