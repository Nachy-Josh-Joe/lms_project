package edu.schoollibrary.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppResponse<T>{
  private String code;
  private String message;
  private T data;
}
