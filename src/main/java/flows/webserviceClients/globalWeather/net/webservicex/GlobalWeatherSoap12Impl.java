
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package flows.webserviceClients.globalWeather.net.webservicex;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-05T09:28:28.934+05:30
 * Generated source version: 3.0.0-milestone2
 * 
 */

@javax.jws.WebService(
                      serviceName = "GlobalWeather",
                      portName = "GlobalWeatherSoap12",
                      targetNamespace = "http://www.webserviceX.NET",
                      wsdlLocation = "http://www.webservicex.com/globalweather.asmx?WSDL",
                      endpointInterface = "net.webservicex.GlobalWeatherSoap")
                      
public class GlobalWeatherSoap12Impl implements GlobalWeatherSoap {

    private static final Logger LOG = Logger.getLogger(GlobalWeatherSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.GlobalWeatherSoap#getCitiesByCountry(java.lang.String  countryName )*
     */
    public java.lang.String getCitiesByCountry(java.lang.String countryName) { 
        LOG.info("Executing operation getCitiesByCountry");
        System.out.println(countryName);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see net.webservicex.GlobalWeatherSoap#getWeather(java.lang.String  cityName ,)java.lang.String  countryName )*
     */
    public java.lang.String getWeather(java.lang.String cityName,java.lang.String countryName) { 
        LOG.info("Executing operation getWeather");
        System.out.println(cityName);
        System.out.println(countryName);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
