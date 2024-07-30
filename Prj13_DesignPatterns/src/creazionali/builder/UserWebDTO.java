package creazionali.builder;

public class UserWebDTO implements UserDTO {

	private String name;
	private String address;
	private String age;
	
	
	
	public UserWebDTO(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.address;
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserWebDTO [name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	
	
}
