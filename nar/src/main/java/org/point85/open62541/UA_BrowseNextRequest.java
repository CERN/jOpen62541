package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:1637</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_BrowseNextRequest extends StructObject {
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
	public UA_BrowseNextRequest requestHeader(UA_RequestHeader requestHeader) {
		this.io.setNativeObjectField(this, 0, requestHeader);
		return this;
	}
	/** C type : UA_Boolean */
	@Field(1) 
	public boolean releaseContinuationPoints() {
		return this.io.getBooleanField(this, 1);
	}
	/** C type : UA_Boolean */
	@Field(1) 
	public UA_BrowseNextRequest releaseContinuationPoints(boolean releaseContinuationPoints) {
		this.io.setBooleanField(this, 1, releaseContinuationPoints);
		return this;
	}
	/** C type : UA_Int32 */
	@Field(2) 
	public int continuationPointsSize() {
		return this.io.getIntField(this, 2);
	}
	/** C type : UA_Int32 */
	@Field(2) 
	public UA_BrowseNextRequest continuationPointsSize(int continuationPointsSize) {
		this.io.setIntField(this, 2, continuationPointsSize);
		return this;
	}
	/** C type : UA_ByteString* */
	@Field(3) 
	public Pointer<UA_String > continuationPoints() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : UA_ByteString* */
	@Field(3) 
	public UA_BrowseNextRequest continuationPoints(Pointer<UA_String > continuationPoints) {
		this.io.setPointerField(this, 3, continuationPoints);
		return this;
	}
	public UA_BrowseNextRequest() {
		super();
	}
	public UA_BrowseNextRequest(Pointer pointer) {
		super(pointer);
	}
}
