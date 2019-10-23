package original;

import java.io.Serializable;

public class Janken implements Serializable{
	private static final long serialVersionUID = 1L;
	private String janken;
	private String muraoJanken;
	private String result;

	public void setJanken(String janken) {
		this.janken = janken;
	}
	public void setMuraoJanken(String muraoJanken) {
		this.muraoJanken = muraoJanken;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getJanken() {
		return janken;
	}
	public String getMuraoJanken() {
		return muraoJanken;
	}
	public String getResult() {
		return result;
	}
}
