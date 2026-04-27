package creational;

import com.fyfe.creational.DclSingleton;
import com.fyfe.creational.EagerSingleton;
import com.fyfe.creational.LazySingleton;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        System.out.println("(EagerSingleton.getInstance() == EagerSingleton.getInstance()) = " + (EagerSingleton.getInstance() == EagerSingleton.getInstance()));
        System.out.println("(LazySingleton.getInstance() == LazySingleton.getInstance()) = " + (LazySingleton.getInstance() == LazySingleton.getInstance()));
        System.out.println("(DclSingleton.getInstance() == DclSingleton.getInstance()) = " + (DclSingleton.getInstance() == DclSingleton.getInstance()));
    }
}
