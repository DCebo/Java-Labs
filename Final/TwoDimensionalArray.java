
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] arr = new int[10][20];
		arr[0][0] = 1;

		System.out.println("arr[0][0] = " + arr[0][0]);
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length - 1;
		int n = matrix[0].length - 1;

		int i = m;
		int j = 0;

		while (i >= 0 && j <= n) {
			if (target < Fimatrix[i][j]) {
				i--;
			} else if (target > matrix[i][j]) {
				j++;
			} else {
				return true;
			}
		}

		return false;
	}
}

class Bank {

	String n;
	String add;
	int an;
	int bal;
	int dep;

	public Bank(String n, String add, int an, int bal) {

		this.add = add;
		this.bal = bal;
		this.an = an;
		this.n = n;

	}

	public String toString() {
				        return "Name of the customer.:" + this.n + ",, "
				                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
				                + this.an + ",, " + "Balance in A/c..:" + this.bal;
				    }
