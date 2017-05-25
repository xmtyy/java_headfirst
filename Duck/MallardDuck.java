package Duck;

/**
 * Created by tangy on 2017/5/17.
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWIthWings();
    }
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }

}
