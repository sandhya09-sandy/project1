package compack.services;

import compack.model.Teacher;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    SessionFactory sessionFactory;
    public Teacher getTeacherById (int id) {
        Session session1 = sessionFactory.openSession();
        Transaction transaction1 = session1.beginTransaction();
        Teacher teacher = session1.get(Teacher.class, id);
        transaction1.commit();
        session1.close();
        return teacher;
    }
    public List<Teacher> getTeacher() throws HibernateException {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Teacher> teacherList = session.createQuery("from Teacher", Teacher.class).list();
        transaction.commit();
        session.close();
        return teacherList;
    }
    public Teacher create(Teacher teacher)
    {
        Session session2 = sessionFactory.openSession();
        Transaction transaction1 = session2.beginTransaction();
        session2.save(teacher);
        transaction1.commit();
        session2.close();
        return teacher;
    }
    public Teacher updateTeacher(Teacher teacher){
        Session session3 = sessionFactory.openSession();
        Transaction transaction2 = session3.beginTransaction();
        session3.saveOrUpdate(teacher);
        transaction2.commit();
        session3.close();
        return teacher;
    }
    public Teacher deleteTeacher ( int id){
        Session session3 = sessionFactory.openSession();
        Transaction transaction3 = session3.beginTransaction();
        Teacher teacher = session3.get(Teacher.class, id);
        session3.delete(teacher);
        transaction3.commit();
        session3.close();
        return teacher;
    }
}
