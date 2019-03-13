public class Encrypt {
    private String message;
    private int code;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public char encrypt(char x){
        return (char)((int)x+this.code);
    }
    public String encryptAll(){
        String result="";
        for(int i=0;i<this.message.length();i++){
            if(this.message.charAt(i)!=' ')
                result=result+encrypt(this.message.charAt(i));
            else
                result=result+' ';
        }
        return result;
    }
}
