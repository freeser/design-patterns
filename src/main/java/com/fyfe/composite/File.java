package com.fyfe.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class File  implements FileSystem {
    private String name;
    private Long size;

//    public File(String name, Long size) {
//        this.name = name;
//        this.size = size;
//    }

    @Override
    public void display() {
        System.out.println("File: " + name + ", Size: " + size);
    }
}
