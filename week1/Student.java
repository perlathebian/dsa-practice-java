public class Student {
    private String name;
    private int id;
    private double gpa;
    private String major;

    public Student (String name, int id, double gpa, String major){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.major = major;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public double getGpa(){
        return this.gpa;
    }

    public String getMajor(){
        return this.major;
    }

    public void setGpa(double gpa){
        if (gpa < 0.0 || gpa > 4.0){
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return "Student[id=" + this.id + ", name=" + this.name + ", major=" + this.major + ", gpa="+ this.gpa+"]";
    }

    public boolean isHonors(){
        return this.gpa >= 3.5;
    }
}
