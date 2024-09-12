package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList list;
    private int totalAdded = 0;

    public DelegationSortedIntList() {
        this.list = new SortedIntList();
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
        return list.add(element);
    }

    /**
     * Adds all of the elements from the IntegerList to the list.
     * Increments the total number of added elements by the input list size.
     *
     * Overrides {@link SortedIntList#addAll(IntegerList)}.
     *
     * @param l IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean addAll(IntegerList l) {
        totalAdded += l.size();
        return list.addAll(l);
    }

    /**
     * Removes from the list all of its elements that are contained in the
     * specified IntegerList.
     * 
     * Overrides {@link SortedIntList#removeAll(IntegerList)}.
     *
     * @param l IntegerList containing elements to be removed from the list
     * @return true if the list changed as a result of the call
     */
    @Override
    public boolean removeAll(IntegerList l) {
        return list.removeAll(l);
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    @Override
    public int get(int index) {
        return list.get(index);
    }

    /**
     * Removes the element at the specified position in this list.
     *
     * @param index the index of the element to be removed
     * @return true if an element was removed as a result of this call
     */
    @Override
    public boolean remove(int index) {
        return list.remove(index);
    }

    /**
     * Returns the number of elements in this list. If this list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return number of elements in this list
     */
    @Override
    public int size() {
        return list.size();
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