package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class JDBC {
	private static MongoDatabase mongoDatabase;
	private final static JDBC jdbc = new JDBC();
	private static MongoClient mongoClient;

	private JDBC() {
		mongoClient = new MongoClient("123.207.221.15", 27017);
	}

	public MongoDatabase getMongoDatabase() {
		if (mongoDatabase == null) {
			mongoDatabase = mongoClient.getDatabase("test");
		}
		return mongoDatabase;
	}

	public static JDBC getJDBC() {
		return jdbc;
	}
}
