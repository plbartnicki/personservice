import com.mongodb.*;
import org.junit.Test;

/**
 * Created by klb on 21.08.18.
 */
public class SimpleTests {

    @Test
    public void testConnection() {
        MongoClient mongoClient = new MongoClient();
        //   MongoClient mongo = new MongoClient( "localhost" , 27017 );

        DB database = mongoClient.getDB("mydb");
        DBCollection collection = database.getCollection("persons");

//        DBObject query = new BasicDBObject("age", "30");
//        DBCursor cursor = collection.find(query);



        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("age", 30);

        DBCursor cursor = collection.find(searchQuery);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }
}
