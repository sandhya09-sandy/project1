package compack.services;

import compack.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService {
    List<Teacher> getTeacher();

    Teacher create(Teacher teacher);

    Teacher getTeacherById(int id);

    Teacher updateTeacher(Teacher teacher);

    Teacher deleteTeacher(int id);
}
