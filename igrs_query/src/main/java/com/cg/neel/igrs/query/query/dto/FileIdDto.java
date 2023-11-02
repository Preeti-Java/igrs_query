/**
 * 
 */
package com.cg.neel.igrs.query.query.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Preeti
 * @des For Fileid which is connected for userId
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FileIdDto {
	
	private String fileId;
	
}
