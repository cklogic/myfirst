package mongodb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{   
		       
		         MongoClient mongoClient = new MongoClient( "123.207.221.15" , 27017 );
		         MongoDatabase mongoDatabase = mongoClient.getDatabase("test");  
		       System.out.println("Connect to database successfully");
		        
		      }catch(Exception e){
		        System.err.println("FAILE");
		     }
	}

}
