
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package flows.webserviceClients.currencyConvertor.net.webservicex;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-05T09:28:40.553+05:30
 * Generated source version: 3.0.0-milestone2
 * 
 */

@javax.jws.WebService(
                      serviceName = "CurrencyConvertor",
                      portName = "CurrencyConvertorHttpPost",
                      targetNamespace = "http://www.webserviceX.NET/",
                      wsdlLocation = "http://www.webservicex.net/CurrencyConvertor.asmx?WSDL",
                      endpointInterface = "net.webservicex.CurrencyConvertorHttpPost")
                      
public class CurrencyConvertorHttpPostImpl implements CurrencyConvertorHttpPost {

    private static final Logger LOG = Logger.getLogger(CurrencyConvertorHttpPostImpl.class.getName());

    /* (non-Javadoc)
     * @see net.webservicex.CurrencyConvertorHttpPost#conversionRate(java.lang.String  fromCurrency ,)java.lang.String  toCurrency )*
     */
    public double conversionRate(java.lang.String fromCurrency,java.lang.String toCurrency) { 
        LOG.info("Executing operation conversionRate");
        System.out.println(fromCurrency);
        System.out.println(toCurrency);
        try {
            double _return = 0.0;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
