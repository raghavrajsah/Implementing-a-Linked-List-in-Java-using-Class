//Accepts a generic defining the type of data this list stores
public class LinkedList<E>{

    //head of the linkedlist
    private Node<E> front;

    //number of elements in the list
    private int size;


    // initialize our empty list
    public LinkedList(){
        this.front=null;
        this.size=0;

    }

    // Inner class for our Nodes, which construct our List
    // private means external code cannot reference Nodes directly
    private class Node<E>{
        private E data;
        private Node<E> next;

        // Instatiates a nOde with the next Node specified
        public  Node(E data, Node<E> next){
            this.data=data;
            this.next=next;
        }
        
        //... or default next Node to null
        public Node(E data){
            this(data, null);
        }


    }

    // returns number of elements in the list
    public int size(){
        return this.size;
    }


    // Retrieves the element at argument index
    public E get(int index){
        if(index<0 || index>=this.size){
            throw new IllegalArgumentException("Out of Range");
        }
        Node<E> temp = front;

        for(int i=0; i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    //Retrieves the node object at the specified index
    //private as external code cannot manipulate Node Objects
    private Node<E> getNode(int index){
        if(index<0 || index>=this.size){
            throw new IllegalArgumentException("Out of Range");
        }
        Node<E> temp=front;
        for(int i=0; i<index;i++){
            temp=temp.next;
        }
        return temp;    
    }

    public void add(E element){
        add(size, element);
    }

    //Insert the argument element at the specified index
    //Like ArrayList, can also be used to append to end of the list
    public void add(int index, E element){
        if(index<0 || index>this.size){
            throw new IllegalArgumentException("Out of Range");
        }
        if(index==0){
            front= new Node<E>(element,front);
        }
        else{
            Node<E> prev= this.getNode(index-1);
            prev.next = new Node<E>(element, prev.next);

        }
        this.size++;
    }

    public String toString(){
        String toReturn = "[";
        if(this.size==0){
            return "[]";
        }
        Node<E> current=front;

        for(int i=0; i<this.size-1;i++){
            toReturn += current.data + " ==> ";
            current=current.next;
        }
        toReturn+=current.data+"]";
        return toReturn;
    }



}