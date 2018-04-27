package org.spring.springboot.service.impl;

import java.util.List;

import org.spring.springboot.dao.ReceiveAddressDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Receive;
import org.spring.springboot.service.ReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReceiveAddressServiceimpl implements ReceiveAddressService {
	
	@Autowired
	private ReceiveAddressDao receiveAddressDao;
	@Override
	public void saveReceiveAddress(Receive receive) {
		receiveAddressDao.saveReceiveAddress(receive);
	}
	

	@Override
	public void updateByReceiveIdAndUserId(Receive r) {
		receiveAddressDao.updateByReceiveIdAndUserId(r);
		
	}

	@Override
	public void deleteByReceiveId(String receiveId) {
		receiveAddressDao.deleteByReceiveId(receiveId);
		
	}

	@Override
	public List<Receive> findByUserId(String userId) {
		return receiveAddressDao.findByUserId(userId);
	}

}
