package compack.controllers;

import compack.model.Student;
import compack.model.classes;
import compack.services.ClassService;
import compack.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/classes")
public class ClassesController {
    @Autowired
    ClassService classService;


    private static final Logger logger = LoggerFactory.getLogger(ClassesController.class);

    @GetMapping
    public List<classes> getClasses() {
        logger.info("Student List");
        return classService.getClasses();
    }

    @PostMapping("/create")
    public classes create(@RequestBody classes clas) {
        logger.info("create class is invoked{}", clas);
        return classService.create(clas);
    }
    @GetMapping("/{id}")
    public classes getClassByClassCode(@PathVariable("id")int id)
    {
        logger.info("get class is invoked {}");
        return classService.getClassByClassCode(id);
    }
    @PutMapping("/update")
    public classes updateClass(@RequestBody classes clas)
    {
        logger.info("update class is invoked {}");
        return classService.updateClass(clas);
    }
    @DeleteMapping("/{id}")
    public classes deleteClass(@PathVariable("id") int id)
    {
        logger.info("delete class is invoked {}");
        return classService.deleteClass(id);
    }

}
