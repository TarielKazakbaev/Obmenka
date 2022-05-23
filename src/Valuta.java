 public class Valuta {
        private String nameVal;

        @Override
        public String toString() {
            return "  "+nameVal +"      "+ buyValute +"/"+ sellValute ;

        }

        private double buyValute;
        private double sellValute;

        public double getBuyValute() {
            return buyValute;
        }

        public void setBuyValute(double buyValute) {
            this.buyValute = buyValute;
        }

        public double getSellValute() {
            return sellValute;
        }

        public void setSellValute(double sellValute) {
            this.sellValute = sellValute;
        }


        public String getNameVal() {
            return nameVal;
        }

        public void setNameVal(String nameVal) {
            this.nameVal = nameVal;
        }

    }

