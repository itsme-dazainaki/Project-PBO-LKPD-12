/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsole;

/**
 *
 * @author Radaza Putri
 */
public class MemberPlatinum extends MemberGold { //janlupa di extends bestie biar yang sebelumnya bisa masuk
    int biaya = 45000;
    long pulsa;
    
    @Override
    protected void benefit1(long lama){
        diskon = 3/100;
        double biayaSewa = biaya * lama;
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa           : Rp." + total);
    }
    
    @Override
    protected void benefit2(long lama){
        poin = 10 * lama;
        System.out.println("Jumlah Poin          : " + poin + " poin");
    }
    
    @Override
    protected void benefit3(){
        cashback = 10000;
        System.out.println("Jumlah CashBack      : Rp." + cashback);
    }
    
    protected void benefit4(long lama){
        pulsa = 5000*lama;
        System.out.println("Bonus Pulsa          : " + pulsa);
    }
}
