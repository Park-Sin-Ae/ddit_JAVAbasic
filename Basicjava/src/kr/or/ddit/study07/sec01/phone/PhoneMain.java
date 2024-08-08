package kr.or.ddit.study07.sec01.phone;

public class PhoneMain {
	public static void main(String[] args) {
		FolderPhone fp = new FolderPhone();
		fp.call();
//		fp.fold();
		
		CameraPhone cp = new CameraPhone();
		cp.camera();
		cp.call();
		
		IPhone1Gen ip = new IPhone1Gen();
		ip.call();
		ip.internet();
		ip.touch();
		ip.appstore();
		ip.camera();
	}
}
