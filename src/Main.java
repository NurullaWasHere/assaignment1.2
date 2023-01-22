import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student SDUDENT = new Aspirant("Nurulla", "Amannula", "07", 4.0);
        Student[] students = new Student[3];
        students[0] = new Student("name", "sname", "777", 1.5);
        students[1] = new Student("GGG", "Gena", "666", 0);
        for(int i=0;i<3;i++){
            students[i].getScholarship();
        }
        SDUDENT.getScholarship();
    }
}
