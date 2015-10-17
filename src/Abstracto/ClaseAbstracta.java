package Abstracto;

public abstract class ClaseAbstracta {
	
	//-> Método normal
	public void metodoNormal() {
		System .out .println( "Soy un método normal" );
	}
	
	//-> Método Abstracto
	//   Todo método de este tipo obliga a que la clase que lo contienen sea abstracta.
	//   Los métodos abstractos no poseen cuerpo
	public abstract void metodoAbstracto();
	

}