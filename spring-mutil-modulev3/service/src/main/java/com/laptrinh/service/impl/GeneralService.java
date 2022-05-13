package com.laptrinh.service.impl;



import com.laptrinh.dao.IGarenalDAO;
import com.laptrinh.service.IGeneralService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GeneralService<L, K> implements IGeneralService<L,K> {


	private IGarenalDAO<L,K> dao;

	@Override
	public L add(L entity) {
		return dao.create(entity);
	}

	@Override
	public void update(L entity) {
		dao.update(entity);
	}

	@Override
	public void delete(@SuppressWarnings("unchecked") K... ks) {
		dao.delete(ks);
	}

	@Override
	public List<L> findAll() {
		return dao.findAll();
	}

	@Override
	public L findById(K id) {
		return dao.findById(id);
	}

}
