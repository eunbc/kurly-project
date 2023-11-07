package com.ebcho.marketkurly.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
	private final UUID orderId;
	private final UUID memberId;
	private final List<OrderItem> orderItems;
	private OrderStatus orderStatus;
	private final LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public Order(UUID orderId, UUID memberId, List<OrderItem> orderItems, OrderStatus orderStatus,
		LocalDateTime createdAt,
		LocalDateTime updatedAt) {
		this.orderId = orderId;
		this.memberId = memberId;
		this.orderItems = orderItems;
		this.orderStatus = orderStatus;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public UUID getOrderId() {
		return orderId;
	}

	public UUID getMemberId() {
		return memberId;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
}
