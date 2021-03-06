/**
 * 
 */
package com.ucreativa.Transacciones.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.ucreativa.Transacciones.Cheque;
import com.ucreativa.Transacciones.Pago;
import com.ucreativa.Transacciones.Transaccion;
import com.ucreativa.Transacciones.Transferencia;
import com.ucreativa.Transacciones.cuentas.CuentaBancaria;
import com.ucreativa.Transacciones.cuentas.CuentaCorriente;
import com.ucreativa.Transacciones.cuentas.CuentaElectronica;
import com.ucreativa.Transacciones.cuentas.DepositoAPlazo;

/**
 * @author Heinz Gamboa
 * updated by Juan Gutierrez
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CuentaBancaria>  myAccounts = new ArrayList<CuentaBancaria>();
		Usuario myUser = new Usuario("John", "Doe", "123456789", "johndoe@test.com", "johndoe01", "password",myAccounts);
		
		ArrayList<Usuario> usuariosFirmantes = new ArrayList<Usuario>();
		usuariosFirmantes.add(myUser);
		
		
		CuentaCorriente myRegularAccount = new CuentaCorriente(120000.00,700024.50,2322.56, "CR123456789014785",1.5,"USD",1,999);
		LocalDate fechaVencimiento = LocalDate.now().plusYears(4);
		CuentaElectronica myElectronicAccount = new CuentaElectronica(300.00,587.85,4.09, "CR123456789032145",3.5,"USD","9874563214785236",fechaVencimiento,3654);
		DepositoAPlazo myDeposit = new DepositoAPlazo(5000.00,5000.00,0.00,"CR123456789025896",12.0,"USD","Certificado John", 365);
		
		ArrayList<Transaccion> myTransactions = new ArrayList<Transaccion>();
		LocalDate checkDate = LocalDate.now().minusDays(7);
		LocalDateTime datetimeTransaccion = LocalDateTime.now().minusDays(7);
		Cheque myCheck = new Cheque("12345",datetimeTransaccion,"Cheque Alquiler Casa",700.00,"Debito",true,"USD","Juan Gutierrez" , 123, true, false, checkDate, usuariosFirmantes);
		Transaccion myTransaccion1 =new Transaccion("12346",datetimeTransaccion,"Cobro Intereses Moratorios",100.00,"Debito",true,"USD");
		Transaccion myTransaccion2 = new Transaccion("12347",datetimeTransaccion,"Credito Promoción La Guacamaya",100.00,"Credito",true,"USD");
		Transferencia myTransfer = new Transferencia("12347",datetimeTransaccion,"Transferencia Cuota Universidad",100.00,"Credito",true,"USD",1,"CR123456789014785","CR123456789032145");
		myTransactions.add(myCheck);
		myTransactions.add(myTransaccion1);
		myTransactions.add(myTransaccion2);
		myTransactions.add(myTransfer);
		myRegularAccount.setArregloTransacciones(myTransactions);
		
		System.out.println(myRegularAccount.listarTransacciones());
		
		
		//Añadir Cuentas a Usuario 
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
		System.out.println(myTransaccion1.toString());
		System.out.println(myTransaccion2.toString());
		System.out.println(myTransfer.toString()); 
	}
}
