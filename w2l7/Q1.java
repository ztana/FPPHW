package w2l7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField Mile;
	private JTextField Pound;
	private JTextField Gallon;
	private JTextField Fahrenheit;
	private JTextField Kilometer;
	private JTextField Kilogram;
	private JTextField Liter;
	private JTextField Centigrade;
	private JLabel lblNewLabel_1;
	private JLabel lblGallon;
	private JLabel lblFahrenheit;
	private JLabel lblKilometer;
	private JLabel lblKilogram;
	private JLabel lblLiter;
	private JLabel lblCentigrade;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q1 frame = new Q1();
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
	public Q1() {
		setTitle("Metric Conversion Assistant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(97, 11, 122, 114);
		contentPane.add(panel);
		
		Mile = new JTextField();
		panel.add(Mile);
		Mile.setColumns(10);
		
		Pound = new JTextField();
		panel.add(Pound);
		Pound.setColumns(10);
		
		Gallon = new JTextField();
		panel.add(Gallon);
		Gallon.setColumns(10);
		
		Fahrenheit = new JTextField();
		panel.add(Fahrenheit);
		Fahrenheit.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(325, 11, 122, 114);
		contentPane.add(panel_1);
		
		Kilometer = new JTextField();
		Kilometer.setColumns(10);
		panel_1.add(Kilometer);
		
		Kilogram = new JTextField();
		Kilogram.setColumns(10);
		panel_1.add(Kilogram);
		
		Liter = new JTextField();
		Liter.setColumns(10);
		panel_1.add(Liter);
		
		Centigrade = new JTextField();
		Centigrade.setColumns(10);
		panel_1.add(Centigrade);
		
		JLabel lblNewLabel = new JLabel("Mile:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(32, 19, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Pound:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(32, 44, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblGallon = new JLabel("Gallon:");
		lblGallon.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGallon.setBounds(32, 69, 46, 14);
		contentPane.add(lblGallon);
		
		lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFahrenheit.setBounds(10, 94, 68, 14);
		contentPane.add(lblFahrenheit);
		
		lblKilometer = new JLabel("Kilometer:");
		lblKilometer.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKilometer.setBounds(242, 19, 73, 14);
		contentPane.add(lblKilometer);
		
		lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKilogram.setBounds(253, 44, 62, 14);
		contentPane.add(lblKilogram);
		
		lblLiter = new JLabel("Liter:");
		lblLiter.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLiter.setBounds(253, 69, 62, 14);
		contentPane.add(lblLiter);
		
		lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCentigrade.setBounds(242, 94, 73, 14);
		contentPane.add(lblCentigrade);
		
		btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(
			e->{
				calculate(Mile,Kilometer,1.60934,0.621371);
				calculate(Pound,Kilogram,0.453592,2.20462);
				calculate(Gallon,Liter,3.78541,0.264172);
				calculate(Fahrenheit,Centigrade);
			}
		);
		btnNewButton.setBounds(198, 138, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
	static void calculate(JTextField f1, JTextField f2) {
		// TODO Auto-generated method stub
		String s1 = f1.getText();
		String s2 = f2.getText();
		if(s1.isEmpty() && s2.isEmpty())
		{
			return;
		}
		if(s2.isEmpty() ||(!s1.isEmpty() && !s2.isEmpty()))
		{
			String p[] = s1.split("\\.");
			float o = 0;
			if(p.length>1)
			{
				int ii = Integer.parseInt(p[0]);
				int ii2 = Integer.parseInt(p[1]);
				o = (float)((((float)ii2/Math.pow(10,p[1].length()) + ii)-32)*5/9);
			}
			else if(p.length == 0)
			{
				//do nothing
			}
			else
			{
				o = (float) ((Integer.parseInt(p[0])-32)*5/9);
			}
			s2 = String.format("%.2f", o);
			f2.setText(s2);
		}
		else if(s1.isEmpty())
		{
			String p[] = s2.split("\\.");
			float o = 0;
			if(p.length>1)
			{
				int ii = Integer.parseInt(p[0]);
				int ii2 = Integer.parseInt(p[1]);
				o = (float)(((float)ii2/Math.pow(10,p[1].length()) + ii)*9/5+32);
			}
			else if(p.length == 0)
			{
				//do nothing
			}
			else
			{
				o = (float) (Integer.parseInt(p[0])*9/5+32);
			}
			s1 = String.format("%.2f", o);
			f1.setText(s1);
		}
	}

	static void calculate(JTextField f1,JTextField f2,double d,double e)
	{
		String s1 = f1.getText();
		String s2 = f2.getText();
		if(s1.isEmpty() && s2.isEmpty())
		{
			return;
		}
		if(s2.isEmpty() ||(!s1.isEmpty() && !s2.isEmpty()))
		{
			String p[] = s1.split("\\.");
			float o = 0;
			if(p.length>1)
			{
				int i = Integer.parseInt(p[0]);
				int i2 = Integer.parseInt(p[1]);
				o = (float)(((float)i2/Math.pow(10,p[1].length()) + i)*d);
			}
			else if(p.length == 0)
			{
				//do nothing
			}
			else
			{
				o = (float) (Integer.parseInt(p[0])*d);
			}
			s2 = String.format("%.2f", o);
			f2.setText(s2);
		}
		else if(s1.isEmpty())
		{
			String p[] = s2.split("\\.");
			float o = 0;
			if(p.length>1)
			{
				int i = Integer.parseInt(p[0]);
				int i2 = Integer.parseInt(p[1]);
				o = (float)(((float)i2/Math.pow(10,p[1].length()) + i)*e);
			}
			else if(p.length == 0)
			{
				//do nothing
			}
			else
			{
				o = (float) (Integer.parseInt(p[0])*e);
			}
			s1 = String.format("%.2f", o);
			f1.setText(s1);
		}
	}
}
