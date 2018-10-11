package com.deloitte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileValidateAndStore {

	public static void main(String[] args) {
		int n=0;
		while(n!=3) {
			System.out.println("Enter Option 1. Write 2. Read 3.Exit\n\n");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		if (n == 1) {

			FileWriter fw = null;
			BufferedWriter bw = null;

			Pattern pattern = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");
			try {
				fw = new FileWriter("file.txt", true);
				bw = new BufferedWriter(fw);
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter Data");
				String s = sc2.nextLine();
				Matcher matcher = pattern.matcher(s);
				if (matcher.matches()) {
					bw.write(s + " : Valid\n");
				} else {
					bw.write(s + " : Invalid\n");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (bw != null) {
					try {
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		} else if (n == 2) {
			BufferedReader bw2 = null;
			File f2 = new File("file.txt");
			try {
				FileReader fw2 = new FileReader(f2);
				bw2 = new BufferedReader(fw2);
				String l = bw2.readLine();
				
				while (l!= null) {
					System.out.println(l);
					l = bw2.readLine();
					

				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (bw2 != null) {
					try {
						bw2.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

		}
	}}
}
