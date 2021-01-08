package com.devup.springlearingsite.repository;

import com.devup.springlearingsite.domain.FilesUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<FilesUpload,Integer> {

FilesUpload findById(int id);
}
