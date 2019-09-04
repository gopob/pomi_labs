package lab_02_01.lab_02_01_03;




import java.util.*;

public class Main {
    public static void main(String args[]) {

        int avgM = 4;

        List < Student > arrayStudents = new ArrayList < > ();

        arrayStudents.add(new Student(1, "Petrov", "Petr", "Petrovich", "example", "34343434",
                new int[] {3, 5, 5, 5, 5}));
        arrayStudents.add(new Student(2, "Ivanov", "Ivan", "Ivanovich", "example", "12121212",
                new int[] {3, 2, 5, 3, 5}));


        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки ");

        for (Student st: arrayStudents) {
            for (int i: st.getRating()) {
                if (i <= 3) {
                    st.printInfo();
                    break;
                }
            }
        }

        System.out.println("Список абитуриентов, средний балл у которых выше заданного ");
        for (Student st: arrayStudents) {
            if (st.avg(st.getRating()) > avgM) {
                st.printInfo();
            }
        }

        System.out.println("Список абитуриентов, у которых средний балл выше всех ");
        Student maxAVG;

        for (int j = 0; j < arrayStudents.size() - 1; j++) {
            int tempJ = j + 1;
            if (arrayStudents.get(j).avg(arrayStudents.get(j).getRating()) < arrayStudents
                    .get(tempJ).avg(arrayStudents.get(tempJ).getRating())) {
                maxAVG = arrayStudents.get(tempJ);
                maxAVG.printInfo();
            }
        }

    }
}