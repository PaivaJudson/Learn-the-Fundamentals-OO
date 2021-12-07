public class Main {
    public static void main(String[] args) {
        int lista[] = {1, 2, 3, 4, 5, 11, 6, -1, 10, 9};
        triangular(10);
        minMax(lista);
    }

    public static void triangular(int n){ 
        for(int i = 1; i<=n; i++){
            int mul = i*(i+1)*(i+2);
            System.out.print(mul+"  ");
        }
    }

    public static void minMax(int lista[]){
        int max = lista[0];
        int min = lista[0];
        
        for(int num: lista){
            if(num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        System.out.println("Maior = "+max+" Mínimo = "+min);
    }
}