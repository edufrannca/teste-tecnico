public class FaturamentoDistribuidora {

	public static void main(String[] args) {
		// adicionando os valores de faturamento para cada dia dentro de um vetor
		double[] faturamento = { 31490.7866, 37277.9400, 37708.4303, 0.0, 0.0, 17934.2269, 0.0, 6965.1262, 24390.9374,
				14279.6481, 0.0, 0.0, 39807.6622, 27261.6304, 39775.6434, 29797.6232, 17216.5017, 0.0, 0.0, 12974.2000,
				28490.9861, 8748.0937, 8889.0023, 17767.5583, 0.0, 0.0, 3071.3283, 48275.2994, 10299.6761, 39874.1073 };

		double menorFaturamento = Double.MAX_VALUE;
		double maiorFaturamento = Double.MIN_VALUE;
		double somaFaturamento = 0;
		//iterando o vetor
		for (int i = 0; i < faturamento.length; i++) {
			//somatório dos valores para obter o total
			somaFaturamento += faturamento[i];
			// condição que checa se o valor de faturamento é 0, logo o dia deve ser ignorado, então ele pula o valor e continua no próximo
			if (faturamento[i] == 0) {
				continue;
			}
			if (faturamento[i] < menorFaturamento) {
				menorFaturamento = faturamento[i];
			}
			if (faturamento[i] > maiorFaturamento) {
				maiorFaturamento = faturamento[i];
			}
		}
		double mediaMensal = somaFaturamento / faturamento.length;
		
		int diasAcimaDaMedia = 0;
		for (double valor : faturamento) {
			if (valor > mediaMensal) {
				diasAcimaDaMedia++;
			}
		}
		System.out.println("Menor valor de faturamento: " + menorFaturamento );
		System.out.println("Maior valor de faturamento: " + maiorFaturamento);
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + diasAcimaDaMedia);
	}
}
