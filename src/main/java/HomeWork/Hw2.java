package HomeWork;
import java.util.Scanner; // імпорт сканера
public class Hw2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("The height building 'height' m and 'count' floors : ");
            String height = sc.nextLine();
            String count = sc.nextLine();
            System.out.println("The height building " + height + " m and " + count + " floors");
        }
    }

