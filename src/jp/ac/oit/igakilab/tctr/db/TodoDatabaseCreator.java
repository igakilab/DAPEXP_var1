package jp.ac.oit.igakilab.tctr.db;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import jp.ac.oit.igakilab.tctr.todoList.todoManager;

public class TodoDatabaseCreator {
	SqlSessionFactory factory = DBUtility.getSqlSessionFactory();

	public List<todoManager> todoListen(){
		List <todoManager> todoItem = new ArrayList<>();
		try (SqlSession session = factory.openSession()){
			todoItem = session.selectList("todoListen");
		}
		return todoItem;
	}

	
	public void todoInsert(String mapper,todoManager tm){
		try (SqlSession session = factory.openSession()){
			session.insert(mapper,tm);
			session.commit();
		}
	}

	public List<todoManager> todoListen(String id){
		List <todoManager> todoItem = new ArrayList<>();
		try (SqlSession session = factory.openSession()){
			todoItem = session.selectList("selectTodoListen",id);
		}
		return todoItem;
	}

	public void statusMove (String id){
		try (SqlSession session = factory.openSession()){
			session.insert("statusMove",id);
			session.commit();
		}
	}

	public void importance (String mapper,String id){
		try (SqlSession session = factory.openSession()){
			session.insert(mapper,id);
			session.commit();
		}
	}
}
