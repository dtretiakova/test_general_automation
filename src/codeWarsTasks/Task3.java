package codeWarsTasks;

public class Task3 {
    public String toCamelCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] strings = s.split("[-_]");
        stringBuilder.append(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            String result = strings[i].substring(0, 1).toUpperCase();
            result = result + strings[i].substring(1);
            stringBuilder.append(result);
        }

        return stringBuilder.toString();
    }

}
