package TEST;

import java.io.File;

public class ChangeFileName {
	public static void main(String[] args) {

		String file_folder = "C:\\\\Downloads\\\\txt\\\\";
		File folder = new File(file_folder);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {

			if (listOfFiles[i].isFile()) {
				String filename = listOfFiles[i].getName();
				System.out.println(filename);
				String newFileName=filename.substring(0, filename.length()-22) + ".txt";
				System.out.println(newFileName);

				File f = new File(file_folder + filename);
				f.renameTo(new File(file_folder + newFileName));
			}
		}

		System.out.println("conversion is done");
	}
}
