package factory;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EntityManagerFactory {


    private static EntityManager manager = null;


    private EntityManagerFactory() {
        manager = Persistence.createEntityManagerFactory("TestPersistence").createEntityManager();
    }

    public static EntityManager getInstance() {
        if (manager == null) {
            new EntityManagerFactory();
        }
        return manager;
    }

}
