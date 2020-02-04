package fathur12;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    int option;
    String opsi;
    Scanner scan = new Scanner(System.in);
    ArrayList<penduduk> aray = new ArrayList<>();
    penduduk pp = new penduduk();
    penduduk pa = new penduduk();
    penduduk ps = new penduduk();
    penduduk pd = new penduduk();

    public static void main(String[] args) {
        Main ma = new Main();
        ma.Inti();
    }

    public void Inti() {

        System.out.println("MENU");
        System.out.println("<1> Nama ");
        System.out.println("<2> NIK");
        System.out.println("<3> TTL");
        System.out.println("<4> Jenis kelamin");
        System.out.println("<5> Goldar");
        System.out.print("Input : ");
        opsi = scan.nextLine();
        switch (opsi) {
            case "1":
                Nama();
                break;
            case "2":
                NIK();
                break;
            case "3":
                TTL();
                break;
            case "4":
                Gender();
                break;
            case "5":
                Goldar();
        }
    }

    public void Nama() {
        System.out.println("NAMA");
        System.out.print("Input Nama : ");
        String Nama = scan.nextLine();
        System.out.println("Nama berhasil disimpan.");
        System.out.print("<1>Ingin lanjut/<2>Print?");
        opsi = scan.nextLine();
        switch (opsi) {
            case "1":
                Inti();
                break;
            case "2":
                pp.setNama(Nama);
                aray.add(pp);
                System.out.println("Nama : " + pp.getNama());
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
        //pp.setNama(Nama);
        //System.out.println(Nama);

    }

    public void NIK() {
        System.out.println("NIK");
        System.out.print("Input NIK : ");
        String NIK = scan.nextLine();
        System.out.println("NIK berhasil disimpan.");
        System.out.print("<1>Ingin lanjut/<2>Print?");
        opsi = scan.nextLine();
        switch (opsi) {
            case "1":
                Inti();
                break;
            case "2":
                pp.setNIK(NIK);
                aray.add(pp);
                System.out.println("NIK : " + pp.getNIK());
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    public void TTL() {
        System.out.println("Tempat Tanggal Lahir");
        System.out.print("Input TTL : ");
        String TTL = scan.nextLine();
        System.out.println("TTL berhasil disimpan.");
        System.out.print("<1>Ingin lanjut/<2>Print?");
        opsi = scan.nextLine();
        switch (opsi) {
            case "1":
                Inti();
                break;
            case "2":
                pp.setTTL(TTL);
                aray.add(pp);
                System.out.println("TTL : " + pp.getTTL());
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    public void Gender() {
        System.out.println("GENDER");
        System.out.print("Input NIK : ");
        String Gender = scan.nextLine();
        System.out.println("NIK berhasil disimpan.");
        System.out.print("<1>Ingin lanjut/<2>Print?");
        opsi = scan.nextLine();
        switch (opsi) {
            case "1":
                Inti();
                break;
            case "2":
                pp.setJK(Gender);
                aray.add(pp);
                System.out.println("Gender : " + pp.getJK());
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }

    public void Goldar() {
        pp.setGoldar(option);
        pa.setGoldar(option);
        ps.setGoldar(option);
        pd.setGoldar(option);
        aray.add(pp);
        aray.add(pa);
        aray.add(ps);
        aray.add(pd);
        System.out.println("Pilih Golongan Darah Anda : ");
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. AB");
        System.out.println("4. O");
        System.out.print("Input : ");
        option = scan.nextInt();
        if (pp.getGoldar()==1) {
            System.out.println("Goldar : A ");
        }else if(pa.getGoldar()==2){
            System.out.println("Goldar : B ");
        }else if(ps.getGoldar()==3){
            System.out.println("goldar : AB ");
        }else if(pd.getGoldar()==4){
            System.out.println("Goldar : O ");
        }else{
            System.out.println("Pilihan tidak tersedia");}
    }
}
