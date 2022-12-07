public class Square implements GeometricForms, Resizable {
    private double edge;

    //Defining constructor
    Square(double edge){
        this.edge = edge;
    }

    //Getter & Setters
    public void setEdge(double edge){
        this.edge = edge;
    }
    public double getEdge(){
        return edge;
    }

    // Implimenting interface methodes
    public double surface(){
        return edge*edge;
    }
    public double perimetre(){
        return 4*edge;
    }

    //overloading toString method
    public String toString(){
        return "This Square is defined by a single edge="+getEdge();
    }
    //Implimenting Resizable
    public void Resize(int percent){
        setEdge((double)edge*percent/100);
    }
}