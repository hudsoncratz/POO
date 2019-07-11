package Codigos;

import java.sql.*;
import java.util.GregorianCalendar;

/**
 * 
 * @author Hudson L. Cratz (Julho - 2019)
 * @author Guilherme Stein
 * @author Klaiton Silva
 * @version 1.0
 *
 */

public class BancoDeDados {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;

	/**
	 * Funcao que: Conecta com o banco de dados
	 * 
	 */
	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/agendafinal?useTimeZone=true&serverTimezone=UTC";
		String usuario = "root";
		String senha = "admin";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
			// System.out.println("\nteste1 ");
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			// *System.out.println("Tentando conexão ao banco... ");
			this.statement = this.connection.createStatement();
			// System.out.println(" Conectado.");

		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());

		}
	}

	/**
	 * Funcao que: verifica se houve conexao com o banco de dados
	 * 
	 * @return boolean
	 */
	public boolean estaConectado() {
		if (this.connection != null)
			return true;
		else
			return false;
	}

	/**
	 * Funcao que: Lista o endereco de todos os saloes de um banco de dados, deste
	 * tipo
	 * 
	 */
	public void listarEnderecoSaloes() {

		try {
			String query = "SELECT * FROM Salao ORDER BY idSalao";
			this.resultset = this.statement.executeQuery(query);
			while (this.resultset.next()) {
				System.out.print("\n\n" + this.resultset.getString("nomeSalao") + "\nRua: "
						+ this.resultset.getString("bairrosalao") + "\n"
						+ this.resultset.getString("celSalao").substring(0, 2) + " - "
						+ this.resultset.getString("ruaSalao") + ", " + this.resultset.getString("numsalao") + " - "
						+ this.resultset.getString("celSalao").substring(2, 6) + " - "
						+ this.resultset.getString("celsalao").substring(6, 10));

			}
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}

	/**
	 * Funcao que: Lista todos os compromissos de um banco de dados, deste tipo
	 * 
	 * @return String
	 */
	public String listAll() {
		try {
			StringBuilder dados = new StringBuilder();
			String query = "SELECT * FROM Salao ORDER BY idSalao";
			Statement r1 = this.connection.createStatement();
			ResultSet set1 = r1.executeQuery(query);

			// this.resultset = this.statement.executeQuery(query);
			while (set1.next()) {
				String save = set1.getString("idsalao");
				dados.append("\n\n" + set1.getString("nomesalao"));

				String query2 = "SELECT *FROM Datas WHERE fksalao =" + save + " ORDER BY mes  ; ";
				Statement r2 = this.connection.createStatement();
				ResultSet set2 = r2.executeQuery(query2);
				// this.resultset = this.statement.executeQuery(query2);
				dados.append("\nAgenda:");
				while (set2.next()) {
					String save2 = set2.getString("iddata");
					dados.append(
							"\n\nData: " + set2.getString("dia") + "/" + set2.getString("mes") );

					String query3 = "SELECT *FROM Atendimentos where fkdata = " + save2 + " ORDER BY horainicio;";
					Statement r3 = this.connection.createStatement();
					ResultSet set3 = r3.executeQuery(query3);
					// this.resultset = this.statement.executeQuery(query3);
					while (set3.next()) {
						dados.append("\n[Horario: " + set3.getString("horainicio") + ":00 ," + " Servico: "
								+ set3.getString("tiposervico") + "]");
					}
					
				}
				
			}
			return dados.toString();
		} 
		catch (Exception e) {
			return ("\n\nErro: " + e.getMessage());

		}
	}
	

	/**
	 * Funcao que: Lista o endereco de um salao passado como parametro
	 * 
	 * @param nomesalao
	 * @return String
	 */
	public String listaEnderecoSalao(String nomesalao) {
		try {
			StringBuilder dados = new StringBuilder();
			String query = "select *from salao where nomesalao = '" + nomesalao + "';";
			// Statement set1 = this.connection.createStatement();
			// ResultSet res1 = set1.executeQuery(query);
			this.resultset = this.statement.executeQuery(query);
			while (this.resultset.next()) {
				dados.append("\n\n" + this.resultset.getString("nomeSalao") + "\nRua: "
						+ this.resultset.getString("ruaSalao") + ", " + this.resultset.getString("numsalao") + " - "
						+ this.resultset.getString("bairrosalao") + "\n"
						+ this.resultset.getString("celSalao").substring(0, 2) + " - "
						+ this.resultset.getString("celSalao").substring(2, 6) + " "
						+ this.resultset.getString("celsalao").substring(6, 10));
			}
			return dados.toString();

		} catch (Exception e) {
			return ("\n\nErro AQUI: " + e.getMessage());
		}
	}

	/**
	 * Funcao que: Lista os atendimentos de um salao, em todas as datas marcadas
	 * 
	 * @param nomesalao
	 * @return String
	 */

	public String listaSalao(String nomesalao) {
		try {
			StringBuilder dados = new StringBuilder();
			String query1 = "select *from salao where nomesalao = '" + nomesalao + "'";
			Statement stat1 = this.connection.createStatement();
			ResultSet res1 = stat1.executeQuery(query1);
			while (res1.next()) {
				dados.append("\n" + res1.getString("nomesalao"));
				int fksalao = Integer.parseInt(res1.getString("idsalao"));

				String query2 = "select *from datas where fksalao = " + fksalao + " order by mes";
				Statement stat2 = this.connection.createStatement();
				ResultSet res2 = stat2.executeQuery(query2);
				dados.append("\nAgenda:");
				while (res2.next()) {
					dados.append(
							"\n\nData: " + res2.getString("dia") + "/" + res2.getString("mes") );
					int fkdata = Integer.parseInt(res2.getString("iddata"));

					String query3 = "select *from atendimentos where fkdata = " + fkdata + " order by horainicio";
					this.statement = this.connection.createStatement();
					this.resultset = this.statement.executeQuery(query3);
					while (this.resultset.next()) {
						dados.append("\n[Horario: " + this.resultset.getString("horainicio") + ":00 ," + " Servico: "
								+ this.resultset.getString("tiposervico") + "]");

					}
				}
			}
			return dados.toString();
		} 
		catch (Exception e) {
			return ("\n\nErro: " + e.getMessage());
		}

	}

	/**
	 * Funcao que: Verifica o nome e cep, de um salao, caso existente, retorna sua
	 * idsalao.
	 * 
	 * @param nomeSalao
	 * @return int
	 * @throws SQLException
	 */
	public int verificasalao(String nomeSalao) throws SQLException {
		String query = "select *from salao where nomesalao = '" + nomeSalao + "'";
		Statement statinfo2 = this.connection.createStatement();
		ResultSet resinfo2 = statinfo2.executeQuery(query);
		if (resinfo2.next()) {
			return Integer.parseInt(resinfo2.getString("idsalao"));
		} else
			return 998; // codigo de salao inexiste

	}

	/**
	 * Funcao que: verifica uma data, caso existente, retorna sua iddata
	 * 
	 * @param dia
	 * @param mes
	 * @return int
	 * @throws SQLException
	 */
	public int verificadata(String nomesalao, int dia, int mes) throws SQLException {
		int idsalao = this.verificasalao(nomesalao);

		String query = "select *from datas where dia = '" + dia + "' and mes = '" + mes + "' and fksalao = '" + idsalao
				+ "'";
		Statement statinfo = this.connection.createStatement();
		ResultSet resinfo = statinfo.executeQuery(query);
		if (resinfo.next()) {
			return Integer.parseInt(resinfo.getString("iddata"));
		}

		return 999; // codigo de data inexistente
	}

	/**
	 * Funcao que: Insere uma data no salao, caso nao existente
	 * 
	 * @param idsalao
	 * @param dia
	 * @param mes
	 */
	public void insereData(int idsalao, int dia, int mes) {
		try {
			if (this.dataValida(dia, mes) == 1) {
				String query = "insert into datas (dia,mes,fksalao) values (" + dia + ", " + mes + ", " + idsalao
						+ ");";
				this.statement.executeUpdate(query);
			}
		} catch (Exception e) {
			System.out.println("\n\nErro: " + e.getMessage());
		}
	}

	/**
	 * Funcao que: Insere um atendimento em um salao, de acordo com data, e horario
	 * Usei funcoes do mysql para nao permitir insercoes repetidas
	 * 
	 * @param nomesalao
	 * @param dia
	 * @param mes
	 * @param horas
	 * @param servico
	 */
	public void insereAtendimento(String nomesalao, int dia, int mes, int horas, String servico) {
		try {
			if (this.dataValida(dia, mes) == 0 && this.horarioValido(horas) == 0)
				return;

			int idsalao = this.verificasalao(nomesalao), iddata = this.verificadata(nomesalao, dia, mes);

			if (idsalao != 998 && iddata != 999) {

				String query = "insert into atendimentos(horainicio, tiposervico, fkdata) select '" + horas + "', '"
						+ servico + "', '" + iddata + "' from dual where "
						+ "not exists(select horainicio from atendimentos where horainicio = '" + horas
						+ "' and fkdata = '" + iddata + "');";
				Statement setinfo = this.connection.createStatement();
				setinfo.executeUpdate(query);
			} else if (iddata == 999) {
				String query1 = "insert into datas(dia, mes, fksalao) values (" + dia + ", " + mes + ", " + idsalao
						+ ");";
				Statement stat1 = this.connection.createStatement();
				stat1.executeUpdate(query1);
				insereAtendimento(nomesalao, dia, mes, horas, servico);
			}
		} catch (Exception e) {
			System.out.println("\n\nErro: " + e.getMessage());
		}
	}

	/**
	 * Funcao que : Deleta um atendimento em um certo salao, com data e horario Caso
	 * o horario nao esteja no banco do mysql, ele faz a operaçao da mesma forma,
	 * mas nao remove nada
	 * 
	 * @param nomesalao
	 * @param dia
	 * @param mes
	 * @param hora
	 */
	public void deleteAtendimento(String nomesalao, int dia, int mes, int hora) {
		try {
			int iddata = this.verificadata(nomesalao, dia, mes);

			String query = "delete from atendimentos where horainicio = " + hora + " and fkdata = " + iddata + ";";
			// System.out.println(query);
			Statement statinfo = this.connection.createStatement();
			statinfo.executeUpdate(query);

		} catch (Exception e) {
			System.out.println("\n\nErro: " + e.getMessage());
		}
	}

	/**
	 * Funcao que : Realiza o mesmo procedimento do horariovalido
	 * 
	 * @param diaTarefa
	 * @param mesTarefa
	 * @return int
	 */
	@SuppressWarnings("deprecation")
	public int dataValida(int diaTarefa, int mesTarefa) {
		GregorianCalendar teste = new GregorianCalendar();
		int dia = Integer.parseInt(teste.getTime().toLocaleString().substring(0, 2));
		int mes = Integer.parseInt(teste.getTime().toLocaleString().substring(3, 5));

		if (diaTarefa >= dia && mesTarefa >= mes)
			return 1;
		else
			return 0;
	}

	/**
	 * Funcao que: Gera uma instancia local do calendario gregorian, que gera uma
	 * data, e hora do momento, caso seja valida, retorna 1 A analise é feita pra
	 * nao permissao de datas no passado, somente
	 * 
	 * @param horaTarefa
	 * @return int
	 */
	@SuppressWarnings("deprecation")
	public int horarioValido(int horaTarefa) {
		GregorianCalendar teste = new GregorianCalendar();
		int horas = Integer.parseInt(teste.getTime().toLocaleString().substring(11, 13)) + 1;

		if (horaTarefa >= horas)
			return 1;
		else
			return 0;
	}

	/**
	 * Funcao que: Desconecta do salao
	 */
	public void desconectar() {
		try {
			this.connection.close();

		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}
}
