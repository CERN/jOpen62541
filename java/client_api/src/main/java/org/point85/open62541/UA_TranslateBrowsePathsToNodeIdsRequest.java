package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:1679</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_TranslateBrowsePathsToNodeIdsRequest extends StructObject {
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
	public UA_TranslateBrowsePathsToNodeIdsRequest requestHeader(UA_RequestHeader requestHeader) {
		this.io.setNativeObjectField(this, 0, requestHeader);
		return this;
	}
	/** C type : UA_Int32 */
	@Field(1) 
	public int browsePathsSize() {
		return this.io.getIntField(this, 1);
	}
	/** C type : UA_Int32 */
	@Field(1) 
	public UA_TranslateBrowsePathsToNodeIdsRequest browsePathsSize(int browsePathsSize) {
		this.io.setIntField(this, 1, browsePathsSize);
		return this;
	}
	/** C type : UA_BrowsePath* */
	@Field(2) 
	public Pointer<UA_BrowsePath > browsePaths() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : UA_BrowsePath* */
	@Field(2) 
	public UA_TranslateBrowsePathsToNodeIdsRequest browsePaths(Pointer<UA_BrowsePath > browsePaths) {
		this.io.setPointerField(this, 2, browsePaths);
		return this;
	}
	public UA_TranslateBrowsePathsToNodeIdsRequest() {
		super();
	}
	public UA_TranslateBrowsePathsToNodeIdsRequest(Pointer pointer) {
		super(pointer);
	}
}
