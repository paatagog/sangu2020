package paybox.gui;

import paybox.Core;
import paybox.Logger;
import paybox.services.Service;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class Gui {

    private Core core;
    private JFrame frame;

    public void init(Core core) {
        this.core = core;
        frame = new JFrame("PayBox frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void showHomeScreen() {

    }

    public void showService(Service s) {
        // ამ ადგილზე გვჭირდება გვერდის გასუფთავება
        int serviceX = core.getScreenWidth()/2 - 300;
        JLabel lblServiceName = new JLabel();
        try {
            BufferedImage img = ImageIO.read(new File("c:\\Users\\amigo\\IdeaProjects\\sangu2020\\paybox\\conf\\services\\images\\telasi\\logo.png"));
            ImageIcon icon = new ImageIcon(img);
            lblServiceName.setIcon(icon);
        } catch (Exception ex) {
            Logger.log("ვერ მოხერხდა სერვისი ლოგოს წაკითხვა");
            Logger.log("სერვისი: " + s.getName());
            Logger.log("ლოგო: " + s.getLogo());
        }
        lblServiceName.setText(s.getName());
        lblServiceName.setSize(lblServiceName.getPreferredSize());
        lblServiceName.setLocation(serviceX, 20);
        frame.add(lblServiceName);

        JButton btnSend = new JButton("გადახდა");
        //btnSend.setText("გადახდა");
        btnSend.setSize(btnSend.getPreferredSize());
        btnSend.setLocation(serviceX, 600);

        btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                core.payService();
            }
        });

        frame.add(btnSend);

        frame.setVisible(false);
        frame.setVisible(true);

    }
}
