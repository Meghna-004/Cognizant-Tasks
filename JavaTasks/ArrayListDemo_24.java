import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo_24{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i+1) + ": ");
            names.add(sc.nextLine());
        }
        System.out.println("All students:");
        names.forEach(System.out::println);
    }
}