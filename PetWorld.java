/**
 * A simulation of my world
 */
public class PetWorld {

    /**
     * Most pets are mammals
     */
    public abstract class Mammal {
        
        /**
         * All mammals can vocalize (make a sound) (I think!)
         */
        public void vocalize(String message) {
            System.out.println(message);
        }
        
        /**
         * All mamals can eat something
         */
        public abstract void eat(String food);
        
    }
    
    /**
     * Cats "inherit" from Mammals
     */
    public class Cat extends Mammal {
        
        /**
         * Our eye color
         */
        public String eyeColor = "blue";
        
        /**
         * Someone is petting us
         */
        public void pet() {
            if (Math.random() > 0.5) {
                vocalize("Purrrrrr...");
            } else {
                vocalize("(bite)");
            }
        }
        
        /**
         * We are being given something to eat
         */
        public void eat(String food) {
            String result;
            
            switch (food) {
                case "mouse":
                    result = "yum!";
                    break;
                case "carrot":
                    result = "no thanks";
                    break;
                default:
                    result = "(stares)";
            }
            
            // talk about how we feel
            vocalize(result);
        }
        
    }
    
    /**
     * What does our world do?
     */
    public void run() {
        
         // Mom can I have a cat please please please
         Cat myCat = new Cat();
         
         show("I got a new cat- thanks Mom!!");
         
         // What color eyes does my cat have?
         show("My cat's eyes are: ");
         show(myCat.eyeColor);
         
         // I love my cat!
         show("I'm petting my cat!");
         myCat.pet();
         
         // Here cat- eat this!!
         String food = "mouse";
         show("I'm feeding my cat a " + food);
         myCat.eat(food);
     
    }

    /**
     * Bootstrap to get world started
     */
    public static void main(String[] args) {
        PetWorld world = new PetWorld();
        world.run();
    }
    
    /**
     * Helper method to show something on the screen
     */
    private void show(String message) {
        // Use the build-in "System" object to print to the output (screen)
        System.out.println(message);
    }
     
}