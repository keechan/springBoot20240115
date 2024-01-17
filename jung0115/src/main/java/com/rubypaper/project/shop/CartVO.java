package com.rubypaper.project.shop;

import lombok.Data;

@Data
public class CartVO {
  private  Long cartId;
  private  Long productId;
  private  String productName;
  private  Long productPrice;
  private  Long amount;
  private  String sessionID;
}
