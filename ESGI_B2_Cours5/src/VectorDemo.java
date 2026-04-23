import java.util.*;
public class VectorDemo {
    public static void main(String args[]) {
        // initial size is 3, increment is 2
        Vector v = new Vector(3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());

        v.addElement((int) 1);
        v.addElement((int) 2);
        v.addElement((int) 3);
        v.addElement((int) 4);
        System.out.println("Capacity after four additions: " + v.capacity());

        v.addElement((double) 5.45);
        System.out.println("Current capacity: " + v.capacity());

        v.addElement((double) 6.08);
        v.addElement((int) 7);
        System.out.println("Current capacity: " + v.capacity());

        v.addElement((float) 9.4);
        v.addElement((int) 10);
        System.out.println("Current capacity: " + v.capacity());

        v.addElement((int) 11);
        v.addElement((int) 12);
        System.out.println("First element: " + (int) v.firstElement());
        System.out.println("Last element: " + (int) v.lastElement());

        if(v.contains((int) 3))
            System.out.println("Vector contains 3.");

        // enumerate the elements in the vector.
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
