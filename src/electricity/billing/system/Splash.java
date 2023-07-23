
package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash()
    {
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2=i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        setVisible(true);
        for(int i=1;i<500;i+=2){
            setSize(i,i);
            setLocation(500,250);
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }  
        t=new Thread(this);
        t.start();
        setVisible(true);
    }
    public void run(){
        try
        {
            Thread.sleep(7000);
            setVisible(false);
            
            // login frame
            new Login();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        new Splash(); 
    }
}