
import java.util.*;
import java.io.*;

public class Simple
{

    public static void main(String args[]){
        ArrayList al = new ArrayList();
        al.add(new Student(104));
        al.add(new Student(101));
        al.add(new Student(107));
        al.add(new Student(100));
        
        System.out.println("Sort by age:");
        
        Collections.sort(al, new AgeComparator());
        Iterator itr2=al.iterator();
        
        while(itr2.hasNext()){
        Student st=(Student)itr2.next();
            
        System.out.println(st.age);
       }
    }
}
