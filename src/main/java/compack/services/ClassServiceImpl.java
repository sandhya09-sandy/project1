package compack.services;

import compack.model.Teacher;
import compack.model.classes;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{
    @Autowired
    SessionFactory sessionFactory;
    public classes getClassByClassCode (int id) {
        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        classes clas = session1.get(classes.class, id);
        transaction1.commit();
        session1.close();
        return clas;
    }
    public List<classes> getClasses() throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<classes> classesList = session.createQuery("from classes", classes.class).list();
        transaction.commit();
        session.close();
        return classesList;
    }
    public classes create(classes clas)
    {
        Session session2 = sessionFactory.openSession();
        Transaction transaction1 = session2.beginTransaction();
        session2.save(clas);
        transaction1.commit();
        session2.close();
        return clas;
    }
    public classes updateClass (classes clas){
        Session session3 = sessionFactory.openSession();
        Transaction transaction2 = session3.beginTransaction();
        session3.saveOrUpdate(clas);
        transaction2.commit();
        session3.close();
        return clas;
    }
    public classes deleteClass ( int id){
        Session session3 = sessionFactory.openSession();
        Transaction transaction3 = session3.beginTransaction();
        classes clas = session3.get(classes.class, id);
        session3.delete(clas);
        transaction3.commit();
        session3.close();
        return clas;
    }
}
