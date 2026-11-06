package mycrud;

import java.io.Serializable;

public class gender implements Serializable {
int id;
String name;

public gender() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
