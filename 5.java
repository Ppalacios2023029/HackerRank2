package org.pablo.prueba;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Prueba{
	public static  void main(String [] args){
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try{
			int N = 0;
			N = Integer.parseInt(entrada.readLine());
			for(int i = 1; i <= 10; i++){
			int R = N * i;
			System.out.println(N + " x " +i+ " = " +R);
		}

		}catch(IOException e){
			e.printStackTrace();
		}
	}
}