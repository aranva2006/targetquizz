package venkat.example.quizzz.service.usermanagement;

import venkat.example.quizzz.model.User;

public interface RegistrationService {
	User startRegistration(User user);

	User continueRegistration(User user, String token);

	boolean isRegistrationCompleted(User user);
}
