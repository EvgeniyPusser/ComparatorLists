
import java.util.*;
import java.util.Map.Entry;

public class PhoneNums {


    public static void main(String[] args) {
        HashMap<String,ArrayList<Long>> m = new HashMap<String,ArrayList<Long>>();

        ArrayList<Long> a1 = new ArrayList<Long>();
        a1.add(89119876234L);
        a1.add(99818987878L);
        ArrayList<Long> a2 = new ArrayList<Long>();
        a2.add(89628987878L);
        a2.add(89018765645L);
        a2.add(89765675432L);
        a2.add(87896756548L);
        ArrayList<Long> a3 = new ArrayList<Long>();
        a3.add(89007654321L);
        ArrayList<Long> a4 = new ArrayList<Long>();
        a4.add(89012342345L);
        m.put("Петров Н.П.", a2);
        m.put("Сидоров К.Л.", a1);
        m.put("Молотова Н.П.", a3);
        m.put("Гинзбург В.И.", a4);

        SortedSet<Map.Entry<String, ArrayList<Long>>> sortedset = new TreeSet<Map.Entry<String, ArrayList<Long>>>(
                new Comparator<Entry<String,ArrayList<Long>>>() {

                    @Override
                    public int compare(Entry<String, ArrayList<Long>> arg1,
                                       Entry<String, ArrayList<Long>
                                               > arg0) {
                        return Integer.compare(arg0.getValue().size(), arg1.getValue().size());
                    }
                }
        );
        sortedset.addAll(m.entrySet());
        for (Map.Entry<String, ArrayList<Long>> em : sortedset){
            System.out.println(
                    em.getKey()+" : "+em.getValue()+"\n"+"========="+"\n"

            );
        }

    }

}