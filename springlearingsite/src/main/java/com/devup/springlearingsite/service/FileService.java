package com.devup.springlearingsite.service;
import com.devup.springlearingsite.domain.FilesUpload;
import com.devup.springlearingsite.repository.FilesRepository;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
@Service
public class FileService {
    @Value("${image.path}")
    private String path;
    @Value("${image.url}")
    private String url;
    @Autowired
    private FilesRepository filesRepository;

    public FilesUpload savesFiles(MultipartFile file, String description) {
        try {
            byte[] bytes = file.getBytes();
            Path pathImage = Paths.get(path + file.getOriginalFilename());
            Files.write(pathImage, bytes);


        } catch (IOException e) {
            e.printStackTrace();
        }
        file.getOriginalFilename();
        FilesUpload image = FilesUpload.builder()
                .name(file.getOriginalFilename())
                .description(description)
                .path(path)
                .url(url + file.getOriginalFilename())
                .build();
        filesRepository.save(image);
        return image;
    }
    public List<FilesUpload> findAllImageUrl() {
        return filesRepository.findAll();
    }

}
