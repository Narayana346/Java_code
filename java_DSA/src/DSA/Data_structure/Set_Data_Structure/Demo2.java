package DSA.Data_structure.Set_Data_Structure;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<student> set = new HashSet<>();
        student s1 = new student(1,"Arjun");
        student s2 = new student(1,"Karshika");
        System.out.println(s1.equals(s2));

        set.add(new student(1,"karshika"));
        set.add(new student(1,"Arjun"));
        set.add(new student(2,"madhu"));
        System.out.println(set);
    }
}
class student{
    int rollNo;
    String Name;
    public student(int rollNo,String Name){
        this.Name = Name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "{" +
                "rollNo=" + rollNo +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student)) return false;
        student student = (student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
