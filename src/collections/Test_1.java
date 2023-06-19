package collections;

import throwableExceptionError.NameException;

import java.util.*;

public class Test_1 {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
//        list.add(44);
//        list.add(55);
//        list.add(88);
//        list.add(0);
//        list.add(-77);
//        list.add(0, 11);
//        System.out.println(list.toString());
//        list.remove(2);
//        System.out.println(list);
//        list.remove(Integer.valueOf(-77));
//        System.out.println(list);
        // Մաքրում է լիստի պարունակությունը   []
//        list.clear();
//        System.out.println(list);
        //Արժեքը փոխելը set
//        list.set(2,-88);
//        System.out.println(list);
//        System.out.println(list.indexOf(0));
//        System.out.println(list.get(1));
//        System.out.println(list.size());
//
//        for (int i = 0; i <list.size() ; i++) {
//            if(list.get(i)%2==0){
//                System.out.print(list.get(i)+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(list.contains(88));
//        List<String> sl = new ArrayList<>(Arrays.asList("1", "11", "111", "ok", "thanks"));
//        List<Integer> il = new ArrayList<>(Arrays.asList(7, -88, 9, 5, 3, -11, 0, 4));
//        System.out.println(sl);
//        System.out.println(il);
//
//        ArrayList<Integer> al1 = new ArrayList<>() {{
//            add(1);
//            add(2);
//            add(22);
//            add(0);
//        }};
//        System.out.println(al1);
//
//        List<Integer> ll = new ArrayList<>(Collections.nCopies(10, 1));
//        List<String> ll1 = new ArrayList<>(Collections.nCopies(5, "ok"));
//        List<String> LL4 = new ArrayList<>(Collections.nCopies(2, "Google"));
//        List<String> LL5 = new ArrayList<>(Collections.nCopies(2, "Java"));
//        ll1.addAll(LL4);
//        ll1.addAll(LL5);

//        List<Integer> ll7 = new ArrayList<>(Collections.nCopies(3, 0));
//        List<Integer> ll8 = new ArrayList<>(Collections.nCopies(3, 5));
//
//        ll.addAll(ll7);
//        ll.addAll(ll8);
//        System.out.println(ll);
//        Collections.sort(ll);
//        System.out.println(ll);
//        Collections.sort(ll,Collections.reverseOrder());
//        System.out.println(ll);
//        System.out.println(ll1);
//        Collections.sort(ll1);
//        System.out.println(ll1);
//        Collections.sort(ll1, Collections.reverseOrder());
//        System.out.println(ll1);

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Bni", "Arzumanyan", 20));
        workers.add(new Worker("Gor", "Gasparyan", 22));
        workers.add(new Worker("Dohar", "Ordyan", 18));
//        System.out.println(workers);
//        Collections.sort(workers);
//        System.out.println(workers);
//        Collections.sort(workers,Collections.reverseOrder());
//        System.out.println(workers);

        Collections.sort(workers,new AgeComparator().reversed());
        System.out.println(workers);
        Collections.sort(workers,new SurnameComparator());
        System.out.println(workers);

        //եթե 1 անգամ ենք ըստ անունի ուզում սորթ անեքօ ՝օգտագործում ենք անանիմուս կլասս
        Collections.sort(workers, new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(workers);


    }
}