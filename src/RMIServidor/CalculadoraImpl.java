/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RMIServidor;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    
    @Override
    public int factorial(int a) throws RemoteException {
        int res=1;
        for (int i = 1; i <= a; i++) {
            res=res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        try {
            // Crear el objeto servidor
            CalculadoraImpl servidor = new CalculadoraImpl();

            // Registrar el servicio en el registro RMI
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.bind("CalculadoraService", servidor);

            System.out.println("Servidor listo.");
        } catch (Exception e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }
}