import java.util.Objects;
public class Main {
    public static void main(String[] args) {


        String bookList[] = new String[6];
        bookList[0] = "Библия";
        bookList[1] = "Азбука";
        bookList[2] = "Дракула";
        bookList[3] = "Ведьмак";
        bookList[4] = "Библия";

        for (int i = 0; i < bookList.length; i++) {
            for (int j = i + 1; j < bookList.length; j++) {
                if (bookList[i] == bookList[j]) {
                    bookList[i] = null;

                }
            }

            if (bookList[i] != null) {
                System.out.print(bookList[i]);

            }


        }
    }}