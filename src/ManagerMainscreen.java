import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ManagerMainscreen extends JFrame {

	private JPanel contentPane;
	private Manager manager;


	public void run() {
		try {
			ManagerMainscreen frame = new ManagerMainscreen(manager);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public ManagerMainscreen(final Manager manager) {
		this.manager=manager;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblName = new JLabel(manager.getName());		
		lblName.setBounds(12, 12, 199, 34);
		contentPane.add(lblName);
		
		JButton btnBuses = new JButton("Buses");
		btnBuses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseFrame();
				ManagerBusesWnd window = new ManagerBusesWnd(manager); 
				window.setTitle("Buses");
				window.setVisible(true);
			}
		});
		btnBuses.setBounds(22, 130, 117, 60);
		contentPane.add(btnBuses);
		
		JButton btnEmployees = new JButton("Employees");
		
		btnEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseFrame();
				ManagerEmployeesWnd window = new ManagerEmployeesWnd(manager); 
				window.setTitle("Employees");
				window.setVisible(true);
			}
		});
		
		btnEmployees.setBounds(162, 130, 117, 60);
		contentPane.add(btnEmployees);
		
		JButton btnLogOut = new JButton("Log out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseFrame();
				// LoginManager
				LoginFrameManager window = new LoginFrameManager();
				window.setTitle("Log in");
				window.setVisible(true);
			}
		});
		btnLogOut.setBounds(301, 17, 131, 25);
		contentPane.add(btnLogOut);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// to be implimened
			}
		});
		btnStatistics.setBounds(301, 130, 117, 60);
		contentPane.add(btnStatistics);
		
	}
	
	public void CloseFrame(){
	    super.dispose();
	}
}
