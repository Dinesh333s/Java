import java.util.Scanner;

public class getting_input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt(),c;
        c = (a*a) + (b*b) + 2*a*b;
        System.out.println("The number is "+c);
    }
}
/*
nextInt() for integer
nextfloat for float
nextDouble for double
next() for one word string value
nextLine for next multiple string value

 */