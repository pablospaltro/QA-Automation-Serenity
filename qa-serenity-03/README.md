qa-serenity-03

In this project there are four versions of a Serenity BDD test, interacting with https://www.saucedemo.com/ 

(the four versions are originally intended to compare four ways to design a login test with a growing complexity. The first three are only login test cases, but the V4 also includes a WhenPurchasing (a product) test case as well)

- SauceDemoV1: 
first approach to a login test using the Serenity BDD template (using a very similar test case to the example test it gives).


- SauceDemoV2: 
another approach to a login test without the template: all web driver actions and testing layer in one class (not a recommended practice).


- SauceDemoV3:
we still do all in one class, now extending UIInteractions for a better interaction with the web elements.


- SauceDemoV4:
    As a test class,
    it should only do that: test.
    it shouldn´t extend from UIInteractions / PageObject
    since its propose is completely different
    (Single Responsibility Principle)

    That's why we use separated classes
    such as LoginActions ( interacting with the user data )
    and InventoryPage ( interacting with the page / web element )

        additional info:
        Also as a good practice, we should structure the project
        creating packages separating:
        - pages / actions / actor / test cases

          (Which elements are going to be just Pages
          and which ones just Actions.
          We don't have a page with actions,
          they're separated.)

    UPDATE: since I began to create more classes, I've structured them
    now in packages (following the original Serenity BDD template as a guide)

