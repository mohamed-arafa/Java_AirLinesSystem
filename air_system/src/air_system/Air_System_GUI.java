package air_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class Air_System_GUI {

	private JFrame frame;
	private JTabbedPane AirPortPane;
	private JTabbedPane FlightPane;
	private JTabbedPane PassengerPane;
	private JTabbedPane QueryPane;
	private JTabbedPane FlightQueryPane;
	private JTabbedPane AirportQueryPane;
	private JTabbedPane PassengerQueryPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Air_System_GUI window = new Air_System_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Air_System_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 398, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddPassenger = new JButton("AddPassenger");
		btnAddPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddPassenger.setBounds(199, 10, 90, 27);
		frame.getContentPane().add(btnAddPassenger);
		
		JButton btnAddFlight = new JButton("AddFlight");
		btnAddFlight.setBounds(103, 10, 86, 27);
		frame.getContentPane().add(btnAddFlight);
		
		JButton btnAddAirport = new JButton("Add_Airport");
		btnAddAirport.setToolTipText("");
		btnAddAirport.setBounds(10, 10, 83, 27);
		frame.getContentPane().add(btnAddAirport);
		
		JButton btnQuery = new JButton("Query");
		btnQuery.setBounds(299, 10, 75, 27);
		frame.getContentPane().add(btnQuery);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 47, 384, 278);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		AirPortPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(AirPortPane, "name_448006483237100");
		
		FlightPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(FlightPane, "name_448006517874000");
		
		PassengerPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(PassengerPane, "name_448006550290300");
		
		QueryPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(QueryPane, "name_448006583297000");
		
		FlightQueryPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(FlightQueryPane, "name_448006616389800");
		
		AirportQueryPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(AirportQueryPane, "name_448006650124400");
		
		PassengerQueryPane = new JTabbedPane(JTabbedPane.TOP);
		layeredPane.add(PassengerQueryPane, "name_448006684975200");
	}
}
