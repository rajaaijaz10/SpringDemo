import java.io.*;
import java.net.*;


public class CallApi extends Thread{
    public static String res="";
    public void run() {

    try {
        while (true){
            String urlToRead="https://x.wazirx.com/wazirx-falcon/api/v2.0/crypto_rates";
            StringBuilder result = new StringBuilder();
            URL url = new URL(urlToRead);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                for (String line; (line = reader.readLine()) != null; ) {
                    result.append(line);
                }
            }
            res= result.toString();
            this.wait(100000);
        }
    }
    catch (Exception e){

    }

        }

    }