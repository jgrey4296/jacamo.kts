// CArtAgO artifact code for project simple

package example;

import cartago.*;


public class Counter extends Artifact {
	void init(int initialValue) {
		defineObsProperty("count", initialValue);
		System.out.println("jg java test");
		System.out.println(example.JG.jgtest());
	}

	@OPERATION
	void inc() {
		ObsProperty prop = getObsProperty("count");
		prop.updateValue(prop.intValue()+1);
		signal("tick");
	}

	@OPERATION
	void inc_get(int inc, OpFeedbackParam<Integer> newValueArg) {
		ObsProperty prop = getObsProperty("count");
		int newValue = prop.intValue()+inc;
		prop.updateValue(newValue);
		newValueArg.set(newValue);
	}

}

