import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class StudentManager {
    // Here Student inside arraylist acts as a datatype and s is object acts as a variable
    ArrayList<Student> students=new ArrayList<>();
    // add student to the list
    public void addStudent(Student s){
        students.add(s);
        System.out.println("✅Student added successfully");
    }
    // view student
    public void viewStudent(){
        if(students.isEmpty()){
            System.out.println("⚠️No student found");
            return;
        }
        for(Student s:students){
            System.out.println(s.toString());
        }
    }
    // searching the student
    // if found return
    // else null
    public Student searchStudent(int id){
        for(Student s:students){
            if(s.id==id)return s;
        }
        return null;
    }
    //update student with the id
    // if id found upadte
    // else not found
    public void upadateStudent(int id,String newname,int newage,String newDept){
        Student s=searchStudent(id);
        if(s!=null){
            s.name=newname;
            s.age=newage;
            s.department=newDept;
            System.out.println("✅student updated successfully");
        }
        else{
            System.out.println("❌student not found");
        }

    }
    // deleting the file
    public void deleteStudent(int id){
         Student s=searchStudent(id);
         if(s!=null){
            students.remove(s);
            System.out.println("🗑️ Student deleted");
         }
         else{
              System.out.println("❌student not found");
         }
    }
    // saving student  datato the file
    public void savetoFile(String Filename){
        try{
            PrintWriter w=new PrintWriter(Filename);
            for(Student s:students){
                w.println(s.toString());
            }
            w.close();
            System.out.println("💾 Data saved to file");
        }
        catch (Exception e) {
            System.out.println("❌ Error saving: " + e.getMessage());
        }
    }
    // load data from the file
    public void loadFromFile(String filename) {
        try {
            students.clear();
            File file = new File(filename);
            if (!file.exists()) return; // First time, file won't exist
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                students.add(Student.fromString(line));
            }
            sc.close();
            System.out.println("📂 Loaded data from file.");
        } catch (Exception e) {
            System.out.println("❌ Error loading: " + e.getMessage());
        }
    }


}
