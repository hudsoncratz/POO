package Tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Codigos.*;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMenuSalao extends JFrame {

	private JPanel contentPane;
	private int j = 0;
	;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuSalao frame = new TelaMenuSalao(/*null*/ " ", 0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public TelaMenuSalao(/*Endereco local*/ String nomeSalao, int i) {
		initialize(nomeSalao, i);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		this.setLocation(size.width/2 -getWidth()/2, size.height/2 - getHeight()/2);
	}
	/**
	 * Create the frame.
	 */
	public void initialize(String nomeSalao, int i) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Endere\u00E7o");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaExibeEndereco t = new TelaExibeEndereco(nomeSalao, i);
				t.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(151, 51, 151, 25);
		contentPane.add(btnNewButton);
		
		JButton btnExcluiHorario = new JButton("Exclui Horario");
		btnExcluiHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j = 1;
				TelaExcluiHorariosAtendimentos t = new TelaExcluiHorariosAtendimentos(nomeSalao,i , j);
				t.setVisible(true);
				dispose();
			}
		});
		btnExcluiHorario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExcluiHorario.setBounds(151, 89, 151, 25);
		contentPane.add(btnExcluiHorario);
		
		JButton btnAddHorario = new JButton("Adiciona Horario");
		btnAddHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j = 2;
				TelaExibeSelecionaServico t = new TelaExibeSelecionaServico(nomeSalao, i , j);
				t.setVisible(true);
				dispose();
			}
		});
		btnAddHorario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAddHorario.setBounds(151, 127, 151, 25);
		contentPane.add(btnAddHorario);
		
		JLabel lblNewLabel = new JLabel("Menu:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 13, 123, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEscolheSalao t = new TelaEscolheSalao();
				t.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(12, 215, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnExibeHorarios = new JButton("Exibe Horarios");
		btnExibeHorarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaExibeHorariosAtendimentos t = new TelaExibeHorariosAtendimentos(nomeSalao, i, i);
				t.setVisible(true);
			}
		});
		btnExibeHorarios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExibeHorarios.setBounds(151, 165, 151, 25);
		contentPane.add(btnExibeHorarios);
	}
}
