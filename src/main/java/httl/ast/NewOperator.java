package httl.ast;

public class NewOperator extends UnaryOperator {

	public NewOperator(String name, int priority, int offset) {
		super(name, priority, offset);
	}

	@Override
	public String toString() {
		return "new " + getName() + "(" + getParameter() + ")";
	}

}
