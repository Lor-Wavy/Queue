package queuell;
// Java program to Implement a queue using singly linked list public class QueueLL {
public static void main(String[] args) {
// create Object of Implementing class queueType queue = new queueType();
// insert Queue value queue.addQueue(1); queue.addQueue(2); queue.addQueue(3); queue.addQueue(4);
// display Queue elements System.out.println("\n********************"); while (!queue.isEmptyQueue()){
        System.out.print(queue.front()); queue.deleteQueue(); System.out.print(" <-- ");
        }
        System.out.print(" End of Queue"); System.out.println("\n********************\n");
        } // end of main
        } // end of program class QueueLL
//**************************************
// A linked list node class Node {
        int data; // integer data
        Node next; }
// ******** Queue Class ********
class queueType{ Node queueFront; Node queueRear;
// ******** default constructor ********
// Constructor queueType() {
this.queueFront = null;
this.queueRear = null; }
// ******** isEmpty ********
// Utility method to check if the queue is empty or not public boolean isEmptyQueue()
{
        return (queueFront == null); }
// ******** isFull ********
// Utility method to check if the queue is full or not public boolean isFullQueue()
        {
        return false; }
// ******** addQueue ********
public void addQueue(int x) // insert at the back of the queue {
        Node node = new Node(); node.data = x;
        node.next = null;
        if (isEmptyQueue()) {
        this.queueFront = node;
        this.queueRear = node; }
        else {
        this.queueRear.next = node; queueRear = node;
        }
        } // end of addQueue()

// ******** front ********
// Utility method to return front element in a queue public int front()
        {
// check for empty Queue if (!isEmptyQueue()) {
        return queueFront.data; }
        else {
        System.out.println("Queue is empty"); return -1;
        }
        } // end of front()
// ******** back ********
// Utility method to return last element in a queue public int back()
        {
// check for empty queue if (!isEmptyQueue()) {
        return queueRear.data; }
        else {
        System.out.println("Queue is empty"); return -1;
        }
        } // end of back()
// ******** deleteQueue ********
// Utility method to remove element from front of the Queue public void deleteQueue() // remove from the beginning
        {
// check for queue underflow if (!this.isEmptyQueue())
        this.queueFront = this.queueFront.next; else
        System.out.print("** Can not deleteQueue an empty queue ** ");
        if (this.queueFront == null) this.queueRear = null;
        }
        } // end of class QueueType