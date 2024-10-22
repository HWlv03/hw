package view;

import controller.Controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Order;
import model.OrderManager;

public class View extends JFrame {
    private final Order order = new Order();
    private final OrderManager orderManager = new OrderManager();
    private final JTextField jTextFieldSoure = new JTextField(20);
    private final JTextField jTextFieldType = new JTextField(20);
    private final JTextField jTextFieldQuantity = new JTextField(20);
    private final JTextField jTextFieldAge = new JTextField(20);
    private final JTextField jTextFieldPrice = new JTextField(20);
    private final JTextField jTextFieldVaccinationStatus = new JTextField(20);
    private final JTable jTableOutput = new JTable(orderManager.getDefauleTableModel());

    public View() {
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("GOOD LUCK FOR YOU");
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(1, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create
        JLabel jLabelSoure = new JLabel("Nhà cung cấp");
        JLabel jLabelType = new JLabel("Giống lợn");
        JLabel jLabelQuantity = new JLabel("Số lượng (con)");
        JLabel jLabelAge = new JLabel("Tuổi (ngày)");
        JLabel jLabelPrice = new JLabel("Giá (VNĐ)");
        JLabel jLabelVaccinationStatus = new JLabel("Tình trạng tiêm chủng (true/false)");
        JButton jButtonInput = new JButton("Nhập");
        JPanel jPanelInput = new JPanel(new GridLayout(6, 2, 20, 10));
        JPanel jPanelLeft = new JPanel(new BorderLayout());
        JPanel jPanelRight = new JPanel(new BorderLayout());
        
        //add
        jPanelInput.add(jLabelSoure);
        jPanelInput.add(jTextFieldSoure);
        jPanelInput.add(jLabelType);
        jPanelInput.add(jTextFieldType);
        jPanelInput.add(jLabelQuantity);
        jPanelInput.add(jTextFieldQuantity);
        jPanelInput.add(jLabelAge);
        jPanelInput.add(jTextFieldAge);
        jPanelInput.add(jLabelPrice);
        jPanelInput.add(jTextFieldPrice);
        jPanelInput.add(jLabelVaccinationStatus);
        jPanelInput.add(jTextFieldVaccinationStatus);
        jPanelLeft.add(jPanelInput, BorderLayout.NORTH);
        jPanelLeft.add(jButtonInput, BorderLayout.SOUTH);
        jPanelRight.add(new JScrollPane(jTableOutput), BorderLayout.CENTER);
        this.add(jPanelLeft);
        this.add(jPanelRight);
        
        //setfont
        Font fontJlabel = new Font("Roboto", Font.BOLD, 13);
        Font fontJtextField = new Font("Roboto", Font.PLAIN, 13);
        Font fontJbutton = new Font("Roboto", Font.BOLD, 20);
        Font fontJtable = new Font("Roboto", Font.BOLD, 12);
        jLabelSoure.setFont(fontJlabel);
        jLabelType.setFont(fontJlabel);
        jLabelQuantity.setFont(fontJlabel);
        jLabelAge.setFont(fontJlabel);
        jLabelPrice.setFont(fontJlabel);
        jLabelVaccinationStatus.setFont(fontJlabel);
        jTextFieldSoure.setFont(fontJtextField);
        jTextFieldType.setFont(fontJtextField);
        jTextFieldQuantity.setFont(fontJtextField);
        jTextFieldAge.setFont(fontJtextField);
        jTextFieldPrice.setFont(fontJtextField);
        jTextFieldVaccinationStatus.setFont(fontJtextField);
        jButtonInput.setFont(fontJbutton);
        jTableOutput.setFont(fontJtable);
        
        //set color
        jButtonInput.setBackground((new Color(184,225,255)));
        
        //add action
        ActionListener actionListener = new Controller(this);
        jButtonInput.addActionListener(actionListener);
    }
    
    public void Action() {
        order.setSoure(jTextFieldSoure.getText());
        order.setType(jTextFieldType.getText());
        order.setQuantity(Integer.parseInt(jTextFieldQuantity.getText()));
        order.setAge(Integer.parseInt(jTextFieldAge.getText()));
        order.setPrice(Double.parseDouble(jTextFieldPrice.getText()));
        order.setVaccinationStatus(Boolean.parseBoolean(jTextFieldVaccinationStatus.getText()));
        orderManager.update(order);
        jTextFieldSoure.setText("");
        jTextFieldType.setText("");
        jTextFieldAge.setText("");
        jTextFieldQuantity.setText("");
        jTextFieldPrice.setText("");
        jTextFieldVaccinationStatus.setText("");
    }
}
