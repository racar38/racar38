Feature: US1012 Kullanici excele data ekler


  Scenario:TC16 Kullanici excel'e data ekleyebilmeli

    Given kullanici ulkeler excelinde Sayfa1'e kadar ayarlari yapar
    Then 5.sutunu olusturur
    And baslik satirinda besinci hucreye yeni bir cell olusturur
    And Olusturdugu hucreye "ulke nufusu" yazdirir
    Then 2.satir ulke nufusu kolonuna 1500000000 yazdirir
    And 8.satir ulke nufusu kolonuna 250000000 yazdirir
    And Dosyayi kaydeder
    Then excel'de 2.satirin ulke nufusunun 1500000000 oldugunu test eder
    And excel'de 8.satirin ulke nufusunun 250000000 oldugunu test eder
    And stream'leri kapatir