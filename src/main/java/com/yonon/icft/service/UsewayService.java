/**
 * 
 */
package com.yonon.icft.service;

import java.util.List;

import com.yonon.icft.model.Useway;

/**
 * @author Yonon
 * 2016��8��7��
 */
public interface UsewayService {
	public List<Useway> getAllUseway();
	public void addUseway(Useway useway);
	public void updateUseway(Useway useway);
	public void deleteUseway(int id);
}
