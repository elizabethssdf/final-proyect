package proyFinal;

public class Compra {
	
	 private double valor;
	private String descripcion;
	
	
	public Compra(double valor,String descripcion) {
		
		this.valor=valor;
		this.descripcion=descripcion;
		
		
	}
	
	
	
	
	//constructor
	
	
	  public double getvalor() {
		  return valor;
	  }
	  public String  getdescripcion() {
		  return descripcion;
	  }
	  
	  @Override
	  public String toString() {
	      return "Compra: valor = " + valor + ", descripcion = " + descripcion + '.';
	  }

	  
	
}
