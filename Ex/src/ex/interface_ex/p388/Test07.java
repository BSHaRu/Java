package ex.interface_ex.p388;

interface DataAccessObj{
	public void select();
	public void insert();
	public void update();
	public void delete();
}

class OracleDao implements DataAccessObj{

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
class MySqlDao implements DataAccessObj{
	
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("MySql DB에서 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}
}

public class Test07 {
	public static void dbWork(DataAccessObj dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
