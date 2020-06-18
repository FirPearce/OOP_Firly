package Adapter;

import Controller.ExecuteMahasiswa;
import Model.Mahasiswa;
import java.util.ArrayList;

public class AdapterMahasiswa {
    public Object[][]getAllGuru(){
        ExecuteMahasiswa em = new ExecuteMahasiswa();
        ArrayList<Mahasiswa>lstmhs;
        lstmhs = em.ListMhs();
        Object[][]datamhs = new Object[lstmhs.size()][5];
        
        int mysize = 0;
        for (Mahasiswa mhs:lstmhs){
            datamhs[mysize][0]=mhs.getNRP();
            datamhs[mysize][1]=mhs.getNama();
            datamhs[mysize][2]=mhs.getNoHP();
            datamhs[mysize][3]=mhs.getAlamat();
            mysize++;
        }
        return datamhs;
    }
}
