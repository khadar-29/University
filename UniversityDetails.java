public class UniversityDetails{
    String name;
    int id;
    double sem;
    String cell;
    UniversityDetails(String n, int i, double s, String c){
        this.name=n;
        this.id=i;
        this.sem=s;
        this.cell=c;
    }
    void displayinfo(){
        System.out.println("Student name : "+name);
        System.out.println("Student id : "+id);
        System.out.println("Student salary : "+sem);
        System.out.println("Student cell : "+cell);
    }
    public static void main(String[] args){
        UniversityDetails stud1=new UniversityDetails("KV",21,4,"1234567789");
        stud1.displayinfo();
    }
}
