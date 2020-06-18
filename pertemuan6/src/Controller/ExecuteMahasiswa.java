package Controller;

import Connection.ConnectionManager;
import Model.Mahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExecuteMahasiswa {
    
    public String InsertMahasiswa(Mahasiswa mhs){
        String query = "INSERT INTO tbl_mahasiswa (NRP,Nama,Alamat,NoHP) "+"VALUES (?,?,?,?)";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        String Respon;
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, mhs.getNRP());
            pstm.setString(2, mhs.getNama());
            pstm.setString(3, mhs.getAlamat());
            pstm.setString(4, mhs.getNoHP());
            pstm.executeUpdate();
            Respon="Insert Sukses";
        } catch (SQLException ex) {
            Respon="Insert Gagal";
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE,null,ex);
        }
        conMan.Logoff();
        return Respon;
    }
    
    public ArrayList<Mahasiswa> ListMhs(){
        
        ArrayList<Mahasiswa> arlistmhs = new ArrayList<>();
        String query = "SELECT * FROM tbl_mahasiswa";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.Logon();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNRP(rs.getString("NRP"));
                mhs.setNama(rs.getString("Nama"));
                mhs.setNoHP(rs.getString("NoHP"));
                mhs.setAlamat(rs.getString("Alamat"));
                
                arlistmhs.add(mhs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExecuteMahasiswa.class.getName()).log(Level.SEVERE,null,ex);
        }
        conMan.Logoff();
        return arlistmhs;
    }
}
