package biblioteka;

public class Autor {
	
	private String ime,prezime;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Autor)){
			throw new RuntimeException();
		}
		Autor a = (Autor) obj;
		if(a.getIme().equals(ime) && a.getPrezime().equals(prezime)){
			return true;
		}else{
			return false;
		}
		
	}
}
