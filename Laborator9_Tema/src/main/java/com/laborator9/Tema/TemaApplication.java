package com.laborator9.Tema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class TemaApplication {

	public static List<Player> lista = new ArrayList<>();


	public static void main(String[] args) {

		SpringApplication.run(TemaApplication.class, args);
		Thread csvThread = new Thread(new FileInputOutputService());
		csvThread.start();
		try {
			csvThread.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}


	}

	@GetMapping("/endpoint1")
	public Player endpoint1() {

		String TeamForSearch = "WSB";

		for (var player: TemaApplication.lista) {
			if(player.getTeam().equals(TeamForSearch)) {
				return player;
			}
		}
		return null;
	}

	@PostMapping ("/endpoint2")
	public String endpoint2(@RequestBody List<Player> data) {

		lista.clear();
		lista.addAll(data);
		return "Totul a mers bine";

	}

	@DeleteMapping("/endpoint3")
	public String endpoint3(@RequestBody String firstName) {

		List<Player> lista2 = new ArrayList<>();
		lista2.addAll(lista);
		for (var player : lista) {
             if(player.getFirst().equals(firstName)) lista2.remove(player);
        }

		lista.clear();
		lista.addAll(lista2);

		return "Jucatorii cu numele " + firstName + " au fost stersi.";
	}

	//Se actualizeaza Games_Played
	@PutMapping("/endpoint4")
	public String endpoint4(@RequestBody Player jucator) {

		for (var player: lista) {

             if(player.getFirst().equals(jucator.getFirst())) player.setGames_played(jucator.games_played);

		}

		for (var player: TemaApplication.lista) {
             System.out.println(player);
        }

		return "Jucatorul a fost actualizat";
	}

}
