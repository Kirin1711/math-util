/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.thanhvinh.mathutil.test.core;

import com.thanhvinh.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author ASUS
 */
public class MathUtilTest {
    //đây là class sẽ sử dụng các hàm của framework JUnit để kiểm thử code chính - hàm tính giai thừa bên class core.MathUtil
    //viết code để test code chính bên kia 
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);
    }
    
    //assertEquals() ko thể dùng so sánh 2 ngoại lệ
    //      equals() là bằng nhau hay không trên value!!!
    
    //màu đỏ, do hàm đúng là có ngoại lệ thật sự nhưng không phải ngoại lệ như kỳ vọng - thực sự kì vọng sai ko phải hàm ném sai
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactorial(-5);
//        //hàm @Test chạy, hàm getF() chạy sẽ ném về ngoại lệ NumberFormat...
//    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
        //hàm @Test chạy, hàm getF() chạy sẽ ném về ngoại lệ NumberFormat...
    }
    
    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!
    //xài Lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
//        Assert.assertThrows(tham số 1: Loại ngoại lệ muốn so sánh, 
//                            tham số 2: đoạn code chạy văng ra ngoại lệ đó runnable);
          Assert.assertThrows(IllegalArgumentException.class,
                              () -> MathUtil.getFactorial(21));
    }
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ không khi n cà chớn
    //có ném, tức là chạy dúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(21);
        } catch (Exception e) {
        //bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko
        //có đoạn code kiểm soát đúng ngoại lệ IllegalẢgumentException xuất 
        Assert.assertEquals("Invalid argument. N must be between 0 to 20",e.getMessage());
        }
        
    }
}
