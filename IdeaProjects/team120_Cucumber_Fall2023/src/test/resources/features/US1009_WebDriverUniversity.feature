Feature: US1009 Webdriver university testi


  Scenario: TC13 coklu window testi

    Given kullanici "webUniUrl" anasayfaya gider
    Then Login Portal a  kadar asagi iner
    And Login Portal a tiklar
    Then Diger window'a gecer
    And username ve  password kutularina faker ile deger yazdirir
    And webUni login butonuna basar
    Then Popup'ta cikan yazinin validation failed oldugunu test eder
    And Ok diyerek Popup'i kapatir
    When Ilk sayfaya geri doner
    Then Ilk sayfaya donuldugunu test eder
    And sayfalari kapatir