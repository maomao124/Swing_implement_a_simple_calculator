import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Project name(项目名称)：Swing实现简单计算器
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/21
 * Time(创建时间)： 13:43
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test2
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("测试");                                       //初始化顶层面板
        jFrame.setSize(1280, 720);
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;       //获取屏幕宽度
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;     //获取屏幕高度
        jFrame.setLocation(screenWidth / 2 - jFrame.getWidth()/2, screenHeight / 2 - jFrame.getHeight()/2);  //位于屏幕中央
        jFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        jFrame.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println(e.getKeyCode());
            }
        });
        jFrame.setVisible(true);
        jFrame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(1);
            }
        });
    }
}
