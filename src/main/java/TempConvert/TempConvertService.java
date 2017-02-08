package TempConvert;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by pyoung on 2017-02-06.
 */
@WebService
public interface TempConvertService {
    @WebMethod(operationName = "fahrenheitToCelsius")
    public double fahrenheitToCelsius(@WebParam(name = "f") double f);

    @WebMethod(operationName = "celsiusToFahrenheit")
    public double celsiusToFahrenheit(@WebParam(name = "c") double c);
}
