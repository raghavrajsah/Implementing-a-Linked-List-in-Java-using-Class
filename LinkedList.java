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


}