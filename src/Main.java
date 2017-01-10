import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by DAM on 14/12/16.
 */
public class Main {
    public static void main(String[] args) {


        Equipo equipo1 = new Equipo("Equipo 1", "Madrid");
        Equipo equipo2 = new Equipo("Equipo 2", "Barcelona");
        Equipo equipo3 = new Equipo("Equipo 3", "Arsenal");
        Jugador jugador1 = new Jugador("Cristiano Ronaldo", 750, LocalDate.of(1992, 4, 30), equipo1);
        Jugador jugador2 = new Jugador("Zidane", 400, LocalDate.of(1989, 2, 23), equipo1);
        Jugador jugador3 = new Jugador("Mendieta", 100, LocalDate.of(1990, 1, 12), equipo3);
        Jugador jugador4 = new Jugador("Sotil", 9000, LocalDate.of(1992, 9, 03), equipo3);
        Jugador jugador5 = new Jugador("Messi", 500, LocalDate.of(1988, 12, 22), equipo2);
        Jugador jugador6 = new Jugador("Arbitro", 250, LocalDate.of(1995, 10, 12), equipo2);

        List<Jugador> lista = new ArrayList<Jugador>();
        lista.add(jugador1);
        lista.add(jugador2);
        lista.add(jugador3);
        lista.add(jugador4);
        lista.add(jugador5);
        lista.add(jugador6);

//        Trader raoul = new Trader("Raoul", "Cambridge");
//        Trader mario = new Trader("Mario","Milan");
//        Trader alan = new Trader("Alan","Cambridge");
//        Trader brian = new Trader("Brian","Cambridge");
//
//        List<Transaction> transactions = Arrays.asList(
//
//                new Transaction(brian, 2011, 300),
//                new Transaction(raoul, 2012, 1000),
//                new Transaction(raoul, 2011, 400),
//                new Transaction(mario, 2012, 710),
//                new Transaction(mario, 2012, 700),
//                new Transaction(alan, 2012, 950)
//
//        );
//
//        //1 Find all tra    nsactions in the year 2011 and sort them by value (small to high).
//
//List<Transaction> tr2011 =
//        (List<Transaction>) transactions.stream()
//        .filter(transaction -> transaction.getYear()== 2011)
//        .sorted(Comparator.comparing(Transaction::getValue))
//        .collect(Collectors.toList());
//
//        System.out.println(tr2011);
//
//
//        // 2. What are all the unique cities where the traders work?
//
//List<String> cities =
//        transactions.stream()
//        .map(transaction ->  transaction.getTrader().getCity())
//        .distinct()
//        .collect(Collectors.toList());
//        System.out.println(cities);
//        // 3. Find all traders from Cambridge and sort them by name.
//
//List<Trader> traders =
//        transactions.stream()
//        .map(Transaction :: getTrader)
//        .filter(trader -> trader.getCity().equals("Cambridge"))
//        .distinct()
//        .sorted(Comparator.comparing(Trader::getName))
//        .collect(Collectors.toList());
//        System.out.println(traders);
//
//        //4. Return a string of all traders’ names sorted alphabetically.
//
//String tradeStr =
//        transactions.stream()
//        .map(transaction -> transaction.getTrader().getName())
//        .distinct()
//        .sorted()
//        .reduce("",(n1,n2) -> n1 + n2);
//        System.out.println(tradeStr);
//        // 5. Are any traders based in Milan?
//
//boolean milanBased =
//        transactions.stream()
//        .anyMatch(transaction -> transaction.getTrader()
//        .getCity()
//                .equals("milan"));
//
//        System.out.println(milanBased);
//
//        // 6. Print all transactions’ values from the traders living in Cambridge.
//
//transactions.stream()
//        .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
//        .map(Transaction::getValue)
//        .forEach(System.out::println);
//
//        // 7. What’s the highest value of all the transactions?
//
//Optional<Integer> highestValue =
//        transactions.stream()
//        .map(Transaction::getValue)
//        .reduce(Integer::max);
//
//        // 8. Find the transaction with the smallest value.
//
//        Optional<Transaction> smallestTransaction =
//              transactions.stream()
//                .reduce((t1,t2) ->
//        t1.getValue() < t2.getValue() ? t1 : t2);


        System.out.println("Devolver con una lista  todos los jugadores que hayan obtenido más de 500 canastas.---_>");
        lista.stream()
                .filter(Jugador -> Jugador.getNumCanastas() > 500)
                .forEach(System.out::println);
        System.out.println("------------");
        System.out.println("Devolver con una lista  todos los jugadores que hayan obtenido entre 200 y 500 canastas.---_>");
        lista.stream()
                .filter(Jugador -> Jugador.getNumCanastas() > 199 && Jugador.getNumCanastas() < 500)
                .forEach(System.out::println);

        System.out.println("------------");
        System.out.println("Devolver en una lista exclusivamente los nombres de los jugadores que satisfacen  los requisitos.---_>");
        lista.stream()
                .filter(Jugador -> Jugador.getNumCanastas() > 199 && Jugador.getNumCanastas() < 500)
                .map(Jugador::getNombre)
                .forEach(System.out::println);
        System.out.println("------------");
        System.out.println("Devolver con una lista todos los jugadores ordenados por la fecha de nacimiento.---_>");
        lista.stream()
                .sorted(Comparator.comparing(Jugador::getNacicmiento))
                .forEach(System.out::println);

        System.out.println("------------");
        System.out.println("Devolver con una lista todos los jugadores ordenados por número de canastas.---_>");

        lista.stream()
                .sorted(Comparator.comparing(Jugador::getNumCanastas))
                .forEach(System.out::println);

        System.out.println("------------");
        System.out.println("Devolver con una lista con los cinco jugadores que hayan realizado más canastas");
        lista.stream()
                .sorted(Comparator.comparing(Jugador::getNumCanastas))
                .limit(5)
                .forEach(System.out::println);

        System.out.println("------------");
        System.out.println("Devolver con una lista todos los jugadores que satisfacen el punto 1.3" +
                "  ordenados por la fecha de nacimiento de manera descendente.---_>");
        lista.stream()
                .filter(Jugador -> Jugador.getNumCanastas() > 199 && Jugador.getNumCanastas() < 500)
                .sorted(Comparator.comparing(Jugador::getNacicmiento))
                .forEach(System.out::println);

        System.out.println("------------");
        System.out.println("Devolver con una lista todos los jugadores que satisfacen el filtro del punto 1.3 ordenados" +
                "        // en primer lugar por número de canastas y en segundo lugar (si tienen el mismo número de canastas) por la fecha de nacimiento.");


        System.out.println("------------");
        System.out.println("Devolver el jugador que ha realizado el mínimo número de canasta.---_>");
        System.out.println(lista.stream()
                .reduce((x, y) -> x.getNumCanastas() < y.getNumCanastas() ? x : y));

        System.out.println("------------");
        System.out.println("Devolver el jugador que ha realizado el máximo número de canastas.---_>");
        System.out.println(lista.stream()
                .reduce((x, y) -> x.getNumCanastas() > y.getNumCanastas() ? x : y));

        System.out.println("------------");
        System.out.println("Devolver la media de canastas de todos los jugadores.---_>");
        System.out.println(lista.stream()
                .collect(Collectors.averagingInt(j -> j.getNumCanastas())));

        System.out.println("------------");
        System.out.println("Devolver con una lista todos los jugadores que pertenezcan " +
                "a equipos cuya localidad sea Barcelona.---_>");
        lista.stream()
                .filter(j -> j.getEquipo().getCiudad().toLowerCase().equals("barcelona"))
                .forEach(System.out::println);

        System.out.println("------------");
        System.out.println("Devolver con un boolean si hay algún jugador que ha " +
                "conseguido más de 4.000 canastas.---_>");

        // he creadp ambas opciones a modo de ejemplo, tanto false || true.
        System.out.println("dará true, por que hay jugador que supera los 4000");
        System.out.println(lista.stream()
                .anyMatch(j -> j.getNumCanastas() > 4000));
        System.out.println("dará false, por que no hay jugador que supere 100000");
        System.out.println(lista.stream()
                .anyMatch(j -> j.getNumCanastas() > 100000));

        System.out.println("------------");
        System.out.println("Devolver con un boolean si todos los jugadores " +
                "han conseguido más de 50 canastas.---_>");
        System.out.println(" **** El estado es " + lista.stream()
                .allMatch(j -> j.getNumCanastas() > 50) + "******");
        System.out.println("Lista de jugadores que lo han conseguido");
        lista.stream()
                .filter(Jugador -> Jugador.getNumCanastas() > 49)
                .map(Jugador::getNombre)
                .forEach(System.out::println);
        System.out.println("------------");
        System.out.println("Devolver con un boolean si todos los jugadores del primer equipo añadido" +
                " han conseguido más de 50 canastas.---_>");
        System.out.println(lista.stream()
                .filter(j -> j.getEquipo() == equipo1)
                .allMatch(j -> j.getNumCanastas() > 50));

        System.out.println("------------");
        System.out.println("Devolver un Map<String, List<Equipo>> agrupando los equipos " +
                "que pertenecen a una misma localidad");
//////// ---->  FALTA

        System.out.println("------------");
        System.out.println("Devolver la suma del número de canastas de todos " +
                "los jugadores Utilizar la operación Reduce");
        System.out.println(lista.stream()
                .map(Jugador::getNumCanastas)
                .reduce(0, (a, b) -> a + b));

    }


}
