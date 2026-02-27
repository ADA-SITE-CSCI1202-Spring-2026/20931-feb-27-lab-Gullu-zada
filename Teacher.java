public class Teacher extends Person {

    private String department;
    private String courses;


    public Teacher() {
        super();
    }

  
    public Teacher(String firstName, String lastName, String gender,
                   String department, String courses) {

        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }


    public String getDepartment() {
        return department;
    }

    public String getCourses() {
        return courses;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Department: " + department +
               ", Courses: " + courses;
    }


    public boolean equals(Teacher t) {

        if (t == null) {
            return false;
        }

        if (!super.equals(t)) {
            return false;
        }

        if (!this.department.equals(t.department)) {
            return false;
        }

        if (!this.courses.equals(t.courses)) {
            return false;
        }

        return true;
    }
}
