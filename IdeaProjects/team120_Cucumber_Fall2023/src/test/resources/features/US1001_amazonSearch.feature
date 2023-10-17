
  Feature:US1001 Kullanici amazon anasayfada arama yapar

    Scenario:TC01 Kullanici amazonda Nutella aratir

      Given kullanici amazonUrl anasayfaya gider
      And arama kutusuna Nutella yazip aratir
      And 10 saniye bekler
      Then arama sonuclarinin Nutella icerdigini test eder
      And sayfayi kapatir



      Scenario:TC02 Kullanici amazonda Java aratir

        Given kullanici amazonUrl anasayfaya gider
        And arama kutusuna Java yazip aratir
        Then arama sonuclarinin Java icerdigini test eder
        And 10 saniye bekler
        And sayfayi kapatir
