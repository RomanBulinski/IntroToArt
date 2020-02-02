import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Itro {

    public static String[] getW(int height) {
        if (height < 2) {
            return new String[0];
        }
        int start = 0;
        int end = (height*2)-2 ;
        String[] halfResult = new String[height];
        for (int i = 0; i < height; i++) {
            String temp = "";
            for (int j = 0; j < (height * 2)-1; j++) {
                if( j == start || j == end ){
                    temp = temp + "*";
                }else{
                    temp = temp + " ";
                }
            }
            start++;
            end--;
            halfResult[i] = temp + temp.substring(1);
        }
        return halfResult;
    }

    public static void main(String[] args){
        Arrays.asList( getW(7) ).stream().forEach( n-> System.out.println(n));
    }

}

