import java.net.*;
import java.io.*;
public class NumVer {

    public static void main(String args[])throws MalformedURLException {
        try{
            URL url=new URL("http://apilayer.net/api/validate?access_key=000c29888a6f64ea24f649cb763b745f&number=3317081943&country_code=MX&format=1");
            URLConnection con=url.openConnection();
            BufferedReader bf=new BufferedReader(new InputStreamReader(con.getInputStream()));
            String linea;
            while((linea=bf.readLine())!=null){
                if(linea.equals("{") || linea.equals("}")){
                    
                }else{
                    System.out.println("[ + ] "+linea);
                }
            }
        }catch(IOException ioe){
            
        }
    }
}
