package Abstracto;

//-> Una clase hereda de una clase abstracta
//   e implementa sus métodos.
public class ClaseHija1 extends ClaseAbstracta {

	@Override
	public void metodoNormal() {
		// TODO Auto-generated method stub
		super.metodoNormal();
		System .out .println( "He sido implementado en la clase hija" );
	}

	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
		System .out .println( "Soy un método abstracto" );
	}

	
	
}
