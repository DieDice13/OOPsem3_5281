package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

     @Override
    public Iterator<Student> iterator() {
       return new StudentIterator(group);
        
    }

    // Реализация интерфейса Comparable
    // Возвращает группы по кол-ву студентов в группе
    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.group.size(), o.group.size());    
    }
    

}
