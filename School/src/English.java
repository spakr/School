public class English extends Subject {
    public static void main(String[] args) {
        String str = "pes";
        String rs = str.replace("p","d");
        rs = rs.replace("e","o");
        rs = rs.replace("s","g");
        System.out.println(rs);
    }
}

