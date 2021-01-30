import java.util.ArrayList;
public class Caesar {
    ArrayList<Character> alphabet = new ArrayList<Character>();

    public Caesar() {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            alphabet.add(letter);
        }
    }

    public int position_of_char(char charindex) {
        return alphabet.indexOf(charindex);
    }

    public char letter_at_pos(int poschar) {
        return alphabet.get(poschar);
    }

    public char encrypt_char(char encryaphaconver) {
       int index_char = position_of_char(encryaphaconver);
       index_char = index_char+3;
       if (index_char >= 26){
           index_char = index_char-26;
       }
       char new_index = letter_at_pos(index_char);
       return new_index;

    }

    public char decrypt_char(char decryptalphacharconvet ){
        int index_chardecrpt = position_of_char(decryptalphacharconvet);

        index_chardecrpt = index_chardecrpt-3;
        if (index_chardecrpt < 0){
            index_chardecrpt = index_chardecrpt+26;
        }
        char new_indexDecrypt = letter_at_pos(index_chardecrpt);
        return new_indexDecrypt;
    }

    public String encrypt(String strng_encypt){
        String ciphertext = "";
        for (int i=0;i<strng_encypt.length();i++){
            ciphertext+=encrypt_char(strng_encypt.charAt(i));

        }
        return ciphertext;
    }

    public String decrypt(String String_decrypt){
        String ciphertext = "";
        for (int i=0;i<String_decrypt.length();i++){
            ciphertext+=decrypt_char(String_decrypt.charAt(i));

        }
        return ciphertext;
    }
}




