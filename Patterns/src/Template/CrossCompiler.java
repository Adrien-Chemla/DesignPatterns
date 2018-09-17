package Template;

public abstract class CrossCompiler {

		public final void CrossCompile() {
			collectSource();
			compileToTarget();
		}
		
		protected abstract void collectSource();
		protected abstract void compileToTarget();
}
