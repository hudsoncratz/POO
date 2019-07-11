package Tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Codigos.BancoDeDados;
import Codigos.Endereco;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TelaExibeHorariosAtendimentos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExibeHorariosAtendimentos frame = new TelaExibeHorariosAtendimentos("", 0, 0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TelaExibeHorariosAtendimentos(String nomeSalao,int i, int j) {
		initialize(nomeSalao, i, j);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		this.setLocation(size.width/2 -getWidth()/2, size.height/2 - getHeight()/2);
	}
	
	/**
	 * Create the frame.
	 */
	public void initialize(String nomeSalao, int i, int j) {
		BancoDeDados b = new BancoDeDados();
		b.conectar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Servicos agendados");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(62, 30, 139, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(555, 386, 97, 25);
		contentPane.add(btnExit);
		
		JButton btnReturnMenu = new JButton("Return Menu");
		btnReturnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuSalao t = new TelaMenuSalao(nomeSalao, i);
				t.setVisible(true);
				dispose();
			}
		});
		btnReturnMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReturnMenu.setBounds(36, 386, 123, 25);
		contentPane.add(btnReturnMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(93, 68, 490, 285);
		contentPane.add(scrollPane);
		
		JTextArea txtrListaDeHorarios = new JTextArea();
		scrollPane.setViewportView(txtrListaDeHorarios);
		txtrListaDeHorarios.setEditable(false);
		txtrListaDeHorarios.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtrListaDeHorarios.setText(b.listaSalao(nomeSalao));
	}

}
