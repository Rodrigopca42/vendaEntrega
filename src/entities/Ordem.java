package entities;

import java.util.Date;

import entities.enums.StatusDeOrdem;

public class Ordem {
	
	private Integer id;
	private Date momento;
	private StatusDeOrdem status;
	
	public Ordem() {		
	}
	
	public Ordem(Integer id, Date momento, StatusDeOrdem status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDeOrdem getStatus() {
		return status;
	}

	public void setStatus(StatusDeOrdem status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Ordem [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
	
	

}
