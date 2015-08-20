class UseInner
{

   

	void abc(JJJ ob)
	{
		ob.abcj();
	}


	public static void main(String[] args) 
	{


		UseInner ui=new UseInner();
		ui.abc(new jjj(){void abcj()
								{
									System.out.println("");
						
									}
									
						}
						
				);

	}
}

	class jjj
	{
		int b;
		jjj()
		{
			b=8;
		}
		void abcj()
		{
			System.out.println("abcj func inside jjj"+b);
		}

	};

/*
	class aaa extends jjj
	{int k=8;
		
		void abcj()
		{
			System.out.println(k);
		}

	};
*/
	
}
