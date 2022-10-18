package ders18_arrays;

public class C07_Soru5 {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        String str[] ={"Java","Javacokgüzeldir","AhmetbulutluozAdamdir","asdgasdga","asdga"};
        kisaveUzun(str);

    }
    public static void kisaveUzun(String [] str){
        String uzunKelime=str[0];
        String kisaKelime=str[0];
        for (int i=0;i<str.length;i++)
        {
            if(str[i].length()>uzunKelime.length())
            {
                uzunKelime=str[i];
            }
            if(str[i].length()<kisaKelime.length())
            {
                kisaKelime=str[i];
            }
        }
        System.out.println("En uzun Kelime = "+ uzunKelime);
        System.out.println("En kisa kelime = " + kisaKelime);
    }
}
