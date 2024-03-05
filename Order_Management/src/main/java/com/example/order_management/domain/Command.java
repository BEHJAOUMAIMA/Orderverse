package com.example.order_management.domain;

import com.example.order_management.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "command", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @ManyToOne
    private Address shippingAddress;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;


}
