public class TempLocation
{
	public static void main(String args[])
	{
		TempLocation tempLocation = new TempLocation();
		tempLocation.initiate();
	}
	
	private void initiate()
	{
		String tempFileLoc = System.getenv("TEMP");
		System.out.println("TEMP file location for this system is " + tempFileLoc);
	}
}
