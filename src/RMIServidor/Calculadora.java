/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package RMIServidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {

    public int factorial(int a) throws RemoteException;
}
