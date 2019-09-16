/*Roman Špak

 */



public class SlovakLang extends Subject {
    public static String upperCaseFirst(String value) {


        char[] array = value.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);
    }

    public static void main(String[] args) {

        String value = "dnes je pondelok";

        String result = upperCaseFirst(value);
        System.out.println(value);
        System.out.println(result);

     
    }
}

