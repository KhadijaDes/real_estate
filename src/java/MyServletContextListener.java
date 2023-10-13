import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // This method is called when your web application is initialized (started).
        // You can perform initialization tasks here if needed.
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // This method is called when your web application is about to be destroyed (stopped).
        // You should unregister the JDBC driver and release any resources here.
        try {
            java.sql.Driver driver = DriverManager.getDriver("jdbc:sqlserver://localhost:1433;databaseName=Sweethome;encrypt=false;trustServerCertificate=false;");
            DriverManager.deregisterDriver(driver);
        } catch (SQLException e) {
            // Handle any exceptions that occur during driver deregistration
            e.printStackTrace();
        }
    }
}



//forerror
//05-Oct-2023 20:17:20.637 WARNING [http-nio-8084-exec-19] org.apache.catalina.loader.WebappClassLoaderBase
//.clearReferencesJdbc The web application [SweetHomepro] registered the JDBC driver [com.microsoft.sqlserver
//.jdbc.SQLServerDriver] but failed to unregister it when the web application was stopped. To prevent a memory 
//leak, the JDBC Driver has been forcibly unregistered.