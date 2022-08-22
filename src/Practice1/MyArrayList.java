package Practice1;

//public class MyArrayList extends MyAbstractList{
//    public static final int INITIAL_CAPACITY=16;
//    private E[] data= (E[]) new Object(INITIAL_CAPACITY);
//    //Create a default of list
//    public MyArrayList(){}
//    //Create a list from an array of objects
//    public MyArrayList(E[] objects){
//        for (int i=0; i<objects.length;i++)
//            add(objects[i]);
//    }
//    @Override
//    //Add a new element of the specified index
//    public void add(int index, E e){
//        ensureCapacity();
//        //Move the elements to the right after the specified index
//        for (int i=size-1; i>= index;i--) data[i+1]= data[i];
//        //Insert new element to data[index]
//        data[index]=e;
//        //Increase size by 1
//        size++;
//    }
//    //Create a new larger array, double the current size+1
//    private void  ensureCapacity(){
//        if (size>= data.length){
//            E[] newData= (E[])(new Object[size*2+1]);
//            System.arraycopy((data,0,));
//        }
//    }
//}
