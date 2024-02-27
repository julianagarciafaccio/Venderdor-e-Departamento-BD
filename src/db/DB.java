package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
        private static Connection con = null;

        public static Connection getConnection(){
            if (con == null){
                try {
                    Properties props = loadProperties();
                    String url = props.getProperty("dburl");
                    con = DriverManager.getConnection(url,props);
                } catch (SQLException e) {
                    throw new DbException(e.getMessage());
                }
            }
            return con;
        }

        private static Properties loadProperties(){
            try (FileInputStream fs = new FileInputStream("db.properties")){
                Properties props = new Properties();
                props.load(fs);
                return props;
            } catch (FileNotFoundException e) {
                throw new DbException(e.getMessage());
            } catch (IOException e) {
                throw new DbException(e.getMessage());
            }
        }

        public static void closeConnection(){
            if (con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new DbException(e.getMessage());
                }
            }
        }

}
