import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class CurrencyConverter {
	
	double Ghana_Cedi= 8.22;
	double USA_Dollar= 1.42;
	double Kenya_Shilling= 152.41;
	double Brazil_Real= 7.55;
	double Canada_Dollar= 1.71;
	double Indian_Rupee= 103.01;
	double Philippine_Peso= 68.17;
	double Indonesia_Rupiah= 20322.17;
	

	private JFrame frame;
	private JTextField jtxtConvert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter window = new CurrencyConverter();
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
	public CurrencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(80, 11, 263, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Ghana", "Brazil", "Canada", "Kenya", "Indonesia", "India", "Philippines"}));
		jcmbCurrency.setBounds(148, 64, 133, 32);
		frame.getContentPane().add(jcmbCurrency);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setBounds(148, 107, 133, 31);
		frame.getContentPane().add(jtxtConvert);
		jtxtConvert.setColumns(10);
		
		JLabel jlblConvert = new JLabel("Result");
		jlblConvert.setForeground(new Color(0, 0, 0));
		jlblConvert.setFont(new Font("Times New Roman", Font.BOLD, 16));
		jlblConvert.setBounds(148, 149, 174, 32);
		frame.getContentPane().add(jlblConvert);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double British_Pound = Double.parseDouble(jtxtConvert.getText());
				
				if (jcmbCurrency.getSelectedItem().equals("Ghana")) 
				{
					String cConvert1 = String.format("C %.2f", British_Pound*Ghana_Cedi);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("USA")) 
				{
					String cConvert1 = String.format("$ %.2f", British_Pound*USA_Dollar);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Canada")) 
				{
					String cConvert1 = String.format("C$ %.2f", British_Pound*Canada_Dollar);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Indonesia")) 
				{
					String cConvert1 = String.format("IDr %.2f", British_Pound*Indonesia_Rupiah);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Philippines")) 
				{
					String cConvert1 = String.format("PhP %.2f", British_Pound*Philippine_Peso);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("India")) 
				{
					String cConvert1 = String.format("INr %.2f", British_Pound*Indian_Rupee);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Brazil")) 
				{
					String cConvert1 = String.format("Bra %.2f", British_Pound*Brazil_Real);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Kenya")) 
				{
					String cConvert1 = String.format("KS %.2f", British_Pound*Kenya_Shilling);
					jlblConvert.setText(cConvert1);
				}
			}
		});
		jbtnConvert.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnConvert.setBounds(23, 208, 100, 42);
		frame.getContentPane().add(jbtnConvert);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtConvert.setText(null);
				jlblConvert.setText(null);
				jcmbCurrency.setSelectedIndex(0);
				
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnReset.setBounds(177, 208, 89, 42);
		frame.getContentPane().add(jbtnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		jbtnExit.setBounds(323, 208, 89, 42);
		frame.getContentPane().add(jbtnExit);
	}
}
