package com.belhard.university.datastructures;

public interface MyCollection {

 boolean add(Object obj); 
 boolean remove(Object obj);
 boolean contains(Object obj); 
 Object get(int index); 
 Object[] toArray(); 

}