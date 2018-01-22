package jp.ac.oit.igakilab.tctr.project;

import java.util.List;

import jp.ac.oit.igakilab.tctr.db.ProjectDatabaseCreator;

public class projectListener {
	ProjectDatabaseCreator pdc = new ProjectDatabaseCreator();
	public List<projectManager> projectListen(){
		return pdc.projectListen("listenProject");
	}
	/*
	public List<projectManager> ownerCandidate(){
		return pdc.projectListen("listenOwner");
	}

	public projectManager listenSelectProject(String id){
		return pdc.projectListen("listenSelectProject", id).get(0);
	}
	*/


	public static void main(String[] args){
		projectListener pl = new projectListener();
		for(projectManager pm:pl.projectListen()){
			System.out.println("ID:"+pm.getId());
			System.out.println("Name:"+pm.getName());
			System.out.println("Owner:"+pm.getOwner());
			System.out.println("Overview:"+pm.getOverview());
			System.out.println("State:"+pm.getState());
		}
	}
}
