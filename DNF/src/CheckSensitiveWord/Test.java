package CheckSensitiveWord;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * ���Թ����ֵ���
 * @author ��ƮƮ
 *
 */
public class Test {
	public static HashMap rootNode;
	
	public static void main(String[] args) {
		Set<String> keyWordSet = new TreeSet();
		keyWordSet.add("�ձ�");
		keyWordSet.add("�ձ�����");
		keyWordSet.add("ë��");
		rootNode =  (HashMap) addSensitiveWordToHashMap(keyWordSet);
		System.out.println(rootNode);
		String a = filter("���Ǹ��õ��ձ���");
		System.out.println(a);
	}
	
	 public static Map addSensitiveWordToHashMap(Set<String> keyWordSet) {  
	        Map sensitiveWordMap = new HashMap(keyWordSet.size());     //��ʼ�����д��������������ݲ���  
	        String key = null;    
	        Map nowMap = null;  
	        Map<String, String> newWorMap = null;  
	        //����keyWordSet  
	        Iterator<String> iterator = keyWordSet.iterator();  
	        while(iterator.hasNext()){  
	            key = iterator.next();    //�ؼ���  
	            nowMap = sensitiveWordMap;  
	            for(int i = 0 ; i < key.length() ; i++){  
	                char keyChar = key.charAt(i);       //ת����char��  
	                Object wordMap = nowMap.get(keyChar);       //��ȡ  
	                  
	                if(wordMap != null){        //������ڸ�key��ֱ�Ӹ�ֵ  
	                    nowMap = (Map) wordMap;  
	                } else{     //���������򹹽�һ��map��ͬʱ��isEnd����Ϊ0����Ϊ���������һ��  
	                    newWorMap = new HashMap<String,String>();  
	                    newWorMap.put("isEnd", "0");     //�������һ��  
	                    nowMap.put(keyChar, newWorMap);  
	                    nowMap = newWorMap;  
	                }  
	                  
	                if(i == key.length() - 1){  
	                    nowMap.put("isEnd", "1");    //���һ��  
	                }  
	            }  
	        }  
	        
	        return sensitiveWordMap;
	    }  
	 
	 
	 /**
	  * �������д�
	  */
	 public static String filter(String text) {
	     if (text == null) {
	         return text;
	     }
	     String replacement = "*";
	     StringBuilder result = new StringBuilder();

	     HashMap tempNode = rootNode;
	     int begin = 0; // �ع���
	     int position = 0; // ��ǰ�Ƚϵ�λ��
	     while (position < text.length()) {
	         char c = text.charAt(position);
	         tempNode = (HashMap) tempNode.get(c);
	         if (tempNode == null) {
	             result.append(text.charAt(begin));
	             // ������һ���ַ���ʼ����
	             position = begin + 1;
	             begin = position;
	             // �ص�����ʼ�ڵ�
	             tempNode = rootNode;
	         } else if (tempNode.get("isEnd") == "1") {
	             // �������дʣ� ��begin��position��λ����replacement�滻��
	             result.append(replacement);
	             position = position + 1;
	             begin = position;
	             tempNode = rootNode;
	         } else { //����ȷ���ǲ������д�
	             ++position;
	         }
	     }
	     result.append(text.substring(begin));

	     return result.toString();
	 }

}
