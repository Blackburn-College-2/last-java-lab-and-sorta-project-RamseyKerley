/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststacktemplate;

/**
 *
 * @author Ramsey
 * @param <T>
 */
public class ListNode<T> {
    private final T node;
    /**
     * Create a new ListNode given a value.
     *
     * @param v
     */
    ListNode(T v) {
         node = v;
    }

    /**
     * return the value being held by this Node.
     *
     * @return
     */
    public T getValue() {
        return node;
    }
}
