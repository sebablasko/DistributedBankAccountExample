package cl.uchile.dcc.cc5303;

import cl.uchile.dcc.cc5303.entities.Bank;
import cl.uchile.dcc.cc5303.entities.IBank;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

    public static final String URL_SERVER = "rmi://localhost:1099/bancoServer";

    public static void main(String[] args) {

        IBank myBank;

        try{
            myBank = new Bank();
            Naming.rebind(URL_SERVER, myBank);
            System.out.println("Objeto banco publicado en: " + URL_SERVER);

        }catch (RemoteException e){
            e.printStackTrace();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

}
