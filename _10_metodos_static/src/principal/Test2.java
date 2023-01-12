package principal;

interface Printer {
	void imprime (String cad);
	//incluiremos un método estatico que proporciones una determinada
	// implememntacion de la interfaz
	
	static Printer of(){
		return new Printer() {
			@Override
			public void imprime(String cad) {
				System.out.println(cad);
			} 
		};
		
	}
}





public class Test2 {

	public static void main(String[] args) {
		Printer.of();

	}

}
