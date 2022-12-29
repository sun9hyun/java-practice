package hashSetTest;

import java.util.HashSet;

public class School {
   public static void main(String[] args) {
      HashSet<Student> stds = new HashSet<Student>();
      stds.add(new Student(1, "한동석"));
      stds.add(new Student(1, "ddsad"));
      
      System.out.println(stds.size());//키 값이 같으면 동일 값으로 인식
      
//      Student han = new Student(1, "한동석");
//      System.out.println(han.equals(new Student(1, "한동석")));
   }
}