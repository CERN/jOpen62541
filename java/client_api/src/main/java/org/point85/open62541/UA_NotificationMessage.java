package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:1826</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_NotificationMessage extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_UInt32 */
	@Field(0) 
	public int sequenceNumber() {
		return this.io.getIntField(this, 0);
	}
	/** C type : UA_UInt32 */
	@Field(0) 
	public UA_NotificationMessage sequenceNumber(int sequenceNumber) {
		this.io.setIntField(this, 0, sequenceNumber);
		return this;
	}
	/** C type : UA_DateTime */
	@Field(1) 
	public long publishTime() {
		return this.io.getLongField(this, 1);
	}
	/** C type : UA_DateTime */
	@Field(1) 
	public UA_NotificationMessage publishTime(long publishTime) {
		this.io.setLongField(this, 1, publishTime);
		return this;
	}
	/** C type : UA_Int32 */
	@Field(2) 
	public int notificationDataSize() {
		return this.io.getIntField(this, 2);
	}
	/** C type : UA_Int32 */
	@Field(2) 
	public UA_NotificationMessage notificationDataSize(int notificationDataSize) {
		this.io.setIntField(this, 2, notificationDataSize);
		return this;
	}
	/** C type : UA_ExtensionObject* */
	@Field(3) 
	public Pointer<UA_ExtensionObject > notificationData() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : UA_ExtensionObject* */
	@Field(3) 
	public UA_NotificationMessage notificationData(Pointer<UA_ExtensionObject > notificationData) {
		this.io.setPointerField(this, 3, notificationData);
		return this;
	}
	public UA_NotificationMessage() {
		super();
	}
	public UA_NotificationMessage(Pointer pointer) {
		super(pointer);
	}
}
