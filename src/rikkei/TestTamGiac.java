package rikkei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTamGiac {
    @Test
     void testTamGiacdeu(){
        double a,b,c;
        a= 6;
        b = 6;
        c=6;
        String expected = "Tam giác đều!";
        String result = CheckTamgiac.checkTamGac(a,b,c);
        assertEquals(expected,result);

    }
    @Test
    void testTamGiacCan(){
        double a,b,c;
        a= 5;
        b = 5;
        c=7;
        String expected = "Tam giác cân!";
        String result = CheckTamgiac.checkTamGac(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiacVuong(){
        double a,b,c;
        a= 3;
        b = 4;
        c=5;
        String expected = "Tam giác vuông!";
        String result = CheckTamgiac.checkTamGac(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiacVuongCan(){
        double a,b,c;
        a= 3;
        b = 3;
        c=Math.sqrt(18);
        String expected = "Tam giác vuông cân!";
        String result = CheckTamgiac.checkTamGac(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiacThuong(){
        double a,b,c;
        a= 3;
        b = 7;
        c=9;
        String expected = "Tam giác thường!";
        String result = CheckTamgiac.checkTamGac(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTamGiacSai(){
        double a,b,c;
        a= 3;
        b = 4;
        c=10;
        String expected = "3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!";
        String result = CheckTamgiac.checkTamGac(a,b,c);
        assertEquals(expected,result);
    }

}
