Feature: Address book

  @contact
  Scenario: adding address
    Given Launch the browser
    When I click link signin_Link
    When I enter email testtilludie@gmail.com
    When I enter password testtilludie
    Then I click on signin
    Then I click on Addresses
    Then I click on New Address
    Then I enter fisrtname Adithya
    Then I enter lastname krishna
    Then I enter Address1 details charlottenburger street,23
    When I entered Address2 details Atlanta, United States
    When I have entered the city name Atlanta
    Then I will select state from the dropdown Alaska
    Then I will enter the postal zipcode  10325
    Then I will select United States
    Then I will select Canada
    Then I will enter the date in textbox 04-05-2013
    Then I will enter the age in textbox 7
    Then I will enter the website details  http://www.google.com/
    Then I will enter the Phone number  9000000000
    Then I choose interests reading,dancing
    Then I will enter in the note textbox  address note
    Then I will click on create address
    Then I will click on edit
    Then I enter lastname Narayan
    Then I will click on update address
    Then I will click on signout












