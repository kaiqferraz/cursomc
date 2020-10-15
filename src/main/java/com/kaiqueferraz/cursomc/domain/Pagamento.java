package com.kaiqueferraz.cursomc.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kaiqueferraz.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) //MAPEAR HERANÇA
public abstract class Pagamento implements Serializable {

    //classe Pagamento é abstrata para poder apenas estanciar com new PagamentoComCartao ou PagamentoComBoleto

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    private Integer estado;

    @JsonIgnore//Bloquear Serialização para  pedido
    @OneToOne
    @JoinColumn(name = "pedido_id")
    @MapsId  //PAGAMENTO TEM O MESMO ID QUE O PEDIDO
    private Pedido pedido; //PEDIDO TEM 1 PAGAMENTO;

    public Pagamento() {
    }

    public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
        super();
        this.id = id;
        this.estado = (estado==null) ? null :  estado.getCod();
        this.pedido = pedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoPagamento getEstado() {
        return EstadoPagamento.toEnum(estado);
    }

    public void setEstado(EstadoPagamento estado) {
        this.estado = estado.getCod();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pagamento other = (Pagamento) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }



}
