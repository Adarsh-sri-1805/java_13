package UNIT3;

import java.util.ArrayList;
import java.util.Collections;

public class Student_object {
    public static void main(String[] args) {
        ArrayList<Studetnt> stob = new ArrayList<Studetnt>();
        stob.add(new Studetnt(21,"Vijay",100));
        stob.add(new Studetnt(20,"jay",101));
        stob.add(new Studetnt(22,"Vi",102));
        stob.add(new Studetnt(19,"Vija",103));
        stob.add(new Studetnt(23,"Ajay",104));
        stob.add(new Studetnt(21,"Vija",105));
        Collections.sort(stob);
        for(Studetnt st : stob){
            System.out.println("Name "  + st.name+ " Age " + st.age + " Roll_No " +  st.roll_no);
        }
    }
}
