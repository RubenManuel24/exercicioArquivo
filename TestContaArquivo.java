package exercicioArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TestContaArquivo {

	   private static Path path = Paths.get("C:/Users/FATIMA30/Desktop/Conta2/Dados da Conta");
	   private static  Charset utf8 = StandardCharsets.UTF_8;
		
	public static  void armazenarConta(ArrayList<Conta> conta) {
		
			try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
				
				for(Conta cont : conta) {
					
					w.write("\n--------------------------------------\n"+"Nome: "+cont.getCliente()+"\nSaldo: "+cont.getSaldo()+" Kz");
				}
			
		    }
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		
		
		public static void escreverArquivo(ArrayList<Conta> conta) {
			
			
			try(BufferedReader r = Files.newBufferedReader(path,utf8)) {
				
				String linha = r.readLine();
				while (linha != null) {
					
					System.out.println(linha);
					linha=r.readLine();
				}
				
				
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
		
	public static void main(String[] args) {
		ArrayList<Conta> conta = new ArrayList<>();
	  
		
		/*Conta c1 = new Conta("Ruben Manuel",10000);
		Conta c2 = new Conta("Marleny Manuel",20000);
		Conta c3 = new Conta("Didi Manuel",300000);
		Conta c4 = new Conta("Elizabeth Manuel",40000); 
		Conta c5 = new Conta("Dádiva Manuel",300000);
		Conta c6 = new Conta("Josimar Manuel",600000);
		
		conta.add(c1);
		conta.add(c2);
		conta.add(c3);
		conta.add(c4);
		conta.add(c5);
		conta.add(c6);
		
		TestContaArquivo.armazenarConta(conta);*/
		TestContaArquivo.escreverArquivo(conta);
		
		
	
			
		} 

}
