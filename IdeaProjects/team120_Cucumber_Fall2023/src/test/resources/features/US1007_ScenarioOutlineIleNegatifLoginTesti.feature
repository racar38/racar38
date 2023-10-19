Feature: US1007 liste olarak verilen kullanici adi ve sifrelerle giris yapilamadigini test eder

  Scenario Outline: TC11 qualitydemy sayfasina yanlis bilgilerle giris yapilamaz

    Given kullanici "qdUrl" anasayfaya gider
    Then ilk login linkine tiklar
    And username kutusuna examples'dan "<gecersizEmail>" yazar
    And password kutusuna examples'dan "<gecersizPassword>" yazar
    And login butonuna basar
    Then basarili giris yapilamadigini test eder
    And sayfayi kapatir
    Examples:
      | gecersizEmail   | gecersizPassword  |
      |Resul            | 123456            |
      |Suha             | 123556            |
      |Yusuf            | 125412             |
