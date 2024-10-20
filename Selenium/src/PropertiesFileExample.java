import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./App.properties");
		Properties p=new Properties(); 
		p.load(file);
		String s= p.getProperty("url");
		System.out.println(s);
		
	}

	
}
