package myarraylistwithbugs;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListWithBugsTest {

    public MyArrayListWithBugsTest() {
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAddObject() {
        System.out.println("add object");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(o);
        assertEquals(instance.get(instance.size() - 1), o);
    }

    /**
     * Test of size method, of class MyArrayListWithBugs.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class MyArrayListWithBugs.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        for (int i = 0; i < 5; i++) {
            instance.add(o);
        }
        Object expResult = o;
        Object result = instance.get(instance.size() -1);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test
    public void testAddObjectOnIndex() {
        System.out.println("add object on index");
        int index = 0;
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        instance.add(index, o);
        assertEquals(instance.get(instance.size()), o);
    }

    /**
     * Test of remove method, of class MyArrayListWithBugs.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs();
        for (int i = 0; i < 5; i++) {
            instance.add(o);
        }
        int index = 4;
        Object expResult = o;
        Object result = instance.remove(index);
        assertEquals(expResult, result);
    }
    
      /**
     * Test of get method, of class MyArrayListWithBugs.
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testGetOnIndexOutOfBounds()
    {
        System.out.println("get on index out of bounds");
        Object o = new Object();
        MyArrayListWithBugs instance = new MyArrayListWithBugs(); 
        instance.add(o);
        instance.get(6);
    }
    
    /**
     * Test of add method, of class MyArrayListWithBugs.
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testAddObjectOnIndexOutOfBounds()
    {
       System.out.println("add object on index out of bounds");
       Object o = new Object();
       MyArrayListWithBugs instance = new MyArrayListWithBugs(); 
       instance.add(4,o);
    }
    
    /**
     * Test of remove method, of class MyArrayListWithBugs.
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveObjectOnEmptyList()
    {
       System.out.println("remove on empty list");
       MyArrayListWithBugs instance = new MyArrayListWithBugs(); 
       instance.remove(0);
    }
}
