package compack.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="createclasses")
public class classes {
    @Id
    @Column(name = "uclasscode")
    private int uclasscode;

    @Column(name = "uclassname")
    private String uclassname;
    @Column(name = "usection")
    private String usection;
    @Column(name = "usubject")
    private int usubject;

    public int getUclasscode() {
        return uclasscode;
    }

    public void setUclasscode(int uclasscode) {
        this.uclasscode = uclasscode;
    }

    public String getUclassname() {
        return uclassname;
    }

    public void setUclassname(String uclassname) {
        this.uclassname = uclassname;
    }

    public String getUsection() {
        return usection;
    }

    public void setUsection(String usection) {
        this.usection = usection;
    }

    public int getUsubject() {
        return usubject;
    }

    public void setUsubject(int usubject) {
        this.usubject = usubject;
    }
}
