package practice;

import org.junit.*;

public class P02 {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class çalıstı. Testler çalışmaya başlayabilir");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Tüm testler basariyla tamamlandi");
    }

    @Before
    public void setup() {
        System.out.println("Yeni bir test Kodu Çalıştırılıyor");
    }

    @After
    public void tearDown() {
        System.out.println("Bu test tamamlandi. Sıradaki test çalıştırılacak");
    }

    @Test
    public void test01() {
        System.out.println("01 Numarali test calistirildi");
    }

    @Test
    public void test02() {
        System.out.println("02 Numarali test calistirildi");
    }
}
