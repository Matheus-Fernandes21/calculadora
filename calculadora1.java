  
package exercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora1 extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String resposta;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora1 frame = new calculadora1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public calculadora1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 357);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 5, 303, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton.getText();
				textField.setText(numero);
			}
		});
		btnNewButton.setBounds(5, 162, 64, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_1.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_1.setBounds(79, 162, 64, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_2.getText();
				textField.setText(numero);
				
			}
		});
		btnNewButton_2.setBounds(153, 162, 64, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(textField.getText());
			textField.setText("");
			operation="+";
			}
		});
		btnNewButton_3.setBounds(239, 56, 64, 42);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_4.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_4.setBounds(5, 109, 64, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_5.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_5.setBounds(79, 109, 64, 42);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_6.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_6.setBounds(153, 109, 64, 42);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_7.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_7.setBounds(5, 58, 64, 42);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_8.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_8.setBounds(79, 58, 64, 42);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_9.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_9.setBounds(153, 56, 64, 42);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numero=textField.getText()+btnNewButton_10.getText();
				textField.setText(numero);
			}
		});
		btnNewButton_10.setBounds(79, 215, 64, 42);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewButton_12.setBounds(239, 109, 64, 42);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("x");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x";
			}
		});
		btnNewButton_13.setBounds(239, 162, 64, 42);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u00F7");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="÷";
			}
		});
		btnNewButton_14.setBounds(239, 215, 64, 42);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("\uF0E7");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnNewButton_15=null;
				if(textField.getText().length()>0)
				{
			StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				btnNewButton_15=str.toString();
				textField.setText(btnNewButton_15);
				}
			}
			
		});
		btnNewButton_15.setBounds(5, 215, 64, 42);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("C");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);	
			}
		});
		btnNewButton_16.setBounds(153, 215, 64, 42);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("=");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String resposta;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					resposta=String.format("%.2f",result);
					textField.setText(resposta);
				}
				else if(operation=="-")
				{
					result=first-second;
					resposta=String.format("%.2f",result);
					textField.setText(resposta);
				}
				else if(operation=="x")
				{
					result=first*second;
					resposta=String.format("%.2f",result);
					textField.setText(resposta);
				}
				else if(operation=="÷")
				{
					result=first/second;
					resposta=String.format("%.2f",result);
					textField.setText(resposta);
				}
			}
		});
		btnNewButton_17.setBounds(239, 268, 64, 42);
		contentPane.add(btnNewButton_17);
		
		JButton btnNewButton_11 = new JButton(".");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String number=textField.getText()+btnNewButton_11.getText();
			textField.setText(number);
			}
		});
		btnNewButton_11.setBounds(79, 268, 64, 42);
		contentPane.add(btnNewButton_11);
	}
}