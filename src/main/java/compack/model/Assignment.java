package compack.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assignments")
public class Assignment {
    @Id
    @Column(name = "assignment_id")
    private int assignment_id;

    @Column(name = "Assignment_title")
    private String Assignment_title;
    @Column(name = "description")
    private String description;
    @Column(name = "points")
    private int points;
   // @Column(name = "duedate")
    //private date duedate;


    public int getAssignment_id() {
        return assignment_id;
    }

    public void setAssignment_id(int assignment_id) {
        this.assignment_id = assignment_id;
    }

    public String getAssignment_title() {
        return Assignment_title;
    }

    public void setAssignment_title(String assignment_title) {
        Assignment_title = assignment_title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
