# JavaExercise
>基礎Java練習題。

---
##目錄：
*   ####sample1
    ```ruby
    Double num = Double.parseDouble(str);
    ```
    >可以輸入含有小數點的數字

*   ####sample2
    ```ruby
    int num = Integer.parseInt(str);
    ```
    >將字串轉換成數值，再指定給int 形態的變數

*   ####sample3
    ```ruby
    for(int i=0 ; i<num ; i++){
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
    ```
    >根據前面輸入的數字，從鍵盤輸入同樣個數的成績
    
*   ####sample4
    ```ruby
    if(test[t] > test[s]){
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
    ```
    >運用氣泡排序法，找出使用者輸入的最大數
    
*   ####sample5/sample6/sample7
    ```ruby
    class Car{
	      void show(){//這是方法method
		    
	      }
     }
    ```
    >在類別宣告的內部呼叫方法
    >呼叫方法並傳遞引數
    >方法的回傳值＿帶有傳回值的方法
    
*   ####sample8
    ```ruby
    public Car3(){//建構式名稱要class 一樣
		    num = 0;
		    gas = 0.0;
		    sum++;//建構式每次被呼叫，都會使類別變數sum的值增加1
		    System.out.println("呼叫一次建構式，初始化車車");
	  }
    ```
    >建構式的觀念。
    
*   ####sample9
    ```ruby
    char ch1 = str.charAt(0);
	  }
    ```
    ```ruby
    int len = str.length();
	  }
    ```
    >取得字串中的指定字元
    >傳回字串的長度
    
*   ####sample10
    ```ruby
    int num = str.indexOf(ch);
	  }
    ```
    >操作字串的類別＿收尋文字
    
*   ####sample11
    ```ruby
    StringBuffer sb = new StringBuffer(str);
		//sb.append(str1);
		sb.setCharAt(num, ch2);
	  }
    ```
    >操作字串的類別＿新增/更改其中內容
