package com.bragin.area.model.persistence;

/**
 * Created with IntelliJ IDEA.
 * User: Bragin
 * Date: 17.09.13
 * Time: 0:42
 * To change this template use File | Settings | File Templates.
 */

import com.bragin.area.model.core.RealtyUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealtyUnitRepository extends JpaRepository <RealtyUnit, Long> {
}
