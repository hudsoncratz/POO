package Tela;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Codigos.*;
import Codigos.TipoServico;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.SystemColor;

public class TelaExibeSelecionaServico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExibeSelecionaServico frame = new TelaExibeSelecionaServico("", 0,0);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public TelaExibeSelecionaServico(String nomeSalao,int i, int j) {
		initialize(nomeSalao, i, j);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		this.setLocation(size.width/2 -getWidth()/2, size.height/2 - getHeight()/2);
	}
	/**
	 * Create the frame.
	 */
	public void initialize(String nomeSalao, int i, int j) {
		
		Servico s = new Servico(0, null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAsdjafn = new JLabel("Serviços");
		lblAsdjafn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAsdjafn.setBounds(148, 26, 75, 25);
		contentPane.add(lblAsdjafn);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor.setBounds(304, 30, 100, 16);
		contentPane.add(lblValor);
		
		JLabel lblNewLabel = new JLabel("Op\u00E7\u00E3o:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(175, 257, 75, 19);
		contentPane.add(lblNewLabel);
			
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaMenuSalao t = new TelaMenuSalao(nomeSalao,i) ;
				t.setVisible(true);
				dispose();
				
			}
		});
		btnReturn.setBounds(12, 283, 97, 25);
		contentPane.add(btnReturn);
		JComboBox comboBox = new JComboBox();
		if(i == 1) {
			comboBox.setModel(new DefaultComboBoxModel(new String[] {TipoServico.Cabelo.toString(), TipoServico.Barba.toString(), 
					TipoServico.Tintura.toString()}));
		}
		else {
			comboBox.setModel(new DefaultComboBoxModel(new String[] {TipoServico.Depilacao.toString(), TipoServico.Manicure.toString(), 
					TipoServico.Pedicure.toString(), TipoServico.Cabelo.toString()}));
		}
		comboBox.getSelectedItem();
		comboBox.setBounds(245, 256, 100, 22);
		contentPane.add(comboBox);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				String servico = new String();
				servico = comboBox.getSelectedItem().toString();
				TelaSelecionaHorariosAtendimentos t = new TelaSelecionaHorariosAtendimentos(nomeSalao, servico, i, j);
				t.setVisible(true);
			}
		});
		btnNext.setBounds(417, 283, 97, 25);
		contentPane.add(btnNext);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(109, 60, 328, 180);
		contentPane.add(scrollPane_1);
		
		JTextArea txtrlistaDeServios = new JTextArea();
		txtrlistaDeServios.setEditable(false);
		txtrlistaDeServios.setFont(new Font("Monospaced", Font.PLAIN, 16));
		if(i == 1) {
			txtrlistaDeServios.setText("    Cabelo         20,00\r\n    Barba          20,00\r\n    Tintura        30,00");
		}
		else {
			txtrlistaDeServios.setText("  Depila\u00E7\u00E3o         30,00\r\n  Manicure          30,00\r\n  Pedicure          30,00\r\n  Cabelo            25,00");
		}
		scrollPane_1.setViewportView(txtrlistaDeServios);


	}
}
