import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Введите возраст");
        if (age<=6){
            System.out.println("Тебе ы дет,сад");
        } else if (age <= 17) {
            System.out.println("Иди в школу");
        }else if (age == 18){
            System.out.println("Ты закончил школу");
        }else if (age > 18){
            System.out.println("У тебя два путя работа или университет");
        }
    }
}