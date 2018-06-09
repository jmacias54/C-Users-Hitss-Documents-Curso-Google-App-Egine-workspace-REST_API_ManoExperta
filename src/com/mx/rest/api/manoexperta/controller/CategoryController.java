package com.mx.rest.api.manoexperta.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mx.rest.api.manoexperta.model.Category;
import com.mx.rest.api.manoexperta.repository.CategoryRepository;

@Controller
@RequestMapping("categoryController")
public class CategoryController {

	private static Logger logger = Logger.getLogger(CategoryController.class);

	@Autowired
	private CategoryRepository categoryRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json; charset=utf-8")
	@ResponseBody
	public Iterable<Category> findAll() throws Exception {
		logger.debug(" --- findAll [ CategoryController ]--- ");

		try {

			return categoryRepository.findAll();
		} catch (Exception e) {
			logger.error(" -- Error  findAll [ CategoryController ]:", e);
			throw new Exception(e.getMessage());
		}

	}

}
