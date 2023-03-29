package example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

public class Main {

	    public static void main(String[] args) throws IOException {
	    	ArrayList<Faturamento> faturamentos = new ArrayList<>();
	        String json
	                = new String(Files.readAllBytes(Paths.get("src/resources/dados.json")));
	        JSONArray jsonArray = new JSONArray(json);
	        for (int i = 0; i < jsonArray.length(); i++) {
	            JSONObject obj = jsonArray.getJSONObject(i);
	            int  dia= obj.getInt("dia");
	            double valor = obj.getDouble("valor");
	            
	            faturamentos.add(new Faturamento(dia,valor)); 
	            
	          }
	        
	        double maxFat = faturamentos.get(0).getValor();
	        double minFat = faturamentos.get(0).getValor();
	        double media = 0;
	        double somMedia = 0;
	        int diaUtiu = 0;
	        for(int i = 1; i<faturamentos.size();i ++) {
	        	if(faturamentos.get(i).getValor() > maxFat ) {
	        		maxFat = faturamentos.get(i).getValor();
	        		
	        		}
	        	if(faturamentos.get(i).getValor()< minFat) {
	        		minFat = faturamentos.get(i).getValor();
	        		
	        		
	        	}
	        	if(faturamentos.get(i).getValor()!= 0){
	        		somMedia+=faturamentos.get(i).getValor();
	        		diaUtiu++;
	        	}
	        	
	        	
		        
	        	
	        }
	        media = somMedia/diaUtiu; 
	        
	        faturamentos.forEach(faturamento ->  System.out.println("DIA: "+faturamento.getDia() + " VALOR: " + faturamento.getValor() ));
	        System.out.println("Valor do maior dia: " + maxFat +
	        		"\nValor do menor dia:  " + minFat +"\nmedia: " + media);
	    }
}
