package UNIT3;

public class Studetnt implements Comparable<Studetnt>{
    int age;
    String name;
    int roll_no;
    public Studetnt(int age, String name, int roll_no) {
        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
    }
    public int compareTo(Studetnt s){
        if(age==s.age)return 0;
        else if(age > s.age)
            return 1;
        else return -1;
    }
}
