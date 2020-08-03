package br.com.mateus.testedetectafraude.calculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.com.mateus.testedetectafraude.model.Resultado;
import br.com.mateus.testedetectafraude.model.Transacao;

public class ScoreCalculator {

	public boolean validaMaiorDeIdade(String birthDate) {
		LocalDate bDay = LocalDate.parse(birthDate);
		LocalDate currentyDate = LocalDate.now();
		int years = Period.between(bDay, currentyDate).getYears();
		if (years >= 18) {
			return true;
		}
		return false;
	}

	public List<Resultado> calcule(List<Transacao> transacoes) {

		List<Resultado> resultados = new ArrayList<Resultado>();

		for (int i = 0; i < transacoes.size(); i++) {
			Transacao transacao = transacoes.get(i);

			int score = 0;

			if (validaMaiorDeIdade(transacao.getCustomer().getBirthDate()) == false) {
				score += 10;
			}
			if (transacao.getCardHoldName() != transacao.getCustomer().getName()) {
				score += 30;
			}
			if (transacao.getValue() <= 0) {
				score = 100;
			}
			if (transacao.getId() == "") {
				score = 100;
			}
			if (transacao.getCustomer().getId() == "") {
				score = 100;
			}

			resultados.add(new Resultado(transacao.getId(), score));
			
		}
		
		return resultados;
	}

}