

import java.util.*;

public class TugasPend24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array
        int[] array = new int[5];
        System.out.println("Masukkan 5 elemen untuk Array:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Elemen dalam Array: " + Arrays.toString(array));

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Masukkan elemen untuk ArrayList (selesai dengan -1):");
        while (true) {
            int element = scanner.nextInt();
            if (element == -1)
                break;
            arrayList.add(element);
        }
        System.out.println("Elemen dalam ArrayList: " + arrayList);

        // Vector
        Vector<Integer> vector = new Vector<>();
        System.out.println("Masukkan elemen untuk Vector (selesai dengan -1):");
        while (true) {
            int element = scanner.nextInt();
            if (element == -1)
                break;
            vector.add(element);
        }
        System.out.println("Elemen dalam Vector: " + vector);

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Masukkan elemen untuk LinkedList (selesai dengan -1):");
        while (true) {
            int element = scanner.nextInt();
            if (element == -1)
                break;
            linkedList.add(element);
        }
        System.out.println("Elemen dalam LinkedList: " + linkedList);

        // Stack
        Stack<Integer> stack = new Stack<>();
        System.out.println("Masukkan elemen untuk Stack (selesai dengan -1):");
        while (true) {
            int element = scanner.nextInt();
            if (element == -1)
                break;
            stack.push(element);
        }
        System.out.println("Elemen dalam Stack: " + stack);

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Masukkan elemen untuk Queue (selesai dengan -1):");
        while (true) {
            int element = scanner.nextInt();
            if (element == -1)
                break;
            queue.offer(element);
        }
        System.out.println("Elemen dalam Queue: " + queue);

    }

}
