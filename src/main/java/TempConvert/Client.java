package TempConvert;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by pyoung on 2017-02-08.
 */
public class Client {
    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/TempConvert?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://TempConvert/", "TempConvertServiceImplService");

        Service service = Service.create(url, qname);

        TempConvertService tempConvertService = service.getPort(TempConvertService.class);

        System.out.println("Testing 37 F to C");
        System.out.println(tempConvertService.fahrenheitToCelsius(37));

        System.out.println("Testing 22 C to F");
        System.out.println(tempConvertService.celsiusToFahrenheit(22));

    }
}
