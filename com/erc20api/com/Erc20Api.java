package com.erc20api.com;

import java.math.BigInteger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.web3j.contracts.eip20.generated.ERC20;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.gas.DefaultGasProvider;

import com.erc20Controller.com.Erc20Controller;

@Path("/erc20")
public class Erc20Api {
	@Path("/erc")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Erc20Controller getErcTokenInfo() throws Exception{
		Web3j web3 = Web3j.build(new HttpService("HTTP://ganache-ip:7545"));
		Credentials creds = Credentials.create("b1427aa43d62f7592feff8874d20fa42d9dbc96005d2a1c8a5cfdd55ebbfca62");
		String contractAddress = "0x82b575F93bEffea73C3C3bb776C82F8D67cb064e"; // The deployed contract address, taken
		BigInteger gasLimit = new BigInteger("100000");
		BigInteger gasPrice = new BigInteger("10");
		
		ERC20 javaToken = ERC20.load(contractAddress, web3, creds, new DefaultGasProvider());

		Erc20Controller erc=new Erc20Controller();
		erc.setTotalSupply(javaToken.totalSupply().send());
		erc.setTokenSymbol(javaToken.symbol().send());
		erc.setTotalDecimal(javaToken.decimals().send());
		erc.setTokenName(javaToken.name().send());
		erc.setTotalBalanceOnDeployedAccount(javaToken.balanceOf("0x82b575F93bEffea73C3C3bb776C82F8D67cb064e").send());
		return erc;
	}
	

}
