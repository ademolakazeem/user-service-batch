package com.verdeinfotech.batch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReadUser {
    private String id;
    private String name;
    private String email;
    private String phone;
}
