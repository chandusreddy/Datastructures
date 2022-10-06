package datastructures.LinkedList;

public class LinkedList {
        private Node head;
        private Node tail;
        private int length;
        // The below methods and constructor common job is to create a node.
    // for that we can use a new Class of Node.
    //It will create a new node
    //public LinkedList(int value){ -- constructor
        // It will create a new node
        // and add a Node to end
        //public void append(int value){}  - // Method
        // It will create a new node
        // and add a Node to Beginning
        //public void prepend(int value){} // Method
        // It will insert a new node
        //public void insert(int index, int value){ }// Method

        public LinkedList(int value){
                // Creates the Node Object (newNode) point to that Node
                Node newNode = new Node(value);
                //pointing the head to the newNode
                head = newNode;
                tail = newNode;
                length = 1;
        }

}
