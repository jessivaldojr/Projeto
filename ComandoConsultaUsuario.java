public class ComandoConsultaUsuario implements Comando {

	private Biblioteca biblioteca;

		
	public ComandoConsultaUsuario() {
		this.biblioteca = Biblioteca.obeterBiblioteca();
	}


	public String executa(String[] arg) {
		
		if(arg.length == 1) {
			
			int c = Integer.parseInt(arg[0]);
		
			return biblioteca.consultaUsuario(c);
			
		}
		
		return "Erro! Número inválido de argumentos" + System.getProperty("line.separator");	
	}

}
