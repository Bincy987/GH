import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.kohsuke.github.GHBranch;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHTag;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.PagedIterable;

public class GhRead

{
	static GitHub gitHub;
	static GHRepository repo;
	static Map<String, GHBranch> gitbranches;
	private static PagedIterable<GHTag> gittags;
	
	
	public static void main(String[] args)
	{
		
		
		try 
		{
			FileInputStream fis = new FileInputStream("cred.properties");
			
			Properties properties= new Properties();
			properties.load(fis);
			
			//properties.loadFromXML(fis);
			String username = properties.getProperty("Username");
			String password = properties.getProperty("Password");
			
			gitHub = GitHub.connectUsingPassword(username, password);
			repo=gitHub.getRepository("Bincy987/GH");
			
			//GitHub gitHub = GitHub.connectAnonymously();
		
			/*gitbranches= repo.getBranches();
			
	
			System.out.println(gitbranches.values());
			

			
			System.out.println("****************************");
			
			gittags = repo.listTags();
			for(GHTag repotag:gittags)
			{
				System.out.print(repotag.getName()+",");
				
				
			}*/
	
		
		
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
