package datmatikkerene22.webhuskeapp.Controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppStart implements ServletContextListener
{
    @Override
    public void contextInitialized(ServletContextEvent sce)
    {
//        ServletContextListener.super.contextInitialized(sce);




    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
