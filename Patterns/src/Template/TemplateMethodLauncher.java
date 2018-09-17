package Template;

public class TemplateMethodLauncher {

	public static void main(String[] args) {
		
		CrossCompiler IPhone = new IPhoneCompiler();
		
		IPhone.CrossCompile();
		
		CrossCompiler android = new AndroidCompiler();
		
		android.CrossCompile();

	}

}
