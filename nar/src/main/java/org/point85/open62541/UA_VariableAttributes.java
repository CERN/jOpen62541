package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:1440</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_VariableAttributes extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_UInt32 */
	@Field(0) 
	public int specifiedAttributes() {
		return this.io.getIntField(this, 0);
	}
	/** C type : UA_UInt32 */
	@Field(0) 
	public UA_VariableAttributes specifiedAttributes(int specifiedAttributes) {
		this.io.setIntField(this, 0, specifiedAttributes);
		return this;
	}
	/** C type : UA_LocalizedText */
	@Field(1) 
	public UA_LocalizedText displayName() {
		return this.io.getNativeObjectField(this, 1);
	}
	/** C type : UA_LocalizedText */
	@Field(1) 
	public UA_VariableAttributes displayName(UA_LocalizedText displayName) {
		this.io.setNativeObjectField(this, 1, displayName);
		return this;
	}
	/** C type : UA_LocalizedText */
	@Field(2) 
	public UA_LocalizedText description() {
		return this.io.getNativeObjectField(this, 2);
	}
	/** C type : UA_LocalizedText */
	@Field(2) 
	public UA_VariableAttributes description(UA_LocalizedText description) {
		this.io.setNativeObjectField(this, 2, description);
		return this;
	}
	/** C type : UA_UInt32 */
	@Field(3) 
	public int writeMask() {
		return this.io.getIntField(this, 3);
	}
	/** C type : UA_UInt32 */
	@Field(3) 
	public UA_VariableAttributes writeMask(int writeMask) {
		this.io.setIntField(this, 3, writeMask);
		return this;
	}
	/** C type : UA_UInt32 */
	@Field(4) 
	public int userWriteMask() {
		return this.io.getIntField(this, 4);
	}
	/** C type : UA_UInt32 */
	@Field(4) 
	public UA_VariableAttributes userWriteMask(int userWriteMask) {
		this.io.setIntField(this, 4, userWriteMask);
		return this;
	}
	/** C type : UA_Variant */
	@Field(5) 
	public UA_Variant value() {
		return this.io.getNativeObjectField(this, 5);
	}
	/** C type : UA_Variant */
	@Field(5) 
	public UA_VariableAttributes value(UA_Variant value) {
		this.io.setNativeObjectField(this, 5, value);
		return this;
	}
	/** C type : UA_NodeId */
	@Field(6) 
	public UA_NodeId dataType() {
		return this.io.getNativeObjectField(this, 6);
	}
	/** C type : UA_NodeId */
	@Field(6) 
	public UA_VariableAttributes dataType(UA_NodeId dataType) {
		this.io.setNativeObjectField(this, 6, dataType);
		return this;
	}
	/** C type : UA_Int32 */
	@Field(7) 
	public int valueRank() {
		return this.io.getIntField(this, 7);
	}
	/** C type : UA_Int32 */
	@Field(7) 
	public UA_VariableAttributes valueRank(int valueRank) {
		this.io.setIntField(this, 7, valueRank);
		return this;
	}
	/** C type : UA_Int32 */
	@Field(8) 
	public int arrayDimensionsSize() {
		return this.io.getIntField(this, 8);
	}
	/** C type : UA_Int32 */
	@Field(8) 
	public UA_VariableAttributes arrayDimensionsSize(int arrayDimensionsSize) {
		this.io.setIntField(this, 8, arrayDimensionsSize);
		return this;
	}
	/** C type : UA_UInt32* */
	@Field(9) 
	public Pointer<Integer > arrayDimensions() {
		return this.io.getPointerField(this, 9);
	}
	/** C type : UA_UInt32* */
	@Field(9) 
	public UA_VariableAttributes arrayDimensions(Pointer<Integer > arrayDimensions) {
		this.io.setPointerField(this, 9, arrayDimensions);
		return this;
	}
	/** C type : UA_Byte */
	@Field(10) 
	public byte accessLevel() {
		return this.io.getByteField(this, 10);
	}
	/** C type : UA_Byte */
	@Field(10) 
	public UA_VariableAttributes accessLevel(byte accessLevel) {
		this.io.setByteField(this, 10, accessLevel);
		return this;
	}
	/** C type : UA_Byte */
	@Field(11) 
	public byte userAccessLevel() {
		return this.io.getByteField(this, 11);
	}
	/** C type : UA_Byte */
	@Field(11) 
	public UA_VariableAttributes userAccessLevel(byte userAccessLevel) {
		this.io.setByteField(this, 11, userAccessLevel);
		return this;
	}
	/** C type : UA_Double */
	@Field(12) 
	public double minimumSamplingInterval() {
		return this.io.getDoubleField(this, 12);
	}
	/** C type : UA_Double */
	@Field(12) 
	public UA_VariableAttributes minimumSamplingInterval(double minimumSamplingInterval) {
		this.io.setDoubleField(this, 12, minimumSamplingInterval);
		return this;
	}
	/** C type : UA_Boolean */
	@Field(13) 
	public boolean historizing() {
		return this.io.getBooleanField(this, 13);
	}
	/** C type : UA_Boolean */
	@Field(13) 
	public UA_VariableAttributes historizing(boolean historizing) {
		this.io.setBooleanField(this, 13, historizing);
		return this;
	}
	public UA_VariableAttributes() {
		super();
	}
	public UA_VariableAttributes(Pointer pointer) {
		super(pointer);
	}
}
