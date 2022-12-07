package JavaProjects.TP2.Excercice2;

public class ArrayList {
    private Object [] Array;
    private int arrayCapacity;


    public ArrayList(){
        Object [] arrayAlocated = new Object [10];
        this.arrayCapacity = 10;
        this.Array = arrayAlocated;
    }

    public ArrayList(int size){
        Object [] arrayAlocated = new Object [size];
        arrayCapacity = size;
        this.Array = arrayAlocated;
    } 

    public void add(Object object){
        Array[Array.length-1] = object;
    }

    public void add(int index, Object object){
        Array[index] = object;
    }

    public Object get(int index){
        return Array[index];
    }

    public int size(){
        return Array.length;
    }

    public boolean isEmpty(){
        if(Array.length != 0) return true;

        return false;
    }

    public boolean isFull(){
        if(size() == arrayCapacity) return true;

        return false;
    }

    // isIn() methode 
    public boolean isFound(Object object){
        for(int i=0; i<Array.length; i++){
            if(object == Array[i]) return true;
        }
        return false;
    }
}
