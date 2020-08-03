package br.com.mateus.testedetectafraude.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.mateus.testedetectafraude.calculator.ScoreCalculator;
import br.com.mateus.testedetectafraude.model.Resultado;
import br.com.mateus.testedetectafraude.model.Transacao;

@Controller
public class ScoreController {

	@RequestMapping(value =  "/score", method = RequestMethod.POST)
	@ResponseBody
	public List<Resultado> score(@RequestBody List<Transacao> transacoes) {

		ScoreCalculator scoreCalculator = new ScoreCalculator();
		return scoreCalculator.calcule(transacoes);
		
		
		
		
	}
	
}
