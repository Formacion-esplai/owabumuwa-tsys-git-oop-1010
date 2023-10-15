


import java.util.Random;

public class Password {
	private int longitud;
	private String password;
	
	private static final int LONGITUD = 8; 

	
	//Por defecto
	public Password() {
		 this.longitud = LONGITUD; 
		 this.password = createPassword();;		 
	}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String createPassword() {
	    String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String characters = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        
        StringBuilder generatedPassword = new StringBuilder();

        
        String comboForPassword = upperCaseLetters + lowerCaseLetters + numbers + characters;
     	Random random = new Random();
     	
     	int randomIndex = 0; 
     	char passwordNow = '\0';
     	
     	for(int i = 0; i<LONGITUD; i++) {
     		randomIndex = random.nextInt(comboForPassword.length());
         	passwordNow = comboForPassword.charAt(randomIndex);
         	generatedPassword.append(passwordNow);
     	}
     	return generatedPassword.toString();

	}
	
     public static void main(String[] args) {
		Password password = new Password();
		String generatedPassword = password.getPassword();
		System.out.println("La contraseña es: " + generatedPassword);
	}
	 
}

