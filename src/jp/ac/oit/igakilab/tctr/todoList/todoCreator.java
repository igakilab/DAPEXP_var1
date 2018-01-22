package jp.ac.oit.igakilab.tctr.todoList;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;

import jp.ac.oit.igakilab.tctr.db.TodoDatabaseCreator;

public class todoCreator {
	todoManager td = new todoManager();
	TodoDatabaseCreator mdb = new TodoDatabaseCreator();

	public void todoCreate(String title,String overview){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");
		td.setTitle(title);
		td.setOverview(overview);
		td.setDate(sdf.format(new Date()));
		td.setId(RandomStringUtils.randomAlphabetic(1)+RandomStringUtils.randomAlphanumeric(5));

		mdb.todoInsert("createTodo",td);
	}
	
	/*
	public void statusMove(String id){
		mdb.statusMove(id);
	}

	public void importanceUp(String id){
		mdb.importance("importanceUp",id);

	}

	public void importanceDown(String id){
		if(mdb.todoListen(id).get(0).getImportance()>1){
			mdb.importance("importanceDown",id);
		}
	}
	*/

	public static void main(String[] args){
		todoCreator tdm = new todoCreator();
		tdm.todoCreate("実験","testです");
	}
}
