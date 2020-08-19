package org.sid.contactapp.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @Getter
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;
}
