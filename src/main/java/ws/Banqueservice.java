package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class Banqueservice {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 11;
    }
    @WebMethod
    public compte getcompte(@WebParam(name = "code")int code){
        return new compte(code, 8700, new Date());
    }
    @WebMethod
public List<compte> listComptes(){
        return List.of(
                new compte(1,8700,new Date()),
                new compte(2,8700,new Date()),
                new compte(3,8700,new Date())
        );
}
}
