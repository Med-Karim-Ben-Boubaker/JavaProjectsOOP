package JavaProjects.TP3.Exercice_2;

public class MallardDuck extends Duck implements Quackable, Flyable {
    public void display(){
        System.out.println("I'm a MallardDuck");
    }

    public void fly(){
        System.out.println("MallardDuck Flying");
    }

    public void quack(){
        System.out.println("MallardDuck Quacking");
    }
}

