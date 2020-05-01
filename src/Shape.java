
public class Shape {
	String text;
	String material;

	// 2 constructors
	public Shape() {

	}

	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}

	// method of toString
	@Override
	public String toString() {
		return "made of " + this.material + ", contains the text: " + this.text + ".";
	}

	// method of generate Hash Code
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	// method of equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	// method of calculate a area of form
	public double getSize() {
		return -1;
	}

}
