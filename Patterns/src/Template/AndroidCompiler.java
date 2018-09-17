package Template;

public class AndroidCompiler extends CrossCompiler {

	protected void collectSource() {
		System.out.println("Collecte des sources pour l'application Android.");
	}
	protected void compileToTarget() {
		System.out.println(("Compilation de l'application Android"));
	}
}
