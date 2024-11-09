package examplesTasksWithStringMethods;

public class TaskStrMethod_1 {
    public static void main(String[] args) {
        String url = "http://ukr.net/sport/news.jsp";

        int i = (url.indexOf("://"));
        System.out.println(i);

        String protocol = url.substring(0, i);
        System.out.println("Protocol: " + protocol);

        url = url.substring(i + 3);
        System.out.println(url);

        i = url.indexOf("/");
        System.out.println(i);

        String domain = url.substring(0, i);
        System.out.println("Domain: " + domain);

        System.out.println("Path: " + url.substring(i));



        System.out.println("--------------------------------");
       //Фамилию Имя Отчество - Третьякова Д.Є. нужно получить с большой букв.
        String fio = "Tretiakova Daria Evhenievna";

        int index = fio.indexOf(" ");
        String firstName = fio.substring(0, index);
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);


       int index2 = fio.lastIndexOf(" ");
        String secondName = fio.substring(index).trim().substring(0, 1).toUpperCase();


        String fatherName = fio.substring(index2).trim().substring(0, 1).toUpperCase();


        System.out.println(firstName + " " + secondName + ". " + fatherName + ". ");








    }
}
