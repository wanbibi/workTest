package chapter5;

import java.util.Scanner;

/**
 * 计算几何图
 * 
 * @author wan.z.c
 *
 */
public class Test073_2 {
	public abstract class Shape {
		public String getName() {
			return this.getClass().getSimpleName();
		}

		public abstract double getArea();
	}

	public class Circle2 extends Shape {
		private double radius;
		
		public Circle2(double d) {
			this.radius = d;
		}

		@Override
		public double getArea() {
			return Math.PI*Math.pow(radius, 2);
		}
		
	}
	
	public static void main(String[] args) {
	}

}
