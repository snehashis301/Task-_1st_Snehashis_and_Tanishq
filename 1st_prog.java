import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Student
{
    String name;
	int id;
	double percentage;
	String[] skills;

    public Student(String name, int id)
	{
        this.name=name;
		this.id=id;
    }
	public Student(int id, double percentage)
	{
		this.id=id;
		this.percentage=percentage;
	}
	public Student(String name, int id, String[] skills)
	{
		this.name=name;
		this.id=id;
		this.skills=skills;
	}
   public getName()
   {
		return this.name;

   }
   public getId()
   {
		return this.id;

   }
   public getPercentage()
   {
		return this.percentage;

   }
   public getSkills()
   {
		return Arrays.toString(this.skills);

   }
}
