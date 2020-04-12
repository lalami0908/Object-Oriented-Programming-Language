/**
 * program to deal with the Sentence.
 * has two functions: removeDuplicatedWords and replaceWord
 * @author b06705048
 *
 */
package hw3;

import java.util.*;
import java.lang.StringBuilder;

public class SentenceProcessor {
    /**
     * @param _input (the original sentence)
     * @return result (the string removed the duplicate words and remain only the one occurs first)
     */
    public static String removeDuplicatedWords(String _input){
        
    	StringTokenizer st = new StringTokenizer(_input, " "); // cut depend on white space
    	
    	int Cnt = st.countTokens();
    	int _cnt = 0;
    	
    	String[]  _result = new String[Cnt];
    	String[] next = new String[Cnt];
    	
    	boolean dupli = false;
    	
        for(int i = 0;i < Cnt; i++){
        	next[i] = st.nextToken();
        	for(int j = 0;j < _cnt; j++) { // check every word in the _result
        		if(_result[j].equals(next[i]))
        			dupli = true;
        	}
        	if(!dupli) { // if it doesn't exist in the result
        		_result[_cnt] = next[i]; 
        		_cnt += 1;
        	}
        	dupli = false;
        }
        // string array to stringbuffer to sting
        StringBuffer sb = new StringBuffer();       
        for(int i = 0; i < _cnt; i++) {
        	sb.append(_result[i]);
        	if(i != _cnt-1)
        		sb.append(" ");
        } 
           
        return sb.toString();
    }
       /**
     * @param _tar (which will be replaced)
     * @param _rep (replace with _tar)
     * @param _input (the original sentence)
     * @return result (the string after replacement)
     */
    public static String replaceWord(String _tar, String _rep, String _input){
        StringTokenizer st = new StringTokenizer(_input, " "); // cut depend on white space
        int cnt = st.countTokens();
        StringBuilder _result = new StringBuilder();
        String[] next = new String[cnt];
        
        for(int i = 0;i < cnt; i++){
        	next[i] = st.nextToken();
        	if(next[i].equals(_tar))  // if it doesn't exist in the result
        		_result.append(_rep);	
        	else        		
        		_result.append(next[i]);     	
        	if(i != cnt-1)
        		_result.append(" ");
        }
        return _result.toString();
    }
 
}