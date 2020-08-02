       Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < miMatriz.length; i++) {
			for (int j = 0; j < miMatriz.length; j++) {
				System.out.print("Ingrese un elemento: ");
				miMatriz[i][j]=entrada.nextInt();
			}
		}
