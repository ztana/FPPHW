package w2l6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Q2 extends JFrame{

	JButton red = new JButton();
	JButton yellow = new JButton();
	JButton orange = new JButton();
	JButton green = new JButton();
	JButton indigo = new JButton();
	JButton violet = new JButton();
	JButton blue = new JButton();
	Q2()
	{
		setTitle("String Utility");
		//setSize(400,150);
		setBounds(100,100,420,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		red.setBackground(Color.RED);
		red.setPreferredSize(new Dimension(50, 100));
		yellow.setBackground(Color.YELLOW);
		yellow.setPreferredSize(new Dimension(50, 100));
		orange.setBackground(Color.ORANGE);
		orange.setPreferredSize(new Dimension(50, 100));
		green.setBackground(Color.GREEN);
		green.setPreferredSize(new Dimension(50, 100));
		indigo.setBackground(new Color(75,0,130));
		indigo.setPreferredSize(new Dimension(50, 100));
		violet.setBackground(new Color(127,0,255));
		violet.setPreferredSize(new Dimension(50, 100));
		blue.setBackground(Color.BLUE);
		blue.setPreferredSize(new Dimension(50, 100));
		
		add(red);

		add(yellow);

		add(orange);
		
		add(green);

		add(indigo);

		add(violet);

		add(blue);
		
		red.addActionListener(
		e->{
			JOptionPane.showMessageDialog(null,"Red is the color with the longest wavelength, being the nearest visible light to infrared in the electromagnetic spectrum.");
		});
/*
		red.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Red is the color with the longest wavelength, being the nearest visible light to infrared in the electromagnetic spectrum.");
			}
		});
		*/
		yellow.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Yellow is naturally associated with the sun itself, and so with its life giving and sustaining energy.");
			}
		});
		orange.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Orange combines red and yellow. It contains the fiery energy of red with the wisdom and control of yellow. Orange is a dynamic energy like red but more thoughtful and controlled.");
			}
		});
		green.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Green is the merging of yellow (mind) and blue (spirit). It is located exactly at the point of color balance - midway between red and violet on the color spectrum. ");
			}
		});
		indigo.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Indigo amplifies the energy of blue in a profound way. At a physical level, while blue is calming, indigo is sedating. It deepens and turns blue energy inward.");
			}
		});
		violet.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Violet is the ray of spiritual mastery. It is the highest and most subtle specialization of light, being at the opposite end of the color spectrum to red.");
			}
		});
		blue.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Blue is the color of distance - oceans, skies, the heavens. The energy of blue helps us to look beyond the immediate environment, expanding our perceptions towards the unknown.");
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q2();

	}

}
