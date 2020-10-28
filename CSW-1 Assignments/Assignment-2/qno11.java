//Write a java program to print null device of your system.

	import java.io.File;
	public class qno11{
		static String UNIX_NULL_DEV="/dev/null";
		static String WINDOWS_NULL_DEV="NUL:";
		static String FAKE_NULL_DEV="jnk";
		public static String getNullDev()
		{
			if (new File(UNIX_NULL_DEV).exists())
				return UNIX_NULL_DEV;
			String sys=System.getProperty("os.name");
			if(sys==null)
				return  FAKE_NULL_DEV;
			if(sys.startsWith("Windows"))
				return  WINDOWS_NULL_DEV;
			return FAKE_NULL_DEV;
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String devNull=getNullDev();
			System.out.println(devNull);

}
}