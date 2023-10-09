package DSA.Data_structure.mapDataStructure;

public class main< length > {
    public static void main(String[] args) {
        String str = "Geeks";
        int length = str.length();
        // Reverse the string str
        for(int i = 0;i<length;i++){
            char temp;
            temp =  str.charAt(i);
//            str.replace(str.charAt(length -1));
            str.replace(str.charAt(length-1) ,temp);
            length--;
        }

       System.out.println(str);
    }
    // Reverse the string str

}
