package cn.eleven.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Before;
import org.junit.Test;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-10 22:19
 * @author: 十一
 */
public class MongodbTest {
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;

    @Before
    public void setup() {
        mongoClient = new MongoClient("127.0.0.1",27017);
        mongoDatabase = mongoClient.getDatabase("springboot");

    }

    @Test
    public void connect() {
        MongoDatabase mongoDatabase = mongoClient.getDatabase("springboot");
        System.out.println("<=== " + mongoDatabase.getName());
    }

    @Test
    public void printCollectionsDocuments() {
        MongoCollection<Document> collection = mongoDatabase.getCollection("errorInfo");
        System.out.println("<=== " + collection.countDocuments());

        FindIterable<Document> documents = collection.find();
        for (Document document : documents) {
            System.out.println("<=== en: " + document.get("en") +
            " cn: " + document.get("cn"));

        }
    }


}
