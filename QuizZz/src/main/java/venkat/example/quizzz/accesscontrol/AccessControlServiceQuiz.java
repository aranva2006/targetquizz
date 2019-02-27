package venkat.example.quizzz.accesscontrol;

import org.springframework.stereotype.Service;

import venkat.example.quizzz.exceptions.UnauthorizedActionException;
import venkat.example.quizzz.model.AuthenticatedUser;
import venkat.example.quizzz.model.Quiz;

@Service("AccessControlQuiz")
public class AccessControlServiceQuiz extends AccessControlServiceUserOwned<Quiz> {

	/*
	 * As long as the user is authenticated, it can create a Quiz.
	 */
	@Override
	public void canUserCreateObject(AuthenticatedUser user, Quiz object) throws UnauthorizedActionException {
		if (user == null) {
			throw new UnauthorizedActionException();
		}
	}

}
