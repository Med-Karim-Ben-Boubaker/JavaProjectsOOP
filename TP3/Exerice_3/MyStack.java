package JavaProjects.TP3.Exerice_3;

public class MyStack {
    private int stackArray[];
    private int capacity;
    private int top;

    //Defining constructor
    MyStack(int capacity){
        stackArray = new int[capacity];
        this.capacity = capacity;
        top = -1;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack OverFlow");

            return;
        }
        //Stacking an element on top of another
        stackArray[++top] = element;
        System.out.println("A Value of "+element+" is added");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
        }

        // return the value of the current position and then pop it.
        return stackArray[top--];
    }

    public int peek(){
        // return the value of top 
        return stackArray[top];
    }

    public boolean isEmpty(){
        if(top == -1) return true;

        return false;
    }

    public boolean isFull(){
        if(top == capacity-1) return true;

        return false;
    }
}
