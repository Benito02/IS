public class Calcolatrice {
    int x;
    int y;

    public Calcolatrice(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int Somma(){
        return x+y;
    }

    public int Sottrazione(){
        return x-y;
    }

    public int Divisione(){
        return x/y;
    }

    public int Moltiplicazione(){
        return x*y;
    }

    public String paridispari(){
        if(x % y == 0){

            return "Pari";
        }else return "Dispari";
    }
}