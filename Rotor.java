public class Rotor {

    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    public boolean rotate(){
        //TODO
        
        rotorValues = rotorValues.charAt(rotorValues.length() - 1) + rotorValues.substring(0, rotorValues.length() - 1);

        //move the first charcter to the back
        if (rotorValues.charAt(0) == startChar){
            return true;
        }

        return false;
    
    }

    public int indexOf(char c){
        //TODO
        return rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        //TODO
        return rotorValues.charAt(idx);
    }
}
    
