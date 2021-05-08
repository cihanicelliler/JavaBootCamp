package abstracts;

import entities.GameSale;

public interface OrderService {
	void add(GameSale order);
    void update(GameSale order);
    void delete(GameSale order);
}
