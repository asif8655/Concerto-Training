package com.boot.demo.SpringBootDemo.entity;

import java.beans.Transient;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Asif_LineItem")
public class LineItem {
	
	@Id
	private int id;
	private int qty;
	@OneToOne
	@JoinColumn(name="prodid")
	private Product product;
	@OneToOne
	@JoinColumn(name="orderid")
	private Order order;
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", qty=" + qty + ", product=" + product + "]";
	}
	
	
}
