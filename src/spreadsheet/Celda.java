package spreadsheet;
import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roger_Torra
 */
public class Celda  extends Observable implements Observer {

	private double value = 0.0;
	private String formula = null;
	private List<Celda> subjects = new ArrayList<Celda>();


	public void addSubject(Celda subject) {
		subject.addObserver(this);
		this.subjects.add(subject);
	}

	public void setValue(double val) {
		value = val;
		setChanged();
		notifyObservers();
	}

	public void setValue() {
		if (formula != null && !subjects.isEmpty()) {
			setValue(eval());
		}
	}

	public void update(Observable o, Object arg) {
		setValue();
	}

	public double getValue() { return value; }

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getFormula() {
		return formula;
	}

	public String toString() { return "" + value; }


	// FORMULA ::= PRODUCT ('+' PRODUCT)*
	// PRODUCT ::= COEFF '*' SUBJECT
	private double eval() {
		double result = 0.0;
		Scanner tokens = new Scanner(formula);
		for(int i = 0; i < subjects.size(); i++) {
			double value = subjects.get(i).getValue();
			double factor = tokens.nextDouble();
			result += factor * value;
			if (tokens.hasNext()) tokens.next(); // skip *
			if (tokens.hasNext()) tokens.next(); // skip si
			if (tokens.hasNext()) tokens.next(); // skip +
		}
		return result;
	}

}