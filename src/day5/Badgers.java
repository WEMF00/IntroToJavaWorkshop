package day5;

public class Badgers {
public static void main(String[] args) {
	String x = "Badger";
	String y = "Mushroom";
	for (int i = 0; i < 2; i++) {

		for (int l = 0; l < 12; l++) {
		speak(x);
		}
		for (int k = 0; k < 2; k++) {
		speak(y);
		}
	}
	for (int i = 0; i < 12; i++) {
		speak(x);
	}
	for (int i = 0; i < 1; i++) {
		speak("Snaaaaake");
	
	}
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }

}

