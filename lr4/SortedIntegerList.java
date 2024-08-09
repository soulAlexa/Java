package lr4;
import java.util.*;

public class SortedIntegerList {
    private LinkedList<Integer> MySortList;
    boolean canRepeat;

    public SortedIntegerList(boolean canRepeat1){
        canRepeat = canRepeat1;
        MySortList = new LinkedList<Integer>();
    }

    public  void add(int number) {
        if(MySortList.size() == 0) {
            MySortList.add(number);
            return;
        }
        ListIterator<Integer> it = MySortList.listIterator();
        int p = 0;
        while(it.hasNext()){
            p = it.next();
            if(p == number && !this.canRepeat)
                return;
            if(p >= number){
                it.previous();
                it.add(number);
                return;
            }
        }
        if(p < number)
            MySortList.addLast(number);
    }

    public  void remove(int number){
            ListIterator<Integer> it = MySortList.listIterator();
            int p = 0;
            while(it.hasNext()) {
                p = it.next();
                if(p == number) {
                    it.remove();
                }
            }
            if(p == number)
                MySortList.remove();
    }

    public SortedIntegerList Sum(SortedIntegerList a, boolean flag){

        if(MySortList.size() != a.MySortList.size())
            return null;

        SortedIntegerList res = new SortedIntegerList(flag);
        ListIterator<Integer> listIter1 = MySortList.listIterator();
        ListIterator<Integer> listIter2 = a.MySortList.listIterator();
        int c = 0; int p = 0;
        while (listIter1.hasNext() && listIter2.hasNext()) {
            c = listIter1.next();
            p = listIter2.next();
            int s = c + p;
            res.add(s);
        }
        return res;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        ListIterator<Integer> listIter = MySortList.listIterator();
        while(listIter.hasNext()){
            str.append(listIter.next() + " ");
        }
        return str.toString();
    }

    public boolean equals(Object o) {
        if(!(o instanceof SortedIntegerList))   //this.getClass() != o.getClass()
            return false;

        SortedIntegerList obj = (SortedIntegerList) o;
        if(MySortList.size() != obj.MySortList.size())
            return false;


        ListIterator<Integer> listIter1 = MySortList.listIterator();
        ListIterator<Integer> listIter2 = obj.MySortList.listIterator();
        while(listIter1.hasNext() && listIter2.hasNext()){
            if(listIter1.next() != listIter2.next()){
                return false;
            }
        }
        return true;
    }
}