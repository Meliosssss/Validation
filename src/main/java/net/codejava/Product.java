package net.codejava;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Product {
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, @NotBlank(message = "ten san pham khong duoc de trong") String name,
			@Length(min = 0, max = 50, message = "ten hinh anh khong qua 50 ki tu") String image,
			@NotNull(message = "gia san pham khong de trong") @Min(value = 1, message = "gia san pham khong nho hon 1") @Max(value = 999999999, message = "gia san pham khong duoc lon hon  999999999") long price) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
	}

	private int id;
	@NotBlank(message = "ten san pham khong duoc de trong")
	private String name;
	@Length(min = 0, max = 50, message = "ten hinh anh khong qua 50 ki tu")
	private String image;
	@NotNull(message = "gia san pham khong de trong")
	@Min(value = 1, message = "gia san pham khong nho hon 1")
	@Max(value = 999999999, message = "gia san pham khong duoc lon hon  999999999")
	private long price;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}