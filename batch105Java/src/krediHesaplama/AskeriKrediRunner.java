package krediHesaplama;

public class AskeriKrediRunner extends BaseKrediRunner{
    @Override
    public void hesapla(double input) {
       /*
           Eğer yaşı uygun değilse, hata versin...
           Eğer
        */
        System.out.println("Ödeyeceğiniz rakam = " + (input*1.40));
    }
}
