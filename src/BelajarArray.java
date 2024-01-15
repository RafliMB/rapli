import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelajarArray {
    public static void main(String[] args) throws IOException {

        int[] angkasaya = new int[4];
        // mengisi valie ke dalam integer array angkasaya
        angkasaya[0] = 4;
        angkasaya[1] = 5;
        angkasaya[2] = 9;
        angkasaya[3] = 14;

        // mencetak ke layar isi dari integer array angkasaya yang ke 1 (index=1)
        System.out.println(angkasaya[1]);

        //menginput nama sesuai dengan jumlah data yang dimasukkan oleh user

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukkan jumlah data yang akan diiinput : ");
        int jum_data = Integer.parseInt(reader.readLine());// misal yang diinput 3 --> jum_data = 3
        String[] nama = new String[jum_data];//maka menjadi -> String[] nama = new String[3];

        // memasukkan data nama ke dalam array sesuai dengan jum_data yang diinput
        // indexnya dari array nama yang dimulai dari 0 sampai dengan index < nama.length = 3
        // array indexnya dimulai dari nol sampai batas atas n-1
        for (int indexsaya = 0; indexsaya < nama.length; indexsaya++) {
            System.out.println("Masukkan nama yang ke - " + (indexsaya + 1) + " = ");
            String nama_input = reader.readLine();
            nama[indexsaya] = nama_input;
        }
        for (int muncul = 0; muncul < nama.length; muncul++) {
            System.out.println("Data Nama Yang Ke - " + (muncul + 1) + ":");
            System.out.println("Nama : " + nama[muncul]);
        }
    }
}