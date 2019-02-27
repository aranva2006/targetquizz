package venkat.example.quizzz.service;

import java.util.List;

import venkat.example.quizzz.exceptions.ResourceUnavailableException;
import venkat.example.quizzz.exceptions.UnauthorizedActionException;
import venkat.example.quizzz.model.Answer;
import venkat.example.quizzz.model.Question;
import venkat.example.quizzz.model.Quiz;

public interface QuestionService {
	Question save(Question question) throws UnauthorizedActionException;

	Question find(Long id) throws ResourceUnavailableException;

	List<Question> findQuestionsByQuiz(Quiz quiz);

	List<Question> findValidQuestionsByQuiz(Quiz quiz);

	Question update(Question question) throws ResourceUnavailableException, UnauthorizedActionException;

	void delete(Question question) throws ResourceUnavailableException, UnauthorizedActionException;

	Boolean checkIsCorrectAnswer(Question question, Long answer_id);

	void setCorrectAnswer(Question question, Answer answer);

	Answer getCorrectAnswer(Question question);

	Answer addAnswerToQuestion(Answer answer, Question question);

	int countQuestionsInQuiz(Quiz quiz);

	int countValidQuestionsInQuiz(Quiz quiz);
}
