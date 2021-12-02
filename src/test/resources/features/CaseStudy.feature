Feature: Case Study I Tests
  Background:
    Given Homepage is open
#    And I close the pop-up

    @done
    Scenario: Task I Search for drone
      When Verify page title "Best Buy | Official Online Store | Shop Now & Save"
      When Search for "drone"
      Then Verify search results for "drone"

    @done
    Scenario: Task II Make login
      And I open "Account" dropdown menu
      When I choose "Account" submenu
      When Verify page title "Sign In to Best Buy"
      When Login with credentials
      Then Verify welcome back
      And I open user dropdown menu
      And Verify user logged in
      And I logged out

  @done
    Scenario: Task III Login with Google
      And I open "Account" dropdown menu
      When I choose "Account" submenu
      When Verify page title "Sign In to Best Buy"
      When Login with google
      When I open homepage in new tab
      And I move to new tab
      And I open user dropdown menu
      Then Verify user logged in
      And I logged out

    @done
    Scenario: Task IV Save items
      And I open "Account" dropdown menu
      When I choose "Account" submenu
      When Verify page title "Sign In to Best Buy"
      When Login with credentials
      And Verify welcome back
      When I click the menu
      And I choose "Audio" menu item
      And I choose "Headphones" menu item
      And I choose "Wireless Headphones" submenu
      When I search for "Philips" brand
      And I click the Item Number 2
      When I verify product detail page "Philips"
      When I click the save button
      And I open "Saved Items" dropdown menu
      Then Verify saved item "Philips" is on the list
      And I open user dropdown menu
      And Verify user logged in
      And I logged out


    Scenario: Task V
      When Search for "sony tv"
      And I click for tv size
      And I add to cart item number 2
      Then I verify the cart subtotal



