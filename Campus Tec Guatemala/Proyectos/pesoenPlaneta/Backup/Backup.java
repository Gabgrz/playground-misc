        switch (planetaOrigen){
            case 1: 
                gravedadOrigen = GRAVEDADTIERRA;
                System.out.println("1 - En la Luna");
                System.out.println("2 - En Marte");
                break;
            case 2:
                gravedadOrigen = GRAVEDADLUNA;
                System.out.println("1 - En la Tierra");
                System.out.println("2 - En Marte");
                break;
            case 3:
                gravedadOrigen = GRAVEDADMARTE;
                System.out.println("1 - En la Tierra");
                System.out.println("2 - En la Luna");
                break;
        }


++++++++


        if(planetaOrigen == 1 AND planetaDestino == 1){
            gravedadDestino = GRAVEDADLUNA;




++++++


            // Calculo de peso
            double nuevoPeso = calculoPeso.calculoPeso(gravedadOrigen, peso, gravedadDestino);
            System.out.println("El peso de la persona es ");
            System.out.println(nuevoPeso);

//////////


            Tierra prueba = new objetoAstro.Tierra();


