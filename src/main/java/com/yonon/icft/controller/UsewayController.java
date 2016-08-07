/**
 * 
 */
package com.yonon.icft.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yonon.framework.util.Convert;
import com.yonon.icft.model.Useway;
import com.yonon.icft.service.UsewayService;

/**
 * @author Yonon 2016年8月7日
 */
@Controller
@RequestMapping("/useway")
public class UsewayController {
	@Autowired
	private UsewayService usewayService;
	private Logger log = Logger.getLogger(this.getClass());

	/**
	 * 获取所有用途名
	 */
	@RequestMapping("/allUseway")
	public String queryAllUseway(HttpServletRequest request, Model model) {
		log.info("获取所有用途名");
		List<Useway> usewayList = usewayService.getAllUseway();

		return "../views/index.jsp";
	}

	@RequestMapping("/addUseway")
	public String addUseway(@RequestParam("usewayName") String usewayName, Model model) {
		Useway useway = new Useway();
		useway.setUsewayName(usewayName);
		usewayService.addUseway(useway);
		return "../views/index.jsp";
	}

	@RequestMapping("/deleteUseway")
	public String deleteUseway(@RequestParam("id") String id, Model model) {
		usewayService.deleteUseway(Convert.stringToInt(id));
		return "../views/index.jsp";
	}

	@RequestMapping("/updateUseway")
	public String updateUseway(@RequestParam("id") String id, @RequestParam("usewayName") String usewayName,
			Model model) {
		Useway useway = new Useway();
		useway.setId(Convert.stringToInt(id));
		useway.setUsewayName(usewayName);
		usewayService.updateUseway(useway);
		return "../views/index.jsp";
	}
}
