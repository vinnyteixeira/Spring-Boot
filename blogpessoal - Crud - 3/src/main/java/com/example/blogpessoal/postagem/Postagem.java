package com.example.blogpessoal.postagem;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_postagens")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo titulo é Obrigatório!")
	@Size(min = 5,max = 100,message = "O titulo deve ter no minimo 5 e no maximo 20 caracteres")
	private String titulo;
	
	@NotNull(message = "O atributo texto é Obrigatorio!")
	@Size(min = 5, max = 1000, message = "O texto deve ter no minimo 10 e no maximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDate data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}