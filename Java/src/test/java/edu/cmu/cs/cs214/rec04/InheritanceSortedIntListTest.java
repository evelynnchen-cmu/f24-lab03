package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntListTest {

    /** 
     * Uncomment the following code to test your implementation 
     * Select all and (CTRL + /) or (COMMAND + /)
     * Feel free to write more tests for your implementation. */

    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    // /**
    //  * Called before each test.
    //  */
    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    // /**
    //  * Tests for the add() method.
    //  */
    @Test
    public void testAdd() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        System.out.println(list1.getTotalAdded());

        assertTrue(list1.getTotalAdded() == 5);
        printList(list1);

        list2.add(3);
        list2.add(0);

        assertTrue(list2.getTotalAdded() == 2);

        list2.addAll(list1);
        printList(list2);

        assertTrue(list2.getTotalAdded() == 7);

        assertTrue(list2.size() == 7);
    }

    // /**
    //  * Tests for the addAll() method.
    //  */
    @Test
    public void testAddAll() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        assertTrue(list1.getTotalAdded() == 5);

        list2.add(3);
        list2.add(0);

        assertTrue(list2.getTotalAdded() == 2);

        list2.addAll(list1);
        printList(list2);

        assertTrue(list2.getTotalAdded() == 7);

        assertTrue(list2.size() == 7);
    }

    // /**
    //  * A helper function that prints out the contents of an IntegerList.
    //  * @param list IntegerList to be printed out.
    //  */
    private void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}