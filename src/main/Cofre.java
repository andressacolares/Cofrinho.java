package main;

public class Cofre {
    private String itens = "";
    private boolean inteiro= true;
    private int volumeAtual;
    private int volumeMAX;
    private int vol;
    private int SobraVol; 
    private double moedas;
     
    public Cofre (int volumeMAX){
        this.volumeMAX=volumeMAX;
        this.SobraVol=volumeMAX;
        this.vol=0;
    }

    public double getMoedas() {
        return moedas;
    }

    public int getSobraVol() {
        return SobraVol;
    }

    public int getVol() {
        return vol;
    }
    public int getVolumeMAX() {
        return volumeMAX;
    }
    public int getVolumeAtual() {
        return volumeAtual;
    }
    
    public boolean isInteiro() {
        return inteiro;
    }

    public String getItens() {
        return itens;
    }
    public void setItens(Item item){
        if(this.itens.equals("")){
            itens += item.getDescrição();
        }else{
            itens += ", ";
            itens += ((Item) item).getDescrição();
        }
    }
    public boolean add(Item item) {
        if(inteiro){
            return false;
        }else if(item.getItemvolume() + vol > volumeMAX){
            return false;
        }else{
            vol+= item.getItemvolume();
            SobraVol-= item.getItemvolume();
            setItens(item);
        }        
        return true;
    }
    public boolean add(Moeda moeda) {
        if(inteiro){
            return false;
        }else if(moeda.getVolume() + vol > volumeMAX){
            return false;
        }else{
            vol += moeda.getVolume();
            moedas += moeda.getValor();
            SobraVol-= moeda.getVolume();
        }        
        return true;
    }
    public boolean quebrar() {
        if(inteiro){
            return false;
        }
        inteiro = true;
        return true;
    }
    
    public String obterItens() {
        if(taInteiro()){
            return null;
        }else if(vol == 0){
            return "vazio";
        }
        String retorno = itens; 
        return retorno;
    }
    public boolean taInteiro() {
        if(inteiro)
            return false;
        
        return true;
    }
    public double obterMoedas() {
        if(taInteiro()){
            return -1.0;
        }else if(vol == 0){
            return 0.0;
        }
        return moedas;
    }
}       
