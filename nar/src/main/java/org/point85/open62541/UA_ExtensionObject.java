package org.point85.open62541;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : open62541.h:534</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_ExtensionObject extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_NodeId */
	@Field(0) 
	public UA_NodeId typeId() {
		return this.io.getNativeObjectField(this, 0);
	}
	/** C type : UA_NodeId */
	@Field(0) 
	public UA_ExtensionObject typeId(UA_NodeId typeId) {
		this.io.setNativeObjectField(this, 0, typeId);
		return this;
	}
	/** C type : encoding_enum */
	@Field(1) 
	public IntValuedEnum<UA_ExtensionObject.encoding_enum > encoding() {
		return this.io.getEnumField(this, 1);
	}
	/** C type : encoding_enum */
	@Field(1) 
	public UA_ExtensionObject encoding(IntValuedEnum<UA_ExtensionObject.encoding_enum > encoding) {
		this.io.setEnumField(this, 1, encoding);
		return this;
	}
	/**
	 * contains either the bytestring or a pointer to the memory-object<br>
	 * C type : UA_ByteString
	 */
	@Field(2) 
	public UA_String body() {
		return this.io.getNativeObjectField(this, 2);
	}
	/**
	 * contains either the bytestring or a pointer to the memory-object<br>
	 * C type : UA_ByteString
	 */
	@Field(2) 
	public UA_ExtensionObject body(UA_String body) {
		this.io.setNativeObjectField(this, 2, body);
		return this;
	}
	/**
	 * enum values<br>
	 * <i>native declaration : open62541.h:533</i>
	 */
	public enum encoding_enum implements IntValuedEnum<encoding_enum > {
		UA_EXTENSIONOBJECT_ENCODINGMASK_NOBODYISENCODED(0),
		UA_EXTENSIONOBJECT_ENCODINGMASK_BODYISBYTESTRING(1),
		UA_EXTENSIONOBJECT_ENCODINGMASK_BODYISXML(2);
		encoding_enum(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<encoding_enum > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<encoding_enum > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	public UA_ExtensionObject() {
		super();
	}
	public UA_ExtensionObject(Pointer pointer) {
		super(pointer);
	}
}
