package com.nt.service;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

import com.nt.dao.Dao;
import com.nt.dao.UserDaoImpl;

public class ServiceImpl implements Service {

	@Override
	public void StoreInboundMessage(String inboundMessage) throws Exception {
		//file is used to locate the file 
		File file =new File(inboundMessage);
		//file reader is used to read the file
		InputStreamReader isr=new FileReader(file);
		//to find the length of the file 
		long lengthOfthefile=inboundMessage.length();
		
		
		//store the file data into charesters
		char[] bufferdata=new char[1024];
		//store file data into charecters
		int bytereads=0;
		String filedata1="";
		while((bytereads=isr.read(bufferdata))!=-1) {
			//store the data into the file
			String filedata=String.valueOf(bufferdata,0,bytereads);
			filedata1=filedata1+filedata;
		}
		System.out.println( " filedata::"+filedata1);
		//call Dao method to to inser the data 
		Dao dao=new UserDaoImpl();
		dao.insertCharecterData(filedata1);
		
		
		
		
	}

}
