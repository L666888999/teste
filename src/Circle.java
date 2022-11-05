import java.util.concurrent.Callable;

public class Circle extends GeometicObjet{
        private double radiue;
        public Circle(){
            super();
        }
        public Circle(double radiue){
            this.radiue=radiue;
        }
        public Circle(double radiue,String color,double weight){
            super(color,weight);
            this.radiue=radiue;
            this.weight=weight;

        }
        public double getRadiue(){
            return radiue;

        }
        public void setRadiue(double radiue){
            this.radiue=radiue;
        }
        //求面积
        public double findArea(){
            return Math.PI*radiue*radiue;
        }
        //重写方法
        public boolean equals(Object obj){
            if (this==obj)
                return true;
            else if (obj instanceof Circle) {

                Circle c1=(Circle) obj;
                //return this.radiue==c1.radiue;
                return this.radiue==c1.radiue;

                    }else {
                return false;
                }
            }


        public String toString(){
            return radiue+"";
        }
    }

