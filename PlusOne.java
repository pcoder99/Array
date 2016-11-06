PS:
  Given a non-negative number represented as an array, plus one to the number.
  The most significant digit was persisted at the head of the array.

Thought:
  Actually, there is one case we need a new array
  
Implementation:
   public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newNumber = new int[len + 1];
        newNumber[0] = 1;
        return newNumber;
    }
