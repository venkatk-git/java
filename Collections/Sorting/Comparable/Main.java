package Collections.Sorting.Comparable;

import java.util.*;

class Main{
    public static void main(String[] args) {
        SortedSet<Integer> treeSet = new TreeSet<Integer>(new CC());
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(0);
        treeSet.add(2);
        treeSet.add(-2);

        System.out.println(treeSet);
    }    
}

class CC implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        //This will allow duplicates
        if(i1 - i2 == 0)
            return 1;

        return i2 - i1;
    }
}

