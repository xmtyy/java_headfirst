package Duck;

/**
 * Created by tangy on 2017/5/17.
 */
public class Test {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPower());
        model.performFly();

    }
}
