package dao;

import java.io.BufferedReader;
import java.util.ArrayList;

import vo.BoyVO;
import vo.GirlVO;

public class NameDAO {
	public ArrayList<BoyVO> boys;
	public ArrayList<GirlVO> girls;
	
//	병합
	public void merge(String path1, String path2, String path3) {
		BufferedReader boyReader = DBConnecter.getReader(path1);
		BufferedReader girlReader = DBConnecter.getReader(path2);
//	랭킹 수정 
		
	}
}
