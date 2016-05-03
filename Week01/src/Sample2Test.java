import static org.junit.Assert.*;
import org.junit.Test;

public class Sample2Test {

	// X座標の返り値(getX)をテストするテストメソッド
	@Test
	public void test1() {
		Circle circle = new Circle(100, 50, 20);
		/*
		 * assertEquals()
		 * 第1引数と第2引数が同じ値かどうかをチェック
		 * 同じならテスト成功、違うならテスト失敗
		 * circle.getX() は100を返せばOK
		 */
		assertEquals(circle.getX(), 100);
	}
	
	// Y座標の返り値(getY)をテストするテストメソッド
	@Test
	public void test2() {
		Circle circle = new Circle(120, 40, 10);
		assertEquals(circle.getY(), 40);
	}
	
	// 半径の返り値(getRadius)をテストするテストメソッド
	@Test
	public void test3() {
		Circle circle = new Circle(10, 20, 30);
		assertEquals(circle.getRadius(), 30);
	}

}
