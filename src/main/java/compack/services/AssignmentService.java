package compack.services;

import compack.model.Assignment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssignmentService {
    List<Assignment> getAssignment();

    Assignment create(Assignment assignment);

    Assignment getAssignmentById(int id);

    Assignment updateAssignment(Assignment assignment);

    Assignment deleteAssignment(int id);

}
