import java.lang.Math;
import java.lang.String;

//We will define the traingle using the three-side definition.
public class Triangle implements GeometricForms, Resizable {
    private double sideA;
    private double sideB;
    private double sideC;

    //Defining constructor
    Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //Getters & Setters
    public void setSideA(double sideA){
        this.sideA = sideA;
    }
    public void setSideB(double sideB){
        this.sideB = sideB;
    }
    public void setSideC(double sideC){
        this.sideC = sideC;
    }
    public double getSide(String sideChoice){
        if(sideChoice.equals("A")) return sideA;
        if(sideChoice.equals("B")) return sideB;
        if(sideChoice.equals("C")) return sideC;
        else return -1;
    }

    // Implimenting interface methodes
    public double surface(){
        double halfPerimetre = this.perimetre();
        return Math.sqrt(halfPerimetre*(halfPerimetre-sideA)
        *(halfPerimetre-sideB)*(halfPerimetre-sideC));
    }
    public double perimetre(){
        return sideA + sideB + sideC ;
    }

    //overloading toString method
    public String toString(){
        return "This Triangle is Defined by 3 sides: A="+getSide("A")+", B="+
        getSide("B")+", C="+getSide("C");
    }
    //Implimenting Resizable
    public void Resize(int percent){
        setSideA((double)sideA*percent/100);
        setSideB((double)sideB*percent/100);
        setSideC((double)sideC*percent/100);
    }
}
