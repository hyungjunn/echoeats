package com.pofol.main.product.repository;

import com.pofol.main.product.domain.ProdDto;

public interface ProdRepository {

    ProdDto select(Integer pro_id) throws Exception;

    Integer insert(ProdDto prodDto) throws Exception;

}