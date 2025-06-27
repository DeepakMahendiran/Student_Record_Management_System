import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    StudentManager manager=new StudentManager();
    // loading the previously loaded data from file
    System.out.print("📁 Enter filename to load/save (e.g., students.txt): ");
        String filename = sc.nextLine();
        manager.loadFromFile(filename);
        while(true){
             System.out.println("\n📘 Student Record Manager");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Save to File");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                System.out.print("Enter ID:  ");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name=sc.nextLine();
                System.out.print("Enter Age:");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Department: ");
                String department=sc.nextLine();
manager.addStudent(new Student(id, name, age, department));

                    break;
                    case 2:
                    manager.viewStudent();
break;

case 3:
System.out.print("Enter Student ID to Search:");
int sid=sc.nextInt();
Student found=manager.searchStudent(sid);
 if (found != null) {
                        System.out.println("✅ Found: " + found.toString());
                    } else {
                        System.out.println("❌ Student not found.");
                    }
break;
case 4:
 System.out.print("Enter ID to update:  ");
                int uid=sc.nextInt();
                sc.nextLine();
                System.out.print("new Name ");
                String newname=sc.nextLine();
                System.out.print("new Age:");
                int newage=sc.nextInt();
                sc.nextLine();
                System.out.print("new Department: ");
                String newdept=sc.nextLine();
manager.upadateStudent(uid, newname, newage, newdept);
break;
case 5:
System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    sc.nextLine();
                    manager.deleteStudent(did);
                    break;
case 6:
  manager.savetoFile(filename);
                    break;

                case 7:
                    System.out.println("👋 Exiting... Data saved.");
                    manager.savetoFile(filename);
                    return;

                default:
                    System.out.println("⚠️ Invalid choice.");
            }
        }
    }
}


