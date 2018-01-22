package jp.ac.oit.igakilab.tctr.member;

import java.util.List;

import jp.ac.oit.igakilab.tctr.db.MemberDatabaseCreator;

public class memberListener {
	MemberDatabaseCreator mdc = new MemberDatabaseCreator();
	memberManager mm = new memberManager();
	public List<memberManager> memberListen(){
		return mdc.memberListen("memberListen",mm);
	}
}
