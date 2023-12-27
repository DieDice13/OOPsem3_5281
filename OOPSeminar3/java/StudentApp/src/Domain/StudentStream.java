package Domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentStreamList; // Список групп в потоке
    private int numberStream; // Номер потока

    public StudentStream(List<StudentGroup> studentStreamList, int numberStream) {
        this.studentStreamList = new ArrayList<>(studentStreamList);
        this.numberStream = numberStream;
    }

    public List<StudentGroup> getStudentStreamList() {
        return studentStreamList;
    }

    public void setStudentStreamList(List<StudentGroup> studentStreamList) {
        this.studentStreamList = studentStreamList;
    }

    public int getNumberStream() {
        return numberStream;
    }

    public void setNumberStream(int numberStream) {
        this.numberStream = numberStream;
    }

    // Реализация интерфейса Iterator
    @Override
    public Iterator<StudentGroup> iterator() {
        return studentStreamList.iterator();
    }

    public StudentGroup[] getGroups() {
        return studentStreamList.toArray(new StudentGroup[0]);
    }
}