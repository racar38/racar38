Feature: US1014 Amazon Testleri
  @wip
  Scenario: TC18 dropdown testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then Arama kutusunun solundaki dropdown menuyu handle eder
    And dropdown menudeki opsiyonlari liste olarak yazdirir
    Then dropdown menude 28 elaman oldugunu test eder

    @wip
  Scenario:
    When dropdown menuden elektronik bolumunu secer
    And arama kutusuna "iphone" yazip aratir
    And bulunan sonuç sayısını yazdirir
    And arama sonuclarinin "iphone" icerdigini test eder
    Then ikinci urune tiklar
    And urunun title'ni ve fiyatini variable'a assign edip sepete ekler