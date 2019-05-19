package ua.mamedov.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import ua.mamedov.entity.Card;
import ua.mamedov.entity.Greeter;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * JPA имплиментация CardDAO.
 */
@Repository
public class CardDaoImpl implements CardDAO {
    /**
     * JPA EM factory, provided by Spring.
     */
    @Inject
    private SessionFactory sessionFactory;

    @Override
    public void addCard(Card card) {
        Session s = sessionFactory.openSession();
        s.getTransaction().begin();
        s.persist(card);
        s.getTransaction().commit();
    }

    @Override
    public List<Card> getAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query SQLQuery = session.createQuery("from Card");
        ArrayList<Card> result = (ArrayList<Card>) SQLQuery.list();
        session.getTransaction().commit();
        if (session.isOpen()) {
            session.close();
        }
        return result;
    }
}
