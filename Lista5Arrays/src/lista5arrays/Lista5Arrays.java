/*
 * André de Amorim Yamamoto
 * aay.andre@outlook.com
 * Turma A
 */
package lista5arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andré.yamamoto <aayandre94@gmail.com>
 */
public class Lista5Arrays {

    static Scanner ler = new Scanner(System.in);

    static Random rnd = new Random();

    static int geradorRandomInt(int ateQuanto) {
        int x = rnd.nextInt(ateQuanto);
        return x;
    }

    static int[] arrayMakerPrinterInt(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = geradorRandomInt(50 + i);//O random está gerando INTs. Não sei pq funciona....
            System.out.printf("Vetor[%d] = %d\n", i, vetor[i]);
        }
        return vetor;
    }

    static int[] arrayJustMakerInt(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = geradorRandomInt(50 + i);//O random está gerando INTs. Não sei pq funciona....
        }
        return vetor;
    }

    static double[] arrayJustMakerDouble(int tamanho) {
        double[] vetor = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = geradorRandomInt(50 + i);//O random está gerando INTs. Não sei pq funciona....
            vetor[i] *= 1.5;//Detalhe
        }
        return vetor;
    }

    static double[] arrayMakerPrinterDouble(int tamanho) {
        double[] vetor = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = geradorRandomInt(50);//O random está gerando INTs. Não sei pq funciona....
            vetor[i] *= 1.3;//Só pra deixar com umas casas utilizadas dps da virgula....
            System.out.printf("Vetor[%d] = %.2f\n", i, vetor[i]);
        }
        return vetor;
    }

    static int arrayFindBiggestInt(int[] x) {
        int maior = x[0];
        for (int i : x) {
            if (i > maior) {
                maior = i;
            }
        }
        return maior;
    }

    static double arrayFindLittlestDouble(double[] x) {
        double menor = x[0];
        for (double i : x) {
            if (i < menor) {
                menor = i;
            }
        }
        return menor;
    }

    static void arrayFindNumberInt(int procurado, int[] x) {
        boolean notFinded = false;
        int i;
        for (i = 0; i < x.length; i++) {
            if (x[i] == procurado) {
                notFinded = false;
                break;
            } else {
                notFinded = true;
            }
        }
        if (notFinded) {
            System.out.printf("\n%d não encontrado...\n", procurado);
        } else {
            System.out.printf("\nEncotrado!\nVetor[%d] = %d\nNúmero procurado é igual. (%d)\n", i, x[i], procurado);
        }
    }

    static int[] arrayMultiplierByElementInt(int[] x, int[] y) {
        int[] resultado = new int[x.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = x[i] * y[i];
        }
        return resultado;
    }

    static double[] arrayMultiplierByElementDouble(double[] x, double[] y) {
        double[] resultado = new double[x.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = x[i] * y[i];
        }
        return resultado;
    }

    static double[] arrayMultiplierByElementOnlyInOddDouble(double[] x, double[] y) {
        double[] resultado = new double[x.length];
        for (int i = 0; i < resultado.length; i++) {
            if (i % 2 != 0) {
                resultado[i] = x[i] * y[i];
            } else {
                resultado[i] = 0;//Não é impar, a posição claro.
            }
        }
        return resultado;
    }

    static int arrayMediaInt(int[] x) {
        int media;
        int soma = 0;
        for (int i : x) {
            soma += i;
        }
        System.out.printf("Média = %d / %d\n", soma, x.length);
        media = soma / x.length;
        return media;
    }

    static double arrayMediaDouble(double[] x) {
        double soma = 0;
        for (double i : x) {
            soma += i;
        }
        System.out.printf("Média = %.2f / %d\n", soma, x.length);
        double media = soma / x.length;
        return media;
    }

    static int arrayProdutoInt(int[] x) {
        int produto = 1;
        for (int i : x) {
            produto *= i;
        }
        return produto;
    }

    static void arrayMultiplicationOnEachElement(int multiplicador, int[] x) {
        int[] vetor = x;

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d]: %d * %d = ", i, vetor[i], multiplicador);
            vetor[i] *= multiplicador;
            System.out.println("" + vetor[i]);
        }
    }

    static int[] arrayUnion(int[] x, int[] y) {
        
        int uniao[] = new int[x.length + y.length];

        for (int i = 0; i < uniao.length; i++) {
            if (i < x.length) {
                uniao[i] = x[i];
            } else if (i >= x.length) {
                uniao[i] = y[i - x.length];
            }

        }
        return uniao;
    }

    static int[] arrayUnionAlternated(int[] x, int[] y) {

        int uniao[] = new int[x.length + y.length];
        int contador = 0;

        for (int i = 0; i < uniao.length; i += 2) {
            uniao[i] = x[contador];
            contador++;
        }

        contador = 0;
        for (int i = 1; i <= uniao.length; i += 2) {
            uniao[i] = y[contador];
            contador++;
        }

        return uniao;
    }

    static int entradaInt() {
        int x = ler.nextInt();
        return x;
    }

    static double entradaDouble() {
        double x = ler.nextDouble();
        return x;
    }

    static String entradaString() {
        String x = ler.next();
        return x;
    }

}
