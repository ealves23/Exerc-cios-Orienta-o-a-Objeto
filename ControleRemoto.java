package PilaresPoo;


public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
       
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);  }

    @Override
    public void desligar() {
        this.setLigado(false);        
    }

    @Override
    public void abrirMenu() {
        System.out.println("---------Menu---------" );
        System.out.println("Está ligado?"+this.getLigado());
        System.out.println("Está tocando?"+this.getTocando());
        System.out.println("Volume: "+this.getVolume());
        
        for(int i =0;i<=getVolume();i+=10){
            System.out.print("|");
        }


        }

  

    @Override
    public void FecharMenu() {
        System.out.println("Fechando Menu ..");
        
    }

    @Override
    public void MaisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }

          }

    @Override
    public void MenosVolume() {
       if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
       }
    }

    @Override
    public void LigarMudo() {

        if(this.getLigado()&& this.getVolume()>0){
            this.setVolume(0);
        }
           }

    @Override
    public void desligarMudo() {
    if(this.getLigado()&& this.getVolume()==0){
        this.setVolume(50);
    }    
    
    }


    @Override
    public void Play() {
        if(this.getLigado()&&!(this.getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void Pause() {
        if(this.getLigado()&& (this.getTocando())){
            this.setTocando(false);
        }else{
        System.out.println("Não consegui pausar!!");
       }
    }
    
    }

