// ALGORITMA PROJECT KELOMPOK 4
// 1.pelanggan memesan ( minuman : Boba/makanan : Mie ) 
// { Masuk antrian pertama, tumpukan piring kurang satu,Proses...} ( QUEUE )( STACK_POP )
// 2.Pesanan pelanggan siap { antrian pertama keluar }( QUEUE_POLL) 
// 3.Lihat data Pelanggan ( Data lengkap, Total, siapa pelanggan pertama ) ( SIZE & PEEK) 
// 4.Hapus data pelanggan { pelanggan menghilang, pelayanan yang diminta tidak disediakan } ( REMOVE ) 
// 5.Cek Piring :
//               • Lihat jumlah piring
//               • Tambah piring ( STACK_PUSH) 
// 6.Keluar/Exit.

import java.util.Scanner; //import method java.util.Scanner
import java.util.ArrayList; //import method java.util.ArrayList
import java.util.LinkedList; //import method java.util.LinkedList
import java.util.Queue; //import method java.util.Queue
import java.util.*; //import method java.util.*
import java.io.*; //import method java.io.*

public class Main  { //class main

    public static void main(String[] args) {
        
        //deklarasi variabel
        int menu,Pmenu,CekP,inputMie,Pesanan;  //deklarasi variabel  menu,Pmenu,CekP,inputMie,Pesanan dengan tipe data integer
        String nama,tambahPesanan,PMie,hapusNama,hapusPesanan,hapusMie,jwb; //deklarasi variabel nama,tambahPesanan,PMie,hapusNama,hapusPesanan,hapusMie,jwb dengan tipe data string
        //deklarasi array
        String[] arrPesanan; //deklarasi arrPesanan sebagai array dengan tipe data String
        arrPesanan = new String[6]; //deklarasi arrPesanan dengan ukuran 6
        String[] mie; //deklarasi array mie
        mie = new String[4];  //deklarasi mie dengan ukuran 4
        
        //Minuman
        arrPesanan[0] = "SUSU JAHE MERAH"; //menambahkan data array pada indeks 0
        arrPesanan[1] = "CAPPUCINO"; //menambahkan data array pada indeks 1
        arrPesanan[2] = "GREEN TEA"; //menambahkan data array pada indeks 2
        arrPesanan[3] = "LATTE"; //menambahkan data array pada indeks 3
        arrPesanan[4] = "LEMON TEA"; //menambahkan data array pada indeks 4
        arrPesanan[5] = "MOCCA"; //menambahkan data array pada indeks 5
        //Makanan
        mie[0] = "MIE REBUS"; //menambahkan data array pada array mie dengan indeks 0
        mie[1] = "MIE GORENG"; //menambahkan data array pada array mie dengan indeks 1
        mie[2] = "MIE ACEH"; //menambahkan data array pada array mie dengan indeks 2
        mie[3] = "MIE SOTO"; //menambahkan data array pada array mie dengan indeks 3
        
        //deklarasi input
        Scanner in=new Scanner(System.in); //deklarasi in sebagai scanner
        Scanner str = new Scanner(System.in); //deklarasi str sebagai scanner
        //deklarasi queue
        Queue<String> name= new LinkedList<>(); //deklarasi name sebagai queue
        Queue<String> pesan= new LinkedList<>(); //deklarasi pesan sebagai queue
        Queue<String> pesanMie= new LinkedList<>(); //deklarasi pesanMie sebagai queue
        //deklarasi stack
        Stack<String> piring = new Stack<String>(); //deklarasi piring pada stack
        //MIE 1
        piring.push("Piring-1"); //menambahkan data pada tumpukan
        piring.push("Piring-2"); //menambahkan data pada tumpukan
        piring.push("Piring-3"); //menambahkan data pada tumpukan
        piring.push("Piring-4"); //menambahkan data pada tumpukan
        piring.push("Piring-5"); //menambahkan data pada tumpukan
        piring.push("Piring-6"); //menambahkan data pada tumpukan
        

        System.out.println("\n\t\t======================================================================================="); //tampilkan "======================================================================================="
        System.out.println("\t\t\t\t\t  Selamat datang di cafe Indonesia"); //tampilkan "Selamat datang di cafe Indonesia"
        System.out.println("\t\t======================================================================================="); //tampilkan "======================================================================================="
        
        do{ //perulangan do while
            System.out.println("\n\n");
            System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
            System.out.println("\t\t\t\t     PILIH MENU PERINTAH  "); //tampilkan "PILIH MENU PERINTAH"
            System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
            System.out.println("\t\t\t\t1. Masuk Antrian"); //tampilkan "1. Masuk Antrian"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t2. Pesan Minuman "); //tampilkan "2. Pesan Minuman"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t3. Pesan Mie "); //tampilkan "3. Pesan Mie"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t4. Pesanan Siap "); //tampilkan "4. Pesanan Siap"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t5. Lihat data Pelanggan"); //tampilkan "5. Lihat data Pelanggan"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t6. Cek piring"); //tampilkan "6. Cek piring"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t7. Hapus Data Pelanggan"); //tampilkan "7. Hapus data pelanggan"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t8. Cek Pohon Biner Traversal"); //tampilkan "8.Cek Pohon Biner Traversal"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t9. Graph"); //tampilkan "9. Graph"
            System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
            System.out.println("\t\t\t\t10.Keluar"); //tampilkan "10. Keluar"
            System.out.println("\t\t\t\t=============================="); //tampilkan "------------------------------"
            System.out.print("\t\t\t\t     Pilihan Anda : "); //tampilkan "Pilihan Anda : "
            menu=in.nextInt(); //deklarasi menu sebagai scanner
            System.out.println("\n"); //kosongkan 1 baris
            if(menu==1){ //percabangan if dengan kondisi nilai menu = 1
                System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
                System.out.print("\t\t\t\tMasukan nama      : "); //tampilkan "Masukan nama      : "
                nama = str.nextLine(); //method nextLine untuk input data nama
                name.add(nama); //fungsi add untuk menambahkan antrian pada nama
                if(nama==""){ //percabangan if dengan kondisi pada variabel nama tidak berisi
                    System.out.println("\t\t\t\tNama Masih Kosong!!"); //tampilkan "Nama Masih Kosong!!"
                    
                }else{ //jika tidak memenuhi kondisi if
                    System.out.println("\t\t\t\tNama Tersimpan!!"); //tampilkan "Nama Tersimpan!!"
                }

                
                
                

            }else if(menu==2){ //percabangan if dengan kondisi nilai menu = 2
                System.out.println("\t\t\t\t----------------------"); //tampilkan "----------------------"
                System.out.println("\t\t\t\t||**PESANAN PELANGGAN**||"); //tampilkan "||**PESANAN PELANGGAN**||"
                System.out.println("\t\t\t\t----------------------"); //tampilkan "----------------------"
                System.out.println("\t\t\t\t| 1.SUSU JAHE MERAH"); //tampilkan "| 1.SUSU JAHE MERAH"
                System.out.println("\t\t\t\t| 2.CAPPUCINO"); //tampilkan | 2.CAPPUCINO
                System.out.println("\t\t\t\t| 3.GREEN TEA"); //tampilkan | 3.GREEN TEA
                System.out.println("\t\t\t\t| 4.LATTE"); //tampilkan | 4.LATTE
                System.out.println("\t\t\t\t| 5.LEMON TEA"); //tampilkan | 5.LEMON TEA
                System.out.println("\t\t\t\t| 6.MOCCA"); //tampilkan | 6.MOCCA
                System.out.println("\t\t\t\t----------------------"); //tampilkan "----------------------"
                System.out.print("\t\t\t\tPILIH MENU : "); //tampilkan "PILIH MENU : "
                Pesanan = in.nextInt(); //deklarasi Pesana  sebagai scanner
                    if(Pesanan==1){ //percabangan if dengan kondisi nilai pesanan = 1
                    pesan.add(arrPesanan[0]); //tambahkan pesanan pada array arrPesanan dengan indeks 0
                }else if(Pesanan==2){ //percabangan if dengan kondisi nilai pesanan = 2
                    pesan.add(arrPesanan[1]); //tambahkan pesanan pada array arrPesanan dengan indeks 1
                }else if(Pesanan==3){ //percabangan if dengan kondisi nilai pesanan = 3
                    pesan.add(arrPesanan[2]); //tambahkan pesanan pada array arrPesanan dengan indeks 2
                }else if(Pesanan==4){ //percabangan if dengan kondisi nilai pesanan = 4
                    pesan.add(arrPesanan[3]); //tambahkan pesanan pada array arrPesanan dengan indeks 3
                }else if(Pesanan==5){ //percabangan if dengan kondisi nilai pesanan = 5
                    pesan.add(arrPesanan[4]); //tambahkan pesanan pada array arrPesanan dengan indeks 4
                }else if(Pesanan==6){ //percabangan if dengan kondisi nilai pesanan = 6
                    pesan.add(arrPesanan[5]); //tambahkan pesanan pada array arrPesanan dengan indeks 5
                }else{ //jika tidak memenuhi kondisi if
                    System.out.println("\t\t\t\tTidak Tersedia!!"); //tampilkan "Tidak Tersedia!!"
                }

                
                
            }else if(menu==3){//percabangan if dengan kondisi nilai menu = 2
                System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
                System.out.println("\t\t\t\t\t  PILIH MENU MIE  "); //tampilkan "pilih menu mie : "
                System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
                System.out.println("\t\t\t\t1. "+mie[0]); //tampilkan "1. " diikuti nilai dari array mie pada indeks 0
                System.out.println("\t\t\t\t2. "+mie[1]); //tampilkan "2. " diikuti nilai dari array mie pada indeks 1
                System.out.println("\t\t\t\t3. "+mie[2]); //tampilkan "3. " diikuti nilai dari array mie pada indeks 2
                System.out.println("\t\t\t\t4. "+mie[3]); //tampilkan "4. " diikuti nilai dari array mie pada indeks 3
                System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
                System.out.print("\t\t\t\tPILIH MENU : "); //menapilkan pesan "PILIH MENU : "
                inputMie = in.nextInt(); //mendeklarasikan inputMie sebagai scanner
                if(inputMie==1){ //percabangan if dengan kondisi inputMie = 1
                    pesanMie.add(mie[0]); //antrian pada array mie akan ditambah pada indeks ke-0
                    
                }else if(inputMie==2){  //percabangan if else dengan kondisi inputMie = 2
                    pesanMie.add(mie[1]);  //antrian pada array mie akan ditambah pada indeks ke-1
                    
                }else if(inputMie==3){  //percabangan if else dengan kondisi inputMie = 3
                    pesanMie.add(mie[2]);   //antrian pada array mie akan ditambah pada indeks ke-2
                    
                }else if(inputMie==4){  //percabangan if else dengan kondisi inputMie = 4
                    pesanMie.add(mie[3]);   //antrian pada array mie akan ditambah pada indeks ke-3
                    
                }else{  //percabangan if else dengan kondisi else atau tidak memenuhi kondisi if
                    System.out.println("\t\t\t\tTidak Tersedia!!"); //tanpilkan pesan "Tidak Tersedia !!"
                }
                //STACK_POP
                piring.pop(); //menambahkan tumpukan pada variabel piring
                System.out.println("\t\t\t\tPESANAN TERSIMPAN!!"); //tampilkan pesan "PESANAN TERSIMPAN!!"
                

                
                

            }else if(menu==4){ //percabangan if else dengan kondisi nilai menu = 4
                if(name.isEmpty()){  //percabangan if dengan kondisi jika antrian kosong
                    System.out.println("\t\t\t\tCEK KEMBALI PELANGGAN ANDA!!"); //tampilkan pesan "CEK KEMBALI PELANGGAN ANDA!!"
                }else{ // jika tidak memenuhi kondisi if
                System.out.println("\t\t\t\tNOTICE!!"); //tampilkan pesan "NOTICE!!"
                System.out.println("\t\t\t\tPemanggilan atas nama : "+name.poll()); //tampilkan pesan "Pemanggilan atasa nama : " dan ditambah dengan data nama yang dicari
                pesan.poll(); //cari data variabel pesan
                pesanMie.poll(); //cari data pada variabel pesanMie
                }

                
            }else if(menu==5){  //percabangan if else dengan kondisi nilai menu = 5
                if(name.isEmpty()){  //percabangan if dengan kondisi jika antrian kosong
                    System.out.println("\t\t\t\tTIDAK ADA PELANGGAN!!"); //tampilkan pesan "TIDAK ADA PELANGGAN!!"
                }else{ // jika tidak memenuhi kondisi if
                    
                    System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
                    System.out.println("\t\t\t\t        DATA PELANGGAN");  //tampilkan "DATA PELANGGAN"
                    System.out.println("\t\t\t\t==============================");  //tampilkan "=============================="
                    System.out.println("\t\t\t\t|| NAMA       : "+name); //tampilkan "NAMA   : " dan diikuti dengan data pada variabel nama
                    System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
                    System.out.println("\t\t\t\t|| MINUMAN    : "+pesan); //tampilkan "MINUMAN   : " dan diikuti dengan data pada variabel pesan
                    System.out.println("\t\t\t\t------------------------------"); //tampilkan "------------------------------"
                    System.out.println("\t\t\t\t|| MIE        : "+pesanMie); //tampilkan "MIE   : " dan diikuti dengan data pada variabel pesanMie
                    System.out.println("\t\t\t\t=============================="); //tampilkan "=============================="
                    System.out.println("\t\t\t\t|| PELANGGAN PERTAMA  : "+name.peek()); //tampilkan "PELANGGAN PERTAMA  : " diikuti dengan data pertama pada nama
                    System.out.println("\t\t\t\t|| TOTAL PELANGGAN    : "+name.size()); //tampilkan "TOTAL PELANGGAN    : " diikuti dengan jumlah data nama

                }

            }else if(menu==6){  //percabangan if else dengan kondisi nilai menu = 6
                System.out.println("\t\t\t\t1.Lihat Jumlah Piring "); //tampilkan "1. Lihat Jumlah Piring"
                System.out.println("\t\t\t\t2.Tambah Tumpukan Piring "); //tampilkan "2. Tambah Tumpukan Piring"
                System.out.println("\t\t\t\t----------------------");  //tampilkan "------------------------------"
                System.out.print("\t\t\t\tPILIH  : "); //tampilkan "PILIH   : "
                CekP = in.nextInt(); //deklarasi CekP sebagai scanner
                if(CekP==1){ //percabangan if dengan kondisi CekP = 1
                    System.out.println("\t\t\t\t"+piring); //tampilkan data dari variabel piring
                }else if(CekP==2){ //percabangan if else dengan kondisi CekP = 2
                    System.out.print("\t\t\t\tMasukan piring & No urut : "); //tampilkan "Masukan piring & No urut : "
                    PMie = str.nextLine(); //method nextLine untuk input data PMie
                    piring.push(PMie); //method push untuk memasukkan nilai PMie ke tumpukan
                if(piring.isEmpty()){    //percabangan if dengan kondisi jika tidak ada data yang tersimpan pada variabel piring
                    System.out.println("\t\t\t\tDATA MASIH KOSONG!!"); //tampilkan "DATA MASIH KOSONG !!"
                }else{ //jika tidak memenuhi kondisi if
                    System.out.println("\t\t\t\tDATA BERHASIL DITAMBAH!!"); //tampilkan "DATA BERHASIL DITAMBAH!!"
                }
                }

                
            }else if(menu==7){  //percabangan if else dengan kondisi nilai menu = 7
                if(pesan.isEmpty()&&name.isEmpty()){ //percabangan if dengan kondisi variabel pesan dan nama dalam keadaan kosong
                    System.out.println("\t\t\t\tDATA KOSONG!!"); //tampilkan "DATA KOSONG!!"
                }else{ //jika tidak memenuhi kondisi if
                System.out.print("\t\t\t\tMasukan NAMA Pelanggan : "); //tampilkan "Masukan Nama Pelanggan : "
                hapusNama = str.nextLine(); //method nextLine untuk input data hapusNama
                System.out.print("\t\t\t\tMasukan Nama Minuman   : "); //tampilkan "Masukan Nama Minuman : "
                hapusPesanan = str.nextLine(); //method nextLine untuk input data hapusPesanan
                System.out.print("\t\t\t\tMasukan Nama Makanan   : "); //tampilkan "Masukan Nama Makanan : "
                hapusMie = str.nextLine(); //method nextLine untuk input data hapusMie
                System.out.print("\n"); //kosongkan 1 baris

                    if(name.contains(hapusNama)&&pesan.contains(hapusPesanan)&&pesanMie.contains(hapusMie)==false){ //percabangan if dengan kondisi data pada hapusNama, hapusPesanan dan hapusMie tidak sesuai
                        System.out.println("\t\t\t\tDATA TIDAK SESUAI!!"); //tampilkan "DATA TIDAK SESUAI!!"
                    }else if(name.remove(hapusNama)&&pesan.remove(hapusPesanan)&&pesanMie.remove(hapusMie)){ //jika tidak memenuhi kondisi if
                        System.out.println("\t\t\t\tDATA BERHASIL DIHAPUS!! "); //tampilkan "DATA BERHASIL DIHAPUS!!"
                    }
                }
            }else if(menu==8){ //percabangan if else dengan kondisi nilai menu = 8
                BinaryTree tree = new BinaryTree(); //deklarasikan tree sebagai variabel dalam binary tree
        tree.root = new Node(20000); //deklarasi nilai root pada tree dengan nilai = 20000
        tree.root.left = new Node(15000); //deklarasi nilai root left pada tree dengan nilai = 15000
        tree.root.right = new Node(18000); //deklarasi nilai root rightpada tree dengan nilai = 18000
        tree.root.left.left = new Node(12000); //deklarasi nilai root  left leftpada tree dengan nilai = 12000
        tree.root.left.right = new Node(13000); //deklarasi nilai root left right pada tree dengan nilai = 13000
        tree.root.right.left = new Node(14000); //deklarasi nilai root right left pada tree dengan nilai = 14000
        tree.root.right.right = new Node(19000); //deklarasi nilai root right right pada tree dengan nilai = 19000
        /*            20.000
                    /        \
                15000         18000
                /   \         /   \
            12000  13000   14000  19000      */
            System.out.println("\t\t\t\t============="); //tampilkan "============="
            System.out.println("\t\t\t\t  TRAVERSAL  "); //tampilkan "TRAVERSAL"
            System.out.println("\t\t\t\t============="); //tampilkan "============="
            System.out.print("\t\t\t\tPre-Order  : "); //tampilkan "Pre-Order  :"
            tree.printPreorder(); //masukkan data tree dengan metode PreOrder
            System.out.print("\n\t\t\t\tin-Order   : "); //tampilkan "In-Order  :"
            tree.printInorder(); //masukkan data tree dengan metode Inorder
            System.out.print("\n\t\t\t\tPost-Order : "); //tampilkan "Post-Order : "
            tree.printPostorder(); //masukkan data tree dengan metode PostOrder
                
                
            }else if(menu==9){ //percabangan if else dengan kondisi nilai menu = 9
                class Graph//kelas graph
                { 
                ArrayList<ArrayList<Integer>>graph; //deklarasi graph dengan arraylist
                int V; //deklarasi V dengan tipe data integer

                Graph(int nodes) //constructor graph, deklarasi variabel nodes
                {
                    V = nodes; //nilai V = nodes
                    graph = new ArrayList<ArrayList<Integer>>(); //deklarasi graph sebagai arraylist dengan tipe data integer
                    for(int i=0;i<V;i++) //perulangan for dengan deklarasi variabel i yang bernilai = 0, i<V dan nilai i terus bertambah
                    {
                        graph.add(new ArrayList<Integer>()); //data pada graph ditambahkan sebagai arraylist
                    }
                }

                void addEdge(int v,int u) //fungsi addEdge untuk menyimpan verteks-verteks pada graph
                {
                    graph.get(v).add(u); //fungsi penambahan nilai pada graph
                    graph.get(u).add(v); //fungsi penambahan nilai pada graph
                }

                void printGraph() //pungsi untuk menampilkan graph
                {
                    for(int i=0;i<V;i++) //perulangan for dengan deklarasi variabel i yang bernilai = 0, i<V dan nilai i terus bertambah
                    {
                        System.out.print("Node : "+i); //tampilkan "Node : " dan diikuti dengan data i
                        for(int x : graph.get(i))System.out.print(" -> "+x); //perulangan for dengan variabel x mengambil nilai dari graph i dan tampilkan "->" diikuti nilai dari x
                        System.out.println();//kosongkan 1 baris
                    }
                }
            }
                //Output Graph Harga Pesanan
            Graph g = new Graph(11); //deklarasi g sebagai variabel pada graph dengan ukuran 11
                g.addEdge(0, 1); //tambahkan 0, 1 pada graph
                g.addEdge(0, 2); //tambahkan 0, 2 pada graph
                g.addEdge(0, 3); //tambahkan 0, 3 pada graph
                g.addEdge(0, 4); //tambahkan 0, 4 pada graph
                g.addEdge(5, 6); //tambahkan 5, 6 pada graph
                g.addEdge(5, 7); //tambahkan 5, 7 pada graph
                g.addEdge(5, 8); //tambahkan 5, 8 pada graph
                g.addEdge(5, 9); //tambahkan 5, 9 pada graph
                g.addEdge(5, 10); //tambahkan 5, 10 pada graph
                g.printGraph(); //print nilai pada graph
            }else{ //jika tidak memenuhi kondisi if
                if(menu==10){ //percabangan if  dengan kondisi nilai menu = 10
                    System.out.println("\n\t\t\t\t\t *Terima Kasih*"); //tampilkan pesan "*Terima Kasih*"
                }
            }
        }while(menu!=10); //perulangan while jika nilai menu bukan bernilai 10
    }
}