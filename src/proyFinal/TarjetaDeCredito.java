package proyFinal;


import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {

	private double limite;
	private double saldo;
	private List<Compra>listaDeCompras;
	//constructor
	
	public TarjetaDeCredito(double limite) {
		
		this.limite=limite;
		this.saldo=limite;
		this.listaDeCompras=new ArrayList<>();
		
		
		
	}
	
	public boolean lanzarCompra(Compra compra) {
		if (this.saldo > compra.getvalor()) {
			
		         this.saldo -= compra.getvalor();
		         this.listaDeCompras.add(compra);
		         return true;
	}
	return false;
	
	}
	
	public double getlimite(){
		return limite;
		
	}
	
	public double getsaldo() {
		return saldo;
	}
	public List<Compra> getlistaDeCompra(){
		return listaDeCompras;
		
	}
	
}
