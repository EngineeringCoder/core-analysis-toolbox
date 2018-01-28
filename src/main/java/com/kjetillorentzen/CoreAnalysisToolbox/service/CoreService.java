package com.kjetillorentzen.CoreAnalysisToolbox.service;

import com.kjetillorentzen.CoreAnalysisToolbox.model.Core;

import java.util.List;

public interface CoreService {
    List<Core> findAll();

    Core findById(Long id);

    void save(Core core);

    void delete(Core core);
}
