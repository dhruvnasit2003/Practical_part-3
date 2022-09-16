package mypackage;
public class Class
{
     
    int id;
     String name;     
    

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        System.out.println("Name of the person "+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        System.out.println("Id of the person "+id);
        return id;
    }

}


Main Java File
import mypackage.Class;
public class PP3_3_5 {
    public static void main(String[] args) {
        
        int id=21072;
        String name="Dhruv";
        Class c= new Class();
        c.setId(id);
        c.setName(name);
        c.getId();
        c.getName();
    }
}




