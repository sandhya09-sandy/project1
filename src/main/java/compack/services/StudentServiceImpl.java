package compack.services;

import compack.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    SessionFactory sessionFactory;
    public Student getStudentById (int id) {
        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Student student = session1.get(Student.class, id);
        transaction1.commit();
        session1.close();
        return student;
    }
    public List<Student> getStudent() throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Student> studentList = session.createQuery("from Student", Student.class).list();
        transaction.commit();
        session.close();
        return studentList;
    }
    public Student create(Student student)
    {
        Session session2 = sessionFactory.openSession();
        Transaction transaction1 = session2.beginTransaction();
        session2.save(student);
        transaction1.commit();
        session2.close();
        return student;
    }
    public Student updateStudent (Student student){
        Session session3 = sessionFactory.openSession();
        Transaction transaction2 = session3.beginTransaction();
        session3.saveOrUpdate(student);
        transaction2.commit();
        session3.close();
        return student;
    }
    public Student deleteStudent ( int id){
        Session session3 = sessionFactory.openSession();
        Transaction transaction3 = session3.beginTransaction();
        Student student = session3.get(Student.class, id);
        session3.delete(student);
        transaction3.commit();
        session3.close();
        return student;
    }

}
