package collections;

import java.util.*;

public class Test_2 {
    public static void main(String[] args) {
        //linkedList
//        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(78, 88, 0, -99, 100, 47));
//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()){
//            Integer next = iterator.next();
//            if(next%2!=0)
//                iterator.remove();
//        }
//        System.out.println(linkedList);

        //Vector:  vector.capacity()-i 10
//        Vector<Integer>vector=new Vector<>();
//        vector.add(0);
//        vector.add(1);
//        vector.add(-1);
//        System.out.println(vector);
//        System.out.println(vector.size());
//        System.out.println("Default capacity for vector is: "+vector.capacity());
//        Vector<Integer>v2=new Vector<>(4);
//        System.out.println(v2.capacity());

        //Set : no duplicates, no arrangement: HashSet,TreeSet, LinkedSet
//        HashSet<Integer>set=new HashSet<>(Arrays.asList(0,0,5,7,8,8,4,9,0,1,-7,7,null));
//        System.out.println(set);

// TreeSet null not get: Դասավորում է աճման կարգով
//        TreeSet<Integer> treeSet=new TreeSet<>(Arrays.asList(4,7,4,7,-8,-9,0));
//        System.out.println(treeSet);
//        TreeSet<String>treeSet1=new TreeSet<>(Collections.reverseOrder());
//        treeSet1.add("Ani");
//        treeSet1.add("Babken");
//        treeSet1.add("Orri");
//        System.out.println(treeSet1);
//        TreeSet<Worker>workerTreeSet=new TreeSet<>(new AgeComparator().reversed());
//        workerTreeSet.add(new Worker("A","B",10));
//        workerTreeSet.add(new Worker("A2","B2",11));
//        System.out.println(workerTreeSet);

        //LinkedHashSet:Կդասավորի հանելով դուբլիկատները այնպես ինչ հերթով որ մուտք ենք արել
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(Arrays.asList(1, 0, 0, 1, 5, 8));
        System.out.println(linkedHashSet);

        String n = "I am Armenian 2023 I 2023";
        String[] n1 = n.split(" ");
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>(Arrays.asList(n1));
        System.out.println(linkedHashSet1);
        for (String x:linkedHashSet1) {
            System.out.print(x+" ");
        }


    }
}
