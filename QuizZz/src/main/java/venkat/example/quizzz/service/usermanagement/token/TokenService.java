package venkat.example.quizzz.service.usermanagement.token;

import java.util.Date;

import venkat.example.quizzz.exceptions.InvalidTokenException;
import venkat.example.quizzz.model.TokenModel;
import venkat.example.quizzz.model.User;

public interface TokenService<T extends TokenModel> {
	T generateTokenForUser(User user);

	void validateTokenForUser(User user, String token) throws InvalidTokenException;

	void invalidateToken(String token);

	void invalidateExpiredTokensPreviousTo(Date date);
}
