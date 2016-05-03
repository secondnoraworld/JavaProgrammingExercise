
public class Sample2 {
	public static void main(String[] args) {
		
		// Circle クラスからインスタンス circle1 を生成
		Circle circle1 = new Circle(100, 50, 20);
		System.out.println("Radius = " + circle1.radius);
		System.out.println("Radius = " + circle1.getRadius());
		circle1.print();
		
		// Circle クラスからインスタンス circle2 を生成
		Circle circle2 = new Circle(200, 180);
		circle2.print();
		System.out.println("Radius = " + circle2.getRadius());
		circle2.setRadius(80);
		System.out.println("Radius = " + circle2.getRadius());
		circle2.print();
	}
}

class Circle {                      // クラス Circle の宣言
	private int x, y;               // X座標とY座標
	int radius;                     // 半径
	
	Circle(int x, int y, int r) {   // コンストラクタ
		this.x = x;                 // X座標を設定
		this.y = y;                 // Y座標を設定
		radius = r;                 // 半径を設定
	}
	
	Circle(int x, int y) {          // コンストラクタ
		this(x, y, 50);
	}
	
	public int getX() {             // X座標を取得
		return x;
	}
	
	public int getY() {             // Y座標を取得
		return y;
	}
	
	public void setRadius(int r) {  // 半径を設定
		radius = r;
	}
	
	public int getRadius() {        // 半径を取得
		return radius;
	}
	
	public void print() {
		System.out.println("(x, y) = (" + x + ", " + y + "), " + "r = " + radius);
	}
}