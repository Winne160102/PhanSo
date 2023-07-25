package TuSo_MauSo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class QA {

	public QA() {
	}
	
	public QA(int tuso, int mauso) {
		super();
		this.tuso = tuso;
		this.mauso = mauso;
	}

	private int tuso;
	private int mauso;
	public int getTuso() {
		return tuso;
	}
	public void setTuso(int tuso) {
		this.tuso = tuso;
	}
	public int getMauso() {
		return mauso;
	}
	public void setMauso(int mauso) {
		this.mauso = mauso;
	}
	
	public void setall(int tuso, int mauso) {
		this.tuso = tuso;
		this.mauso = mauso;
	}
	
	public static ArrayList<QA> inputFile(){
		ArrayList<QA> list = new ArrayList<QA>();
		try {
			FileReader fReader = new FileReader("‪‪C:\\Users\\Admin\\Desktop\\baitap\\Anh van\\input.txt");
			BufferedReader bReader = new BufferedReader(fReader);
			while(true) {
				String line = bReader.readLine();
				if(line == "" || line == null) break;
				String[] temp = line.split("/");
				QA data = new QA(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
				list.add(data);
			}
			bReader.close();
			fReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void outputFile(ArrayList<QA> list) {
		try {
			FileWriter fWriter = new FileWriter("‪‪C:\\Users\\Admin\\Desktop\\baitap\\Anh van\\output.txt");
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			for(QA data : list) {
				double result = (double) data.getTuso() / data.getMauso();
				if (result == 50) {
					bWriter.write(data.getTuso() + "/" + data.getMauso());
					bWriter.newLine();
				}
			}
			bWriter.close();
			fWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<QA> list = new ArrayList<QA>();
		list = inputFile();
		outputFile(list);
	}
}
