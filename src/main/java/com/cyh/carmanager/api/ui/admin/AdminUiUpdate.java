package com.cyh.carmanager.api.ui.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminUiUpdate extends JFrame {

    private JPanel contentPane;
    private JTextField text;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminUiUpdate frame = new AdminUiUpdate();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AdminUiUpdate() {
        setTitle("车辆信息修改界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 851, 597);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("序      号：");
        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        lblNewLabel.setBounds(60, 48, 133, 42);
        contentPane.add(lblNewLabel);

        JLabel label = new JLabel("车       型：");
        label.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        label.setBounds(60, 116, 143, 35);
        contentPane.add(label);

        JLabel label_1 = new JLabel("车       主：");
        label_1.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        label_1.setBounds(60, 177, 143, 35);
        contentPane.add(label_1);

        JLabel label_2 = new JLabel("价格(元/天)：");
        label_2.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        label_2.setBounds(60, 238, 159, 35);
        contentPane.add(label_2);

        JLabel label_3 = new JLabel("颜       色：");
        label_3.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        label_3.setBounds(60, 300, 159, 35);
        contentPane.add(label_3);

        JLabel label_4 = new JLabel("以租用(否)：");
        label_4.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        label_4.setBounds(60, 366, 159, 35);
        contentPane.add(label_4);

        text = new JTextField();
        text.setBounds(227, 48, 512, 39);
        contentPane.add(text);
        text.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(227, 112, 512, 39);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(227, 173, 512, 39);
        contentPane.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(227, 234, 512, 39);
        contentPane.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(227, 296, 512, 39);
        contentPane.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(227, 362, 512, 39);
        contentPane.add(textField_5);

        JButton btnNewButton = new JButton("提交");
        btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        btnNewButton.setBounds(91, 451, 149, 42);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("重置");
        btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        btnNewButton_1.setBounds(581, 452, 159, 41);
        contentPane.add(btnNewButton_1);

        JButton button = new JButton("取消");
        button.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        button.setBounds(331, 451, 159, 41);
        contentPane.add(button);
        setLocationRelativeTo(null);
    }

}
