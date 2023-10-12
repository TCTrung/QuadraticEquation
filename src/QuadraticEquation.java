package src;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getDiscriminant() {
        if (this.a == 0) {
            if (this.b == 0 && this.c ==  0) {
                return "Phuong trinh vo so nghiem";
            }
            if (this.b == 0 && this.c != 0){
                return "Phuong trinh vo nghiem";
            }
            return "Phuong trinh co nghiem x = " + (-this.c/this.b);
        }

        double delta = (this.b * this.b) - (this.a * this.c * 4);

        if (delta == 0) {
            return getRoot1();
        }
        if (delta > 0) {
            return getRoot2(delta);
        }
        return "Phuong trinh vo nghiem";

    }

    public String getRoot1() {
    return "Phuong trinh co nghiem kep " + (-this.b/(2*this.a));
    }

    public String getRoot2(double delta) {
        return "Phuong trinh co 2 nghiem la " + ((-this.b + Math.sqrt(delta))/(this.a*2))
                + " va " + ((-this.b - Math.sqrt(delta))/(this.a*2));
    }
}
