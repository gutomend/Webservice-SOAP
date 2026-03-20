package br.com.fiap.winery;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


@SOAPBinding

@WebService

public interface WineStockService {

    @WebMethod
    String getMenu();

    @WebMethod
    String placeOrder(String name, int quantity);


}
