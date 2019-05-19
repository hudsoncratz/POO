package E11;

import java.util.Scanner;

public class Uso {
	public static void main(String[] args)throws Exception {
		Scanner input = new Scanner(System.in);
		int QTDE=100, i;
		
		int identidade, menu;
		int dia, mes, ano;
		double salario, taxa, emp;
		String nome, departamento, saude;
		/*
		System.out.println("Digite 1 para escrever uma pessoa: ");
		System.out.println("Digite 2 para escrever uma paciente: ");
		menu = input.nextInt();
		
		if(menu == 1) {
			System.out.println("Digite o seu nome:  ");
			nome = input.next();
			System.out.println("Digite o dia do seu aniversário:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do seu aniversario:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do seu aniversario:  ");
			ano = input.nextInt();
			Data d1 = new Data(dia, mes,ano);
			System.out.println("Digite o numero de id:  ");
			identidade = input.nextInt();
			System.out.println("\n");
			Pessoa p1 = new Pessoa(nome,identidade, d1 );
			System.out.println(p1);
		}
		if(menu == 2) {
			System.out.println("Digite o seu nome:  ");
			nome = input.next();
			System.out.println("Digite o dia do seu aniversário:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do seu aniversario:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do seu aniversario:  ");
			ano = input.nextInt();
			Data d1 = new Data(dia, mes,ano);
			System.out.println("Digite o numero de id:  ");
			identidade = input.nextInt();
			Pessoa p1 = new Pessoa(nome,identidade, d1 );
			System.out.println("Digite o seu plano de saude:  ");
			saude = input.next();
			Paciente pa1 = new Paciente(nome, identidade, d1, saude);
			System.out.println("\n");
			System.out.println(pa1);
		}
		if(menu == 3) {
			System.out.println("Digite o seu nome:  ");
			nome = input.next();
			System.out.println("Digite o dia do seu aniversário:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do seu aniversario:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do seu aniversario:  ");
			ano = input.nextInt();
			Data d1 = new Data(dia, mes,ano);
			System.out.println("Digite o dia do sua adm:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do sua admo:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do sua adm:  ");
			ano = input.nextInt();
			Data d2 = new Data(dia, mes,ano);
			System.out.println("Digite o numero de id:  ");
			identidade = input.nextInt();
			System.out.println("Digite o seu salario:  ");
			salario = input.nextDouble();
			System.out.println("Digite a taxa:  ");
			taxa = input.nextDouble();
			Funcionario fa1 = new Funcionario(nome, identidade, d1, salario, taxa, d2);
			System.out.println("\n");
			System.out.println(fa1);
			System.out.println(fa1.Emprestimo());
			
		}
		if(menu == 4) {
			System.out.println("Digite o seu nome:  ");
			nome = input.next();
			System.out.println("Digite o dia do seu aniversário:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do seu aniversario:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do seu aniversario:  ");
			ano = input.nextInt();
			Data d1 = new Data(dia, mes,ano);
			System.out.println("Digite o dia do sua adm:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do sua adm:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do sua adm:  ");
			ano = input.nextInt();
			Data d2 = new Data(dia, mes,ano);
			System.out.println("Digite o numero de id:  ");
			identidade = input.nextInt();
			System.out.println("Digite o seu salario:  ");
			salario = input.nextDouble();
			System.out.println("Digite a taxa:  ");
			taxa = input.nextDouble();
			System.out.println("Digite o seu deparatamento:  ");
			departamento = input.next();
			Chefe c1 = new Chefe(nome, identidade, d1, salario, taxa, d2, departamento);
			System.out.println(c1);
			System.out.println(c1.Emprestimo());
		}
		if(menu == 5) {
			System.out.println("Digite o seu nome:  ");
			nome = input.next();
			System.out.println("Digite o dia do seu aniversário:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do seu aniversario:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do seu aniversario:  ");
			ano = input.nextInt();
			Data d1 = new Data(dia, mes,ano);
			System.out.println("Digite o dia do sua adm:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do sua adm:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do sua adm:  ");
			ano = input.nextInt();
			Data d2 = new Data(dia, mes,ano);
			System.out.println("Digite o numero de id:  ");
			identidade = input.nextInt();
			System.out.println("Digite o seu salario:  ");
			salario = input.nextDouble();
			System.out.println("Digite a taxa:  ");
			taxa = input.nextDouble();
			System.out.println("Digite o seu deparatamento:  ");
			departamento = input.next();
			System.out.println("Digite o dia do sua prom:  ");
			dia = input.nextInt();
			System.out.println("Digite o mes do sua prom:  ");
			mes = input.nextInt();
			System.out.println("Digite o ano do sua prom:  ");
			ano = input.nextInt();
			Data dtProm = new Data(dia, mes, ano);
			Diretor di1 = new Diretor(nome, identidade, d1, salario, taxa, d2, departamento, dtProm);
			System.out.println(di1);
			System.out.println(di1.Emprestimo());
		}
		*/
		while(QTDE>50) {
		System.out.println("Digite a quantidade de funcionario qur deseja inserir");
		QTDE = input.nextInt();
		}
		Funcionario vetor[] = new Funcionario[QTDE];
		
		for(i=0; i< QTDE; i++) {
			System.out.println("\nCadastro: " + (i+1) + "\n(1)Funcionario, (2)Chefe, (3)Diretor: ");
			menu = input.nextInt();
			if(menu == 1) {
				System.out.println("Digite o seu nome:  ");
				nome = input.next();
				System.out.println("Digite o dia do seu aniversário:  ");
				dia = input.nextInt();
				System.out.println("Digite o mes do seu aniversario:  ");
				mes = input.nextInt();
				System.out.println("Digite o ano do seu aniversario:  ");
				ano = input.nextInt();
				Data d1 = new Data(dia, mes,ano);
				System.out.println("Digite o dia do sua adm:  ");
				dia = input.nextInt();
				System.out.println("Digite o mes do sua admo:  ");
				mes = input.nextInt();
				System.out.println("Digite o ano do sua adm:  ");
				ano = input.nextInt();
				Data d2 = new Data(dia, mes,ano);
				System.out.println("Digite o numero de id:  ");
				identidade = input.nextInt();
				System.out.println("Digite o seu salario:  ");
				salario = input.nextDouble();
				System.out.println("Digite a taxa:  ");
				taxa = input.nextDouble();
				vetor[i] = new Funcionario(nome, identidade, d1, salario, taxa, d2);
				
			}
			if(menu == 2) {
				System.out.println("Digite o seu nome:  ");
				nome = input.next();
				System.out.println("Digite o dia do seu aniversário:  ");
				dia = input.nextInt();
				System.out.println("Digite o mes do seu aniversario:  ");
				mes = input.nextInt();
				System.out.println("Digite o ano do seu aniversario:  ");
				ano = input.nextInt();
				Data d1 = new Data(dia, mes,ano);
				System.out.println("Digite o dia do sua adm:  ");
				dia = input.nextInt();
				System.out.println("Digite o mes do sua adm:  ");
				mes = input.nextInt();
				System.out.println("Digite o ano do sua adm:  ");
				ano = input.nextInt();
				Data d2 = new Data(dia, mes,ano);
				System.out.println("Digite o numero de id:  ");
				identidade = input.nextInt();
				System.out.println("Digite o seu salario:  ");
				salario = input.nextDouble();
				System.out.println("Digite a taxa:  ");
				taxa = input.nextDouble();
				System.out.println("Digite o seu deparatamento:  ");
				departamento = input.next();
				vetor[i] = new Chefe(nome, identidade, d1, salario, taxa, d2, departamento);
				
			}
			if(menu == 3) {
				System.out.println("Digite o seu nome:  ");
				nome = input.next();
				System.out.println("Digite o dia do seu aniversário:  ");
				dia = input.nextInt();
				System.out.println("Digite o mes do seu aniversario:  ");
				mes = input.nextInt();
				System.out.println("Digite o ano do seu aniversario:  ");
				ano = input.nextInt();
				Data d1 = new Data(dia, mes,ano);
				System.out.println("Digite o dia do sua adm:  ");
				dia = input.nextInt();
				System.out.println("Digite o mes do sua adm:  ");
				mes = input.nextInt();
				System.out.println("Digite o ano do sua adm:  ");
				ano = input.nextInt();
				Data d2 = new Data(dia, mes,ano);
				System.out.println("Digite o numero de id:  ");
				identidade = input.nextInt();
				System.out.println("Digite o seu salario:  ");
				salario = input.nextDouble();
				System.out.println("Digite a taxa:  ");
				taxa = input.nextDouble();
				System.out.println("Digite o seu deparatamento:  ");
				departamento = input.next();
				System.out.println("Digite o dia do sua prom:  ");
				dia = input.nextInt();
				System.out.println("Digite o mes do sua prom:  ");
				mes = input.nextInt();
				System.out.println("Digite o ano do sua prom:  ");
				ano = input.nextInt();
				Data dtProm = new Data(dia, mes, ano);
				vetor[i] = new Diretor(nome, identidade, d1, salario, taxa, d2, departamento, dtProm);
				
			}
		}
		for(i=0; i<QTDE; i++) {
			System.out.println("\n" + vetor[i]);
			System.out.println("Max emprestimo: " + vetor[i].Emprestimo());
		}
	}
}
