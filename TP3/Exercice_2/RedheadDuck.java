package JavaProjects.TP3.Exercice_2;

public class RedheadDuck extends Duck implements Quackable, Flyable {
    public void display(){
        System.out.println("I'm a RedheadDuck");
    }

    public void fly(){
        System.out.println("RedheadDuck Flying");
    }

    public void quack(){
        System.out.println("RedheadDuck Quacking");
    }
}
