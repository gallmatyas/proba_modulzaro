package text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Text {
    public static void modifyText(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String result = strings.get(i);
            if (result.length() > 25) {
                strings.set(i, result.substring(0, 20) + "...");
            }
        }
    }

    public static void main(String[] args) {

        List<String> szovegek = new ArrayList<>(Arrays.asList(
                "Ez egy rövid szöveg.",
                "Ez egy hosszú szöveg, aminek a hossza több mint 25 karakter.",
                "Ez is egy rövid szöveg.",
                "Ez szintén egy hosszú szöveg, mert több, mint 25 karakter."));

        modifyText(szovegek);

    }
}

