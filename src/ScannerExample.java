import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sca = sc.nextLine();
        System.out.println("Вы ввели "+sca);
        int a = 6;
        int b = 7;
        int c = 3;
        do {
            System.out.println("Hello,do while");
        }while (b>a);
        switch (c){
            case 1:
                System.out.println("c = 1");
                break;
            case 2:
                System.out.println("c = 2");
                break;
            case 3:
                System.out.println("c = 3");
                break;
            default:
                System.out.println("No one");
        }
    }
}
