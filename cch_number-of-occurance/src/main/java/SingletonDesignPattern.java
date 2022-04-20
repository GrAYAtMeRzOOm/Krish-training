import java.text.NumberFormat;

/**
 * Created by IntelliJ IDEA Ultimate.
 * User: Pasindu Raveen
 * Date: 10-Mar-22
 * Time: 1:06 AM
 * cch_number-of-occurance
 */
public class SingletonDesignPattern {
    private static volatile SingletonDesignPattern designPatterns;

    private SingletonDesignPattern() {
        if(designPatterns!=null){
            throw new RuntimeException("please use getDesignPattern method");
        }
    }

    public static SingletonDesignPattern getInstance() {
        if(designPatterns==null){
            synchronized (SingletonDesignPattern.class){
                if(designPatterns==null){
                    designPatterns = new SingletonDesignPattern();
                }
            }
        }
        return designPatterns;
    }
}

class Test{
    public static void main(String[] args) {
        long start=0;
        long end=0;

        start = System.nanoTime();
        SingletonDesignPattern patterns1 = SingletonDesignPattern.getInstance();
        end = System.nanoTime();
        System.out.println("pat1 -- "+(end-start));
        start = System.nanoTime();
        SingletonDesignPattern patterns2 = SingletonDesignPattern.getInstance();
        end = System.nanoTime();
        System.out.println("pat2 -- "+(end-start));

        NumberFormat.getCurrencyInstance()
    }
}