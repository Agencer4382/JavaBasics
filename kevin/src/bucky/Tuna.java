package bucky;

public class Tuna {
private String girlName;

public void setName(String name) {
	girlName=name;
}

public String getName() {
	return girlName;
}

public void saying() {
	System.out.println("your first call was " +getName());
}

}
