package compack.controllers;

import compack.model.Teacher;
import compack.services.StudentService;
import compack.services.TeacherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;


    private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @GetMapping
    public List<Teacher> getTeacher() {
        logger.info("Student List");
        return teacherService.getTeacher();
    }

    @PostMapping("/create")
    public Teacher create(@RequestBody Teacher teacher) {
        logger.info("create teacher is invoked{}", teacher);
        return teacherService.create(teacher);
    }
    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable("id")int id)
    {
        logger.info("get teacher is invoked {}");
        return teacherService.getTeacherById(id);
    }
    @PutMapping("/update")
    public Teacher updateTeacher(@RequestBody Teacher teacher)
    {
        logger.info("update teacher is invoked {}");
        return teacherService.updateTeacher(teacher);
    }
    @DeleteMapping("/{id}")
    public Teacher deleteTeacher(@PathVariable("id") int id)
    {
        logger.info("delete teacher is invoked {}");
        return teacherService.deleteTeacher(id);
    }

}
