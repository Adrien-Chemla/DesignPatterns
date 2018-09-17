package Template;

public class IPhoneCompiler extends CrossCompiler {

	protected void collectSource() {
		System.out.println("Collecte des sources pour l'application Iphone.");
	}
	protected void compileToTarget() {
		System.out.println(("Compilation de l'application Iphone"));
	}
}
