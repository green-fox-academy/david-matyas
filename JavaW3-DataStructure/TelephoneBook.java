import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> telephoneBook = new HashMap<String, String>();

        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        boolean containValue = false;
        for (Map.Entry entry : telephoneBook.entrySet()) {
            if (entry.getKey().equals("John K. Miller")) // What is John K. Miller's phone number?
            {
                System.out.println(entry.getValue());
            }
            if (entry.getValue().equals("307-687-2982")) //
            {
                System.out.println(entry.getKey());
            }

        }
        if (telephoneBook.get("Chris E. Myers'") != null)//
        {
            System.out.println("yes");
        } else  {
            System.out.println("no");

        }

    }
}