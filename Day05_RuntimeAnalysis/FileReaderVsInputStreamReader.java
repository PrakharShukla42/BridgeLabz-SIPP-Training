package Day05_RuntimeAnalysis;

import java.io.*;

public class FileReaderVsInputStreamReader {
    public static void usingFileReader(String path) throws Exception {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {}
        br.close();
        fr.close();
    }

    public static void usingInputStreamReader(String path) throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {}
        br.close();
        isr.close();
    }

    public static void main(String[] args) throws Exception {
        String path = "bigdata.txt";

        long start = System.currentTimeMillis();
        usingFileReader(path);
        long end = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        usingInputStreamReader(path);
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
    }
}
