public class Constant {
        int value;
        public static final int BOXWIDTH = 6;

        static final String TITLE = "Manager";
        public Constant(int value){
            this.value = value;
        }

        public void changeValue(int value){
            this.value = value;
        }

    public static void main(String[] args) {
        Constant c = new Constant(5);
        c.changeValue(6);
    }
}
