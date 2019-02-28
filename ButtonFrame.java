import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ButtonFrame extends JFrame implements ActionListener
{
  public ButtonFrame()
  {
    setBounds(100, 100, 400, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());

    JPanel myButtonPanel = new JPanel();
    myButtonPanel.setLayout(new FlowLayout());

    JButton button1 = new JButton("Button 1");
    button1.addActionListener(this);
    JButton button2 = new JButton("Button 2");
    button2.addActionListener(new SeperateActionListener());
    JButton button3 = new JButton("Button 3");
    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Button 3 pressed");
      }
    });

    myButtonPanel.add(button1);
    myButtonPanel.add(button2);
    myButtonPanel.add(button3);

    contentPane.add(myButtonPanel, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e)
  {
    System.out.println("ButtonFrame action performed");
    System.out.println(e);
  }
}
