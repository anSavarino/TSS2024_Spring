package creazionali.builder;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {

		User u = createUser();
		
		UserDTOBuilder builder= new UserWebDTOBuilder();
		
		UserDTO dto = directBuild(builder, u);
		System.out.println(dto);
		
	}

	private static UserDTO directBuild(UserDTOBuilder builder, User u) {
		
		return builder.withFirstName(u.getFirstName())
					  .withFirstName(u.getLastName())
					  .withBirthday(u.getBirthday())
					  .withAddress(u.getAddress())
					  .build();
	}

	public static User createUser() {
		User user = new User();
		
		user.setFirstName("Mauro");
		user.setLastName("Bogliaccino");
		user.setBirthday(LocalDate.of(1969, 7, 28));
		
		Address a = new Address();
		a.setCity("TORino");
		a.setHouseNumber("22/A");
		a.setState("Italia");
		a.setStreet("Via Carlo Alberto");
		a.setZipcode("10122");
		
		user.setAddress(a);
		
		return user;
	}
}
