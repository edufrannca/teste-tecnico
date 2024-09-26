import org.json.JSONArray;
import org.json.JSONObject;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        String jsonData = "[10.0, 20.5, 30.2, 0, 25.3, 40.5, 0, 0, 50.5, 35.2]";
        JSONArray faturamento = new JSONArray(jsonData);

        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        int diasAcimaDaMedia = 0;

        // Calculando menor, maior e soma dos faturamentos, ignorando dias sem faturamento
        for (int i = 0; i < faturamento.length(); i++) {
            double valor = faturamento.getDouble(i);
            if (valor > 0) {
                if (valor < menorFaturamento) {
                    menorFaturamento = valor;
                }
                if (valor > maiorFaturamento) {
                    maiorFaturamento = valor;
                }
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = somaFaturamento / diasComFaturamento;

        // Contando os dias com faturamento acima da média
        for (int i = 0; i < faturamento.length(); i++) {
            double valor = faturamento.getDouble(i);
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento: " + menorFaturamento);
        System.out.println("Maior faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
