///////////////////////////////////////// hw7.java

package hw7;

public class hw7 {

    public static void main(String[] args) {
        AnimalClassTester qa = new AnimalClassTester();
  
        Tyrannosaur clarence = new Tyrannosaur();
        if (qa.testAnimalObject((Object) clarence)) {
            System.out.println("Tyrranosaur class passes");
        } else {
            System.out.println(">>>>Tyrranosaur class Failed!<<<<");
        }
  
        Penguin opus = new Penguin();
        if (qa.testAnimalObject((Object)opus)) {
            System.out.println("Penguin class passes");
        } else {
            System.out.println(">>>>Penguin class Failed!<<<<");
        }
  
        Cow mrsolearys = new Cow();
        if (qa.testAnimalObject(mrsolearys)) {
            System.out.println("Cow class passes");
        } else {
            System.out.println(">>>>Cow class Failed!<<<<");
        }
    }
}

/////////////////////////////////////////  AnimalClassTester.java

package hw7;
public class AnimalClassTester {

   public boolean testAnimalObject(Object clarence) {
      
       if(clarence instanceof Tyrannosaur){
           return true;
       }
       if(clarence instanceof Penguin){
           return true;
       }
       if(clarence instanceof Cow){
           return true;
       }
      
       return false;
   }

}

///////////////////////////////////////// Tyrannosaur.java

package hw7;
public class Tyrannosaur {
   public Tyrannosaur(){}
}

///////////////////////////////////////// Penguin.java

package hw7;
public class Penguin {
   public Penguin(){}
}

///////////////////////////////////////// Cow.java

package hw7;
public class Cow {
   public Cow(){}
}

/////////////////////////////////////////

Tyrranosaur class passes Penguin class passes Cow class passes |

Tyrranosaur class passes Penguin class passes Cow class passes |

/////////////////////////////////////////