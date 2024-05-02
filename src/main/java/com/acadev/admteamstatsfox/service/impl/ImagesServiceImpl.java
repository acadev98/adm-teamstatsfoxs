package com.acadev.admteamstatsfox.service.impl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.acadev.admteamstatsfox.database.entity.Images;
import com.acadev.admteamstatsfox.database.repository.ImagesRepository;
import com.acadev.admteamstatsfox.handler.exception.ApiException;
import com.acadev.admteamstatsfox.service.ImagesService;
import com.acadev.admteamstatsfox.utils.enums.ApiMessage;

@Service
public class ImagesServiceImpl implements ImagesService {

	@Autowired
	private ImagesRepository repository;

	public Long getNextId() {
		Optional<Images> entityMaxId = repository.findTopByOrderByIdDesc();
		if (entityMaxId.isPresent())
			return (entityMaxId.get().getId() + 1);
		return 1L;
	}

	public Images save(String imageName, MultipartFile file) {
		
		try {
			Images image = Images.builder()
					.id(getNextId())
					.name(imageName)
					.data(file.getBytes())
					.type(file.getContentType())
					.build();
	        
			return repository.save(image);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ApiException(ApiMessage.CONTENT_NOT_FOUND);
		}
	}

	public Images getImageByName(String imageName) {
		
		Optional<Images> imageEntityOptional = repository.findByName(imageName);
        if (imageEntityOptional.isPresent()) {
            return imageEntityOptional.get();
        } else {
			throw new ApiException(ApiMessage.CONTENT_NOT_FOUND);
        }
        
	}
	
}
