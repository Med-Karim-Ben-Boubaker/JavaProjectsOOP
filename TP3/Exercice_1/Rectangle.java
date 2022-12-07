

public class Rectangle implements GeometricForms, Resizable {
    private double sideA;
    private double sideB;

    //Defining constructor
    Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Getters & Setters
    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public void setSideB(double sideB){
        this.sideB = sideB;
    }
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }

    // Implimenting interface methodes
    public double surface(){
        return sideA*sideB;
    }
    public double perimetre(){
        return sideA*2 + sideB*2;
    }
    //Implimenting Resizable
    public void Resize(int percent){
        setSideA((double)sideA*percent/100);
        setSideB((double)sideB*percent/100);
    }

    //overloading toString method
    public String toString(){
        return "This Rectangle is defined by 2 sides: A="+getSideA()+", B="+
        getSideB();
    }
}