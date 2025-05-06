public class UniversityDetails{
    String name;
    int id;
    int sem;
    String cell;
    double gpa;
    UniversityDetails(String n, int i, int s, String c, double g){
        this.name=n;
        this.id=i;
        this.sem=s;
        this.cell=c;
        this.gpa=g;
    }
    void displayinfo(){
        System.out.println("Student name : "+name);
        System.out.println("Student id : "+id);
        System.out.println("Student salary : "+sem);
        System.out.println("Student cell : "+cell);
        System.out.println("Student gpa : "+gpa);
    }
    public static void main(String[] args){
        UniversityDetails stud1= new UniversityDetails("KV",21,4,"1234567789",8.12);
        stud1.displayinfo();
    }
}
