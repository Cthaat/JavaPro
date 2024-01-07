package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test
{
    public static void main (String[] args)
    {
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");

        btn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "登录成功");
            }
        });

        panel.add(btn);

        win.setSize(700, 500);
        win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}
