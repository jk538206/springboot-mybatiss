package org.spring.springboot.controller;


import java.util.List;
import java.util.Map;

import org.spring.springboot.domain.Receive;
import org.spring.springboot.service.ReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/receiveAddress")
public class ReceiveAddressController {
	
	@Autowired
	private ReceiveAddressService receiveAddressService;
	
	//保存新增的收货地址，将前台传入数据封装到Receive对象
	@RequestMapping(value = "/save", method = RequestMethod.GET)
    public void saveReceiveAddress(@RequestParam(value = "/saveReceiveAddress", required = false) @RequestBody Map<String,Receive> receive) {
        Receive r = new Receive();
		r.setCityName("上海");
		r.setCountryName("浦东");
		r.setCreateDate("20180422");
		r.setCreateTime("20180422");
		r.setDetailInfo("史各庄");
		r.setNationalCode("10000");
		r.setPostalCode("10000");
		r.setProvinceName("上海");
		r.setReceiveId("03");
		r.setTelNumber("133333");
		r.setUpdateDate("20180422");
		r.setUpdateTime("20180422");
		r.setUserId("002");
		r.setUserName("大娃");
		receiveAddressService.saveReceiveAddress(r);
    }
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public List<Receive> findByUserId(@RequestParam(value = "/findByUserId", required = false) String userId) {
//         Receive r = new Receive("001","002","张三","10000","北京","北京","昌平","史各庄","003","133333","20180422","20180422","20180422","20180422");
		String userId1 = "01";
		List<Receive> list=receiveAddressService.findByUserId(userId1);
		for (Receive receive : list) {
			
			System.out.println(receive);
		}
		return list;
	}
	
	//根据ReceiveId修改收货地址
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void  updateByReceiveIdAndUserId(@RequestParam(value = "/updateByReceiveIdAndUserId", required = false) String receiveId,String userId) {
		Receive r = new Receive();
		r.setCityName("上海");
		r.setCountryName("浦东");
		r.setCreateDate("20180422");
		r.setCreateTime("20180422");
		r.setDetailInfo("史各庄");
		r.setNationalCode("10000");
		r.setPostalCode("10000");
		r.setProvinceName("上海");
		r.setReceiveId("01");
		r.setTelNumber("133333");
		r.setUpdateDate("20180422");
		r.setUpdateTime("20180422");
		r.setUserId("003");
		r.setUserName("葫芦娃爷爷");
		receiveAddressService.updateByReceiveIdAndUserId(r);
		
	}
	//根据ReceiveId修改收货地址
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void  deleteByReceiveId(@RequestParam(value = "/deleteByReceiveId", required = false) String receiveId) {
		String receiveId1 = "01";
		receiveAddressService.deleteByReceiveId(receiveId1);
	}
	 

	 
}
