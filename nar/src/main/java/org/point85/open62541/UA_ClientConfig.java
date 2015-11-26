package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:2159</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_ClientConfig extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * sync response timeout<br>
	 * C type : UA_Int32
	 */
	@Field(0) 
	public int timeout() {
		return this.io.getIntField(this, 0);
	}
	/**
	 * sync response timeout<br>
	 * C type : UA_Int32
	 */
	@Field(0) 
	public UA_ClientConfig timeout(int timeout) {
		this.io.setIntField(this, 0, timeout);
		return this;
	}
	/**
	 * lifetime in ms (then the channel needs to be renewed)<br>
	 * C type : UA_Int32
	 */
	@Field(1) 
	public int secureChannelLifeTime() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * lifetime in ms (then the channel needs to be renewed)<br>
	 * C type : UA_Int32
	 */
	@Field(1) 
	public UA_ClientConfig secureChannelLifeTime(int secureChannelLifeTime) {
		this.io.setIntField(this, 1, secureChannelLifeTime);
		return this;
	}
	/**
	 * time in ms  before expiration to renew the secure channel<br>
	 * C type : UA_Int32
	 */
	@Field(2) 
	public int timeToRenewSecureChannel() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * time in ms  before expiration to renew the secure channel<br>
	 * C type : UA_Int32
	 */
	@Field(2) 
	public UA_ClientConfig timeToRenewSecureChannel(int timeToRenewSecureChannel) {
		this.io.setIntField(this, 2, timeToRenewSecureChannel);
		return this;
	}
	/** C type : UA_ConnectionConfig */
	@Field(3) 
	public UA_ConnectionConfig localConnectionConfig() {
		return this.io.getNativeObjectField(this, 3);
	}
	/** C type : UA_ConnectionConfig */
	@Field(3) 
	public UA_ClientConfig localConnectionConfig(UA_ConnectionConfig localConnectionConfig) {
		this.io.setNativeObjectField(this, 3, localConnectionConfig);
		return this;
	}
	public UA_ClientConfig() {
		super();
	}
	public UA_ClientConfig(Pointer pointer) {
		super(pointer);
	}
}
