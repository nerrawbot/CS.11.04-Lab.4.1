public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String parentheses) {
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == ('(')) {
                counter++;
            }
            if (parentheses.charAt(i) == (')')) {
                counter2++;
            }
        }
        return counter == counter2;
    }


    public static String reverseInteger(int num) {
        String revint = "";
        for (int i = String.valueOf(num).length() - 1; i >= 0; i--) {
            revint += String.valueOf(num).charAt(i);
        }
        return revint;
    }

    public static String encryptThis(String helloGoodDay) {

        String[] words = helloGoodDay.split(" ");
        StringBuilder encryptedMessage = new StringBuilder();

        for (String word : words) {
            if (word.length() == 1) {
                encryptedMessage.append((int) word.charAt(0)).append(" ");
            } else if (word.length() == 2) {
                encryptedMessage.append((int) word.charAt(0)).append(word.charAt(1)).append(" ");
            } else {
                int firstCharCode = (int) word.charAt(0);
                char secondChar = word.charAt(1);
                String middlePart = word.substring(2, word.length() - 1);
                char lastChar = word.charAt(word.length() - 1);
                encryptedMessage.append(firstCharCode).append(lastChar).append(middlePart).append(secondChar).append(" ");
            }
        }
        return encryptedMessage.toString().trim();
    }

    public static String decipherThis(String s) {
        String[] words = s.split(" ");
        StringBuilder decryptedMessages = new StringBuilder();

        for (String word : words) {
            if (word.isEmpty()) continue;

            int i = 0;
            while (i < word.length() && Character.isDigit(word.charAt(i))) {
                i++;
            }
            char firstChar = (char) Integer.parseInt(word.substring(0, i));
            String restOfWord = word.substring(i);

            if (restOfWord.isEmpty()) {
                decryptedMessages.append(firstChar).append(" ");
            }
            if (restOfWord.length() == 1) {
                decryptedMessages.append(firstChar).append(restOfWord).append(" ");
                continue;
            }
            char lastChar = restOfWord.charAt(restOfWord.length() - 1);
            String middlePart = restOfWord.substring(1, restOfWord.length() - 1);
            char secondChar = restOfWord.charAt(0);
            decryptedMessages.append(firstChar).append(lastChar).append(middlePart).append(secondChar).append(" ");
        }
        return decryptedMessages.toString().trim();
    }
}
        /*String[] words = s.split(" ");
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,0};
        int counter = 0;
        StringBuilder encryptedMessages = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == nums[i]) {
                    counter++;
                }
            }
            if (word.length() == 1) {
                encryptedMessages.append((char)Integer.parseInt(word.substring(0, (int)counter)));
            } else if (word.length() == 2) {
                encryptedMessages.append((char)Integer.parseInt(word.substring(0, (int)counter)));
            } else {
                char firstCharCode2 = (char) Integer.parseInt(word.substring(0, 2));
                char secondChar2 = word.charAt(1);
                String middlePart2 = word.substring(2, word.length() - 1);
                char lastChar = word.charAt(word.length() - 1);
                encryptedMessages.append(firstCharCode2).append(lastChar).append(middlePart2).append(secondChar2).append(" ");
            }
        }
        return encryptedMessages.toString().trim();
    }
}

    // String[] Array = helloGoodDay.split(" ");
        /* StringBuilder str = new StringBuilder();
        int letter1 = 0;
        int lastDigit = 1;
        String EncString = "";
        int secondDigit = 0;
        int lastChar = 0;
        EncString += (int)helloGoodDay.charAt(letter1);
        for (int i = 0; i < helloGoodDay.length() -1 ; i++) {
            if (helloGoodDay.charAt(i + 1) == ' ') {
                lastDigit = i;
                lastChar = helloGoodDay.charAt(i);
                secondDigit = helloGoodDay.substring()
            }



        }

        int x = helloGoodDay.length();
        String brush = helloGoodDay.substring(1,2);
        System.out.println(brush);
        String brush2 = helloGoodDay.substring(x-3,x-1);
        System.out.println(brush2);
        helloGoodDay = helloGoodDay.replace(brush, brush2);
        helloGoodDay = helloGoodDay.replace(brush2, brush);
        int i = helloGoodDay.charAt(0);
        helloGoodDay = helloGoodDay.substring(1, x-1);
        helloGoodDay = i + helloGoodDay;
        return helloGoodDay;*/


// 2. reverseInteger

    //x <= 40, 30x
    //x > 40, 50(x-40) + 1200

    //x <= 20, 22x
    //20 < x <= 30, 40(x - 20) + 440
    //x > 30, 60(x-30) + 840

    // 3. encryptThis


    // 4. decipherThis


