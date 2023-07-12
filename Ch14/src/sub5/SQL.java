package sub5;

public class SQL {

	public static final String INSERT_USER 
		= "INSERT INTO user1 VALUES(?, ?, ?, ?)";
	
	public static final String SELECT_USERS
		= "SELECT * FROM user1";
	
	public static final String SELECT_USER
		= "SELECT * FROM user1 WHERE uid = ?";
	
	public static final String UPDATE_USER
		= "UPDATE user1 SET "
				+ " name = ?, "
				+ " hp = ?, "
				+ " age = ? "
				+ " WHERE uid = ? ";
	
	public static final String DELETE_USER
		= "DELETE FROM user1 WHERE uid = ?";
}
