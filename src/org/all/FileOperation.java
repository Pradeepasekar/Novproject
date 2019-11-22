package org.all;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class FileOperation {

	public static void main(String[] args) throws IOException {
		File f=new File("F:\\pradeepa\\pragathi\\nithi");
		File[] s = f.listFiles();
		for(File a:s) {
			System.out.println(a);
		}
	}
}
