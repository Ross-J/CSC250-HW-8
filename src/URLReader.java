import java.net.URL;
import java.util.Scanner;

public class URLReader 
{
	private String urlString;
	private String theURLContents;
	
	public URLReader(String urlString) 
	{
		this.urlString = urlString;
		this.theURLContents = "";
		
		//get the contents of that URL and fill theURLContents
		this.readFromURL();
	}
	
	public String gettheURLContents()
	{
		return this.theURLContents;
	}
	
	public void display()
	{
		System.out.println(this.theURLContents);
	}
	
	private void readFromURL()
	{
		String line = "";
		try
		{
			URL url = new URL(this.urlString);
			Scanner input = new Scanner(url.openStream()); //reading from the input stream associated with the url

			//keep reading from the scanner as long as there is something to read
			while (input.hasNext())
			{
				line += input.nextLine();
			}

			// close our reader
			input.close();
			}
		catch(Exception e)
		{
			e.printStackTrace();
			line = "Can't Connect";
		}
		this.theURLContents = line;
	}
}
