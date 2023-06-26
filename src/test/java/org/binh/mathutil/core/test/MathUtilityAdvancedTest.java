/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.binh.mathutil.core.test;

import static org.binh.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilityAdvancedTest {

    //tạo mảng 2 chiều chứa data sẽ dùng cho việc assertE()
    //gồm n đưa vào expected trả về
    //int    long -> Object (Wrapper class)
    //                       Integer Long
    public static Object[][] initTestData() {
        Object testData[][] = {
            {0, 1},
            {2, 2},
            {4, 24},
            {6, 7200}};
        return testData;

    }

//hoif data nay vao ham assertE();
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expected) {

        //assertEquals(69, 69);
        assertEquals(expected, getFactorial(n));
    }
}
//TDD:test driven development là kĩ thuật lập trình mà gắn với việc viết các test case để kiểm thử ngay những hàm dev mình vừa viết
//viết ode chính và viết code tes (JUnit, Unit Test) xen kẽ với nhau. 2mauf xanh đỏ liên tục diễn ra

//DDT: sự mở rộng thêm cho quá trình viết code test (JUnit)
//data driven Testing
//kĩ thuật tách bộ test dât ra 1 chỗ riêng, tách vào mảng, tách vào file excel, hay table, sau đó nhồi /fill/map cái dât từ mảng này vào trong hàm so sánh
//assertEquals()
//giúp code dễ đọc hơn, dễ kiểm tra xem còn thiếu test case nào hay không
