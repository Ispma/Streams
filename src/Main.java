import java.io.*;


public class Main {

    //в поле users указать своего пользователя
    //По аналогии можно указывать разные типы файлов и методов их создания
    static String filename= "C:\\Users\\VDorofeyev\\file.txt";
    static String filenameTwo= "C:\\Users\\MGlazunov\\file.xml";

    public static void main(String[] args)
    {
        //Тут прописать нужный метод из нижеперечисленных

    }

    private static void readFile() throws IOException
    {
        FileReader fileReader= new FileReader(filename);
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        String line= bufferedReader.readLine();
        System.out.println(line);
    }


    private static void createFile()
    {
        String text= "Hello world";
        try
        {
            FileOutputStream fileOutputStream= new FileOutputStream(filename);
            byte[] bytes= text.getBytes();
            fileOutputStream.write(bytes);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void createFile2() throws IOException
    {
        FileWriter fileWriter= new FileWriter(filename);
        BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello world");
        bufferedWriter.close();
    }

    private static void createFileXML()
    {
        String text= "<tag>Hello world</tag>";
        try
        {
            FileOutputStream fileOutputStream= new FileOutputStream(filenameTwo);
            byte[] bytes= text.getBytes();
            fileOutputStream.write(bytes);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    // Пример обработки ошибок
    // Мы можем просто указать throws Exception, но тогда мы не будем иметь возможность обработать такую ошибку
    private static void tryExeption()
    {
        String args[]= new String[1];
        try {
            args[2]= "sttt";
            System.out.println("attr хранится в args[0]");
        } catch (Exception e) {
            String a[]= new String[1];
            a[0]= "attr";
        } finally {
            System.out.println("attr хранится в a[0]");
        }
    }
}