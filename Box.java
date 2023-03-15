import java.util.Arrays;
public class Box {

        private double width;
        private double height;
        private double depth;
        private String[] boxArray = new String[10];

        Box() {
            Arrays.fill(boxArray, "");
        }
        
        void addItem(String itemName) {
            int itemInsertLocation = -1;
            for (int i = 0; i < boxArray.length; i++) {
                if (boxArray[i] == "") {
                    itemInsertLocation = i;
                    break;
                }
            }
            if (itemInsertLocation == -1) {
                System.out.println("Box is full. can't add:" + itemName);
            } else {
                boxArray[itemInsertLocation] = itemName;
                System.out.println(
                    "Item Inserted - item "
                    + itemInsertLocation
                    + ":" + itemName );
            }

        }

        void removeItem(String itemName) {
            int itemRemoveLocation = -1;
            for (int i = 0; i < boxArray.length; i++) {
                if (boxArray[i] == itemName) {
                    itemRemoveLocation = i;
                    break;
                }
            }
            if (itemRemoveLocation == -1) {
                System.out.println(itemName + "doesn't exist");
            } else {
                boxArray[itemRemoveLocation] = "";
                System.out.println(
                    "Item removed - item"
                    + itemRemoveLocation
                    + ":" + itemName );
            }
        }

        void printItems() {
            for (int i=0; i < boxArray.length; i++) {
                System.out.println("item " + i + ": " + boxArray[i]);
            }
        }
        //constructor
        public Box(double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
        void findWidth(int inputW) {
            width = inputW;
        }
        double getWidth() {
            return width;
        }
        void findDepth(int inputD) {
            depth = inputD;
        }
        double getDepth() {
            return depth;
        }
        void findHeight(int inputH) {
            height = inputH;
        }
        double getHeight() {
            return height;
        }
       
       public double findVolume() {
        return width * height * depth;
       }
}

class BoxDemo {
    public static void main(String[] args) {
        Box theBox = new Box();
        theBox.findHeight(3);
        theBox.getHeight();
        theBox.findDepth(4);
        theBox.getDepth();
        theBox.findWidth(2);
        theBox.getWidth();
        theBox.findVolume();
        
        System.out.println("The volume of the box is " + theBox.findVolume());

        theBox.addItem("Banana");
        theBox.addItem("Soda Can");
        theBox.addItem("Laptop");
        theBox.addItem("Xbox Series X");
        theBox.addItem("PS5");

        theBox.printItems();

        theBox.addItem("Sweatshirt");

        theBox.printItems();

        theBox.removeItem("Laptop");
        theBox.removeItem("PS5");
        theBox.printItems();
    }
}
