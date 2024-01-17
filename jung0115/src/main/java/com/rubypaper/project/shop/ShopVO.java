package com.rubypaper.project.shop;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ShopVO {
  private Long   productId;  // 상품번호
  private String productName;  // 상품이름
  private Long   productPrice;  //상품가격
  private String productDesc;    // 상품 상세설명
  private MultipartFile productFile;   // 파일등록
  private String productImg;   // 상품사진
  private String productDate;  // 상품등록날짜
}
