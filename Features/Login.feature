Feature: Login feature
  За да се използва системата е необходимо всеки потребител
   първо да влезе в системата с предварително регистриран профил.

  Scenario: Влизане в системата с валидни потребителски данни
    Given Потребитяле се намира в началния екран
    And Натиска бутона за вход в системата
    And Отваря се попъп за вход в системата
    When Въведе  валидно потребителско име
    And Въведе валидна потребителска парола
    And Натисне на бутона за вход в системата
    Then Показва се съобщение "Влязохте в системата"
    
   Scenario: Влизане в системата с невалидни потребителски данни
   	Given Потребитяле се намира в началния екран
    And Натиска бутона за вход в системата
    And Отваря се попъп за вход в системата
    When Въведе  невалидно потребителско име
    And Въведе невалидна потребителска парола
    And Натисне на бутона за вход в системата
    Then Показва се съобщение "Грешни данни"
    
   Scenario: Влизане в системата само с парола
   Given Потребитяле се намира в началния екран
    And Натиска бутона за вход в системата
    And Отваря се попъп за вход в системата
    When Въведе валидна потребителска парола
    And Натисне на бутона за вход в системата
    Then Показва се съобщение "Попълнете всички задължителни полета"
   

   Scenario: Влизане в системата без въвеждане на потребителско име и парола
     Given Потребитяле се намира в началния екран
    And Натиска бутона за вход в системата
    And Отваря се попъп за вход в системата
    When Натисне на бутона за вход в системата
    Then Показва се съобщение "Попълнете всички задължителни полета"
   