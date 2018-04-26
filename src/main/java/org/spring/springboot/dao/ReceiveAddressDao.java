package org.spring.springboot.dao;

import java.util.List;

import org.spring.springboot.domain.Receive;

public interface ReceiveAddressDao {

	void saveReceiveAddress(Receive receive);
	void deleteByReceiveId(String receiveId);
	void updateByReceiveIdAndUserId(Receive r);
	List<Receive> findByUserId(String userId);
	
}
