package project1;

import java.util.*;


public class Problem {
    //attributes
    private int num;
    private String passage;
    private String right;
    private ArrayList<String> wrong;
    
    //constructors
    public Problem() {this(-1,"","",new ArrayList<String>());}
    public Problem(int n,String p, String r, ArrayList<String> w){
        num =n;
        passage     = p;
        right       = r;
        wrong       = w;
    }
    
    //getters
    public int getNum() {return num;}
    public String getRight() { return right;}
    public ArrayList<String> getWrong() { return wrong;} 
    public String getWrong(int index) {return wrong.get(index);}
    public String getPassage() { return passage;}
    //setters
    public boolean setNum(int n) { num =n; return true;}
    public boolean setRight(String r) { right=r; return true;}
    public boolean setWrong(ArrayList<String> w) { wrong = w; return true;}
    public boolean setPassage(String p) { passage =p ; return true;}
    
    public String[] getOutOf(int r) {
        shuffleWrongs();
        
        String[] outof = new String[5];
        int f=0;
        
        for(int i=0;i<outof.length;i++) {
            if(i==r) {outof[i]=right; f=1;}
            else outof[i]=wrong.get(i-f);
        }
        return outof;
    }
    
    public void shuffleWrongs() {
        Collections.shuffle(wrong);
    }
    
    public String toString() { 
        String result=num+". "+passage+", right : "+right+", wrong : ";
        for(String s : wrong) {
            result+=s+", ";
        }
        return result;
    }

}