package com.xms.js;

import javax.script.*;
import java.io.FileReader;
import java.util.Scanner;

public class ScriptEngineDemo {
	public static void main(String[] args) throws Exception {
		//创建JSEngine,指定引擎类型为javascript
		ScriptEngine jSEngine = new ScriptEngineManager().getEngineByName("javascript");
		//通过JSEngine对象的createBindings()方法生成绑定对象bind
		Bindings bind = jSEngine.createBindings();
		//将要使用的参数名与值绑定
		bind.put("factor", 3);
		bind.put("factor1", 5);
		//将绑定设置为当前引擎范围
		jSEngine.setBindings(bind, ScriptContext.ENGINE_SCOPE);
		//指定需要执行的js代码文件
		jSEngine.eval(new FileReader("C:/model.js"));
		//创建Scanner对象
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int first = sc.nextInt();
			int src = sc.nextInt();
			//判断是否可以执行js中保存的函数
			if(jSEngine instanceof Invocable) {
				//将ScriptEngine对象向下转型
				Invocable in = (Invocable)jSEngine;
				//执行in的invokeFunction()方法调用js中的函数,将执行结果保存在Double类型的对象result中
				Double result = (double) in.invokeFunction("formula",first,src);
				//输出最后的执行结果
				System.out.println("执行结果为:"+result.intValue());
				
			}
		}
	}
}
