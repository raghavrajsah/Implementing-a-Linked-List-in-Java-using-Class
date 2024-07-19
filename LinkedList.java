public class LinkedList<E>{
    private Node<E> front;
    private int size;

    public LinkedList(){
        this.front=null;
        this.size=0;

    }
    private class Node<E>{
        private E data;
        private Node<E> next;

        public  Node(E data, Node<E> next){
            this.data=data;
            this.next=next;
        }


    }
}