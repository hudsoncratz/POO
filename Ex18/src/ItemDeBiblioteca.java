
public interface ItemDeBiblioteca extends Livro implements LivroDeBiblioteca{

	boolean isEmprestado();
	public void empresta();
	public void devolve();
	public void localiza();
	public void apresentaDescricao();


}
