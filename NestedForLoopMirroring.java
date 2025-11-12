public class NestedForLoopMirroring {
    public static void main(String[] args) {
    int i;
        //This acts as a  row
       for ( i = 1; i <= 10; i++) {
          //this acts as the coloumns which will print star(s)
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            //Still in the first row we will now proceed to the second row to print spaces
            for (int j = 10; j>i; j--) {
                   System.out.print("  ");
               }
            //Still in the first row, when the spaces have finished printing, print the star
           //This will act as mirroring
            for(int k=1;k<=i;k++){
                   System.out.print("*");
               }
             //This is because after each row, print on a new row
               System.out.println();
           }
    }

}


