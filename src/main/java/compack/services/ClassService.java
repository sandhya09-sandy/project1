package compack.services;

import compack.model.classes;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ClassService {
    List<classes> getClasses();

    classes create(classes clas);

    classes getClassByClassCode(int classcode);

    classes updateClass(classes clas);

    classes deleteClass(int classcode);

}
