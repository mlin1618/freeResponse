
public class Code {
    private String myCode;
    private String temp;
    public Code(String code){
        myCode = code;
        temp = code;
    }
    public String getCode(){
        return myCode;
    }
    public void hide(int p1, int p2){
        for(int i = p1; i < p2; i++){
            myCode = myCode.substring(0,i) + "X" + myCode.substring(i+1, myCode.length());
        }
    }
    public void recover(int p1, int p2){
        myCode = myCode.substring(0,p1) + temp.substring(p1,p2) + myCode.substring(p2, myCode.length());
    }
}
