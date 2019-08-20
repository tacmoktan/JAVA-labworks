
package genericthreadpriority;

/**
 *
 * @author Tashi
 */
public class GenericThreadPriority extends Thread {
    @Override
    public void run(){
        System.out.println("Thread name:" + Thread.currentThread().getName());
        System.out.println("Thread priority:" + Thread.currentThread().getPriority());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        GenericThreadPriority t1 = new GenericThreadPriority();
        GenericThreadPriority t2 = new GenericThreadPriority();
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        
        if( t1.getPriority() > t2.getPriority()){
            t1.start();
            t2.start();
        }else{
            t2.start();
            t1.start();
        }
        /*
        t1.start();
        t2.start();*/
    }
    
}
