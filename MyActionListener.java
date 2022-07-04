import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyActionListener implements ActionListener{

    MyPanel panel;

    public MyActionListener(MyPanel panel){
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        panel.repaint();   
    }
}
