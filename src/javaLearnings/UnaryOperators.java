package javaLearnings;

public class UnaryOperators {

	public static void main(String[] args) {

		int bb = 100;
		System.out.println(bb++);
		System.out.println(bb);
		int a = 30;
		int b = a++;
		System.out.println(a); // 31
		System.out.println(b); // 30

		int c = -30;
		int d = c++;
		System.out.println(c); // -29
		System.out.println(d); // -30

		int e = 40;
		int f = ++e;
		System.out.println(f); // 41
		System.out.println(e); // 41

		int g = -100;
		int h = ++g;
		System.out.println(g); // -99
		System.out.println(h); // -99

		int nn = 45;
		int j = nn--;
		System.out.println(nn); // 44
		System.out.println(j); // 45

		int test = -49;
		int r = test--;
		System.out.println(test); // -50
		System.out.println(r); // -49

		int mm = 45;
		int i = --mm;
		System.out.println(mm); // 44
		System.out.println(i); // 44

		int test1 = -39;
		int s = --test1;
		System.out.println(test1); // -40
		System.out.println(s); // -40

		int num = 10;
		System.out.println(num++); // 10

		int num1 = 20;
		System.out.println(++num1); // 21
		System.out.println(num1); // 21

		int num2 = 20;
		System.out.println(--num2); // 19
		System.out.println(num2); // 19
		System.out.println(num2 + 1); // 20

		int amount = 10;
		int finalAmount = amount + 2;
		System.out.println(finalAmount); // 12

		int nav = 1;
		int test2 = nav++ + nav++ + nav++ + nav++; // 1 +2+3+4 =10
		System.out.println(test2);
		System.out.println(nav);

		int na = 5;
		int test3 = na++ + ++na + --na + na-- + na++;
		System.out.println(test3);
		System.out.println(na);
	}

}
