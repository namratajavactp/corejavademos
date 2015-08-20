class Mydate 
{
	int date,month,year;
	Mydate (int dd, int mm,int yy)
	{
		date=dd;
		month=mm;
		year=yy;
	}
void display()
	{
	System.out.println(date+"/"+month+"/"+year);
	}

	public static void main(String[] args) 
	{
		Mydate date= new Mydate(4,4,4);
date.display();
			}
}
