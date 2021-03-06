package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:1176</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_RequestHeader extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_NodeId */
	@Field(0) 
	public UA_NodeId authenticationToken() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : UA_NodeId */
	@Field(0) 
	public UA_RequestHeader authenticationToken(UA_NodeId authenticationToken) {
		this.io.setNativeObjectField(this, 0, authenticationToken);
		return this;
	}
	/** C type : UA_DateTime */
	@Field(1) 
	public long timestamp() {
		return this.io.getLongField(this, 1);
	}
	/** C type : UA_DateTime */
	@Field(1) 
	public UA_RequestHeader timestamp(long timestamp) {
		this.io.setLongField(this, 1, timestamp);
		return this;
	}
	/** C type : UA_UInt32 */
	@Field(2) 
	public int requestHandle() {
		return this.io.getIntField(this, 2);
	}
	/** C type : UA_UInt32 */
	@Field(2) 
	public UA_RequestHeader requestHandle(int requestHandle) {
		this.io.setIntField(this, 2, requestHandle);
		return this;
	}
	/** C type : UA_UInt32 */
	@Field(3) 
	public int returnDiagnostics() {
		return this.io.getIntField(this, 3);
	}
	/** C type : UA_UInt32 */
	@Field(3) 
	public UA_RequestHeader returnDiagnostics(int returnDiagnostics) {
		this.io.setIntField(this, 3, returnDiagnostics);
		return this;
	}
	/** C type : UA_String */
	@Field(4) 
	public UA_String auditEntryId() {
		return this.io.getNativeObjectField(this, 4);
	}
	/** C type : UA_String */
	@Field(4) 
	public UA_RequestHeader auditEntryId(UA_String auditEntryId) {
		this.io.setNativeObjectField(this, 4, auditEntryId);
		return this;
	}
	/** C type : UA_UInt32 */
	@Field(5) 
	public int timeoutHint() {
		return this.io.getIntField(this, 5);
	}
	/** C type : UA_UInt32 */
	@Field(5) 
	public UA_RequestHeader timeoutHint(int timeoutHint) {
		this.io.setIntField(this, 5, timeoutHint);
		return this;
	}
	/** C type : UA_ExtensionObject */
	@Field(6) 
	public UA_ExtensionObject additionalHeader() {
		return this.io.getNativeObjectField(this, 6);
	}
	/** C type : UA_ExtensionObject */
	@Field(6) 
	public UA_RequestHeader additionalHeader(UA_ExtensionObject additionalHeader) {
		this.io.setNativeObjectField(this, 6, additionalHeader);
		return this;
	}
	public UA_RequestHeader() {
		super();
	}
	public UA_RequestHeader(Pointer pointer) {
		super(pointer);
	}
}
