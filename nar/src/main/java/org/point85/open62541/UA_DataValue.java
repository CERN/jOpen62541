package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Bits;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.point85.open62541.Open62541ExtLibrary.UA_StatusCode;
/**
 * <i>native declaration : open62541.h:595</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_DataValue extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_Boolean */
	@Field(0) 
	@Bits(1) 
	public boolean hasValue() {
		return this.io.getBooleanField(this, 0);
	}
	/** C type : UA_Boolean */
	@Field(0) 
	@Bits(1) 
	public UA_DataValue hasValue(boolean hasValue) {
		this.io.setBooleanField(this, 0, hasValue);
		return this;
	}
	/** C type : UA_Boolean */
	@Field(1) 
	@Bits(1) 
	public boolean hasStatus() {
		return this.io.getBooleanField(this, 1);
	}
	/** C type : UA_Boolean */
	@Field(1) 
	@Bits(1) 
	public UA_DataValue hasStatus(boolean hasStatus) {
		this.io.setBooleanField(this, 1, hasStatus);
		return this;
	}
	/** C type : UA_Boolean */
	@Field(2) 
	@Bits(1) 
	public boolean hasSourceTimestamp() {
		return this.io.getBooleanField(this, 2);
	}
	/** C type : UA_Boolean */
	@Field(2) 
	@Bits(1) 
	public UA_DataValue hasSourceTimestamp(boolean hasSourceTimestamp) {
		this.io.setBooleanField(this, 2, hasSourceTimestamp);
		return this;
	}
	/** C type : UA_Boolean */
	@Field(3) 
	@Bits(1) 
	public boolean hasServerTimestamp() {
		return this.io.getBooleanField(this, 3);
	}
	/** C type : UA_Boolean */
	@Field(3) 
	@Bits(1) 
	public UA_DataValue hasServerTimestamp(boolean hasServerTimestamp) {
		this.io.setBooleanField(this, 3, hasServerTimestamp);
		return this;
	}
	/** C type : UA_Boolean */
	@Field(4) 
	@Bits(1) 
	public boolean hasSourcePicoseconds() {
		return this.io.getBooleanField(this, 4);
	}
	/** C type : UA_Boolean */
	@Field(4) 
	@Bits(1) 
	public UA_DataValue hasSourcePicoseconds(boolean hasSourcePicoseconds) {
		this.io.setBooleanField(this, 4, hasSourcePicoseconds);
		return this;
	}
	/** C type : UA_Boolean */
	@Field(5) 
	@Bits(1) 
	public boolean hasServerPicoseconds() {
		return this.io.getBooleanField(this, 5);
	}
	/** C type : UA_Boolean */
	@Field(5) 
	@Bits(1) 
	public UA_DataValue hasServerPicoseconds(boolean hasServerPicoseconds) {
		this.io.setBooleanField(this, 5, hasServerPicoseconds);
		return this;
	}
	/** C type : UA_Variant */
	@Field(6) 
	public UA_Variant value() {
		return this.io.getNativeObjectField(this, 6);
	}
	/** C type : UA_Variant */
	@Field(6) 
	public UA_DataValue value(UA_Variant value) {
		this.io.setNativeObjectField(this, 6, value);
		return this;
	}
	/** C type : UA_StatusCode */
	@Field(7) 
	public IntValuedEnum<UA_StatusCode > status() {
		return this.io.getEnumField(this, 7);
	}
	/** C type : UA_StatusCode */
	@Field(7) 
	public UA_DataValue status(IntValuedEnum<UA_StatusCode > status) {
		this.io.setEnumField(this, 7, status);
		return this;
	}
	/** C type : UA_DateTime */
	@Field(8) 
	public long sourceTimestamp() {
		return this.io.getLongField(this, 8);
	}
	/** C type : UA_DateTime */
	@Field(8) 
	public UA_DataValue sourceTimestamp(long sourceTimestamp) {
		this.io.setLongField(this, 8, sourceTimestamp);
		return this;
	}
	/** C type : UA_Int16 */
	@Field(9) 
	public short sourcePicoseconds() {
		return this.io.getShortField(this, 9);
	}
	/** C type : UA_Int16 */
	@Field(9) 
	public UA_DataValue sourcePicoseconds(short sourcePicoseconds) {
		this.io.setShortField(this, 9, sourcePicoseconds);
		return this;
	}
	/** C type : UA_DateTime */
	@Field(10) 
	public long serverTimestamp() {
		return this.io.getLongField(this, 10);
	}
	/** C type : UA_DateTime */
	@Field(10) 
	public UA_DataValue serverTimestamp(long serverTimestamp) {
		this.io.setLongField(this, 10, serverTimestamp);
		return this;
	}
	/** C type : UA_Int16 */
	@Field(11) 
	public short serverPicoseconds() {
		return this.io.getShortField(this, 11);
	}
	/** C type : UA_Int16 */
	@Field(11) 
	public UA_DataValue serverPicoseconds(short serverPicoseconds) {
		this.io.setShortField(this, 11, serverPicoseconds);
		return this;
	}
	public UA_DataValue() {
		super();
	}
	public UA_DataValue(Pointer pointer) {
		super(pointer);
	}
}
