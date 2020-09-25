package com.kaiqueferraz.cursomc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class ItemPedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonIgnore // BLOQUEAR SERIALIZAÇÃO DO PEDIDO E DO PRODUTO
    @EmbeddedId //ID EMBUTIDO AUXILIAR
    private ItemPedidoPK id = new ItemPedidoPK();


    private Double desconto;
    private Integer quantidade;
    private Double preço;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido,Produto produto, Double desconto, Integer quantidade, Double preço) {

        id.setPedido(pedido);
        id.setProduto(produto);
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preço = preço;
    }


//---------------------------------------
// ter acesso direto ao pedido e produto fora da classe ItemPedido

    @JsonIgnore
    public Pedido getPedido(){
        return id.getPedido();
    }

    public Produto getProduto(){
        return id.getProduto();
    }

//-----------------------------------------

    public ItemPedidoPK getId() {
        return id;
    }

    public void setId(ItemPedidoPK id) {
        this.id = id;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
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
        ItemPedido other = (ItemPedido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }


}
