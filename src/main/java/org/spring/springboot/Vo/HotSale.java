package org.spring.springboot.Vo;

//首页 新货热卖
/**商品简介 大略*/
public class HotSale extends BaseVo{

	//首页 新货热卖 货品id
	private String hotSaleId;
	//产品名称
	private String saleName;
	//销量
	private String salesVolume;
	//售价
	private String price;
	//图片地址
	private String imgUrl;
	//商品类型
	private String itemType;
	
	public String getHotSaleId() {
		return hotSaleId;
	}
	public void setHotSaleId(String hotSaleId) {
		this.hotSaleId = hotSaleId;
	}
	public String getSaleName() {
		return saleName;
	}
	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}
	public String getSalesVolume() {
		return salesVolume;
	}
	public void setSalesVolume(String salesVolume) {
		this.salesVolume = salesVolume;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Override
	public String toString() {
		
		return "HotSale [hotSaleId=" + hotSaleId + ", saleName=" + saleName + ", salesVolume=" + salesVolume
				+ ", price=" + price + ", imgUrl=" + imgUrl + ", itemType=" + itemType +"minRecordNum: "+ super.getMinRecordNum()+ "pagesize"+ super.getPageSize()+"]";
	}
	
	
	
	
}
