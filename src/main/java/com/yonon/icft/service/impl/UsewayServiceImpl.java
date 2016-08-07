/**
 * 
 */
package com.yonon.icft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonon.icft.dao.UsewayDao;
import com.yonon.icft.model.Useway;
import com.yonon.icft.service.UsewayService;

/**
 * @author Yonon
 * 2016Äê8ÔÂ7ÈÕ
 */
@Service("UsewayService")
public class UsewayServiceImpl implements UsewayService {
	@Autowired
	private UsewayDao usewayDao;
	/* (non-Javadoc)
	 * @see com.yonon.icft.service.UsewayService#getAllUseway()
	 */
	@Override
	public List<Useway> getAllUseway() {
		// TODO Auto-generated method stub
		return usewayDao.getAllUseway();
	}

	/* (non-Javadoc)
	 * @see com.yonon.icft.service.UsewayService#addUseway(com.yonon.icft.model.Useway)
	 */
	@Override
	public void addUseway(Useway useway) {
		// TODO Auto-generated method stub
		usewayDao.addUseway(useway);
	}

	/* (non-Javadoc)
	 * @see com.yonon.icft.service.UsewayService#updateUseway(com.yonon.icft.model.Useway)
	 */
	@Override
	public void updateUseway(Useway useway) {
		// TODO Auto-generated method stub
		usewayDao.updateUseway(useway);
	}

	/* (non-Javadoc)
	 * @see com.yonon.icft.service.UsewayService#deleteUseway(int)
	 */
	@Override
	public void deleteUseway(int id) {
		// TODO Auto-generated method stub
		usewayDao.deleteUseway(id);
	}

}
