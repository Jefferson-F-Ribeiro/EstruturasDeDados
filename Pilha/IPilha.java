public interface IPilha {

	void pushRubro(int o);

	int popRubro() throws PilhaVaziaException;

	int topRubro() throws PilhaVaziaException;

  boolean isEmptyRubro();

  void pushNegro(int o);

	int popNegro() throws PilhaVaziaException;

	int topNegro() throws PilhaVaziaException;

  boolean isEmptyNegro();

	int size();

}