package com.cyh.carmanager.api.ui.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 管理员界面
 */
public class AdminUi extends JFrame {

    private JPanel contentPane;
    private JTextField txtDelteId;
    private JTextField txtUpdateId;
    private JTextField txtQuery;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminUi frame = new AdminUi();
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
    public AdminUi() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1186, 990);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnAdd = new JButton("汽车信息录入");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                /**
                 * 车辆的添加
                 */
                AdminUiAdd adminUiAdd = new AdminUiAdd();
                adminUiAdd.setVisible(true);
                dispose();
            }
        });
        btnAdd.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        btnAdd.setBounds(34, 57, 242, 55);
        contentPane.add(btnAdd);

        JButton btnNewButton_1 = new JButton("汽车信息浏览");
        btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        btnNewButton_1.setBounds(34, 125, 242, 55);
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("待删除的信息编号：");
        lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        lblNewLabel.setBounds(44, 198, 216, 55);
        contentPane.add(lblNewLabel);

        txtDelteId = new JTextField();
        txtDelteId.setBounds(34, 259, 242, 45);
        contentPane.add(txtDelteId);
        txtDelteId.setColumns(10);

        JButton btnDelete = new JButton("删除");
        btnDelete.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        btnDelete.setBounds(34, 317, 242, 55);
        contentPane.add(btnDelete);

        JButton btnUpdate = new JButton("修改");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /**
                 * 修改
                 */
                AdminUiUpdate adminUiUpdate = new AdminUiUpdate();
                adminUiUpdate.setVisible(true);
                dispose();
            }
        });
        btnUpdate.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        btnUpdate.setBounds(34, 538, 242, 55);
        contentPane.add(btnUpdate);

        JLabel label = new JLabel("待修改的信息编号：");
        label.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        label.setBounds(44, 419, 216, 60);
        contentPane.add(label);

        txtUpdateId = new JTextField();
        txtUpdateId.setColumns(10);
        txtUpdateId.setBounds(34, 480, 242, 45);
        contentPane.add(txtUpdateId);

        JLabel label_1 = new JLabel("待查询的信息编号：");
        label_1.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        label_1.setBounds(44, 639, 216, 60);
        contentPane.add(label_1);

        txtQuery = new JTextField();
        txtQuery.setColumns(10);
        txtQuery.setBounds(34, 700, 242, 45);
        contentPane.add(txtQuery);

        JButton btnQuery = new JButton("查询");
        btnQuery.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /**
                 * 查询
                 */
                AdminUiInfo adminUiInfo = new AdminUiInfo();
                adminUiInfo.setVisible(true);
                dispose();
            }
        });
        btnQuery.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        btnQuery.setBounds(34, 758, 242, 55);
        contentPane.add(btnQuery);

        JButton btnExit = new JButton("退出登录");
        btnExit.setFont(new Font("微软雅黑", Font.PLAIN, 24));
        btnExit.setBounds(34, 875, 242, 55);
        contentPane.add(btnExit);

        JLabel lblNewLabel_1 = new JLabel("汽车租赁信息管理系统");
        lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
        lblNewLabel_1.setBounds(324, 13, 299, 45);
        contentPane.add(lblNewLabel_1);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(321, 57, 820, 873);
        contentPane.add(scrollPane);

        table = new JTable();
        table.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        table.setModel(new DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null, null},
                },
                new String[]{
                        "\u7F16\u53F7", "\u8F66\u578B", "\u8F66\u4E3B", "\u4EF7\u683C(\u5143/\u5929)", "\u989C\u8272", "\u662F\u5426\u88AB\u79DF\u7528", "\u79DF\u7528\u7684\u7528\u6237"
                }
        ));
        scrollPane.setViewportView(table);
        setLocationRelativeTo(null);
    }
}
