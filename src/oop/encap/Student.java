package oop.encap;

public class Student {
    private String name;
    private String department;
    private String  studentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null && name.equals("")){
            System.out.println("빈값은 안돼요.");return;}
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if(department == null && department.equals("")){
            System.out.println("빈값은 안돼요.");return;}
        this.department = department;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if(studentId == null && studentId.equals("")){
            System.out.println("빈값은 안돼요.");return;}
        this.studentId = studentId;
    }
}
