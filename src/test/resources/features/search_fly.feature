Feature: Search fly
  I as a person
  Want to search the most economic fly between Medellin and Bogota
  To save money

  Scenario: Search fly
    Given Cesar want to fly
    When choose the fly Medellin - Bogota
    Then i can see the ticket most economic