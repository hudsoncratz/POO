package Tela;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Codigos.BancoDeDados;
import Codigos.Data;
import Codigos.Endereco;
import Codigos.Horario;

public class TelaExcluiHorariosAtendimentos extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeCliente;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAno;
	private JTextField textHora;
	private JTextField textMinuto;
	private JLabel label;
	private JButton btnNewButton;
	private JButton btnReturn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExcluiHorariosAtendimentos frame = new TelaExcluiHorariosAtendimentos("", 0, 0);
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
	public TelaExcluiHorariosAtendimentos(String nomeSalao,int i, int j) {
		initialize(nomeSalao, i, j);
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		this.setLocation(size.width/2 -getWidth()/2, size.height/2 - getHeight()/2);
	}
	
	public void initialize(String nomeSalao,int i, int j) {
		
		BancoDeDados b = new BancoDeDados();
		b.conectar();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(29, 62, 56, 16);
		contentPane.add(lblNome);
		
		textNomeCliente = new JTextField();
		textNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNomeCliente.setBounds(29, 91, 328, 22);
		contentPane.add(textNomeCliente);
		textNomeCliente.setColumns(10);
		
		JLabel lblAgendamentoDeHorario = new JLabel("Exclus\u00E3o de horario");
		lblAgendamentoDeHorario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAgendamentoDeHorario.setBounds(217, 13, 215, 32);
		contentPane.add(lblAgendamentoDeHorario);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblData.setBounds(29, 137, 56, 16);
		contentPane.add(lblData);
		
		textDia = new JTextField();
		textDia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textDia.setBounds(29, 166, 56, 22);
		contentPane.add(textDia);
		textDia.setColumns(10);
		
		textMes = new JTextField();
		textMes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMes.setColumns(10);
		textMes.setBounds(101, 166, 56, 22);
		contentPane.add(textMes);
		
		textAno = new JTextField();
		textAno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textAno.setColumns(10);
		textAno.setBounds(173, 166, 56, 22);
		contentPane.add(textAno);
		
		JLabel lblHoraraio = new JLabel("Horaraio:");
		lblHoraraio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHoraraio.setBounds(29, 215, 86, 16);
		contentPane.add(lblHoraraio);
		
		textHora = new JTextField();
		textHora.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textHora.setBounds(29, 249, 56, 22);
		contentPane.add(textHora);
		textHora.setColumns(10);
		
		textMinuto = new JTextField();
		textMinuto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textMinuto.setColumns(10);
		textMinuto.setBounds(107, 249, 56, 22);
		contentPane.add(textMinuto);
		
		label = new JLabel("       :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(59, 251, 56, 16);
		contentPane.add(label);
		
		btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int dia = Integer.parseInt(textDia.getText().toString());
					int mes = Integer.parseInt(textMes.getText().toString());
					int ano = Integer.parseInt(textAno.getText().toString());
				
					int hora = Integer.parseInt(textHora.getText().toString());
					int minuto = Integer.parseInt(textMinuto.getText().toString());
					
					Data d = new Data(dia, mes, ano);
					Horario h = new Horario(hora, minuto);
					b.deleteAtendimento(nomeSalao, d.getDia(), d.getMes(), h.getHora());
					TelaExibeHorariosAtendimentos t = new TelaExibeHorariosAtendimentos(nomeSalao, i, j);
					t.setVisible(true);
				}
				catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(487, 362, 97, 25);
		contentPane.add(btnNewButton);
		
		btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenuSalao t = new TelaMenuSalao(nomeSalao, i);
				t.setVisible(true);
				dispose();
				
			}
		});
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReturn.setBounds(29, 363, 97, 25);
		contentPane.add(btnReturn);
	}

}
