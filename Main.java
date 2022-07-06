public class Main{
    public static void main (String args[]) {
		
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		double valTotal = sp+rj+mg+es+outros;
		
		double resSP = sp/valTotal * 100;
		double resRJ = rj/valTotal * 100;
		double resMG = mg/valTotal * 100;
		double resES = es/valTotal * 100;
		double resOutros = outros/valTotal * 100;

		System.out.println("Total de lucros: R$" + valTotal);
		System.out.println("");
		System.out.println("Porcentual de representação SP: "+resSP+"%");
		System.out.println("Porcentual de representação RJ: "+resRJ+"%");
		System.out.println("Porcentual de representação MG: "+resMG+"%");
		System.out.println("Porcentual de representação ES: "+resES+"%");
		System.out.println("Porcentual de representação Outros Estados: "+resOutros+"%");

	}
}