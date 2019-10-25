/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4ed;

/**
 *
 * @author tiago
 */
public class LinkedQueue<T> implements QueueADT<T>{
    
    private int count;
    private LinearNode<T> front;
    private LinearNode<T> rear;

    public LinkedQueue() {
        this.count = 0;
        this.front = null;
        this.rear = null;
    }
    

    @Override
    public void enqueue(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);
        if(this.count == 0){
            this.front = newNode;
            this.rear = newNode;
        } else{
            this.rear.setNext(newNode);
            this.rear = newNode;
        }
        this.count++;
    }

    @Override
    public T dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        LinearNode<T> current = this.front;
        StringBuilder str = new StringBuilder();
        str.append("Front: ");str.append(this.front.getElement());str.append("\n");
        str.append("Rear: ");str.append(this.rear.getElement());str.append("\n");
        str.append("Tamanho: ");str.append(this.count);str.append("\n");
        

        while (current != null) {
            str.append(current.getElement());
            str.append("\n");
            current = current.getNext();
        }
        return str.toString();
    }
    
    
    
    

    
}
