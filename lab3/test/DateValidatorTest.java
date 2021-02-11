
/* * * * * * * * * * * * * * * * * * * * * * * * * * * ** * * * * * * * * *
* 
* ENSE375 Lab3 Test-Driven Development
* Author: Li Pan SID 200371281
* Reference: The lab material from Adam.
* DateValidator Test File for checking wehther the date is legal format.
*     
* * * * * * * * * * * * * * ** * * * * * * * * ** * * * * * * * * * * * */
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DateValidatorTest {

    /** Adam test samples: */

    @Test
    public void Validate_Today_True() {
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02042021");
        assertTrue(legalDate);
    }

    @Test
    public void Validate_Tomorrow_True() {
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02052021");
        assertTrue(legalDate);
    }

    @Test
    public void Validate_Jan32_False() {
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("01322021");
        assertFalse(illegalDate);
    }

    @Test
    public void Validate_13thMonth_False() {
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("13012021");
        assertFalse(illegalDate);
    }

    @Test
    public void Validate_Feb31_False() {
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("02312021");
        assertFalse(illegalDate);
    }

    @Test
    public void Validate_LeapDay_True() {
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02292020");
        assertTrue(legalDate);
    }

    @Test
    public void Validate_TodayWithSeparator_True() {
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("02/04/2021");
        assertTrue(legalDate);
    }

    @Test
    public void Validate_TodayWithMissMatchSeparator_False() {
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("02/04-2021");
        assertFalse(illegalDate);
    }
    /**Below is my own testing work */
    @Test
    public void Validate_TodayWithLongName_True() {
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("Thursday, February 4, 2021");
        assertTrue(legalDate);
    }

    @Test
    public void Validate_TodayWithShortName_True() {
        DateValidator dateValidator = new DateValidator();
        boolean legalDate = dateValidator.validate("Thurs, Feb 4, 2021");
        assertTrue(legalDate);
    }

    @Test
    public void Validate_weekDayMatchdate_False() {
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("Thursday, February 5, 2021");
        assertFalse(illegalDate);
    }

    @Test
    public void Validate_dateFormat_False() {
        DateValidator dateValidator = new DateValidator();
        boolean illegalDate = dateValidator.validate("abc, d, e");
        assertFalse(illegalDate);
    }

}