package exception;
import java.sql.Connection;
import java.sql.SQLException;
public class Try {
    public static void main(String[] args){
        Connection conn = null;
        try {
            conn.commit();
        }catch (SQLException i){
            System.out.println("Catch SQLException");}
            catch (Exception k) {
                k.printStackTrace();
            }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
}
