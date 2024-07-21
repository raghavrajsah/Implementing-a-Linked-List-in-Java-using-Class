import java.util.Arrays;

public class Stack {

    private static final int DEFAULT_CAP=3;
    private static String[] elements;
    private static int size;

    public Stack(){
        this(DEFAULT_CAP);
    }


    public Stack(int capacity){
        elements = new String[Math.max(DEFAULT_CAP, capacity)];
    }

    public int getSize(){
        return this.size;
    }

    public void push(String element){
        if(size==elements.length){
            doubleCapacity();

        }
        elements[size]=element;
        size++;
    }

    public String pop(){
        if(size==0){
            throw new IllegalStateException("The stack is empty");
        }
        String toReturn = elements[size-1];
        elements[size-1]=null;
        size--;
        return toReturn;
    }

    public String peek(){
        return elements[size-1];
    }

    public String toString(){
        return Arrays.toString(elements);
    }



    public void doubleCapacity(){
        String[] temp = new String[elements.length*2];
        for(int i=0; i<size; i++){
            temp[i]=elements[i];
        }

        elements = temp;
    }
    
}
