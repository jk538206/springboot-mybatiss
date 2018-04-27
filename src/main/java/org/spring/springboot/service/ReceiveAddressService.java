package org.spring.springboot.service;

import java.util.List;

import org.spring.springboot.domain.Receive;

public interface ReceiveAddressService {

	void saveReceiveAddress(Receive receive);

	void deleteByReceiveId(String receiveId);

	void updateByReceiveIdAndUserId(Receive r);
	

	List<Receive> findByUserId(String userId);

}
