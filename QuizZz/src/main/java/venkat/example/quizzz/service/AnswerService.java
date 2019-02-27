package venkat.example.quizzz.service;

import java.util.List;

import venkat.example.quizzz.exceptions.ResourceUnavailableException;
import venkat.example.quizzz.exceptions.UnauthorizedActionException;
import venkat.example.quizzz.model.Answer;
import venkat.example.quizzz.model.Question;

public interface AnswerService {
	Answer save(Answer answer) throws UnauthorizedActionException;

	Answer find(Long id) throws ResourceUnavailableException;

	Answer update(Answer newAnswer) throws UnauthorizedActionException, ResourceUnavailableException;

	void delete(Answer answer) throws UnauthorizedActionException, ResourceUnavailableException;

	List<Answer> findAnswersByQuestion(Question question);

	int countAnswersInQuestion(Question question);
}
