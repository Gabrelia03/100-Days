package isc;

import java.util.Stack;

public class isc33 {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Data 6");
        stack.push("Data 3");
        stack.push("Data 5");

        // Mendapatkan elemen teratas dari stack
        String topElement = stack.peek();
        System.out.println("Elemen teratas: " + topElement);

        // Menghapus elemen teratas dari stack
        String removedElement = stack.pop();
        System.out.println("Elemen yang dihapus: " + removedElement);

        // Mengecek apakah stack kosong
        boolean isEmpty = stack.isEmpty();
        System.out.println("Apakah Stack Kosong ? " + isEmpty);
    }

}
