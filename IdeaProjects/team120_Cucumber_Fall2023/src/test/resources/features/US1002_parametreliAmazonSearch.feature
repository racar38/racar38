Feature:US1002 Kullanici parametre olarak yazdigi urunu amazonda aratir

  Scenario:TC03 parametre ile amazonda arama

    Given kullanici "amazonUrl" anasayfaya gider
    Then arama kutusuna "Java" yazip aratir
    And arama sonuclarinin "Java" icerdigini test eder
    Then 2 saniye bekler
    And sayfayi kapatir

    Scenario:TC04 parametre ile apple aratir

      Given kullanici "amazonUrl" anasayfaya gider
      And 10 saniye bekler
      Then arama kutusuna "apple" yazip aratir
      Then 10 saniye bekler
      And sayfayi kapatir