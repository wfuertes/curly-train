package dev.wfuertes.recursion;

import java.io.File;
import java.util.Optional;
import java.util.stream.Stream;

public class TraversalDirectories {

    public void findDirs(File dir) {
        if (dir != null && dir.exists() && dir.isDirectory()) {
            Optional.ofNullable(dir.listFiles())
                    .stream()
                    .flatMap(Stream::of)
                    .forEach(file -> {
                        if (file.isDirectory()
                                && !file.getName().equals(".")
                                && !file.getName().equals("..")) {

                            System.out.println("%s".formatted(file.getAbsolutePath()));

                            // Recursively find sub-dirs
                            findDirs(file);
                        }
                    });
        }
    }

    public static void main(String[] args) {
        var service = new TraversalDirectories();
        service.findDirs(new File("/Users/willian"));
    }
}
