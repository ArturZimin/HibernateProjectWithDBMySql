package by.zimin.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;


//спец класс для инициализации Hibernate
public class HibernateUtil {
//фабрика для создания сессий (статичная инициализация автоматически при запуске)
    private static final SessionFactory sessionFactory = buildSessionFactory();


    //
    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure(new File("F:\\HibernateSpring\\Spring projects\\Hibernate2021\\src\\main\\resources\\hibernate.cfg.xml")).buildSessionFactory();
        } catch (Throwable th) {
            System.err.println("Initial SessionFactory creating faild" + th);
            throw new ExceptionInInitializerError(th);
        }
    }

    //этот метод будем вызывать когда потребуется SessionFactory
    public static SessionFactory getSessionFactory() {
        if (sessionFactory==null){
            buildSessionFactory();
        }
        return sessionFactory;
    }


    /**
     * Close caches and connection pools
     */
    public static void close() {
        getSessionFactory().close();
    }
}
