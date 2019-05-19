package ua.mamedov.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import ua.mamedov.entity.Greeter;

/**
 * JPA based implementation of GreeterDao.
 */
@Repository
public class GreeterDaoImpl implements GreeterDao {
    /**
     * JPA EM factory, provided by Spring.
     */
    @Inject
    private SessionFactory sessionFactory;

    @Override
    public final void addGreet(final Greeter g) {
        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.persist(g);
        s.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    @Override
    public final List<Greeter> getGreetings() {


        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query SQLQuery = session.createQuery("from Greeter");
        ArrayList<Greeter> result = (ArrayList<Greeter>) SQLQuery.list();
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
        return result;


//        return sessionFactory.openSession()
//                .createCriteria(Greeter.class)
//                .list();
    }
}
