package com.cyh.carmanager.api.ui.user;

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
 * 用户界面
 */
public class UserUi extends JFrame {

	private JPanel contentPane;
	private JTextField txtZYQC;
	private JTextField txtInfoId;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserUi frame = new UserUi();
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
	public UserUi() {
		setTitle("用户界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1186, 990);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKYCL = new JButton("可租用的车辆");
		btnKYCL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**
				 * 车辆的添加
				 */
			
			}
		});
		btnKYCL.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		btnKYCL.setBounds(34, 57, 242, 55);
		contentPane.add(btnKYCL);
		
		JButton btnSelectCar = new JButton("汽车信息浏览");
		btnSelectCar.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		btnSelectCar.setBounds(34, 125, 242, 55);
		contentPane.add(btnSelectCar);
		
		JLabel lblNewLabel = new JLabel("输入需要租用的汽车：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		lblNewLabel.setBounds(34, 198, 242, 55);
		contentPane.add(lblNewLabel);
		
		txtZYQC = new JTextField();
		txtZYQC.setBounds(34, 259, 242, 45);
		contentPane.add(txtZYQC);
		txtZYQC.setColumns(10);
		
		JButton btnOk = new JButton("确定");
		btnOk.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		btnOk.setBounds(34, 317, 242, 55);
		contentPane.add(btnOk);
		
		JButton btnInfo = new JButton("详细信息");
		btnInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * 修改
				 */
			}
		});
		btnInfo.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		btnInfo.setBounds(34, 561, 242, 55);
		contentPane.add(btnInfo);
		
		JLabel label = new JLabel("查询详细的信息编号：");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		label.setBounds(34, 419, 242, 60);
		contentPane.add(label);
		
		txtInfoId = new JTextField();
		txtInfoId.setColumns(10);
		txtInfoId.setBounds(34, 480, 242, 45);
		contentPane.add(txtInfoId);
		
		JButton btnQuit = new JButton("退出登录");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * 查询
				 */

			}
		});
		btnQuit.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		btnQuit.setBounds(34, 708, 242, 55);
		contentPane.add(btnQuit);
		
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
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u7F16\u53F7", "\u8F66\u578B", "\u8F66\u4E3B", "\u4EF7\u683C(\u5143/\u5929)", "\u989C\u8272", "\u662F\u5426\u88AB\u79DF\u7528"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton butMyCar = new JButton("我租的车");
		butMyCar.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		butMyCar.setBounds(34, 629, 242, 55);
		contentPane.add(butMyCar);
		setLocationRelativeTo(null);
	}
}
