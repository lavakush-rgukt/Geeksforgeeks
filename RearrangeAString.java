//Rearrange a string 

class RearrangeAString
{
    public String arrangeString(String s)
        {
            //code here.
            
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String finalSt ="";
            int mysum = 0;
            boolean contains =false;
            for(int i=0;i<c.length;i++){
                if(Character.isDigit(c[i])){
                    mysum = mysum + Integer.parseInt(c[i]+"");
                    contains = true; 
                }else{
                    finalSt= finalSt + c[i];
                }  
            }
            String st = contains==true? finalSt+mysum: finalSt;
            //System.out.println(st);
            return st;
        }
}
