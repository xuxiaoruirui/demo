import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class Tes {

    public static void main(String[] args) throws SQLException {
        List<Map> list=new ArrayList();
        for (int i = 0; i < 11; i++) {
            Connection connection= DataSourceUtils.getConnection();

            PreparedStatement ps=connection.prepareStatement("select * from  tmp.real_time_users");
            ResultSet resultSet= ps.executeQuery();
            Map<String,Object> map=new HashMap();
            while (resultSet.next()){
                map.put(connection.toString(),i);
               /* map.put("date",resultSet.getString("date"));
                map.put("hours",resultSet.getString("hours"));
                map.put("countrycode",resultSet.getString("countrycode"));
                map.put("usercount",resultSet.getString("usercount"));*/
            }
            list.add(map);
            ps.close();
            connection.close();
        }
        list.stream().forEach(System.out::println);
    }
}
