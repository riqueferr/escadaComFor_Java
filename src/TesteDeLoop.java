
public class TesteDeLoop {

	public static void main(String[] args) {

		int entrada = 10;
        System.out.println(entrada + "\n ============= \n");
        for(int linha = 0; linha < entrada; linha++) {
        	for(int coluna = entrada; coluna + 1 > 0; coluna--) {
        		if(coluna > linha) {
        		System.out.print(" ");  //aqui escolhe o lado da escada... "com espaço", a escada sobe para direita, "sem espaço" a escada sobe para esquerda
        		} else {
        			System.out.print("#");
        		}
        	}    	
        	System.out.println("");
        }
	}

}
