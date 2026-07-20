package CoreJava.D03_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStudentAge {
    static class Student {
        int id;
        String name;
        int Age;

        public Student(int id, String name, int Age) {
            this.id = id;
            this.name = name;
            this.Age = Age;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + Age;
        }
    }
        static class sortByAge implements Comparator<Student>{
            public int compare(Student s1 , Student s2){
                //if age is same then sort based on ID:
                if(s1.Age == s2.Age){
                    return Integer.compare(s1.id,s2.id);
                }
                return Integer.compare(s1.Age , s2.Age);
            }
    }

    static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(10,"ritesh",21));
        list.add(new Student(11,"shubham",20));
        list.add(new Student(12,"gitesh",25));
        list.add(new Student(13,"harshal",19));

        Collections.sort(list,new sortByAge());

        for(Student s : list){
            System.out.println(s.id+" "+s.name+" "+s.Age);
        }

    }
}
