package main;

public class Item {
    public class item {
    
        private int volume;
        private String descrição;
    
        public int getVolume(){
            return volume;
        }
        public  String getDescrição() {
            return descrição;
        }
        public item (String descrição, int volume){
            this.volume = volume;
            this.descrição = descrição;
        }
    
        @Override
        public String toString() {
            return "Item{" +
                    "volume=" + volume +
                    ", descricao='" + descrição + '\'' +
                    '}';
        }
    }

    public Item(String string, int i) {
    }

    public String getDescrição() {
        return null;
    }

    public int getItemvolume() {
        return 0;
    }
}
