package excercise1;

import java.util.ArrayList;

public class MyList<E> {
private int size=0;
private final int DEFAULT_CAPACITY=10;
private Object[] elements;
public MyList(){
}
public MyList(int capacity){
//    super();
    if (capacity<0)
        throw new IllegalArgumentException("Illegal Capacity: "+
                capacity);
    this.elements= new Object[capacity];
}
public void add(int index, E element){
if (index==size){
    add(element);
}else {
    add(index,element);
}
}
public E remove(int index) {
return null;
}

public int size(){
    return size;
}
public E clone(){
   return null;
}
public boolean contains(E o){
    return false;
}
public int indexOf(E O){
    return 0;
}
public boolean add(E e){
    return true;
}
public void ensureCapacity(int minCapacity){

}
public E get(int i){
    return null;
}
public void clear(){

}
}
