Feature: US2000 kullanici girdigi isim ile yaptigi aramayi test eder


  Scenario Outline: TC200 kullanici girdigi isim ile bilgilerini gorebilmeli

    Given kullanici "dataTablesUrl" anasayfaya gider
    Then new butonuna basar
    And firstname kutusuna examples'dan "<isim>" bilgisi girer
    And lastname kutusuna examples'dan "<soyisim>" yazar
    And position kutusuna examples'dan "<isunvan>" yazar
    And ofis kutusuna examples'dan "<ulkeadi>" yazar
    And extension kutusuna examples'dan "<iladi>" yazar
    And start date kutusuna examples'dan "<isebaslangictarihi>" yazar
    And salary kutusuna examples'dan "<maas>" yazar
    And Create tusuna basar
    When kullanici "<isim>" ile arama yapar
    And 2 saniye bekler
    Then isim bolumunde "<isim>" oldugunu dogrular
    And sayfayi kapatir

    Examples:
      | isim | soyisim | isunvan | ulkeadi | iladi | isebaslangictarihi | maas |
      | Beyza | Nergiz | QA-Tester | Turkey | Istanbul | 2023-10-21 | 150.500 |
      | Ayfer | Sarikoc | Developer | UK | Swindon | 2023-10-20 | 200.900 |
      | Yetis | Ulas | Soft Engineer | Netherlands | Harlem | 2023-10-23 | 250.540 |