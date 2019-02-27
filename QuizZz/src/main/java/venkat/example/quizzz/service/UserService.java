package venkat.example.quizzz.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import venkat.example.quizzz.exceptions.ResourceUnavailableException;
import venkat.example.quizzz.exceptions.UnauthorizedActionException;
import venkat.example.quizzz.exceptions.UserAlreadyExistsException;
import venkat.example.quizzz.model.User;

public interface UserService extends UserDetailsService {
	User saveUser(User user) throws UserAlreadyExistsException;

	User find(Long id) throws ResourceUnavailableException;;

	User findByEmail(String email) throws ResourceUnavailableException;

	User findByUsername(String username) throws ResourceUnavailableException;

	User updatePassword(User user, String password) throws ResourceUnavailableException;

	void delete(Long user_id) throws UnauthorizedActionException, ResourceUnavailableException;

	User setRegistrationCompleted(User user) throws ResourceUnavailableException;

	boolean isRegistrationCompleted(User user) throws ResourceUnavailableException;

}