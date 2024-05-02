package com.acadev.admteamstatsfox.service;

import org.springframework.web.multipart.MultipartFile;

import com.acadev.admteamstatsfox.database.entity.Images;

public interface ImagesService {

	Images save(String imageName, MultipartFile file);
	
	Images getImageByName(String imageName);

}
