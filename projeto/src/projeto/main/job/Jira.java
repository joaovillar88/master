package projeto.main.job;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Jira {
	
	public static void main(String[] args){
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("https://issues.apache.org/jira/rest/api/2/search?jql=assignee=jayunit100");
		try {
			CloseableHttpResponse response1 = httpclient.execute(httpGet);
			System.out.println(response1.getStatusLine());
		    HttpEntity entity1 = response1.getEntity();
		    System.out.println("asd: " + entity1.getContentType());
		    EntityUtils.consume(entity1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
