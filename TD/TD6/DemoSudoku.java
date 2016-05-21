import java.io.*;

class DemoSudoku{

	public static void main (String[] args)throws IOException{
		
		SudokuSolver solver=new SudokuSolver();

		solver.displayOriginalGrid(System.out);
		solver.displayWorkingGrid(System.out);
		boolean res=solver.solve();
		System.out.println(res);
		solver.displayWorkingGrid(System.out);

	}

}
