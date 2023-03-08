package compack.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


    @Entity
    @Table(name ="student")
    public class Student {
        @Id
        @Column(name = "stid")
        private int sid;

        @Column(name = "stuname")
        private String stuname;
        @Column(name = "classcode")
        private String classcode;
        @Column(name = "email")
        private int email;
        @Column(name = "mobilenum")
        private String mobilenum;

        public int getSid() {
            return sid;
        }

        public void setSid(int sid) {
            this.sid = sid;
        }

        public String getStuname() {
            return stuname;
        }

        public void setStuname(String stuname) {
            this.stuname = stuname;
        }

        public String getClasscode() {
            return classcode;
        }

        public void setClasscode(String classcode) {
            this.classcode = classcode;
        }

        public int getEmail() {
            return email;
        }

        public void setEmail(int email) {
            this.email = email;
        }

        public String getMobilenum() {
            return mobilenum;
        }

        public void setMobilenum(String mobilenum) {
            this.mobilenum = mobilenum;
        }
    }

