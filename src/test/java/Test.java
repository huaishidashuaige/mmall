import java.lang.reflect.Constructor;

public class Test {

    private int price;

    private int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public static void main(String[] args) throws Exception{
        Class clz = Class.forName("Test");
        Constructor constructor = clz.getConstructor();
        Test test = (Test)constructor.newInstance();
        test.setPrice(10);
        int price = test.getPrice();
        System.out.println(clz.getName());
        System.out.println(price);
    }


}
