package venkat.example.quizzz.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import venkat.example.quizzz.exceptions.ResourceUnavailableException;
import venkat.example.quizzz.exceptions.UnauthorizedActionException;
import venkat.example.quizzz.model.Quiz;
import venkat.example.quizzz.model.User;
import venkat.example.quizzz.model.support.Response;
import venkat.example.quizzz.model.support.Result;

public interface QuizService {
	Quiz save(Quiz quiz, User user);

	Page<Quiz> findAll(Pageable pageable);

	Page<Quiz> findAllPublished(Pageable pageable);

	Page<Quiz> findQuizzesByUser(User user, Pageable pageable);

	Quiz find(Long id) throws ResourceUnavailableException;

	Quiz update(Quiz quiz) throws ResourceUnavailableException, UnauthorizedActionException;

	void delete(Quiz quiz) throws ResourceUnavailableException, UnauthorizedActionException;

	Page<Quiz> search(String query, Pageable pageable);

	Result checkAnswers(Quiz quiz, List<Response> answersBundle);

	void publishQuiz(Quiz quiz);
}
