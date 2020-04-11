package ArrayPrograms;
public class Date 
{
	int dd;
	int mm;
	int yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dname[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public Date(int dd, int mm, int yy) 
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		//1946*365+(1946/400+1946/4-1946/100)+(31+28+31+30+31+30+31+15)
		if(yy%400==0||yy%4==0&&yy%100!=0)
			month[2]=29;
	}
	
	int noOfDays()
	{
		int days=0;
		int y=yy-1;
		days=days+y*365;
		//2019+365+(2019/400+2019/4-2019/100)+31+7
		days=days+y/400+y/4-y/100;
		for (int i=1;i<mm;i++) 
			days=days+month[i];
		days=days+dd;
		return days;
	}
	
	public String getDayName()
	{
		int days=this.noOfDays();
		return dname[days%7];
	}
}
