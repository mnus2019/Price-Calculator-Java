package Project1;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* Class                QuiltPrice()
* File                 QuiltPrice.java
* Description          Provides constants MAX_SHINNING_STAR,MAX_KAT_SOUP
*                      MAX_BIRCH_TREES, TAX, PRICE_SHINNING_STAR, PRICE_KAT_SOUP,
*                      PRICE_BIRCH_TREES ,subTotal, tax, shinningStar,katSoup,
*                      birchTrees declared as double and Byte respectively.
*                      methods setQuiltPrice(), QuiltPrice()(i.e Constructor),
*                      calculateSubTotal(), calculateTax().
* Environment          PC,Windows 10, jdk 20, NetBeans 17.
* Date                 4/18/2023
* @author              <i>Minassie Ghebremicael</i>
* @version             1.0.0
* History Log   
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class QuiltsPrice {
    final double MAX_SHINNING_STAR = 10; //maximum allowed shiinning star quilts
    final double MAX_KAT_SOUP = 6; //maximum allowed kat soup quilts
    final double MAX_BIRCH_TREES = 3; //maximum allowed birch trees quilts
    final double TAX = 0.098;  // tax constant rate
    final double PRICE_SHINNING_STAR = 950; //price for shiinning star quilts
    final double PRICE_KAT_SOUP = 480; //price for kat suop quilts
    final double PRICE_BIRCH_TREES = 315; //price for birch trees quilts
    private double subTotal;  // subtotal
    private double tax;  // tax
    private byte shinningStar; //number of shinning star quilts
    private byte katSoup; //number of kat soup quilts
    private byte birchTrees; //number of birch trees quilts

     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * Default constructor
     * Creates an instance of a QuiltPrice object with default
     * values for its fields.
     * Calls setQuiltPrice() method for validation and assigns values.
     * @param shinningQlParam--byte
     * @param katQlParam--byte
     * @param birchQlParam--byte
     * @param id--byte
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
     public QuiltsPrice (byte id,byte shinningQlParam, byte katQlParam, 
             byte birchQlParam)
   {
        setQuiltPrice(shinningQlParam,
                katQlParam, birchQlParam); 
          
   }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               setQuiltPrice()
    * Description          Checks for quilts  Validation performed are
    *                      on range and assign values to proposed quilts values.
    * Environment          PC,Windows 10, jdk 20, NetBeans 17.
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @param               shinningStarParam-byte
    * @param               katSoupParam-byte
    * @param               birchTreesParam-byte
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    private void setQuiltPrice(byte shinningStarParam, 
            byte katSoupParam, byte birchTreesParam)
   {
    // check for valid quilts value
        if ((shinningStarParam >= 0 && shinningStarParam <= MAX_SHINNING_STAR )
              && (katSoupParam >= 0 && katSoupParam <= MAX_KAT_SOUP) 
                && (birchTreesParam >= 0 && birchTreesParam <= MAX_BIRCH_TREES))
        {   
            // assign values
            shinningStar = shinningStarParam;
            katSoup = katSoupParam;
            birchTrees = birchTreesParam;
        }
        else
        {
           shinningStar = 0;
           katSoup = 0;
           birchTrees = 0;
        }
   
   }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               setQuiltPrice()
    * Description          Calculates Tax for assigned quilts purchased.
    *                      It calls a method calculateSubTotal()
    * Environment          PC,Windows 10, jdk 20, NetBeans 17.
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @return              double
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/    
    public double calculateTax()
    {
         // returns the calculated tax
        return (TAX * calculateSubTotal());
    } 
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               calculateSubTotal()
    * Description          Calculate quilts charges by validating the quilts
    *                      assigned value and return.
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @return              double
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
     public double calculateSubTotal()
    {   // check quils value are in range
         if ((shinningStar >= 0 && shinningStar <= MAX_SHINNING_STAR )
              && (katSoup >= 0 && katSoup <= MAX_KAT_SOUP) 
                && (birchTrees >= 0 && birchTrees <= MAX_BIRCH_TREES))
         {
             // calculates the subtotal of the quilts
              subTotal = (PRICE_SHINNING_STAR * shinningStar) + 
                      (PRICE_KAT_SOUP  * katSoup) +
                      (PRICE_BIRCH_TREES * birchTrees);
             
         } 
         else
         {
             subTotal = 0;
         }
         
         return subTotal;
         }
      /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * Method               calculateTotal()
    * Description          Calculate total quilt charges. It calls a method,
    *                      calculateSubTotal() to get the subtotal and
    *                      calculateTax() to get the quilts tax.It adds
    *                      both methods to provide total charges.
    * Date                 4/25/2023
    * @author              <i>Minassie Ghebremicael</i>
    * @return              double
    * History Log   
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/ 
    public double calculateTotal()
     {
         // returns the calculated total
       return (calculateSubTotal() + calculateTax());
     }
}


         

 