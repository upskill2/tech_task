package technikal.task.fishmarket.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class FishDto {
	

	@NotEmpty(message = "потрібна назва рибки")
	private String name;
	@Min(0)
	private double price;
	private List<MultipartFile> imageFile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public List<MultipartFile> getImageFile () {
		return imageFile;
	}

	public void setImageFile (final List<MultipartFile> imageFile) {
		this.imageFile = imageFile;
	}
}
