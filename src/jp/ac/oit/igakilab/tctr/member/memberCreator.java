package jp.ac.oit.igakilab.tctr.member;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

import jp.ac.oit.igakilab.tctr.db.MemberDatabaseCreator;

public class memberCreator {
	MemberDatabaseCreator mdc = new MemberDatabaseCreator();
	List<memberManager> mml = new ArrayList<>();
	memberManager mm = new memberManager();
	public void memberInsert(String name,String org,String position,int age){
		mm.setName(name);
		mm.setOrg(org);
		mm.setPosition(position);
		mm.setAge(age);
		mm.setId(RandomStringUtils.randomAlphabetic(1)+RandomStringUtils.randomAlphanumeric(5));
		mdc.memberInsert("memberInsert", mm);
	}

	/*public static void main(String[] args){
		memberCreator mc = new memberCreator();
		mc.memberInsert("秋元", "igklab", "4回生", 22);
	}*/
}
