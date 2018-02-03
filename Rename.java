package rename;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class Rename {

	public static void main(String[] args) throws FileNotFoundException {
		// FileReader("D:\\Personal\\Desktop\\QTDownloadRadio"));
		long currentTimeMillis = System.currentTimeMillis();
		File file = new File("D:\\Personal\\Desktop\\QTDownloadRadio");
		//BufferedReader reader = new BufferedReader(new FileReader(file));
		
		String[] listFiles = file.list();
		// 获得文件夹下的文件对象数组
		File[] listFiles2 = file.listFiles();
		// 遍历
		for (File file2 : listFiles2) {
			// 获取文件名字
			String name = file2.getName();
			// 截取前7个数字
			String substring = name.substring(0, 7);
			Integer integer = Integer.parseInt(substring);
			int i = integer - 2699877;
			String string = String.valueOf(i);
			//String.format(format, args)
			DecimalFormat df = new DecimalFormat("000");
			String f = df.format(i);
			System.out.println(f);
			File file1 = new File("D:\\Personal\\Desktop\\智圣东方朔");
			file1.mkdirs();
			file2.renameTo(new File("D:\\Personal\\Desktop\\智圣东方朔\\"+"东方朔"+f + ".mp3"));
			
		}
		long c = System.currentTimeMillis()-currentTimeMillis;
		System.out.println("命名完毕"+c/1000);
	}
}
