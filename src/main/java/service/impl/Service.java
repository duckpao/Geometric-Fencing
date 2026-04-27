package service.impl;

import entity.OrderEntity;
import entity.ShipperEntity;
import enums.Status;
import repository.OrderRepository;
import repository.ShipperRepository;

public class Service {
    private final OrderRepository orderRepository;
    private final ShipperRepository shipperRepository;

    @Override
    public void startDelivery(Long orderId, Integer shipperId) {
        OrderEntity order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy đơn hàng"));

        ShipperEntity shipper = shipperRepository.findById(shipperId)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy shipper"));

        order.setShipper(shipper);
        order.setStatus(Status.SHIPPING); // Dùng Enum bạn vừa làm

        orderRepository.save(order);
    }
}
