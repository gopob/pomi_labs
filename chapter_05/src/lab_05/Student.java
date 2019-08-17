package lab_05;

import java.util.*;
import java.util.Comparator;

public class Student implements Comparable {
    private String name;
    private int course;
    public Student() {

    }
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }
    public void printStudents(LinkedList < Student > students, int course) {
        Iterator < Student > itr = students.iterator();
        while (itr.hasNext()) {
            Student element = itr.next();
            if (element.getCourse() == course) {
                System.out.println(element.toString());
            }
        }
    }
    public void union(LinkedList < Student > set1, LinkedList < Student > set2) {
        LinkedList < Student > unionStudents = new LinkedList < Student > ();
        set1.addAll(set2);
        unionStudents.addAll(set1);
        Iterator < Student > itr = unionStudents.iterator();
        while (itr.hasNext()) {
            Student element = itr.next();
            System.out.println(element.toString());
        }
    }
    public void intersect(LinkedList < Student > set1, LinkedList < Student > set2) {
        int t = 0;
        Iterator < Student > itr1 = set1.iterator();
        while (itr1.hasNext()) {
            Student element1 = itr1.next();
            for (Student o: set2) {
                if (element1.equals(o)) {
                    t++;
                }
            }
        }
        if (t == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
    public static LinkedList compare(LinkedList < Student > arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).course < arr.getLast().course) {
                arr.addFirst(arr.pollLast());
            }
        }
        return arr;
    }
    public LinkedList compareList(LinkedList arr) {
        compare(arr);
        return arr;
    }
    public boolean comparison(TreeSet < Student > mas, LinkedList < Student > arr) {
        if (mas.containsAll(new Student().compareList(arr))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Student ob = new Student();
        Student petrov = new Student("Petr", 3);
        Student ivanov = new Student("Ivan", 2);
        Student sidorov = new Student("Stas", 1);
        Student romanov = new Student("Roma", 4);
        LinkedList < Student > students = new LinkedList < Student > ();
        students.add(sidorov);
        students.add(petrov);
        students.add(ivanov);
        LinkedList < Student > newstudents = new LinkedList < Student > ();
        newstudents.add(romanov);
        newstudents.add(sidorov);
        ob.printStudents(students, 1);
        ob.union(students, newstudents);
        ob.intersect(students, newstudents);
        ob.compareList(students);
        Comparator < Student > comp = new Comparator < Student > () {
            @Override
            public int compare(Student arg0, Student arg1) {
                return Integer.compare(arg1.course, arg0.course);
            }
        };
        TreeSet < Student > mas = new TreeSet < Student > (comp);
        mas.add(petrov);
        mas.add(sidorov);
        mas.add(ivanov);
        System.out.println(ob.comparison(mas, students));

    }
}