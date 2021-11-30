package com.doge;
import io.javalin.Javalin;
import java.util.*;

public class Driver {
	static LinkedList<Character> characters;
	 
	public static void main(String[] args) {
		characters= new LinkedList<Character>();
		Javalin app = Javalin.create();
		
		app.start();
		
		app.post("/dogelore", ctx -> {
			Character c = new Character();
			c.name= ctx.formParam("name");
			c.species = ctx.formParam("species");
			c.description = ctx.formParam("description");
			c.age = Integer.parseInt(ctx.formParam("age"));
			c.toast = ctx.formParam("toast");
			characters.add(c);
			
			String text="";
			
			for(int i =0; i<characters.size();i++) {
				text += characters.get(i)+"<br>";				
			}
			
			ctx.html(text);
		});
		
	}

}
