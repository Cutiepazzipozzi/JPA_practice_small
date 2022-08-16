package jpa.practice.order;

import jpa.practice.member.Member;
import jpa.practice.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name="order_id")
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    private List<OrderProduct> lists;

    private String pName;
    private int pNumber;

}
