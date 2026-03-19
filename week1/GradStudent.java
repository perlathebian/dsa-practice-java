public class GradStudent extends Student implements Printable{
    private String thesisTopic;
    private String advisor;

    public GradStudent(String name, int id, double gpa, String major, String thesisTopic, String advisor){
        super(name, id, gpa, major);
        this.thesisTopic = thesisTopic;
        this.advisor = advisor;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Thesis topic is: " + this.thesisTopic + ", advised by: " + this.advisor;
    }

    public boolean isEligibleToGraduate(){
        return this.getGpa() >= 3.0 && this.thesisTopic != null;
    }

    @Override
    public void printDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String getSummary() {
        return getName() + " (GPA: " + getGpa() + ", Thesis: " + thesisTopic + ")";
    }
}
