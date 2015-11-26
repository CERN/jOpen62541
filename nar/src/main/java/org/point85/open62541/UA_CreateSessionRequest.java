package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:1312</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_CreateSessionRequest extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_RequestHeader */
	@Field(0) 
	public UA_RequestHeader requestHeader() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : UA_RequestHeader */
	@Field(0) 
	public UA_CreateSessionRequest requestHeader(UA_RequestHeader requestHeader) {
		this.io.setNativeObjectField(this, 0, requestHeader);
		return this;
	}
	/** C type : UA_ApplicationDescription */
	@Field(1) 
	public UA_ApplicationDescription clientDescription() {
		return this.io.getNativeObjectField(this, 1);
	}
	/** C type : UA_ApplicationDescription */
	@Field(1) 
	public UA_CreateSessionRequest clientDescription(UA_ApplicationDescription clientDescription) {
		this.io.setNativeObjectField(this, 1, clientDescription);
		return this;
	}
	/** C type : UA_String */
	@Field(2) 
	public UA_String serverUri() {
		return this.io.getNativeObjectField(this, 2);
	}
	/** C type : UA_String */
	@Field(2) 
	public UA_CreateSessionRequest serverUri(UA_String serverUri) {
		this.io.setNativeObjectField(this, 2, serverUri);
		return this;
	}
	/** C type : UA_String */
	@Field(3) 
	public UA_String endpointUrl() {
		return this.io.getNativeObjectField(this, 3);
	}
	/** C type : UA_String */
	@Field(3) 
	public UA_CreateSessionRequest endpointUrl(UA_String endpointUrl) {
		this.io.setNativeObjectField(this, 3, endpointUrl);
		return this;
	}
	/** C type : UA_String */
	@Field(4) 
	public UA_String sessionName() {
		return this.io.getNativeObjectField(this, 4);
	}
	/** C type : UA_String */
	@Field(4) 
	public UA_CreateSessionRequest sessionName(UA_String sessionName) {
		this.io.setNativeObjectField(this, 4, sessionName);
		return this;
	}
	/** C type : UA_ByteString */
	@Field(5) 
	public UA_String clientNonce() {
		return this.io.getNativeObjectField(this, 5);
	}
	/** C type : UA_ByteString */
	@Field(5) 
	public UA_CreateSessionRequest clientNonce(UA_String clientNonce) {
		this.io.setNativeObjectField(this, 5, clientNonce);
		return this;
	}
	/** C type : UA_ByteString */
	@Field(6) 
	public UA_String clientCertificate() {
		return this.io.getNativeObjectField(this, 6);
	}
	/** C type : UA_ByteString */
	@Field(6) 
	public UA_CreateSessionRequest clientCertificate(UA_String clientCertificate) {
		this.io.setNativeObjectField(this, 6, clientCertificate);
		return this;
	}
	/** C type : UA_Double */
	@Field(7) 
	public double requestedSessionTimeout() {
		return this.io.getDoubleField(this, 7);
	}
	/** C type : UA_Double */
	@Field(7) 
	public UA_CreateSessionRequest requestedSessionTimeout(double requestedSessionTimeout) {
		this.io.setDoubleField(this, 7, requestedSessionTimeout);
		return this;
	}
	/** C type : UA_UInt32 */
	@Field(8) 
	public int maxResponseMessageSize() {
		return this.io.getIntField(this, 8);
	}
	/** C type : UA_UInt32 */
	@Field(8) 
	public UA_CreateSessionRequest maxResponseMessageSize(int maxResponseMessageSize) {
		this.io.setIntField(this, 8, maxResponseMessageSize);
		return this;
	}
	public UA_CreateSessionRequest() {
		super();
	}
	public UA_CreateSessionRequest(Pointer pointer) {
		super(pointer);
	}
}