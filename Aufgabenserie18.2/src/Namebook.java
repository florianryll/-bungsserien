import java.util.ArrayList;

public class Namebook {
	ArrayList<String> names;

	ArrayList<String> potentialFemaleNames= new ArrayList<String>();
	ArrayList<String> potentialMaleNames= new ArrayList<String>();
	public Namebook() {
		super();
		this.names = new ArrayList<String>();
		fillFemaleNames();
		fillMaleNames();
	}
	
	private void fillFemaleNames() {
		potentialFemaleNames.add("Dagmara");
		potentialFemaleNames.add("Daisy");
		potentialFemaleNames.add("Camille");
		potentialFemaleNames.add("Christiana");
		potentialFemaleNames.add("Dominique");
		potentialFemaleNames.add("Beverly");
	}
	private void fillMaleNames() {
		potentialMaleNames.add("Kevin");
		potentialMaleNames.add("Richard");
		potentialMaleNames.add("Alessandro");
		potentialMaleNames.add("Christian");
		potentialMaleNames.add("Alexander");
	}

	public void addName(String name) throws nameAlreadyExisits {
		for(String myName:names) {
			if(myName==name) {
				throw new nameAlreadyExisits();
			}
		}
		names.add(name);
	}

	public String giveNextFemaleName() throws noMoreFemaleNames {
		if(potentialFemaleNames.size()<1) {
			throw new noMoreFemaleNames();
		}
		String tmpName = potentialFemaleNames.get(0);
		potentialFemaleNames.remove(0);
		while(names.contains(tmpName)) {
			if(potentialFemaleNames.size()<1) {
				throw new noMoreFemaleNames();
			}
			tmpName = potentialFemaleNames.get(0);
			potentialFemaleNames.remove(0);
		}
		return tmpName;
	}

	public String giveName(Gender gender) {
		if(gender==Gender.male) {
			try {
				return giveNextMaleName();
			} catch (noMoreMaleNames e) {
				e.printStackTrace();
			}
		}else if(gender==Gender.female) {
			try {
				return giveNextFemaleName();
			} catch (noMoreFemaleNames e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private String giveNextMaleName() throws noMoreMaleNames {
		if(potentialMaleNames.size()<1) {
			throw new noMoreMaleNames();
		}
		String tmpName = potentialMaleNames.get(0);
		potentialMaleNames.remove(0);
		while(names.contains(tmpName)) {
			if(potentialMaleNames.size()<1) {
				throw new noMoreMaleNames();
			}
			tmpName = potentialMaleNames.get(0);
			potentialMaleNames.remove(0);
		}
		return tmpName;
	}


}
