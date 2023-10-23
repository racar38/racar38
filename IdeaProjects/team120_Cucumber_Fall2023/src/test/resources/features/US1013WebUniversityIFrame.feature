Feature: US1013 Kullanici iFrame'e gecis yapabilmeli


  Scenario: TC17 iFrame otomasyon testi
    Given kullanici "webUniFrameUrl" anasayfaya gider
    And ourProduct linkine tiklamak icin iFrame'e gecis yapar
    And Our Products butonuna basar
    Then acilan sayfada Cameras'i tiklar
    And 1 saniye bekler
    And Popup mesajini yazdirir
    And close butonuna basar
    Then iFrame'den cikis yapar
    And WebdriverUniversity.com (IFrame) linkini tiklar
    And acilan sayfa url'inin "http://webdriveruniversity.com/index.html" oldugunu test eder
    And sayfayi kapatir