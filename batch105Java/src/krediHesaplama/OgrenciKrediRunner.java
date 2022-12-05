package krediHesaplama;

public class OgrenciKrediRunner extends BaseKrediRunner{
    @Override
    public void hesapla(double input) {
        System.out.println("Ödeyeceğiniz rakam = " + (input*1.10));
    }
}
