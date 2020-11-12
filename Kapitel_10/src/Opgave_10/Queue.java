package Opgave_10;

public class Queue {


    // DataFields 404
    private int size =0;
    private int[] elements;
    public static final int DEFAULTSIZE = 8;


    // Constructor

    public Queue(){
        elements = new int[DEFAULTSIZE];
    }


    // Methods

    public void enqueue(int v){
        if(size>= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size ++ ] = v;
    }

    public int dequeue(){
        int first = elements[0];
        int[] temp = new int[elements.length];
        System.arraycopy(elements,1,temp,0,size);
        elements = temp;
        size--;
        return first;

    }

    public boolean empty(){
        return size == 0;
    }


    public int getSize(){
        return size;
    }


}
