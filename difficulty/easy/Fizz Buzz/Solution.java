class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> fb = new ArrayList<>();
        
        for(int i =1;i<=n;i++){
            //is multple of three
            int iMOT = i%3;
            //is multiple of five
            int iMOF = i%5;
            
            if((iMOF+iMOT)==0){
                 fb.add("FizzBuzz");
            }else if(iMOF==0){
                 fb.add("Buzz");
            }else if (iMOT==0){
                  fb.add("Fizz");
            }else{
               fb.add(String.valueOf(i)); 
            }
        }
        
       
      return fb;
        
    }
}
