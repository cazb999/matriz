package logic;
/**
 * Permite las operaciones basicas de una matrix
 * @author AULA
 *
 */
public class Matrix {
	//----------------------- Atributos Constantes--------------------
	private static final int DEFAULT_ROWS = 5;
	private static final int DEFAULT_COLUMNS = 7;
	//-----------------------Atributos--------------------------------
	/**
	 * Es la cantidad de filas que tiene la matrix
	 */
	private int n;
	/**
	 * Es la cantidad de columnas que tiene la matrix
	 */
	private int m;
	/**
	 * Es la matriz de enteros para aplicar los diferentes procesos
	 */
	private int[][] arrayBi;
	//-------------------------- Constructores ---------------------
	/**
	 * Se inicializan los atributos por defecto
	 */
	public Matrix() {
		this.n = DEFAULT_ROWS;
		this.m = DEFAULT_COLUMNS;
		this.arrayBi = new int[this.n][this.m];
	}
	/**
	 * Se crea una matriz de acuerdo a la cantidad de filas y columnas que se indique
	 * @param n
	 * @param m
	 */
	public Matrix(int n, int m) {
		this.n = n;
		this.m = m;
		this.arrayBi = new int[this.n][this.m];
	}
	/**
	 * Permite recibir los datos a la matrix
	 * @param arrayBi
	 */
	public Matrix(int[][] arrayBi){
		this.n = arrayBi.length;
		this.m = arrayBi[0].length;
		this.arrayBi = arrayBi;
	}
	//-----------------------Otros Metodos--------------------------
	/**
	 * Es la suma de los elementos existentes en la matriz
	 * @return la suma de los datos de la matriz
	 */
	public int sum(){
		int acum = 0;
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.m; j++) {
				acum += arrayBi[i][j];
			}
		}
		return acum;
	}
	// -------------------------Getters y Setters ------------------
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int[][] getArrayBi() {
		return arrayBi;
	}
	public void setArrayBi(int[][] arrayBi) {
		this.arrayBi = arrayBi;
	}	
}
