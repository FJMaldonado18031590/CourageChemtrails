import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtillTest
{

    @Test
    public void weak_when_has_less_than_8_letters()
    {
        assertEquals(PasswordUtill.SecurityLevel.WEAK,PasswordUtill.assessPassword("1234567"));
    }


    //123aa!
    @Test
    public void weak_when_has_only_letters()
    {
        assertEquals(PasswordUtill.SecurityLevel.WEAK,PasswordUtill.assessPassword("abcdefghijk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers()
    {
        assertEquals(PasswordUtill.SecurityLevel.MEDIUM,PasswordUtill.assessPassword("abcde12345"));
    }

    @Test
    public void string_when_has_letters_numbers_and_symbols()
    {
        assertEquals(PasswordUtill.SecurityLevel.STRONG,PasswordUtill.assessPassword("abcd1234!"));
    }

}