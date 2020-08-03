package br.com.mateus.testedetectafraude.model;

public class Resultado {
	
	 public Resultado(String id, int score) {
		 this.id = id;
		 this.score = score;
	 }

	private String id;
	private int score;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
