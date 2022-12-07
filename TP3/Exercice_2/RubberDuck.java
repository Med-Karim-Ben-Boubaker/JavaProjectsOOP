package JavaProjects.TP3.Exercice_2;

public class RubberDuck extends Duck implements Quackable {
    public void display(){
        System.out.println("I'm a RubberDuck");
    }
    public void quack(){
        System.out.println("RubberDuck Quacking");
    }
}
