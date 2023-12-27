import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);
        Student s7 = new Student("Катя",  20);

        // Создали две группы и раскидали по ним студентов
        // Кол-во студентов нечетное дабы показать что сортировка групп по кол-ву студентов в группе была реализована верно
        List<Student> group5281 = new ArrayList<Student>();
        group5281.add(s1);
        group5281.add(s2);
        group5281.add(s3);

        List<Student> group5282 = new ArrayList<Student>();
        group5282.add(s4);
        group5282.add(s5);
        group5282.add(s6);
        group5282.add(s7);
        
        StudentGroup sg1 = new StudentGroup(group5281, 5281);
        StudentGroup sg2 = new StudentGroup(group5282, 5282);

        // Создаем поток в который будут добавлены две ранее созданных групп студентов
        List<StudentGroup> studentStreamList = new ArrayList<StudentGroup>();
        studentStreamList.add(sg1);
        studentStreamList.add(sg2);

        StudentStream stream1 = new StudentStream(studentStreamList, 1); 

        // Вывод групп со списком студентов в консоль через for 
        for (StudentGroup group : stream1.getGroups()) {
            System.out.println(group);
        }

        System.out.println("=====================================");

        // Сортировка по количеству студентов в группе и их следующий ввывод в консоль(в порядке убывания)
        studentStreamList.stream()
            .sorted(Collections.reverseOrder())
            .forEach(System.out::println);  
    }
}
