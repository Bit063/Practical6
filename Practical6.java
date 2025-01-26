class Practical6 {

	void displayPattern1(int size){
		int line, spaces, symbols;
		for(line = 1; line <= size; line++){
			for(spaces = size-line; spaces > 0; spaces--){
				System.out.print(" ");
			}
			for(symbols = 2*line-1; symbols >0; symbols--){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(line = size+1; line <= 2*size-1; line++){
			for(spaces = line-size; spaces > 0; spaces--){
				System.out.print(" ");
			}
			for(symbols = 2*(2*size-line)-1; symbols > 0; symbols--){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	void displayPattern2(int size){
		int line, spaces, symbols;
		for(line = 1; line <= size; line++){
			for(spaces = size-line; spaces > 0; spaces--){
				System.out.print(" ");
			}
			for(symbols = 2*line-1; symbols > 0; symbols--){
				if(symbols % 2 == 1){
					System.out.print("*");
				}else{
					System.out.print(" ");	
				}
			}
			System.out.print("\n");
		}
		
		for(line = size+1; line <= 2*size-1; line++){
			for(spaces = line-size; spaces > 0; spaces--){
				System.out.print(" ");
			}
			for(symbols = 2*(2*size-line)-1; symbols > 0; symbols--){
				if(symbols % 2 == 1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
	
	void displayPattern3(int size){
		 int line, spaces, symbols;
		 for(line = 1; line <= 2*size; line++){
		 	if(line > size){
		 		spaces = line-size-1;
		 		symbols = 2*(2*size-line)+1;
		 	}
		 	else{
		 		spaces = size-line;
		 		symbols = 2*line-1;
		 	}
		 	for(spaces = spaces; spaces > 0; spaces--){
		 		System.out.print(" ");
		 	}
		 	for(symbols = symbols; symbols > 0; symbols--){
		 		if((size*symbols-line)%2 == 0){
		 			System.out.print("*");
		 		}
		 		else{
		 			System.out.print("+");
		 		}
		 	}
		 	System.out.print("\n");
		 }
	}
	
	public static void main (String[] args) {
		Practical6 pattern = new Practical6();
		pattern.displayPattern1(3);
		System.out.print("\n");
		pattern.displayPattern2(3);
		System.out.print("\n");
		pattern.displayPattern3(3);
		System.out.print("\n");
	} 
}
