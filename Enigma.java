public class Enigma{

    private String rotorInit[] = {
        "#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"
    };


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        //TODO
        String decryptString = "";
        char[] messageChar = message.toCharArray();

        for(int i = 0;i < messageChar.length;i++){
            char currentChar = messageChar[i];

            int innerIndex = rotors[2].indexOf(currentChar);
            char outerChar = rotors[1].charAt(innerIndex);
            //System.out.println(outerChar);
            int middleIndex = rotors[2].indexOf(outerChar);
            char finalChar = rotors[0].charAt(middleIndex);
            
            decryptString += finalChar;

            rotate();
        }

        return decryptString;  
    }


    
    public String encrypt(String message){

        String encryptString = new String();
        char[] messageChar = message.toCharArray();

        for(int i = 0;i < messageChar.length;i++){
            char currentChar = messageChar[i];

          
            int innerIndex = rotors[0].indexOf(currentChar);
            char outerChar = rotors[2].charAt(innerIndex);
            //System.out.println(outerChar);
            int middleIndex = rotors[1].indexOf(outerChar);
            char finalChar = rotors[2].charAt(middleIndex);
            
            encryptString += finalChar;

            rotate();
        }

        System.out.println(encryptString);

        return encryptString;  
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
