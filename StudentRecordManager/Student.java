class Student{
    int id;
    String name;
    int age;
    String department;
    //constructor
    Student(int id,String name,int age,String departmet){
        this.id=id;
        this.name=name;
        this.age=age;
        this.department=departmet;
    }
    // convert object to string
    //(object) Student s=new Student(26,"deepak",21,"CSE");to
    // (tostring)26,"deepak",21,"CSE"
    public String toString(){
        return id+" ,"+name+" ,"+age+" ,"+department;
    }
    // it is a static function so no object creation is neede
    // it will convert the string to object
 // (string)26,"deepak",21,"CSE"
  // (to object)Student s=new Student(26,"deepak",21,"CSE");to
public static Student fromString(String data){
    String[] parts=data.split(" ,");
    return new Student(Integer.parseInt(parts[0]), parts[1],Integer.parseInt(parts[2]), parts[3]);
}

}