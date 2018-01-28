package com.kjetillorentzen.CoreAnalysisToolbox.dao;

import com.kjetillorentzen.CoreAnalysisToolbox.model.Core;

import java.util.List;

public interface CoreDao {
    List<Core> findAll();

    Core findById(Long id);

    void save(Core core);

    void delete(Core core);
}
