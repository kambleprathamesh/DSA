
import java.util.PriorityQueue;

public class objects {
    // to comapre the objects within the classs
    // make use of interfaces call comparable
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        // define constructror
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // to use the function of interface make use of compareTo() function of
        // comparable
        // method override
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String args[]) {

        // define pq for object
        PriorityQueue<Student> pq = new PriorityQueue<>();

        // add student names and rank

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 5));
        pq.add(new Student("D", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "--->" + pq.peek().rank);
            pq.remove();
        }

    }
}
