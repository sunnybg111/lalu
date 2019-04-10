

import java.io.Serializable;
import java.io.*;





 class Student implements Serializable{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = 121;
        this.name = "name";
        System.out.println("cool");

    }
     public Student()
     {

     }
}


public class DeserializationExample {

    public static void main(String args[])throws Exception{
        Student s1 =new Student();
        FileOutputStream fout=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);

        out.writeObject(s1);
        out.flush();
        System.out.println("success");
    }
}