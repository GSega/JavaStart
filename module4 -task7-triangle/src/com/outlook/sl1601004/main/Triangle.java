package com.outlook.sl1601004.main;

public class Triangle {
	private int[] a = new int[2];
	private int[] b = new int[2];
	private int[] c = new int[2];

	public Triangle() {
		a[1] = 1;
		a[0] = 4;
		b[0] = 5;
		b[1] = 3;
		c[0] = 3;
		c[1] = 8;
	}

	public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
		this.a[0] = ax;
		this.a[1] = ay;
		this.b[0] = bx;
		this.b[1] = by;
		this.c[0] = cx;
		this.c[1] = cy;
	}

	public double perimeter() {
		double ab = Math.sqrt(Math.pow((a[0] - b[0]), 2) + Math.pow((a[1] - b[1]), 2));
		double ac = Math.sqrt((a[0] - c[0]) * (a[0] - c[0]) + (a[1] - c[1]) * (a[1] - c[1]));
		double bc = Math.sqrt((b[0] - c[0]) * (b[0] - c[0]) + (b[1] - c[1]) * (b[1] - c[1]));

		return ab + ac + bc;

	}

	public double square() {
		double perim = this.perimeter();
		double halfP = perim / 2;

		double ab = Math.sqrt(Math.pow((a[0] - b[0]), 2) + Math.pow((a[1] - b[1]), 2));
		double ac = Math.sqrt((a[0] - c[0]) * (a[0] - c[0]) + (a[1] - c[1]) * (a[1] - c[1]));
		double bc = Math.sqrt((b[0] - c[0]) * (b[0] - c[0]) + (b[1] - c[1]) * (b[1] - c[1]));

		double s = Math.sqrt(halfP * (halfP - ab) * (halfP - ac) * (halfP - bc));
		return s;
	}

	public void medianaCrossing() {
		// середина стороны BC точка p
		double[] p = new double[2];
		p[0] = (b[0] - c[0]) / 2;
		p[1] = (b[1] - c[1]) / 2;

		// точка пересечения медиан N делит АP на 2 части с соотношением 2:1
		double[] n = new double[2];
		n[0] = (a[0] + 2 * p[0]) / 3;
		n[1] = (a[1] + 2 * p[1]) / 3;

		System.out.println("medianes are ceossing in N: [" + n[0] + ";" + n[1] + "]");

	}
}
