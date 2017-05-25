package Duck;

/**
 * Created by tangy on 2017/5/17.
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    public void display(){
        System.out.println("I'm a modle duck");
    }

}
