package venkat.example.quizzz.accesscontrol;

import org.springframework.stereotype.Service;

import venkat.example.quizzz.model.Question;

@Service
public class AccessControlServiceQuestion extends AccessControlServiceUserOwned<Question> {

}
