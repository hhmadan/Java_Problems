import java.util.Scanner;
public class GetNameUsingCommandLine {
    public static void main(String[] args){
        String name;
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Entered String is: "+name);
    }
}
