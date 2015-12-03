package w2l6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Q1 extends JFrame{

	JButton Counter = new JButton("Count Letters");
	JButton Reverser = new JButton("Reverse Letters");
	JButton Remover = new JButton("Remove Duplicates");
	
	JTextField input = new JTextField();
	JTextField output = new JTextField();
	Q1()
	{
		setTitle("String Utility");
		setBounds(0,0,400,150);
		setSize(400, 200);
		setLocation(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		Counter.setBounds(10, 30, 160, 30);
		Reverser.setBounds(10, 70, 160, 30);
		Remover.setBounds(10, 110, 160, 30);
		add(Counter,"West");
		add(Reverser,"West");
		add(Remover,"West");
		JLabel l1 = new JLabel("Input");
		JLabel l2 = new JLabel("Output");
		l1.setBounds(190,40,160,20);
		input.setBounds(190, 60, 160, 20);
		l2.setBounds(190, 80, 160, 20);
		output.setBounds(190, 100, 160, 20);
		add(l1);
		add(l2);
		add(input);
		add(output);

		Counter.addActionListener(new eCounter());
		Reverser.addActionListener(new eReverser());
		Remover.addActionListener(new eRemover());

		//panel.setLayout(new FlowLayout(FlowLayout.LEFT));
	}
	class eCounter implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String le = String.format("%d", input.getText().length());
			output.setText(le);
		}
		
	}
	
	class eReverser implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String in = input.getText();
			String out = new String();
			for(int i=0; i<in.length(); i++)
			{
				out += Character.toString(in.charAt(in.length()-i-1));
			}
			output.setText(out);
		}
		
	}
	
	class eRemover implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			boolean add = true;
			String in = input.getText();
			String out = new String();
			for(int i=0; i<in.length(); i++)
			{
				for(int j=0; j<out.length(); j++)
				{
					if(in.charAt(i) == out.charAt(j))
						add = false;
				}
				if(add)
				{
					out += Character.toString(in.charAt(i));
				}
				add = true;
			}
			output.setText(out);
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q1();
	}

}
