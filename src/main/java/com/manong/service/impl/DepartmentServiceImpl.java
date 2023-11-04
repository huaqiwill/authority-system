package com.manong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manong.dao.DepartmentMapper;
import com.manong.entity.DepartmentEntity;
import com.manong.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, DepartmentEntity> implements DepartmentService {

}
