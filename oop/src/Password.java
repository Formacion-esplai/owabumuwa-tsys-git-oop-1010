


import java.util.Random;

public class Password {
	int longitud;
	String password;
	
	private static final int LONGITUD = 8; 

	
	//Por defecto
	public Password() {
		 this.longitud = LONGITUD; 
		 this.password = "";		 
	}

	
	public char createPassword() {
	    String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String characters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        
        String comboForPassword = upperCaseLetters + lowerCaseLetters + numbers + characters;
     	Random random = new Random();
     	
     	int randomIndex = 0; 
     	char passwordNow = '\0';
     	
     	System.out.print("La contraseña es ");
     	
     	for(int i = 0; i<LONGITUD; i++) {
     		randomIndex = random.nextInt(comboForPassword.length());
         	passwordNow = comboForPassword.charAt(randomIndex);
         	
         	System.out.print(passwordNow);

     	}
     	return passwordNow;

     	

	}
	
     public static void main(String[] args) {
		Password password = new Password();
		password.createPassword();
	}
	 
}

