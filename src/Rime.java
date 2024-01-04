import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rime {

    /*public Map<String, List<String>> cercaRime(String riga){
        BufferedReader br = new BufferedReader();
        Map<String,List<String>> result = new TreeMap<>();
        while((riga = br.readLine()) != null ) {
            riga = riga.toLowerCase();
            riga = riga.replaceAll("[^a-z0-9\\s]", " ").trim();
            String[] parole = riga.split("\\s+");
            for (String parola:parole) {
                if (parola.length()<4){
                    continue;
                }
                String finale = parola.substring(parola.length() -3);
                if (result.containsKey(finale)) {
                    List<String> oldValue = result.get(finale);
                    oldValue.add(parola);
                    result.put(finale, oldValue);
                }else {
                    List<String> oddValue = new ArrayList<>();
                    oddValue.add(parola);
                }
            }
        }
        return result;
    }*/
}
