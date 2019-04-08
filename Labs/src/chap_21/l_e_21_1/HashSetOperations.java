package chap_21.l_e_21_1;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetOperations {
    HashSet<String> hashSet1;
    HashSet<String> hashSet2;

    HashSetOperations() {
        String[] values1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] values2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};

        hashSet1 = new HashSet<>();
        hashSet1.addAll(Arrays.asList(values1));
        hashSet2 = new HashSet<>();
        hashSet2.addAll(Arrays.asList(values2));

        HashSet<String> union = (HashSet<String>) hashSet1.clone();
        union.addAll((HashSet<String>) hashSet2.clone());

        HashSet<String> inter = (HashSet<String>) hashSet1.clone();
        hashSet1.retainAll((HashSet<String>) hashSet2.clone());

        HashSet<String> diff = (HashSet<String>) hashSet1.clone();
        diff.remove((HashSet<String>) hashSet2.clone());

        System.out.println(union);
        System.out.println(inter);
        System.out.println(diff);
    }

    public static void main(String[] args) {
        new HashSetOperations();
    }
}
