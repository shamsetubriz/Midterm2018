package design;

public abstract class  DistiguishedEmployee implements Employee{

    public final String ownerName = "John Smith";
    static String foundingYear = "1951";
    static String location = "Santa Monica, Calofornia";

    public void aoutCompany(){
        System.out.println("This company was found by " + ownerName + " in the year of " + foundingYear + " in " + location);
    }

    public abstract void aboutCompany(String globalBrances);



}
