public class ComandoConsultaMaterial implements Comando {

	private Biblioteca biblioteca;

		
	public ComandoConsultaMaterial(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}


	public String executa(String[] arg) {
		
		if(arg.length == 1) {
		
			System.out.println(arg[0].toString());
			
			int c = Integer.parseInt(arg[0]);
			
			return biblioteca.consultaMaterial(c);
			
		}
		
		return "Erro! Número inválido de argumentos" + System.getProperty("line.separator");
		
	}

}
