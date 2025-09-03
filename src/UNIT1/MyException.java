package UNIT1;

public class MyException {
    public static void main(String[] args) {
        UserDefinedException u = new UserDefinedException();
        try{
            u.validate(12);
            u.validate(19);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
