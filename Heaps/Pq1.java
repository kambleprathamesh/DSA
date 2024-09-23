import java.util.Comparator;
import java.util.PriorityQueue;

public class Pq1 {
    public static void main(String args[]) {

        // define pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // JCF major functions
        // add elemt to pq,
        //Comparator.reverseOrder() ---reverse the order: default order is asecnding
        //remove--remove any specific element
        // peek ----retirves the head of queue
        // poll retrives & remove the head of queue
        // .size() returns the size of Priorityqueue
        // to print elements of PQ use
        // for each
        // while---.isempty(),size()

        // add
        pq.add(1);
        pq.add(5);
        pq.add(8);
        pq.add(10);
        pq.add(11);

        // print this pq using while

        System.out.println("Elements in the PriorityQueue:");
        while (pq.size() != 0) {
            System.out.println(pq.poll());
            // pq.remove();
        }

        // print using foreach
        // System.out.println("Elements in the PriorityQueue:");
        // for (Integer element : pq) {
        // System.out.println(element + " ");
        // }
    }

}