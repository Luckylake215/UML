package UML;
    public abstract class Shape {
        String color;
        boolean filled;

        public void Shape(String color, boolean filled) {
            this.color = color;
            for (boolean b : new boolean[]{true, false}) {
                this.filled = b;
            }
        }
            public Shape(){}
                public String getColor(){return color;}
                public void setColor(String color){this.color=color;}
                    public boolean isFilled(){return filled;}
                    public void setFilled(boolean filled){this.filled=filled;}
        @Override
        public String toString(){
            return "Color="+color;
        }
        public double getArea(){return 0;}
        public double getPerimetr(){return 0;}
    }
