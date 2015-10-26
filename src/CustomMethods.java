import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CustomMethods {

	// pass the file name as a string and the method output the entire file.
	public void fileOutput(String fileName){
		BufferedReader br = null;
		String line = null;

		try {
			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


