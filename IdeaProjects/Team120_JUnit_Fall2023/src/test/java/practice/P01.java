package practice;

import org.junit.Ignore;
import org.junit.Test;

public class P01 {

    /*
                5 cesit testNotasyonu vardir.
            @BeforeClass ----- sadece 1 kere calisir.
            @Before --- Her testen once 1 kere calisir.
            @AfterClass ---- Tum testlerin sonunda bitince 1 kere calisir
            @After ---- Her test sonunda 1 kere calisir
            @Test --- yapacagimiz test kodlarinin yer aldigi kisim

     */

    @Test
    public void ahmet(){
        System.out.println("Ahmet");
    }
    @Test @Ignore
    public void resul(){
        System.out.println("resul");
    }
    @Test
    public void nergiz(){
        System.out.println("nergiz");
    }
}
