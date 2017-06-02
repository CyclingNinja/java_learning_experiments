public class FizzBuzz {
    int response_int;
    String response_str;

    public FizzBuzz(int fbNumber){
        response_int = fbNumber;
}
        
    public obj getResponse() {
        
        if (response_int == 3) {
            response_str = "Fizz";
            return response_str;    
        }
        else {
            return response_int;
        }
    }
}
