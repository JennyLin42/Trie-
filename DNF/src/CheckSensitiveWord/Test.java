package CheckSensitiveWord;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 测试构建字典树
 * @author 林飘飘
 *
 */
public class Test {
	public static HashMap rootNode;
	
	public static void main(String[] args) {
		Set<String> keyWordSet = new TreeSet();
		keyWordSet.add("日本");
		keyWordSet.add("日本鬼子");
		keyWordSet.add("毛泽东");
		rootNode =  (HashMap) addSensitiveWordToHashMap(keyWordSet);
		System.out.println(rootNode);
		String a = filter("我是搁置的日本人");
		System.out.println(a);
	}
	
	 public static Map addSensitiveWordToHashMap(Set<String> keyWordSet) {  
	        Map sensitiveWordMap = new HashMap(keyWordSet.size());     //初始化敏感词容器，减少扩容操作  
	        String key = null;    
	        Map nowMap = null;  
	        Map<String, String> newWorMap = null;  
	        //迭代keyWordSet  
	        Iterator<String> iterator = keyWordSet.iterator();  
	        while(iterator.hasNext()){  
	            key = iterator.next();    //关键字  
	            nowMap = sensitiveWordMap;  
	            for(int i = 0 ; i < key.length() ; i++){  
	                char keyChar = key.charAt(i);       //转换成char型  
	                Object wordMap = nowMap.get(keyChar);       //获取  
	                  
	                if(wordMap != null){        //如果存在该key，直接赋值  
	                    nowMap = (Map) wordMap;  
	                } else{     //不存在则，则构建一个map，同时将isEnd设置为0，因为他不是最后一个  
	                    newWorMap = new HashMap<String,String>();  
	                    newWorMap.put("isEnd", "0");     //不是最后一个  
	                    nowMap.put(keyChar, newWorMap);  
	                    nowMap = newWorMap;  
	                }  
	                  
	                if(i == key.length() - 1){  
	                    nowMap.put("isEnd", "1");    //最后一个  
	                }  
	            }  
	        }  
	        
	        return sensitiveWordMap;
	    }  
	 
	 
	 /**
	  * 过滤敏感词
	  */
	 public static String filter(String text) {
	     if (text == null) {
	         return text;
	     }
	     String replacement = "*";
	     StringBuilder result = new StringBuilder();

	     HashMap tempNode = rootNode;
	     int begin = 0; // 回滚数
	     int position = 0; // 当前比较的位置
	     while (position < text.length()) {
	         char c = text.charAt(position);
	         tempNode = (HashMap) tempNode.get(c);
	         if (tempNode == null) {
	             result.append(text.charAt(begin));
	             // 跳到下一个字符开始测试
	             position = begin + 1;
	             begin = position;
	             // 回到树初始节点
	             tempNode = rootNode;
	         } else if (tempNode.get("isEnd") == "1") {
	             // 发现敏感词， 从begin到position的位置用replacement替换掉
	             result.append(replacement);
	             position = position + 1;
	             begin = position;
	             tempNode = rootNode;
	         } else { //还不确定是不是敏感词
	             ++position;
	         }
	     }
	     result.append(text.substring(begin));

	     return result.toString();
	 }

}
