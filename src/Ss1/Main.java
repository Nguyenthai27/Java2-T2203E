package Ss1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("hello");
        hs.add("world");
        for(String s:hs){
            System.out.println(s);
        }
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        System.out.println(numbers);

        int first = numbers.peek();
        System.out.println("first: "+first);
        System.out.println("total: "+numbers.size());

        System.out.println("Poll:" +numbers.poll()+ " remain:" +numbers.size());
        System.out.println("Poll:"  +numbers.poll()+ " remain:" +numbers.size());
        System.out.println("Poll:"  +numbers.poll()+ " remain:" +numbers.size());

        PriorityQueue<Student> st = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getMark() - o1.getMark() ;
            }
        });
        st.add(new Student("Nguyen Tuan Anh",1));
        st.add(new Student("Cao Hoang Nam",3));
        st.add(new Student("Tran Van Thanh",2));
        st.add(new Student("Ha Hoang Hung",0));
        Student s;

        while(st.size()>0){
            s = st.poll();
            System.out.println("SV: "+ s.getName()+" Diem Thi:" + s.getMark());
        }

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("good_student",10);
        hm.put("bad_student",3);

        System.out.println("Tieu Chuan lam sinh vien xuat sac la dem thi phai dat: "
                + hm.get("good_studen"));

        System.out.println(hm.keySet());
        System.out.println(hm.values());

    }
}
