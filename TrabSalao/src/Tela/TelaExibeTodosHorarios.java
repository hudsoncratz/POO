package Tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Codigos.BancoDeDados;
import Codigos.Endereco;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class TelaExibeTodosHorarios extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExibeTodosHorarios frame = new TelaExibeTodosHorarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TelaExibeTodosHorarios() {
		initialize();
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		this.setLocation(size.width/2 -getWidth()/2, size.height/2 - getHeight()/2);
	}
	/**
	 * Create the frame.
	 */
	public void initialize() {
		BancoDeDados b = new BancoDeDados();
		b.conectar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEscolheSalao t = new TelaEscolheSalao();
				t.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(36, 479, 97, 25);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea(b.listAll());
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBounds(136, 55, 514, 381);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(136, 55, 514, 381);
		contentPane.add(scrollPane);
		
		JLabel lblListaDeHorarios = new JLabel("Lista de horarios agendados (Total):");
		lblListaDeHorarios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListaDeHorarios.setBounds(77, 26, 299, 16);
		contentPane.add(lblListaDeHorarios);
		
		JButton btnNewButton_1 = new JButton("Finsh");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(657, 480, 97, 25);
		contentPane.add(btnNewButton_1);
		

	}
}
