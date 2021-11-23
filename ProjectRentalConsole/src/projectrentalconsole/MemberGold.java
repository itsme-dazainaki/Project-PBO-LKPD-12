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
public class MemberGold extends MemberSilver{ //janlupa di extends bestie biar yang sebelumnya bisa masuk
    int biaya = 30000;
    int cashback;
    
    @Override
    protected void benefit1(long lama){
        diskon = 2/100;
        double biayaSewa = biaya * lama;
        double total = biayaSewa - (biayaSewa * diskon);
        System.out.println("Total Sewa           : Rp." + total);
    }
    
    @Override
    protected void benefit2(long lama){
        poin = 5 * lama;
        System.out.println("Jumlah Poin          : " + poin + " poin");
    }
    
    protected void benefit3(){
        cashback = 5000;
        System.out.println("Jumlah CashBack      : Rp." + cashback);
    }
}
