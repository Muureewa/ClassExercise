public class Pencil
{

        private String color;
        private String brand;
        private double price;
        public Pencil(String color, String brand, double price) {
            super();
            this.color = color;
            this.brand = brand;
            this.price = price;
        }

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return color + " " + brand + " $" + price ;
        }

}

