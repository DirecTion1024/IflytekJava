package com.homework.readfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
	public String readFile(String readfilename , String outfilename){
		String content = null ;
		try {
			FileInputStream fis = new FileInputStream(readfilename);  //字节流读写文件
			FileOutputStream fo = new FileOutputStream(outfilename);
			byte[] bytes = new byte[fis.available()];
			fis.read(bytes);  //读文件
			content = new String(bytes);
			fis.close();
			byte bt[] = new byte[1024];  
	        bt = content.getBytes();
	        fo.write(bt, 0, bt.length);  //读取字节流数组，btt,移位为0，长度为bt.length度
            fo.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return content;
	}

	public static void main(String[] args) {
		ReadFile readfile = new ReadFile();
		readfile.readFile("F:/test.txt","F:/test123.txt");
		System.out.println("done");
	}
}
