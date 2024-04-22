package Utilities;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Console {
	
	protected static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static  void print(String s){
		System.out.print(s);
		
	}
	public static void println(String s){
		
		System.out.println(s);
		
	}
	public static void print(int i){
		System.out.print(i);
		
	}
	public static  void println(int i){
		System.out.println(i);
	}
	public static String read(){
		
		try{
			return in.readLine();
		}catch(Exception e){return null;}
		
	}
	public static  String read(String s){
		print(s);
		return Console.read();
	}
	
	public static int readInt(){
		return readInt(null);
	}
	public static int readInt(String msg){
		int num = -1;
		boolean ok = false;
		while(!ok){
			try{
				if (msg!=null){print(msg);}
				num = Integer.parseInt(Console.read());
				ok = true;
			}catch(Exception e){}
		}
		return num;
	}
	public static int menu(ArrayList opciones){
	
		for(int x=0;x<opciones.size();x++){
			println( (x+1) + "-" + opciones.get(x).toString());
		}
		int opcion;
		do{
			opcion = readInt("opcion:") - 1;
			
		}while(opcion < 0 || opcion >= opciones.size());
		
		return opcion;
	}
	
        public static double readDouble(String msg) {
            System.out.println(msg);
            double result = 0;
            try {
                String strResult = in.readLine();
                result = Double.parseDouble(strResult);
            } catch (IOException ex) {
                Logger.getLogger(Console.class.getName()).log(Level.SEVERE, null, ex);
            }
            return result;
        }
	
}
