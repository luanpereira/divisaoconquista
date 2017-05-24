
public class MergeSort {
	private final static int TAM_VETOR = 10;
	
	public static void main(String[] args) {
		int[] vetor = {2,5,6,2,3,4};
		
		mergeSort(vetor, vetor.length);

		for(int i = 0; i < vetor.length; i++){
			System.out.print(vetor[i]);
		}
		
	}

	private static void mergeSort(int[] vetor, int tamanho) {
		int meio = tamanho / 2;

		if( tamanho > 1 ){
			mergeSort(vetor, meio);
			mergeSort(vetor, tamanho - meio);
			merge(vetor, tamanho);
		}
	}

	private static void merge(int[] vetor, int tamanho) {
		  int meio = tamanho / 2;
		  int i = 0, j = meio, k = 0;
		  int[] aux = new int[tamanho];

		  while( i < meio && j < tamanho ){
		    if( vetor[i] <= vetor[j] )
		      aux[k] = vetor[i++];
		    else
		      aux[k] = vetor[j++];
		    k++;
		  }
		 
		  if( i == meio )
		    while( j < tamanho )
		      aux[k++] = vetor[j++];
		  else
		    while( i < meio )
		      aux[k++] = vetor[i++];
		 
		  for( i = 0; i < tamanho; i++ )
		    vetor[i] = aux[i];
	}
}
