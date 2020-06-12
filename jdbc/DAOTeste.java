package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Jo�o da Silva"));
		System.out.println(dao.incluir(sql, "Molly"));
		System.out.println(dao.incluir(sql, "Nathalie"));
		
		dao.close();
	}

}
