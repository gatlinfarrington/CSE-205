package jsjf;

import java.util.Iterator;

import jsjf.exceptions.*;

/**
 * Represents a linked implementation of a stack.
 *
 * @author Java Foundations 
 * @version 4.0
 */
public class LinkedStack<T> implements StackADT<T>
{
    private int count;  
    private LinearNode<T> top; 

    /**
     * Creates an empty stack.
     */
    public LinkedStack()
    {
        count = 0;
        top = null;
    }

    /**
     * Adds the specified element to the top of this stack.
     * @param element element to be pushed on stack
     */
    public void push(T element)
    {
        LinearNode<T> temp = new LinearNode<T>(element);

        temp.setNext(top);
        top = temp;
        count++;
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it. 
     * @return element from top of stack
     * @throws EmptyCollectionException if the stack is empty
     */
    public T pop() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        T result = top.getElement();
        top = top.getNext();
        count--;
 
        return result;
    }
   
    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.  
     * @return element on top of stack
     * @throws EmptyCollectionException if the stack is empty  
     */
    public T peek() throws EmptyCollectionException
    {
        // To be completed as a Programming Project
		return top.getElement();
    }

    /**
     * Returns true if this stack is empty and false otherwise. 
     * @return true if stack is empty
     */
    public boolean isEmpty()
    {
        // To be completed as a Programming Project
		return (top.getNext() == null);
    }
 
    /**
     * Returns the number of elements in this stack.
     * @return number of elements in the stack
     */
    public int size()
    {
    	return count;
    }

    /**
     * Returns a string representation of this stack. 
     * @return string representation of the stack
     */
    public String toString()
    {
    	String retVal = "";
        LinearNode<T> cur = top;
        while(cur != null) {
        	retVal = retVal + cur.toString() + "\n";
        	cur = cur.getNext();
        }
    	return retVal;
    }
    public boolean contains(T elem){
    	boolean retVal = false;
    	LinearNode<T> cur = top;
    	while(cur != null) {
    		if(cur == elem) {
    			retVal = true;
    		}
    	}
    	return retVal;
    }
    public void shuffle(int times) {
    	//trying my own shuffle. It didn't work
    	for(int i = 0; i < times; i++) {
    		LinearNode<T> cur2 = top;
    		LinearNode<T> cur = top;
    		LinearNode<T> temp = new LinearNode<T>();
    		LinearNode<T> temp2 = new LinearNode<T>();
    		int spot1 = (int)Math.random() * count;
    		int spot2 = (int)Math.random() * count;
    		for(int j = 0; j < spot1; j++) {
    			cur2 = cur2.getNext();
    		}
    		for(int q = 0; q < spot2; q++) {
    			cur = cur.getNext();
    		}
    		temp.setNext(cur.getNext().getNext());
    		cur.setNext(temp);
    		cur.setNext(cur2.getNext().getNext());
    		cur2.setNext(cur);
    		
    		
    		
    	}
    }
}
