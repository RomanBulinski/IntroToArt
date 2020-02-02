import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Itro {

    public static String[] getW(int height) {
        if (height < 2) {
            return new String[0];
        }

        String[] result = new String[height];
            for (int i = 0; i < height; i++) {
                String temp = "";
                for (int j = 1; j < (height * 4) - 2; j++) {
                    temp = temp + " ";
                }
                result[i] = temp;
            }

        int start = 0;
        int middle = (result[0].length()-1) /2 ;
        int end = result[0].length() - 1 ;

        char[] temparr = result[0].toCharArray();
        temparr[start] = '*';
        temparr[middle] = '*';
        temparr[end] = '*';

        StringBuilder sb = new StringBuilder();
        for( char c : temparr ){
            sb.append(c);
        }
        result[0] = sb.toString();

        return result;
    }

    public static void main(String[] args){




    }

}

