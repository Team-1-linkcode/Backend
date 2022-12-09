package com.example.demo.entities;

public class Role {

	private Long roleId;
	private String roleName;

	public Long getRoleId() {
		return roleId;
	}

	

	public Role(Long roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
