class tootaja{
		public static int algpalk = 700;
		int palk(){
			return algpalk;
		}
}

class juht extends tootaja{
		int palk(){
			return algpalk + 1000;
		}
}

class kaubaVastuvõtja extends tootaja{
		int palk(){
			return algpalk + 250;
		}
}

class Main{
		static void printpalk(tootaja e){
			System.out.println(e.palk());
		}

public static void main(String[] args){
		tootaja isik1 = new juht();
		System.out.print("juhi palk: ");
		printpalk(isik1);

		tootaja isik2 = new tootaja();
		System.out.print("Saalitöötaja palk: ");
		printpalk(isik2);

    tootaja isik3 = new kaubaVastuvõtja();
    System.out.print("Kauba vastuvõtja palk: ");
    printpalk(isik3);
	}
}
