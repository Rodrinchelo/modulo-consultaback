package edu.moduloalumno.component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.moduloalumno.model.PruebaTCambio;

@Component("floatformat")
public class FloatFormat {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private static String dateString = format.format( new Date()   );
	
	public float round(float number, int decimalPlace) {
		BigDecimal bd = new BigDecimal(number);
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.floatValue();
	}
	
	// tipo de cambio api sunat
	public PruebaTCambio dolares_a_soles(String fecha) throws MalformedURLException, ParseException {

		logger.info("fuck "+fecha);
		
  		PruebaTCambio p= null;		
  		URL url = new URL("https://api.sunat.cloud/cambio/"+fecha);
		ObjectMapper mapper = new ObjectMapper();

		try {				
			
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(url.openStream()));

	        String inputLine="",lineafinal="";
	        int campos=0;
	        while ((inputLine = in.readLine()) != null) {
	        	if(campos == 2 || campos == 3)
	        			lineafinal+=inputLine;
	         campos++;
	        }
	        
	        lineafinal="{"+lineafinal+"}";
	        
	        logger.info("cuerpo "+lineafinal.trim());
	        
	        Reader reader = new StringReader(lineafinal.trim());
	        p = mapper.readValue(reader, PruebaTCambio.class);
			
			logger.info("> objeto "+p);
			if(p.getCompra() == 0.0 ) {
				logger.info("> string "+ dateString);
				p=dolares_a_soles(dateString);
			}
			logger.info("> objeto "+p);
			in.close();
		
		} catch (IOException e){
			System.out.println("ERROR! USUARIOS NO GUARDADOS : " + e.getMessage());
		}
	
		return p; 
  	}
	
}
