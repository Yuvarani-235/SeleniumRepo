package week1.day2;

public class Browser {
	
	String launchBrowser(String browserName) {
		System.out.println("Browser Launched Successfully");
		return "Browser name is"+" "+browserName;
	}
	
	void loadurl() {
		System.out.println("Application url launched successfully");
	}

	public static void main(String[] args) {
		Browser br=new Browser();
		System.out.println(br.launchBrowser("Edge Browser"));
		br.loadurl();
	}

}
