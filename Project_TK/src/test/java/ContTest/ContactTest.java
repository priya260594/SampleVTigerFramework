package ContTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("Create Contact");
	}

	@Test
	public void modifyContTest() {
		System.out.println("Modify Contact");
	}

}
