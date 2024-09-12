



package beginnerlevel;

public class StaticVariable1 {
    String name;
    int id;
    static String universityName="AUST";
    
    StaticVariable1(String n,int i)
    {
        name=n;
        id=i;
    }
    
    void DisplayInformation()
    {
        System.out.println("\n\nName: "+name);
        System.out.println("Id: "+id);
        System.out.println("University: "+universityName);
    }
}

















