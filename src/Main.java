import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        Queue<People> Nam = new LinkedList<>();
        Queue<People> Nu = new LinkedList<>();
        People person1= new People("Vu","Nam",21);
        People person2 = new People("Phu","Nam",20);
        list.add(person1);
        list.add(person2);
        for( People i : list)
        {
            if(i.gender=="Nam")
            {
                Nam.add(i);
            }else if(i.gender=="Nu")
            {
                Nu.add(i);
            }
        }
        for(People i : Nam)
            System.out.println(i.name);

    }
    private static class People{
        private int age;
        private String name;
        private String gender;
        People(String name, String gender,int age)
        {
            this.age=age;
            this.gender=gender;
            this.name=name;
        }
        People()
        {};
    }
}