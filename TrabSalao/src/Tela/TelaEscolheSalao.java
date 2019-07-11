package Tela;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import Codigos.Endereco;
import Codigos.Horario;
import Codigos.Salao;

import java.sql.*;

import Codigos.BancoDeDados;

public class TelaEscolheSalao extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 try {
			 //jtattoo.plaf.hifi.HiFiLookAndFeel
	            //here you can put the selected theme class name in JTattoo
	            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(TelaEscolheSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(TelaEscolheSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(TelaEscolheSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(TelaEscolheSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEscolheSalao frame = new TelaEscolheSalao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 /**
	 * Create the application.
	 * @throws Exception 
	 */
	public TelaEscolheSalao()  {
			initialize();
			Toolkit toolkit = getToolkit();
			Dimension size = toolkit.getScreenSize();
			setLocation(size.width/2 -getWidth()/2, size.height/2 - getHeight()/2);
	}
	
	/**
	 * Initialize the contents of the frame.
	 * @throws Exception 
	 */
	private void initialize() {
		BancoDeDados b = new BancoDeDados();;
		b.conectar();
		contentPane = new JPanel();
		setBounds(100, 100, 644, 379);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		JButton btnNomeSalao2 = new JButton("Salao Cratz");
		btnNomeSalao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				TelaMenuSalao t = new TelaMenuSalao("Salao Cratz", 2);
				t.setVisible(true);
			}
		});
		btnNomeSalao2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNomeSalao2.setBounds(374, 133, 117, 45);
		getContentPane().add(btnNomeSalao2);
		
		JButton btnNomesalao1 = new JButton("Salao Stein");
		btnNomesalao1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNomesalao1.setBounds(119, 133, 117, 45);
		getContentPane().add(btnNomesalao1);
		JButton btnExibeTodos = new JButton("Exibe Todos");
		btnExibeTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaExibeTodosHorarios t = new TelaExibeTodosHorarios();
				t.setVisible(true);
				dispose();
			}
		});
		btnExibeTodos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExibeTodos.setBounds(457, 277, 134, 29);
		getContentPane().add(btnExibeTodos);
		btnNomesalao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaMenuSalao t = new TelaMenuSalao("Salao Stein", 1);
				t.setVisible(true);
			}
		});
		
	}
}
