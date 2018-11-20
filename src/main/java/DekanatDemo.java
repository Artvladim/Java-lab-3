import java.io.File;
public class DekanatDemo {
    public static void main(String[] args){
        Dekanat a=new Dekanat();
        File stud=new File("Students.txt");
        File group=new File("Groups.txt");
        System.out.println("Making groups, marks and heads of the groups");
        a.addStudents(stud);
        a.addGroups(group);
        a.addRandomMarks();
        a.randomizer();
        a.chooseHeads();
        a.printData();
        System.out.println();
        System.out.println("STUDENT 2 transferring to group applied mathematics and Informatics");
        System.out.println();
        a.studTransfer("STUDENT 2","applied mathematics and Informatics");
        a.printData();
        System.out.println();
        System.out.println("Students, which marks were lower than < 3.5 are getting lost right now");
        System.out.println();
        a.badStudentsGetLost();
        a.printData();
    }
}