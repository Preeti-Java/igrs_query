/**
 * 
 */
package com.cg.neel.igrs.query.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.neel.igrs.query.external.service.Data_Service;
import com.cg.neel.igrs.query.query.dto.FileIdDto;
import com.cg.neel.igrs.query.query.dto.FileIdDto.FileIdDtoBuilder;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Preeti
 * @dis This service used for reuse method of data related info.
 * @apiNote Used For Call other Micro-service method and  Fault tolerance and circuit breaker and retry module
 *
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class DataService {
	
	private final Data_Service dataService;
	
	/**
	 * @param userId
	 * @return payment id list - PaymentDropdownIdAndPaymentIdAndDateOnly
	 */
	//@CircuitBreaker(name = "fileIdDetailsByUserIdBreaker_Query_Data", fallbackMethod = "fileIdDetailsByUserFallback_Query_Data")
	//@Retry(name = "fileIdDetailsByUserIdRetry_Query_Data", fallbackMethod = "fileIdDetailsByUserIdFallback_Query_Data")
	@RateLimiter(name = "fileIdDetailsByUserIdRetry_Query_Data", fallbackMethod = "fileIdDetailsByUserIdFallback_Query_Data")
	public List<FileIdDto> getFileIdByPrincipal(Long userId) {
		//Need to implement in future
		//return dataService.getFileIdByPrincipal(userId);
		FileIdDto data= new FileIdDto();
		data.setFileId("123BB234");
		
		FileIdDto data1= new FileIdDto();
		data.setFileId("123BB235");  
		
		List<FileIdDto> dataList = new ArrayList<>();
		dataList.add(data);
		dataList.add(data1);
		log.debug("Getting Data for fileId dropdown.");
		return dataList;
		
	}
	
	//Creating fallback method for getFileIdByPrincipal()
	public List<FileIdDto> fileIdDetailsByUserIdFallback_Query_Data(Long userId, Exception ex){
		log.info("Fallback is executed because service is down :" + ex);
		FileIdDtoBuilder data =  FileIdDto.builder()
				.fileId("123BB235");
				
		return (List<FileIdDto>) data;
	}


}
