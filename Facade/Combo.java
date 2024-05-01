public class Combo {
    Burguer burguer;
    Bebida bebida;
    Sobremesa sobremesa;

    public Combo(){
        this.burguer = new Burguer();
        this.bebida = new Bebida();
        this.sobremesa = new Sobremesa();
    }

    public void CriarCombo (int tipo){
        if (tipo ==1 )
        {
          burguer.setDescricao("Triplo Bacon Smash");
          burguer.setPreco(35.90);
          burguer.setGramas(350);
          sobremesa.setDescricao("Petit Gateau");
          sobremesa.setPreco(16.50);
          sobremesa.setTamanho("Grande");
          bebida.setDescricao("Coca-Cola Zero");
          bebida.setPreco(5.99);
          bebida.setMl(300);        
        }
        if (tipo == 2)
        {
            burguer.setDescricao("Double Blend Picanha");
            burguer.setPreco(39.9);
            burguer.setGramas(550);
            sobremesa.setDescricao("Torta de Limão");
            sobremesa.setPreco(12.00);
            sobremesa.setTamanho("Pequeno");
            bebida.setDescricao("Suco de Acerola");
            bebida.setPreco(9.50);
            bebida.setMl(500);        
        }

    }

    public void MostrarCombo()
    {
        double total = sobremesa.getPreco() + burguer.getPreco() + bebida.getPreco();

        System.out.println("-------------------------------");
        System.out.println("Burguer: " +burguer.getDescricao());
        System.out.println("Peso do burguer: " +burguer.getGramas()+ " gramas");
        System.out.println("Preço: " +burguer.getPreco());
        System.out.println("-------------------------------");
        System.out.println("Sobremesa: " +sobremesa.getDescricao());
        System.out.println("Tamanho: " +sobremesa.getTamanho());
        System.out.println("Preço: " +sobremesa.getPreco());
        System.out.println("-------------------------------");
        System.out.println("Bebida: " +bebida.getDescricao());
        System.out.println("Mililitros: " +bebida.getMl()+ "ml");
        System.out.println("Preço: " +bebida.getPreco());
        System.out.println("-------------------------------");
        System.out.println("Total: "+ total);


    }
}
