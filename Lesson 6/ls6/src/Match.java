import java.lang.Math;
public class Match {
    public String topla(int a,int b){
        String topla = "Cem: " + (a+b);
        return topla;
    }

    public String cixma(int a,int b){
        String cixma = "Ferq: " + (a-b);
        return cixma;
    }

    public String vurma(int a,int b){
        String vurma = "Vurma: " + (a*b);
        return vurma;
    }

    public String bolme(int a,int b){
        String bolme = "Bolme: " + (a/b);
        String str = "0-a bolme yoxdu";
        if (b==0){
            return str;
        }
        else{
            return bolme;
        }
    }

    public String quvvet(int eded,int quvvet) {
        String power = "Quvvet: " + (Math.pow(eded,quvvet));
        return power;
    }


    public String factorial(int eded){
        int h = 1;
        for (int i = 1;i<=eded;i++){
            h*=i;
        }
        String fact = "Factorial: " + h;
        return fact;
    }

    public String kokalti(int eded){
        String kokalti = "Kokalti:" + Math.sqrt(eded);
        return kokalti;
    }

    

    
}
