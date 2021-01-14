package com.devup.springlearingsite.controller;

import com.devup.springlearingsite.domain.FilesUpload;
import com.devup.springlearingsite.repository.FilesRepository;
import com.devup.springlearingsite.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


@RestController
@RequestMapping("download")
public class FilesUploadController {
    @Autowired
    private FileService fileService;
    FilesRepository filesRepository;

    public FilesUploadController(FilesRepository filesRepository) {
        this.filesRepository = filesRepository;
    }

    @PostMapping
    public ResponseEntity<FilesUpload> postfile(@RequestParam("file") MultipartFile file,
                                                @RequestParam("description") String description) {

        return ResponseEntity.ok(fileService.savesFiles(file,description));
    }

    @GetMapping("/{id}")
    public ResponseEntity<InputStreamResource> getById(@PathVariable int id) throws FileNotFoundException {
    FilesUpload filesUpload=filesRepository.findById(id);
    String address=filesUpload.getPath()+filesUpload.getName();
    File file=new File(address);
        InputStream  inputStream=new FileInputStream(file);
        InputStreamResource inputStreamResource=new InputStreamResource(inputStream);
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.setContentType(MediaType.valueOf("application/pdf"));

        httpHeaders.set("Content-Disposition", "attachment; filename="+filesUpload.getName()); // best for download
        return new ResponseEntity<InputStreamResource>(inputStreamResource,httpHeaders, HttpStatus.OK);
    }


}