package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation
    private int totalAdded = 0;

    public InheritanceSortedIntList() {
    }

    /**
     * Adds the specified element to the list in sorted order.
     * Increments the total number of added elements.
     * 
     * Overrides {@link SortedIntList#add(int)}.
     * 
     * @param element an integer to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean add(int element) {
        totalAdded++; 
        return super.add(element);
    }

    /**
     * Adds all elements from the specified IntegerList to this list.
     * Increments the total number of added elements for each element added.
     * 
     * Overrides {@link SortedIntList#addAll(IntegerList)}.
     *
     * @param elements IntegerList containing elements to be added to the list
     * @return true if this list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList elements) {
        for (int i = 0; i < elements.size(); i++) {
            add(elements.get(i));  
        }
        return true; 
    }

    /**
     * Returns the total number of elements added to this list since it was made.
     *
     * @return the total number of elements added to this list
     */
    public int getTotalAdded() {
        return totalAdded;
    }

}