//Author: yetkinsln
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class javelin {

ArrayList<Integer> list1 = new ArrayList<>();
Lock lock = new ReentrantLock();


public void artır(){
    lock.lock();
       try {
         for (int i = 0; i < 100000; i++) {
        list1.add(i);
    }
    } finally {
                   lock.unlock();
    }

}

Thread function1 = new Thread(new Runnable() {
    @Override
    public void run() {
        artır();
    }
})
        ;
Thread function2 = new Thread(new Runnable() {
    @Override
    public void run() {
        artır();
    }
})
        ;
public void situation(){
    System.out.println("List1 Size: " + list1.size());
}
public void start(){
    function1.start();
    function2.start();
    try {
    function1.join();
    function2.join();
    } catch (Exception e) {
    }
}
}
