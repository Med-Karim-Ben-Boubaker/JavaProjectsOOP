

public class Circle implements GeometricForms, Resizable  {
    final double pi = 3.14f;
    private double radius;

    //Defining constructor
    Circle(double radius){
        this.radius = radius;
    }

    //Getters & Setters
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    // Implimenting interface methodes

        //Implimenting GeometricForms
        public double surface(){
            return pi*radius;
        }
        public double perimetre(){
            return pi*2*radius;
        }

        //Implimenting Resizable
        public void Resize(int percent){
            setRadius((double)radius*percent/100);
        }

    //overloading toString method
    public String toString(){
        return "This Circle is defined by a radius R="+getRadius();
    }
}
