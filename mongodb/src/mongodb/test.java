package mongodb;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MongoDatabase db = JDBC.getJDBC().getMongoDatabase();
			MongoCollection<Document> collection = db.getCollection("users");
			
			collection = db.getCollection("users");
			Document doc = new Document();
			doc.put("username", "admin");
			Bson filter = Filters.eq("_id","590db88be338f14649ad09ea");
			//collection.updateOne(filter, doc);
			
			
			BasicDBObject queryObject = new BasicDBObject("username","admin");
			
			
			
			FindIterable<Document> findIterable = collection.find();
			MongoCursor<Document> mongoCursor = findIterable.iterator();
			while (mongoCursor.hasNext()) {
				System.out.println(mongoCursor.next());
			}
			
				
			

		} catch (Exception e) {
			System.err.println("FAILE");
		}
	}

}
