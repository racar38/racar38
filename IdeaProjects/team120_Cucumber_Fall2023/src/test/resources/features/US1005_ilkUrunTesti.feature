Feature: US1005 kullanici amazonda arama yapip ilk urunu test eder

@amazon
  Scenario: TC09 Ilk urun testi

    Given kullanici "amazonUrl" anasayfaya gider
    And arama kutusuna "Nutella" yazip aratir
    Then ilk urunu tiklar
    And urun isminin "Nutella" icerdigini test eder
    And sayfayi kapatir