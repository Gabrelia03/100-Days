package isc;

import java.util.Scanner;
import java.util.Stack;

public class isc35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> huruf = new Stack<>();
        String kata = sc.nextLine();

        for (int i = 0; i < kata.length(); i++) {
            huruf.push(kata.charAt(i));
        }
        while (!huruf.empty()) {
            System.out.print(huruf.pop());
        }
    }

}
