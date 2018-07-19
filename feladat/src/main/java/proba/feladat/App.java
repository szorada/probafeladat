package proba.feladat;

import java.io.IOException;

import com.google.gson.*;
import com.google.maps.*;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ApiException, InterruptedException, IOException
    {
        System.out.println( "Hello World!" );
        GeoApiContext context = new GeoApiContext.Builder()
        	    .apiKey("AIzaSyBWho6HmIO0hZlWRCM3OPNRr1qh7PcYusc")
        	    .build();
        System.out.println( context );
                
    }
}
