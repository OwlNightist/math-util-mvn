/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.binh.mathutil.core.test;

import static org.binh.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        
        //assertEquals(69, 69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
        
    }
}
//DDT LÀ MỘT PHẦN MỞ RỘNG CỦA CÁC UNIT TEST FRAMEWORK
//DATA DRIVEN TESTING
// KHÔNG NHẦM VỚI TDD: TEST DRIVEN DEVELOPMENT
//VIEST CODE VÀ VIẾT TEST CASE SONG HÀNH VỚI NHAU, ĐÃ HỌC XONG
//NHƯNG CODE TEST BỐC MÙI (BAD SMELLS) TRÙNG CODE NHIỀU
//NÊN NGƯỜI TA CHẾ RA CÁCH VIẾT CODE TEST ĐẸP HƠN, GỌN HƠN, DỄ BÀO TRÌ HƠN
