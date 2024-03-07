package com.wipro.PasswordDecorder.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	public String encrypt(String text) {
		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(text.getBytes());
		return encodeToString;
	}
	
	public String decrypted(String decryText) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(decryText);
		return new String(decode);
	}

}
