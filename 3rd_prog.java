import java.util.*;

class DisplayOperations extends Operations
{
    public void showAttributes()
	{
        System.out.prinltn(this.id);
        System.out.prinltn(this.name);
        System.out.prinltn(this.percentage);
        System.out.prinltn(this.skills);
    }
    public void showNAME()
	{
        System.out.prinltn(this.name.toUpperCase());
    }
    public void showDifference(Student s2)
	{
        System.out.prinltn(this.percentage-s2.percentage);
    }
}

