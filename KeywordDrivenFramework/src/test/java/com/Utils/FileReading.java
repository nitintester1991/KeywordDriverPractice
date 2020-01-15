package com.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
	public static void main(String[] args) throws IOException{
		File f=new File("D:\\MavenFreamwork\\KeywordDrivenFramework\\LogFile\\Demo1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader bfr=new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
	}
}
