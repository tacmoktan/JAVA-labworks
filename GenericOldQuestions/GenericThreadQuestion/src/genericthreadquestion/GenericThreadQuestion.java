
package genericthreadquestion;

/**
 *
 * @author Tashi
 */
public class GenericThreadQuestion{
    public static void main(String[] args) throws InterruptedException{
       
        //runnable
        Thread t1 = new Thread( () -> {
            System.out.println("this is 1st runnable thread");
        });

        //subclass
        Thread t2 = new Thread() {
            @Override
            public void run(){
                System.out.println("this is subclass thread");
            }
        };
        
        t1.start();
        t2.start();
        
        
    }
    
}
