class UseInner
{

   

	void abc(jjj ob)
	{
		ob.abcj();
	}


	public static void main(String[] args) 
	{


	/*	UseInner ui=new UseInner();
		ui.abc(new jjj(){void abcj()
								{
									System.out.println("annonymous inner class overrirden meth" + b);
						
									}
									
						}
						
				);
	*/

jjj oo= new jjj()
		{
		   void abcj()
			{

			   	System.out.println("annonymous inner class overrirden meth" + b);
			}

		};

		oo.abcj();

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
	
