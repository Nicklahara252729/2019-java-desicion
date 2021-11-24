/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intankelas;

/**
 *
 * @author nicolahara
 */
public class IntanKelas {
    public void Identitas(String nama, String nim, String smester, double ip_smester){
        
        System.out.println("Nama mahasiswa : " +nama); 
        System.out.println("NIM : " + nim);
        System. out. println("Semester : " + smester); 
        System. out.println("IP Smester ini : " +ip_smester); 
        if(ip_smester > 3){
            System. out.println("Anda Berhak mengontrak 24 SKS pada semester VI" ); 
        }else{
            System. out.println("Maksimal Beban SKS Semester ini 18 SKS" ); 
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntanKelas kelas = new IntanKelas(); 
        kelas.Identitas("Joni", "5314110007", "V", 3.50); 
    }
    
}
