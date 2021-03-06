package venkat.example.quizzz.service.usermanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import venkat.example.quizzz.model.User;
import venkat.example.quizzz.service.UserService;

@Service
public class RegistrationServiceSimple implements RegistrationService {

	@Autowired
	private UserService userService;

	@Override
	public User startRegistration(User user) {
		User newUser = userService.saveUser(user);
		userService.setRegistrationCompleted(newUser);

		return newUser;
	}

	@Override
	public User continueRegistration(User user, String token) {
		return null;
	}

	@Override
	public boolean isRegistrationCompleted(User user) {
		return userService.isRegistrationCompleted(user);
	}

}
