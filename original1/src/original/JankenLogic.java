package original;

public class JankenLogic{
//	private String janken;
	private String muraoJanken;
	private String result;

	public JankenLogic() {
	}

/*	public JankenLogic(String janken) {
		this.janken = janken;
	}*/

	public void execute(String jibun) {
		int r = (int)(Math.random() *3);
		switch (r) {
		case 0: //村男ぐー
			this.muraoJanken = "gu";
			break;
		case 1: //村男ちょき
			this.muraoJanken = "choki";
			;
			break;
		case 2: //村男ぱー
			this.muraoJanken = "pa";
			break;
		}

		if (jibun.equals(this.muraoJanken)) {
			this.result = "draw";
		}else {
		switch(jibun){
			case "gu":if (this.muraoJanken.equals("choki")) {
				this.result = "win";}
				break;
			case"choki":if (this.muraoJanken.equals("pa")) {
				this.result = "win";}
				break;
			case"pa":if (this.muraoJanken.equals("gu")) {
				this.result = "win";}
				break;
		}

		}
		if(this.result == null ) {
			this.result ="loss";
		}

		/*
		} else if (this.janken.equals("gu")) {
			if (this.muraoJanken.equals("choki")) {
				this.result = "win";
			}
		} else if (this.janken.equals("choki")) {
			if (this.muraoJanken.equals("pa")) {
				this.result = "win";
			}
		} else if (this.janken.equals("pa")) {
			if (this.muraoJanken.equals("gu")) {
				this.result = "win";
			}
		} else {
			this.result = "loss";
		}
		*/

	}

/*	public String getJanken() {
		return janken;
	}*/

	public String getMuraoJanken() {
		return muraoJanken;
	}

	public String getResult() {
		return result;
	}

}
