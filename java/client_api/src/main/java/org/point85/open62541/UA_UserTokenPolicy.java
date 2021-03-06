package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.point85.open62541.Open62541ExtLibrary.UA_UserTokenType;
/**
 * <i>native declaration : open62541.h:1227</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_UserTokenPolicy extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_String */
	@Field(0) 
	public UA_String policyId() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : UA_String */
	@Field(0) 
	public UA_UserTokenPolicy policyId(UA_String policyId) {
		this.io.setNativeObjectField(this, 0, policyId);
		return this;
	}
	/** C type : UA_UserTokenType */
	@Field(1) 
	public IntValuedEnum<UA_UserTokenType > tokenType() {
		return this.io.getEnumField(this, 1);
	}
	/** C type : UA_UserTokenType */
	@Field(1) 
	public UA_UserTokenPolicy tokenType(IntValuedEnum<UA_UserTokenType > tokenType) {
		this.io.setEnumField(this, 1, tokenType);
		return this;
	}
	/** C type : UA_String */
	@Field(2) 
	public UA_String issuedTokenType() {
		return this.io.getNativeObjectField(this, 2);
	}
	/** C type : UA_String */
	@Field(2) 
	public UA_UserTokenPolicy issuedTokenType(UA_String issuedTokenType) {
		this.io.setNativeObjectField(this, 2, issuedTokenType);
		return this;
	}
	/** C type : UA_String */
	@Field(3) 
	public UA_String issuerEndpointUrl() {
		return this.io.getNativeObjectField(this, 3);
	}
	/** C type : UA_String */
	@Field(3) 
	public UA_UserTokenPolicy issuerEndpointUrl(UA_String issuerEndpointUrl) {
		this.io.setNativeObjectField(this, 3, issuerEndpointUrl);
		return this;
	}
	/** C type : UA_String */
	@Field(4) 
	public UA_String securityPolicyUri() {
		return this.io.getNativeObjectField(this, 4);
	}
	/** C type : UA_String */
	@Field(4) 
	public UA_UserTokenPolicy securityPolicyUri(UA_String securityPolicyUri) {
		this.io.setNativeObjectField(this, 4, securityPolicyUri);
		return this;
	}
	public UA_UserTokenPolicy() {
		super();
	}
	public UA_UserTokenPolicy(Pointer pointer) {
		super(pointer);
	}
}
