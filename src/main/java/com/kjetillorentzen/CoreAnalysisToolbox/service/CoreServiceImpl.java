package com.kjetillorentzen.CoreAnalysisToolbox.service;

import com.kjetillorentzen.CoreAnalysisToolbox.dao.CoreDao;
import com.kjetillorentzen.CoreAnalysisToolbox.model.Core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoreServiceImpl implements CoreService {
    @Autowired
    private CoreDao coreDao;

    @Override
    public List<Core> findAll() {

        return coreDao.findAll();
    }

    @Override
    public Core findById(Long id) {
        return coreDao.findById(id);
    }

    @Override
    public void save(Core core) {
        coreDao.save(core);
    }

    @Override
    public void delete(Core core) {
        coreDao.delete(core);
    }
}
