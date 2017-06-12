package constructor;

public class argconstructor {
	
	
	      private int var;
	      public argconstructor(int num)
	      {
	             var=num;
	      }
	      public argconstructor() {
			// TODO Auto-generated constructor stub
		}
		public int getValue()
	      {
	              return var;
	      }
	      public static void main(String args[])
	      {
	              argconstructor  myobj = new argconstructor();
	              System.out.println("value of var is: "+myobj.getValue());
	      }
	}


