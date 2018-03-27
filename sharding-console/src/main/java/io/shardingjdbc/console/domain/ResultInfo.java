package io.shardingjdbc.console.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * Result information.
 * 
 * @author zhangyonglun
 */
@AllArgsConstructor
@Getter
@Setter
public class ResultInfo {
    
    private String affectedRows;
    
    private Long durationMilliseconds;
    
    private String sql;
    
    private Map<String, String> types;
    
    //Todo
    private List<Map<String, String>> data;
}