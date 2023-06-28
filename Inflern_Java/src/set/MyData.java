package set;

import java.util.Objects;

// 불변 객체 - MyData
public class MyData {
	private String name;
	private int value;
	
	public MyData(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyData other = (MyData) obj;
		return Objects.equals(name, other.name) 
				&& value == other.value;
	}

	@Override
	public String toString() {
		return "MyData [name=" + name + 
				", value=" + value + "]";
	}

	
}
