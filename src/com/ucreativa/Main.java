/**
 * 
 */
package com.ucreativa;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Heinz Gamboa
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario myUser = new Usuario("John", "Doe", "123456789", "johndoe@test.com", "johndoe01", "password",myAccounts);
		
		ArrayList<Usuario> usuariosFirmantes = new ArrayList<Usuario>();
		usuariosFirmantes.add(myUser);
		
		
		CuentaCorriente myRegularAccount = new CuentaCorriente(120000.00,700024.50,2322.56, "CR123456789014785",1.5,"USD",1,999);
		LocalDate fechaVencimiento = LocalDate.now().plusYears(4);
		CuentaElectronica myElectronicAccount = new CuentaElectronica(300.00,587.85,4.09, "CR123456789032145",3.5,"USD","9874563214785236",fechaVencimiento,3654);
		DepositoAPlazo myDeposit = new DepositoAPlazo(5000.00,5000.00,0.00,"CR123456789025896",12.0,"USD","Certificado John", 365);
		
		ArrayList<Transaccion> myTransactions = new ArrayList<Transaccion>();
		LocalDate checkDate = LocalDate.now().minusDays(7);
		Cheque myCheck = new Cheque("Juan Gutierrez" , 123, true, false, checkDate, usuariosFirmantes);
		Transaccion myTransaccion =new Transaccion();
		Transaccion myTransaction = new Transaccion();
		Transferencia myTransfer = new Transferencia();
		myRegularAccount.setArregloTransacciones(myTransactions);
		
		
		ArrayList<CuentaBancaria>  myAccounts = new ArrayList<CuentaBancaria>();
		myAccounts.add(myRegularAccount);
		myAccounts.add(myElectronicAccount);
		myAccounts.add(myDeposit);
		
		myUser.setArregloCuentas(myAccounts);
		
		
		Pago myPayment = new Pago(myUser);
		ReponerTarjeta myLostCard = new ReponerTarjeta(myUser);
		
		//myAccounts.toString();
		System.out.println(myUser.toString());
		System.out.println(myCheck.toString());
		System.out.println("Clase Cuenta Corriente: => " + myRegularAccount.toString());
		System.out.println("Clase Cuenta Eletronica: => " + myElectronicAccount.toString());
		System.out.println("Clase Dep�sito: => " + myDeposit.toString());
		System.out.println(myPayment.toString());
		System.out.println(myLostCard.toString());
		System.out.println(myTransaction.toString());
		System.out.println(myTransfer.toString()); 
	}
}
