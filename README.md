<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

 -- In mainscreen.html I changed lines 19, 21, and 53. These changes altered the shops, parts, and product section names. No additional elements, colors, styles etc were added.

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

 -- Added about.html in the templates' folder, and created a very simple webpage describing to the web viewer how cool big bert's skateboards are. This page also included a button to navigate to the mainscreen.html page, and some light formatting to put the text in the middle of the screen. In mainscreen.html, I updated lines 20 - 22 to include a button to navigate to the new about.html page. I added a AboutController file in the com.example.demo/controllers file. This controller file added the functionality on lines 9 - 11 for the buttons to properly navigate back and forth. 

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.

 -- In BootStrapData.java I added my five different types of skateboard products, and five skateboard parts. Lines 40 - 80 are the parts, and lines 97 - 106 are the different type of skateboard products. Added spacing, and formatting in written code to make it easier to read on various lines throughout the file. On line 42, and 101 I added an if statement to prevent duplicate parts / products from being added if the list was not 0.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

 -- Added the succpurchase.html file and the failpurchase.html file and their functionality so that they display a message of either failed or successful purchase. This code is implemented on line 8 and 9 on both files. Added the BuyController.java file for the Buy button and added the proper functionality using @Autowired and @GetMapping. In productServiceImpl.java I created decrInventory which takes a productId as a long, and deleted one value from the total inventory after a successful purchase. This was done on line 70 - 77. I also added a totalInventory method which returned the new inventory total so that I could call it for the if else statement inside the BuyController file. This was completed on line 81 - 85 of ProductServiceImpl.java. Inside ProductService.java on line 20, I added the decrInventory method, and line 21 I added the totalInventory method. Added the buy button to the mainscreen.html file on line 88.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

 -- Added additional fields to parts entity in Parts.java file on lines 32 - 37. Initialized those variables into the public parts object on line 47 - 61. Added get / set methods for new variables on lines 96 - 108. On line 120 - 122 of Parts.java, I added a method to check if inventory was given a valid input. Added two new columns in mainscreen.html on lines 41 and 42. Functionality for these two columns was added on lines 51 and 52. In BootStrapData.java, I set the min / max inventory for each part individually. This took place on lines 50-51, 60-61, 70-71, 80-81, and 90-91. In OutsourcedPartForm.html, line 27 - 30 added the input text box for the min / max inventory fields. These fields only allow the specified min / max values to be inputted and display an error message when needed. This same functionality is added in the InhousePartForm.html file on lines 26 - 29. Renamed datasource.url in the application.properties file to database on line 6.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

 -- Inside AddInhousePartController.java, altered the if statement under @PostMapping on lines 45 - 48 to create an error message if input was not within range of min / max values. The same thing was done in AddOutsourcedPartController.java on lines 46 - 49. In both InhousePartForm.html, and OutsourcedPartForm.html, I added new <div> elements to display the error message created in the respective controller files. This was done on lines 32 - 35 in both files. Altered the EnufPartsValidator.java file on line 36. Added an OR statement to the if() statement to return false if not enough parts will be available to add to product. 

I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.  Remove the class files for any unused validators in order to clean your code.