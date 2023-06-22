

public class Main {
    public static void main(String[] args) {
        String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] strings = s
                .replaceAll("", "")
                .replaceAll("}", "")
                .replaceAll("\"", "")
                .split(" ");
        StringBuilder builder = new StringBuilder();
        builder.append("'").append(strings[0]).append(" = '").append(strings[1]).append("' ").append(strings[2]).append("' ").append(strings[3]).append("' ");


        System.out.println(builder);
    }
}


