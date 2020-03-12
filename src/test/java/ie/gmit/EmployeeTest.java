package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    @Test
    void testConstructor ( ) {
        Employee myEmployee = new Employee( "Mr" , "habib" , "149329" , "0899860" , "Part-Time" , 24 );
        assertEquals( "habib" , myEmployee.getName( ) );
    }

    @Test
    void testConstructorNoTitle ( ) {
        assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "" , "habib" , "149329" , "0899860" , "Part-Time" , 24 ) );

    }

    @Test
    void testConstructorNoName ( ) {
        Exception e = assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "" , "bello" , "1493292F" , "0899860417" , "Part-Time" , 17 ) );
        assertEquals( "name is not provided" , e.getMessage( ) );
    }

    @Test
    void testConstructorNoPPS ( ) {
        assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "habib" , "" , "0899860" , "Part-Time" , 24 ) );
    }

    @Test
    void testConstructorNoPhone ( ) {
        assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "habib" , "149329" , "" , "Part-Time" , 24 ) );
    }

    @Test
    void testConstructorPart ( ) {
        assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "habib" , "149329" , "0899860" , "Part-Time" , 24 ) );
    }

    @Test
    void testConstructionAgeFail ( ) {
        // test age > 18
        Exception e = assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "habib" , "149329" , "0899860" , "Part-Time" , 17 ) );
        assertEquals( "must be over 18" , e.getMessage( ) );

    }

    @Test
    void testConstructionNameShort ( ) {
        // test name
        Exception e = assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "bello" , "149329" , "0899860" , "Part-Time" , 17 ) );
        assertEquals( "name too short" , e.getMessage( ) );

    }

    @Test
    void testConstructionNameLong ( ) {
        // test name
        Exception e = assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "bellossssssssssssssssssss" , "1493292F" , "0899860" , "Part-Time" , 17 ) );
        assertEquals( "name too Long" , e.getMessage( ) );

    }

    @Test
    void testConstructionPPSLong ( ) {
        // test name
        Exception e = assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "bello" , "1493292Ffdfdvs" , "0899860" , "Part-Time" , 17 ) );
        assertEquals( "PPS too Long" , e.getMessage( ) );

    }

    @Test
    void testConstructionWrongTitle ( ) {
        // test name
        Exception e = assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "scsdsfd" , "bello" , "149329" , "0899860" , "Part-Time" , 17 ) );
        assertEquals( "Invalid Title" , e.getMessage( ) );

    }

    @Test
    void testConstructionPhoneLong ( ) {
        // test name
        Exception e = assertThrows( IllegalArgumentException.class , ( ) -> new Employee( "Mr" , "bello" , "1493292F" , "0899860417" , "Part-Time" , 17 ) );
        assertEquals( "phone too short" , e.getMessage( ) );

    }


}
