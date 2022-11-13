package TesteIgualdade;

public class RegistraAluno {
private String nome;
private int idade;
private String ende;
private double notaMat;
private double notaPort;
private double notaGeo;
private double media;

private static int contador;

public String getNome() {
	return nome;
}
public String getEndereco() {
	return ende;
}
public int getIdade() {
	return idade;
}

public double getNotaMat() {
	return notaMat;
}
public double getNotaPort() {
	return notaPort;
}
public double getNotaGeo() {
	return notaGeo;
}

public void setNome(String nome) {
	this.nome = nome;
}

public void setEndereco(String ende) {
	this.ende= ende;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public void setNotaPort(double notaPort) {
	this.notaPort = notaPort;
}
public void setNotaGeo(double notaGeo) {
	this.notaGeo = notaGeo;
	
}
public void setNotaMat(double notaMat) {
	this.notaMat = notaMat;
}

public static int getContador() {
	return contador;
}
public double getMedia() {
	media = (notaPort + notaGeo + notaMat)/3;
	
	return media;
}



}
