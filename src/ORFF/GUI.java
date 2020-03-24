package ORFF;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private JButton databaseButton = new JButton();
    private JButton choseFileButton = new JButton();
    private JButton blastButton = new JButton();

    private void setupGUI(){
        System.out.println("Setting up GUI");
    }

    private void showBLASTGUI(){
        System.out.println("Showing BLAST GUI");
    }

    private void showDbGUI(){
        System.out.println("Showing database GUI");
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
