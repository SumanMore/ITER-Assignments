

	import java.util.*; 
	  
	public class q2
	{ 
		public static void main (String args[])
		{
			Scanner in=new Scanner(System.in);
	     int cd,cm,cy,bd,bm,by,d,m,y;
	     
	        int month[] = { 31, 28, 31, 30, 31, 30, 31,  
	                             31, 30, 31, 30, 31 }; 
	        System.out.println("Enter birth date in dd,mm,yy");

	        bd=in.nextInt();
	        bm=in.nextInt();
	        by=in.nextInt();
	        System.out.println("Enter current date in dd,mm,yy");

	        cd=in.nextInt();
	        cm=in.nextInt();
	        cy=in.nextInt();
	        
	        if(cd>bd)
	        {
	        	cd=cd+ month[bm-1];
	        	cm=cm-1;
	        
	        }
	        if(bm>cm)
	        {
	        	cy=cy-1;
	        	cm=cm+12;
	        }
	        d=cd-bd;
	        m=cm-bm;
	        y=cy-by;
	        System.out.println("Age is " +y+ " years " +m+ " months " +d+ " days");
		}}
	        
	        