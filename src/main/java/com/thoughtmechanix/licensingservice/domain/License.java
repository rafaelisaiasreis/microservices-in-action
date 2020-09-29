package com.thoughtmechanix.licensingservice.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class License {

    String id;
    String organizationId;
    String productName;
    String licenseType;

}
