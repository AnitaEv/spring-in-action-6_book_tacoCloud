package project.tacoscloud.dao;

import project.tacoscloud.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
