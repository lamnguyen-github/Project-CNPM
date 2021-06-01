package DataAccess;

import Entity.monHoc;
import java.io.*;
import java.util.ArrayList;

public class FileMH {
    File f = new File("MONHOC.DAT");
    public void ghiMH(ArrayList<monHoc> list)
    {
        try{
            if(!f.exists())
                f.createNewFile();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(list);
            oos.close();
        }   
        catch(Exception e){}
    }
    
    public ArrayList<monHoc> docMH() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(!f.exists())
            return new ArrayList<monHoc>();
        ObjectInputStream ois =new  ObjectInputStream(new FileInputStream(f));
        return (ArrayList<monHoc>)ois.readObject();
    }
}
