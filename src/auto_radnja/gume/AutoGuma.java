package auto_radnja.gume;

/**
 * 
 * Klasa koja predstavlja auto gumu.
 * Auto guma ima precnik, sirinu i visinu kao int vrednosti a marku i model kao String
 * 
 * @author Aleksandar Markovic
 * @version 0.1
 *
 */
public class AutoGuma {
	/**
	 * Marka i model gume kao String
	 */
	private String markaModel = null;
	/**
	 * Precnik gume kao int
	 */
	private int precnik = -1;
	/**
	 * Sirina gume kao int
	 */
	private int sirina = -1;
	/**
	 * Visina gume kao int
	 */
	private int visina = -1;
	/**
	 * Konstruktor koji inicijalizuje objekat i nista vise.
	 */
	public AutoGuma() {
	}
	/**
	 * Konstruktor koji inicijalizuje objekat i postavlja vrednosti za marku i model, precnik, sirinu i visinu gume
	 * 
	 * @param markaModel Marka i model gume kao String
	 * @param precnik	Precnik gume kao int	
	 * @param sirina	Sirina gume kao int
	 * @param visina	Visina gume kao int
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}
	/**
	 * Vraca Marku i model
	 * 
	 * @return Marku i model kao String.
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Postavlja Marku i model na novu vrednost
	 * 
	 * @param markaModel Marka i model gume kao String
	 * 
	 * @throws java.lang.NullPointerException ako je uneta markaModel null
	 * @throws java.lang.RuntimeException ako je uneta markaModel koja ima manje od 3 znaka
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length() < 3)
			throw new RuntimeException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}
	/**
	 * Vraca precnik gume
	 * 
	 * @return Precnik gume kao int
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Postavlja precnik gume na novu vrednost
	 * 
	 * @param precnik Precnik gume kao int
	 * 
	 * @throws java.lang.RuntimeException ako je uneti precnik manji od 13 i veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Vraca sirinu gume
	 * 
	 * @return Sirina gume kao int
	 */
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Postavlja sirinu gume na novu vrednost
	 * 
	 * @param sirina Sirina gume kao int
	 * 
	 * @throws java.lang.RuntimeException ako je sirina gume manja od 135 i veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Vraca visinu gume
	 * 
	 * @return Visina gume kao int
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja visinu gume na novu vrednost
	 * 
	 * @param visina Visina gume kao int
	 * 
	 * @throws java.lang.RuntimeException ako je uneta visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * @return Vraca String sa svim podacima o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Poredi dve gume i vraca true ako su iste a false ako nisu.
	 * 
	 * Gume se porede po marki i modelu, precniku, sirini i visini
	 * @return
	 * <ul>
	 * 			<li>true ako su oba objekta klase AutoGuma i imaju istu marku i model, precnik, sirinu i visinu</li>
	 * 			<li>false u svim ostalim slucajevima</li>
	 * </ul>
	 */
	@Override
		public boolean equals(Object obj) {
		if (this == obj)
		return true;
		if (obj == null)
		return false;
		if (getClass() != obj.getClass())
		return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
		if (other.markaModel != null)
		return false;
		} else if (!markaModel.equals(other.markaModel))
		return false;
		if (precnik != other.precnik)
		return false;
		if (sirina != other.sirina)
		return false;
		if (visina != other.visina)
		return false;
		return true;
	}

}
