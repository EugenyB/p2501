import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.runQueues();
    }

    private void runQueues() {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(List.of(10,9,8,4,7,6,5,3,2,1,7));
        System.out.println(queue);
        while (queue.size() > 0) {
            System.out.println(queue.remove());
            System.out.println(queue);
        }
    }

    private void runSets() {
        HashSet<Integer> set = new HashSet<>(List.of(10,9,3,4,5,6,7,8,2,1));
        set.add(20);
        set.add(21);
        set.add(30);
        System.out.println(set);
    }

    private void runLists() {
        List<String> list1 = new ArrayList<>(List.of("one", "two", "three", "four"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Sly", "Chuck", "Bruce", "Arnie"));

        list1.add("five");

        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println(list2);
        System.out.println("-----------------");
        String[] array = new String[0];
        array = list2.toArray(array);

        for (String s : array) {
            System.out.println(s);
        }

        System.out.println("-------------------");
        List<Integer> intList = new ArrayList<>(List.of(1,7,4,5,2,7,8,6,9));
        for (Integer x : intList) {
            System.out.print(x + " ");
        }
        System.out.println();
        intList.remove(Integer.valueOf(5));
        System.out.println(intList);
        int p1 = intList.indexOf(7); //1
        int p2 = intList.lastIndexOf(7); //4
        System.out.println(p1 + " " + p2);
        List<Integer> list = intList.subList(p1, p2);
        System.out.println(list);
        list.set(1,17);
        System.out.println(list);
        list.remove(2);
        System.out.println(intList);
    }
}
