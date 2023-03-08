package compack.controllers;

import compack.model.Assignment;
import compack.model.Student;
import compack.services.AssignmentService;
import compack.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/assignments")
public class AssignmentController {
    @Autowired
    AssignmentService assignmentService;


    private static final Logger logger = LoggerFactory.getLogger(AssignmentController.class);

    @GetMapping
    public List<Assignment> getAssignment() {
        logger.info("Assignments List");
        return assignmentService.getAssignment();
    }

    @PostMapping("/create")
    public Assignment create(@RequestBody Assignment assignment) {
        logger.info("create Assignment is invoked{}", assignment);
        return assignmentService.create(assignment);
    }
    @GetMapping("/{id}")
    public Assignment getAssignmentById(@PathVariable("id")int id)
    {
        logger.info("get Assignment is invoked {}");
        return assignmentService.getAssignmentById(id);
    }
    @PutMapping("/update")
    public Assignment updateAssignment(@RequestBody Assignment assignment)
    {
        logger.info("update Assignment is invoked {}");
        return assignmentService.updateAssignment(assignment);
    }
    @DeleteMapping("/{id}")
    public Assignment deleteAssignment(@PathVariable("id") int id)
    {
        logger.info("delete Assignment is invoked {}");
        return assignmentService.deleteAssignment(id);
    }
}
