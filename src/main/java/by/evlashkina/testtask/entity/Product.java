package by.evlashkina.testtask.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "products")
	public class Product {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

		@Column(name = "name")
		private String name;

		@Column(name = "price")
		private int price;

		@Column (name = "status")
		private Status status;
		
		@Column (name = "created_at")
		private LocalDate creationDate;
		
		List <Order> orders = new ArrayList<>();

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public LocalDate getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(LocalDate creationDate) {
			this.creationDate = creationDate;
		}

		public List<Order> getOrders() {
			return orders;
		}

		public void setOrders(List<Order> orders) {
			this.orders = orders;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((orders == null) ? 0 : orders.hashCode());
			result = prime * result + price;
			result = prime * result + ((status == null) ? 0 : status.hashCode());
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
			Product other = (Product) obj;
			if (creationDate == null) {
				if (other.creationDate != null)
					return false;
			} else if (!creationDate.equals(other.creationDate))
				return false;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (orders == null) {
				if (other.orders != null)
					return false;
			} else if (!orders.equals(other.orders))
				return false;
			if (price != other.price)
				return false;
			if (status != other.status)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", status=" + status
					+ ", creationDate=" + creationDate + ", orders=" + orders + "]";
		}

}
