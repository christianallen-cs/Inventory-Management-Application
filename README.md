# Western Governors University 
## D287 – Java Frameworks

### C. Customize the HTML User Interface
- **Changes Made:** 
  - In `mainscreen.html`, I modified lines 19, 21, and 53. These changes altered the shop, parts, and product section names.
  - No additional elements, colors, or styles were added.

### D. Add an "About" Page
- **Changes Made:**
  - Created `about.html` in the `templates` folder. This simple webpage describes how cool Big Bert's Skateboards are.
  - Added a button to navigate back to `mainscreen.html` and applied light formatting to center the text.
  - In `mainscreen.html`, updated lines 20-22 to include a button for navigation to the new `about.html` page.
  - Added `AboutController` in `com.example.demo/controllers` to handle navigation functionality on lines 9-11.

### E. Add a Sample Inventory
- **Changes Made:**
  - In `BootStrapData.java`, I added five types of skateboard products and five skateboard parts.
  - Parts are added on lines 40-80, and products on lines 97-106.
  - Added spacing and formatting to improve readability throughout the file.
  - Included `if` statements on lines 42 and 101 to prevent duplicate parts/products from being added if the list is not empty.

### F. Add a "Buy Now" Button
- **Changes Made:**
  - Created `succpurchase.html` and `failpurchase.html` to display success or failure messages after a purchase. This code is on lines 8 and 9 in both files.
  - Added `BuyController.java` to handle "Buy Now" button functionality using `@Autowired` and `@GetMapping`.
  - In `ProductServiceImpl.java`, added `decrInventory` method on lines 70-77 to decrement product inventory by one upon a successful purchase.
  - Also, added `totalInventory` method on lines 81-85 to return the updated inventory total.
  - In `ProductService.java`, added `decrInventory` on line 20 and `totalInventory` on line 21.
  - Added the "Buy Now" button to `mainscreen.html` on line 88.

### G. Track Maximum and Minimum Inventory for Parts
- **Changes Made:**
  - Added additional fields to the `Parts.java` entity on lines 32-37 for max and min inventory.
  - Initialized these variables in the public parts object on lines 47-61.
  - Added `get`/`set` methods for the new variables on lines 96-108.
  - Added a method on lines 120-122 to check for valid inventory input.
  - Added new columns for min/max inventory in `mainscreen.html` on lines 41-42 with functionality on lines 51-52.
  - Set min/max inventory in `BootStrapData.java` for each part individually on lines 50-51, 60-61, 70-71, 80-81, and 90-91.
  - Updated `OutsourcedPartForm.html` on lines 27-30 and `InhousePartForm.html` on lines 26-29 to include input text boxes for min/max inventory.
  - Renamed `datasource.url` in the `application.properties` file to `database` on line 6.

### H. Add Validation for Maximum and Minimum Fields
- **Changes Made:**
  - In `AddInhousePartController.java`, altered the `@PostMapping` if statement on lines 45-48 to create an error message for invalid min/max input.
  - Applied similar changes to `AddOutsourcedPartController.java` on lines 46-49.
  - Added new `<div>` elements in `InhousePartForm.html` and `OutsourcedPartForm.html` to display error messages on lines 32-35 in both files.
  - In `EnufPartsValidator.java`, altered the `if()` statement on line 36 to return false if not enough parts are available for a product.

### I. Add Unit Tests for Maximum and Minimum Fields
- **Changes Made:**
  - Added 4 unit tests in `PartTest.java` to test various min/max values for the `getMax` and `getMin` methods on lines 160-193.

### J. Remove Unused Validators
- **Changes Made:**
  - Removed the `DeletePartValidator.java` file as it was never used.
