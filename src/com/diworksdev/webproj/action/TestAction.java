package com.diworksdev.webproj.action;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
//	TestAction は ActionSupport クラスを継承
//	ActionSupport は Struts 2 アクションの基本的な機能を提供する抽象クラス
	private String username;
	private String password;
//	username と password は、このアクションクラスのフィールド（属性）です。これらはHTMLフォームからの入力データを保持するための変数です。
	public String execute(){
		return SUCCESS;
//		execute メソッドが SUCCESS を返しています。SUCCESS は Struts 2 が提供する定数で、アクションが成功したことを示します。
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}