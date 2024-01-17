package com.rubypaper.project.psd;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class PsdVO {
  private int idx;
  private String title;
  private MultipartFile file;
  private String img;
}
