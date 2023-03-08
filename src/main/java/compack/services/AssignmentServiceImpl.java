package compack.services;

import compack.model.Assignment;
import compack.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {
    @Autowired
    SessionFactory sessionFactory;
    public Assignment getAssignmentById (int id) {
        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Assignment assignment = session1.get(Assignment.class, id);
        transaction1.commit();
        session1.close();
        return assignment;
    }
    public List<Assignment> getAssignment() throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Assignment> assignmentList = session.createQuery("from assignments", Assignment.class).list();
        transaction.commit();
        session.close();
        return assignmentList;
    }
    public Assignment create(Assignment assignment)
    {
        Session session2 = sessionFactory.openSession();
        Transaction transaction1 = session2.beginTransaction();
        session2.save(assignment);
        transaction1.commit();
        session2.close();
        return assignment;
    }
    public Assignment updateAssignment (Assignment assignment){
        Session session3 = sessionFactory.openSession();
        Transaction transaction2 = session3.beginTransaction();
        session3.saveOrUpdate(assignment);
        transaction2.commit();
        session3.close();
        return assignment;
    }
    public Assignment deleteAssignment ( int id){
        Session session3 = sessionFactory.openSession();
        Transaction transaction3 = session3.beginTransaction();
        Assignment assignment = session3.get(Assignment.class, id);
        session3.delete(assignment);
        transaction3.commit();
        session3.close();
        return assignment;
    }

}
