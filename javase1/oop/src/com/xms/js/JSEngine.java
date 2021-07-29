package com.xms.js;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSEngine {
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		//创建脚本引擎对象
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
		//创建绑定对象
		Bindings bind = engine.createBindings();//Bindings是个接口继承了Map<String,Object>
		//将标识符factor与值1绑定
		bind.put("factor", 1);
		bind.put("factor1", 5);
		//将绑定对象bind设置为脚本作用域内有效
		engine.setBindings(bind, ScriptContext.ENGINE_SCOPE);
		//创建Scanner实例
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int first = input.nextInt();
			int src = input.nextInt();
			System.out.println("输入的参数是"+first+","+src);
			//指定要调用的JS代码所在文件
			engine.eval(new FileReader("c:/model.js"));
			//判断是否能调用方法
			if(engine instanceof Invocable) {
				//将ScriptEngine对象向下转型为Invocable对象
				Invocable in = (Invocable)engine;
				//使用Invocable对象的invokeFunction方法调用js中的函数,将计算结果保存在变量result中
				Double result = (double) in.invokeFunction("formula", first,src);
				System.out.println("运算后的结果:"+result.intValue());
			}
		}
	}
}
