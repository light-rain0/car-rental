package com.cyh.carmanager.api.ui.admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminUiInfo extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminUiInfo frame = new AdminUiInfo();
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
    public AdminUiInfo() {
        setFont(new Font("微软雅黑", Font.PLAIN, 20));
        setTitle("管理员详细信息界面");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 767, 652);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("车辆的详细信息：");
        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        lblNewLabel.setBounds(193, 13, 232, 53);
        contentPane.add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBounds(36, 79, 687, 435);
        contentPane.add(panel);

        JButton btnNewButton = new JButton("编辑");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /**
                 * 编辑
                 */
            }
        });
        btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        btnNewButton.setBounds(104, 537, 113, 37);
        contentPane.add(btnNewButton);

        JButton button = new JButton("提交");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /**
                 * 提交
                 */
            }
        });
        button.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        button.setBounds(312, 537, 113, 37);
        contentPane.add(button);

        JButton button_1 = new JButton("返回");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /*
                 * 返回;
                 */
            }
        });
        button_1.setFont(new Font("微软雅黑", Font.PLAIN, 26));
        button_1.setBounds(527, 537, 113, 37);
        contentPane.add(button_1);
    }
}
