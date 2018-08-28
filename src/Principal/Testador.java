package Principal;

import DAO.LivroDao;
import conexao.Conexao;
import dominio.Livro;

public class Testador {

	public static void main(String[] args) {
		
		Livro l = new Livro("Fire in the valley", "Prag prog","Ximbinha",4,35.87);
		
		Conexao c = new Conexao();
		LivroDao ldao = new LivroDao(c.abrirConexao());
		ldao.save(l);
		
		
		//Livro atualizado = new Livro("Valley of Genius", "Dont know", "Ximbinha", 3,56.78);
				
		//atualizado.setId(7);
		
		System.out.println("--------------------------");
		
		//ldao.update();
		//ldao.delete(5);
		System.out.println(ldao.list());
		//System.out.println(ldao.getOne(4));
		c.fechaConexao();
		
	}

}
