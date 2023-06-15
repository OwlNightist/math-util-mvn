/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.binh.mathutil.core;

/**
 *
 * @author Admin
 */
// class này clone lại cái class java.util.Math
//với các hàm nổi tiếng Math.sqrt() Math.sin() Math.random()
//và con số Pi
public class MathUtility {

    public static final double PI = 3.1415;

    //class này chứa hàm static, chấm xài luôn
    // tính n giai thừa n! = 1.2.3...n
    //quy ước thiết kế hàm này như sau
    //0! = 1! =1
    // không có giai thừa số âm. Nếu đưa số âm , chửi
    //giai thừa tăng nhanh, 20! vừa khớp full kiểu long
    // do đó 21! không dùng kiểu long được. nếu đưa > 21, chui
    //chui : không trả về giá trị gì cả mà ném ra ngoại lệ exceptiôn
    public static long getFactorial(int n) {
        if (n < 0 || n >20)
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20,pls");
        
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; //tích nhân dồn khởi động từ 1
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

//TDD: Test Driven Development phát triển p/mềm theo phong cách code đến đâu kiểm thử đến đó, viết code và viết test case/test run
//diễn ra song song, đan xen
// cứ có hàm là có test case
// viết ra các test case đủ bao quát các tình huống xài hàm
// test case: là 1 bộ dữ liệu dùng để đưa vào app/hàm để mô phỏng lại
// 1 tihf huống xài app/hàm. Nó có input data, giải thích cách dùng hàm/app
// và có giá trị trả về expected
//(test run/test execution) để luận đúng sai
// dân dev giống dân qc ở chỗ này:
//đều phải viết/tạo ra test case, đều phải tiến hành run/ chạy test
//và đều phải đọc kết quả đúng sai
//dev khác tester là phải viết code làm app !!!
//Test case không viết tự do  mà viết theo template
//viết tự do 0! -> 1; 2! -> 2; 3! -> 6; 5! -> 120
//viết chuẩn lại test case (XUẤT HIỆN TRONG ĐỀ THI FE, KHÓA LUẬN T/N VÀ ĐI LÀM))
//TEST CASE #1: (mục tiêu test) check getF() ưith n = 0
//Steps-Procedures (cách tiến hành test - input/output...)
//   1.given n = 0
//   2.call the get F(n) (getF(1))
//Expected results: (kết quả kì vọng)
//   getF(1) must return 1
