package Tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Codigos.BancoDeDados;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TelaExibeEndereco extends JFrame {

	private JPanel contentPane;
	private String endrecoSalao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExibeEndereco frame = new TelaExibeEndereco("", 0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TelaExibeEndereco(String nomeSalao, int i) {
		initialize(nomeSalao, i);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		this.setLocation(size.width/2 -getWidth()/2, size.height/2 - getHeight()/2);
	}
	
	
	/**
	 * Create the frame.
	 */
	public void initialize(String nomeSalao, int i) {
		BancoDeDados b = new BancoDeDados();
		b.conectar();
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Endereco:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(42, 25, 95, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnFinsh = new JButton("Exit");
		btnFinsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnFinsh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnFinsh.setBounds(323, 215, 97, 25);
		contentPane.add(btnFinsh);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuSalao t = new TelaMenuSalao(nomeSalao, i);
				t.setVisible(true);
				dispose();
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReturn.setBounds(22, 217, 97, 25);
		contentPane.add(btnReturn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 54, 326, 142);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea(b.listaEnderecoSalao(nomeSalao));
		scrollPane.setViewportView(textArea);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setEditable(false);
		
		
	}
}
