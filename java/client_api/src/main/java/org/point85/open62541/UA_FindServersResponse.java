package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:1205</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_FindServersResponse extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_ResponseHeader */
	@Field(0) 
	public UA_ResponseHeader responseHeader() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : UA_ResponseHeader */
	@Field(0) 
	public UA_FindServersResponse responseHeader(UA_ResponseHeader responseHeader) {
		this.io.setNativeObjectField(this, 0, responseHeader);
		return this;
	}
	/** C type : UA_Int32 */
	@Field(1) 
	public int serversSize() {
		return this.io.getIntField(this, 1);
	}
	/** C type : UA_Int32 */
	@Field(1) 
	public UA_FindServersResponse serversSize(int serversSize) {
		this.io.setIntField(this, 1, serversSize);
		return this;
	}
	/** C type : UA_ApplicationDescription* */
	@Field(2) 
	public Pointer<UA_ApplicationDescription > servers() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : UA_ApplicationDescription* */
	@Field(2) 
	public UA_FindServersResponse servers(Pointer<UA_ApplicationDescription > servers) {
		this.io.setPointerField(this, 2, servers);
		return this;
	}
	public UA_FindServersResponse() {
		super();
	}
	public UA_FindServersResponse(Pointer pointer) {
		super(pointer);
	}
}
