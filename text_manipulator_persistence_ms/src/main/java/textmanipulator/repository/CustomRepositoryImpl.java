package textmanipulator.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomRepositoryImpl implements ICustomRepository {

    @Autowired
    MongoTemplate mongoTemplate;

}