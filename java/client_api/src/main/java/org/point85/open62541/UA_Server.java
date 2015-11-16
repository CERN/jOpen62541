package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * The actual struct is not used in the client API<br>
 * <i>native declaration : wrapper62541.h:3</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_Server extends StructObject {
	static {
		BridJ.register();
	}
	@Field(0) 
	public int i() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public UA_Server i(int i) {
		this.io.setIntField(this, 0, i);
		return this;
	}
	public UA_Server() {
		super();
	}
	public UA_Server(Pointer pointer) {
		super(pointer);
	}
}
