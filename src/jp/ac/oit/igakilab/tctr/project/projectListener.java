package jp.ac.oit.igakilab.tctr.project;

import java.util.List;

import jp.ac.oit.igakilab.tctr.db.ProjectDatabaseCreator;

public class projectListener {
    ProjectDatabaseCreator pdc = new ProjectDatabaseCreator();
    public List<projectManager> projectListen(){
        return pdc.projectListen("listenProject");
    }

    public static void main(String[] args){

    }
}