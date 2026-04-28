package creational;

import com.fyfe.creational.DclSingleton;
import com.fyfe.creational.EagerSingleton;
import com.fyfe.creational.LazySingleton;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@Slf4j
public class SingletonTest {
    @Test
    public void testSingleton() {
        log.info("Singleton Test");
        System.out.println("(EagerSingleton.getInstance() == EagerSingleton.getInstance()) = " + (EagerSingleton.getInstance() == EagerSingleton.getInstance()));
        System.out.println("(LazySingleton.getInstance() == LazySingleton.getInstance()) = " + (LazySingleton.getInstance() == LazySingleton.getInstance()));
        System.out.println("(DclSingleton.getInstance() == DclSingleton.getInstance()) = " + (DclSingleton.getInstance() == DclSingleton.getInstance()));
    }

    // 通过反射破坏单例
    @Test
    public  void testReflect() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<DclSingleton> clazz = DclSingleton.class;
        Constructor<DclSingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        boolean flag = DclSingleton.getInstance() == constructor.newInstance();
        log.info("flag -> {}", flag);
    }

    @Test
    public void testSerialize() throws IllegalAccessException, NoSuchMethodException, IOException, ClassNotFoundException {
        // 获取单例并序列化
        DclSingleton singleton = DclSingleton.getInstance();
        FileOutputStream fout = new FileOutputStream("D://Study//singleton.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(singleton);
        // 将实例反序列化出来
        FileInputStream fin = new FileInputStream("D://Study//singleton.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        Object o = in.readObject();
        log.info("他们是同一个实例吗？{}",o == singleton);
    }
}
