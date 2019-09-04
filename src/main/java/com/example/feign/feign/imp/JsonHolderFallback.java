package com.example.feign.feign.imp;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.feign.feign.IJsonPlaceHolderData;

@Component
public class JsonHolderFallback implements IJsonPlaceHolderData {

	@Override
	public ResponseEntity<Map> getJson() {
		// TODO Auto-generated method stub
		System.out.println("JsonPlaceHolder serive is down");
		return null;
	}

}
