package com.fyfe.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private String fileName;
    private List<FileSystem> fileSystems;

    public Folder(String fileName) {
        this.fileName = fileName;
        this.fileSystems = new ArrayList<>();
    }

    public void addFileSystem(FileSystem fileSystem) {
        this.fileSystems.add(fileSystem);
    }

    public void remove(FileSystem fileSystem) {
        this.fileSystems.remove(fileSystem);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + fileName);
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.display();
        }
    }
}