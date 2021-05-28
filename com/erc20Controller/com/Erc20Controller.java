package com.erc20Controller.com;

import java.math.BigInteger;

public class Erc20Controller {
	BigInteger totalSupply,totalDecimal,totalBalanceOnDeployedAccount;
	String tokenSymbol,tokenName;
	public BigInteger getTotalSupply() {
		return totalSupply;
	}
	public void setTotalSupply(BigInteger totalSupply) {
		this.totalSupply = totalSupply;
	}
	public BigInteger getTotalDecimal() {
		return totalDecimal;
	}
	public void setTotalDecimal(BigInteger totalDecimal) {
		this.totalDecimal = totalDecimal;
	}
	public BigInteger getTotalBalanceOnDeployedAccount() {
		return totalBalanceOnDeployedAccount;
	}
	public void setTotalBalanceOnDeployedAccount(BigInteger totalBalanceOnDeployedAccount) {
		this.totalBalanceOnDeployedAccount = totalBalanceOnDeployedAccount;
	}
	public String getTokenSymbol() {
		return tokenSymbol;
	}
	public void setTokenSymbol(String tokenSymbol) {
		this.tokenSymbol = tokenSymbol;
	}
	public String getTokenName() {
		return tokenName;
	}
	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}
}
