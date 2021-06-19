/*Define a function to create a lookup table of size 216 whose value is the
parity bits of the index.*/



/*static void lookupcreator(int parity[])
    {
    	for(int i=0;i<65536;i++)
    	{
    		int x=i;
    		x^=x>>8;
    	     x^=x>>4;
    	     x^=x>>2;
    	     x^=x>>1;
    		parity[i]=(x&1);
    	}
    }*/
public class A1qno5 {
	public static int computepartity(int x){
	int result = 0;
   while (x != 0) {
	result^= 1;
	x &= (x - 1);
   }
   return result;
	}
	public static void lookupTable(){
	int parity[] =new int[(int)Math.pow(2, 16)];
	for(int i=0;i<parity.length;i++){
	parity[i]=computepartity(i);
	}
	}
	// public static void main(String[] args) {
	
	// }
   }

