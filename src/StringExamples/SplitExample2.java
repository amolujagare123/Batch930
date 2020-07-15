package StringExamples;

public class SplitExample2 {

    public static void main(String[] args) {

        String str = "Hi this is a engineering";

        String[] stArr = str.split(" ");
        //=> {"Hi","this","is","a","java","program"}
       //     charAt(i) ---->        "Priyanka" ---> ilast = l-1 -> str.length() - 1
        // stArr[i].charAt(iLast) == 's'
        System.out.println("-----using normal way-------");

        for(int i=0;i<stArr.length;i++) {

            int iLast = stArr[i].length() - 1;

            if(stArr[i].charAt(iLast)=='s')
                System.out.println(stArr[i]);
        }

        System.out.println("-----using endsWith()-------");
        // stArr[i].charAt(iLast) == 's'
        for(int i=0;i<stArr.length;i++) {


            if(stArr[i].endsWith("s"))
                System.out.println(stArr[i]);
        }


    }
}

// normal way and using startsWith / contains
// 1. hey baby you are so lovely -- print the words that contains 'o'
// 2. we want to go to toronto  -- print the words those starts with 'a'