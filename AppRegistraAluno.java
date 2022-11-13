package TesteIgualdade;
import java.io.*;
import java.util.*;

public class AppRegistraAluno {
	
public static void main(String[] args) throws IOException {
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	RegistraAluno aluno = new RegistraAluno();
	ArrayList<RegistraAluno> lista = new ArrayList<RegistraAluno>();
	int contador=0;
	
	while(contador==0) {
		System.out.println("Bem-vindo ao sistema de cadastro da escola Santo Antonio!");
		System.out.println("Escolha as opcoes que deseja cadastrar");
		System.out.println(" ");
		System.out.println("Alunos: Digite 1");
		System.out.println("Professores: Digite 2");
		System.out.println("Funcionarios administrativos: Digite 3");
		System.out.println("Funcionarios da limpeza: Digite 4");
		System.out.println("Caso queira verificar o banco de dados dos cadastros dos alunos : Digite 5");
		System.out.println("Digite 6: Se quiser sair");
		
		
		int teclado = Integer.parseInt(bfr.readLine());
		
		
		
		switch(teclado) {
		case 1:
			RegistraAluno alunoCad = new RegistraAluno();
			
			System.out.println("Digite seu nome:");
			String nome = bfr.readLine();
			
			System.out.println("Digite seu endereço:");
			String endereco = bfr.readLine();
			
			System.out.println("Digite sua idade:");
			int idade = Integer.parseInt(bfr.readLine());
			
			System.out.println("Digite sua nota de portugues:");
			double notaPort = Integer.parseInt(bfr.readLine());
			
			System.out.println("Digite sua nota de geografia:");
			double notaGeo = Integer.parseInt(bfr.readLine());
			
			System.out.println("Digite sua nota de matematica:");
			double notaMat = Integer.parseInt(bfr.readLine());
			
			alunoCad.setNome(nome);
			alunoCad.setEndereco(endereco);
			alunoCad.setIdade(idade);
			alunoCad.setNotaGeo(notaGeo);
			alunoCad.setNotaMat(notaMat);
			alunoCad.setNotaPort(notaPort);
			
			lista.add(alunoCad);
			
			System.out.println("Aluno " + RegistraAluno.getContador()+ "Registrado com sucesso!");
			System.out.println("Nome do aluno:"+ alunoCad.getNome());
			System.out.println("Endereço do aluno: " + alunoCad.getEndereco());
			System.out.println("Idade do aluno: " + alunoCad.getIdade());
			System.out.println("Media do aluno: " + alunoCad.getMedia());
			System.out.println(" ");
			
			break;
		case 5:{
			System.out.println("Lista de alunos:");
			
			for(int i=0; i<lista.size();i++) {
				System.out.println("Aluno " + RegistraAluno.getContador()+ "Registrado com sucesso!");
				System.out.println("Nome do aluno:"+ lista.get(i).getNome());
				System.out.println("Endereço do aluno: " + lista.get(i).getEndereco());
				System.out.println("Idade do aluno: " + lista.get(i).getIdade());
				System.out.println("Media do aluno: " + lista.get(i).getMedia());
				
			}
		}
			
		case 6:{
			contador++;
			break;
		}
			
			
		}
		
		
		
	}

	
	
	
	
	
	
	
}
}
