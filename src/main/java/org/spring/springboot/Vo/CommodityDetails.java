package org.spring.springboot.Vo;

public class CommodityDetails extends BaseVo{

	private String id;
	//详情图片 
	private String imgUrl ;
	//名称
	private String fullName;
	//重量
	private String  weight;
	//原价
	private String retail;
	//特价
	private String promotionPrice;
	//销售状态（是否特价促销）
	private String promotionType;
	//销量
	private String salesVolume;
	//详细描述
	private String description;
	//可提供的服务 1小时发货 IOE ，送货到家 IHM  IOE_IHM 两个服务都有
	private String serviceType;
	//  本地   或者发货地
	private String place;
	//包装 散装 商品保质期替代
	private String shelfLife;
	//储藏方式 商品品牌替代
	private String brand;
	
	
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getRetail() {
		return retail;
	}
	public void setRetail(String retail) {
		this.retail = retail;
	}
	public String getPromotionPrice() {
		return promotionPrice;
	}
	public void setPromotionPrice(String promotionPrice) {
		this.promotionPrice = promotionPrice;
	}
	public String getPromotionType() {
		return promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	public String getSalesVolume() {
		return salesVolume;
	}
	public void setSalesVolume(String salesVolume) {
		this.salesVolume = salesVolume;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CommodityDetails [id=" + id + ", imgUrl=" + imgUrl + ", fullName=" + fullName + ", weight=" + weight
				+ ", retail=" + retail + ", promotionPrice=" + promotionPrice + ", promotionType=" + promotionType
				+ ", salesVolume=" + salesVolume + ", description=" + description + ", serviceType=" + serviceType
				+ ", place=" + place + ", shelfLife=" + shelfLife + ", brand=" + brand + "]";
	}
	
	
	 
	
}
