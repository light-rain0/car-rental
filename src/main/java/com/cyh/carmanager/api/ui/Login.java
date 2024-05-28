package com.cyh.carmanager.api.ui;

import com.cyh.carmanager.api.ui.admin.AdminUi;
import com.cyh.carmanager.api.ui.user.UserUi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 登录界面
 */
public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtPwd;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 797, 590);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("账号：");
        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 32));
        lblNewLabel.setBounds(190, 108, 107, 94);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("密码：");
        lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 32));
        lblNewLabel_1.setBounds(190, 211, 107, 58);
        contentPane.add(lblNewLabel_1);

        txtName = new JTextField();
        txtName.setBounds(296, 131, 311, 50);
        contentPane.add(txtName);
        txtName.setColumns(10);

        txtPwd = new JTextField();
        txtPwd.setColumns(10);
        txtPwd.setBounds(296, 215, 311, 50);
        contentPane.add(txtPwd);

        JRadioButton rbUser = new JRadioButton("用户");
        rbUser.setSelected(true);
        buttonGroup.add(rbUser);
        rbUser.setFont(new Font("微软雅黑", Font.PLAIN, 22));
        rbUser.setBounds(296, 301, 77, 27);
        contentPane.add(rbUser);

        JRadioButton rbAdmin = new JRadioButton("管理员");
        buttonGroup.add(rbAdmin);
        rbAdmin.setFont(new Font("微软雅黑", Font.PLAIN, 22));
        rbAdmin.setBounds(417, 301, 107, 27);
        contentPane.add(rbAdmin);

        JButton btnNewButton = new JButton("登录");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (rbUser.isSelected()) {
                    // 进入用户操作界面
                    UserUi userUi = new UserUi();
                    userUi.setVisible(true);
                    dispose();
                } else {
                    // 进入管理员操作界面
                    AdminUi adminUi = new AdminUi();
                    adminUi.setVisible(true);
                    dispose();
                }
            }
        });
        btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 32));
        btnNewButton.setBounds(189, 361, 433, 67);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("注册");
        btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        btnNewButton_1.setBounds(640, 465, 100, 43);
        contentPane.add(btnNewButton_1);

        setLocationRelativeTo(null);
    }
}
