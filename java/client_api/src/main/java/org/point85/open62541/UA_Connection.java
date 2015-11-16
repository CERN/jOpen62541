package org.point85.open62541;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.point85.open62541.Open62541ExtLibrary.UA_ConnectionState;
import org.point85.open62541.Open62541ExtLibrary.UA_SecureChannel;
import org.point85.open62541.Open62541ExtLibrary.UA_StatusCode;
/**
 * The connection to a single client (or server). The connection is defined independent of the<br>
 * underlying network layer implementation. This allows a plugging-in custom implementations (e.g.<br>
 * an embedded TCP stack)<br>
 * <i>native declaration : open62541.h:1931</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Open62541Ext") 
public class UA_Connection extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : UA_ConnectionState */
	@Field(0) 
	public IntValuedEnum<UA_ConnectionState > state() {
		return this.io.getEnumField(this, 0);
	}
	/** C type : UA_ConnectionState */
	@Field(0) 
	public UA_Connection state(IntValuedEnum<UA_ConnectionState > state) {
		this.io.setEnumField(this, 0, state);
		return this;
	}
	/** C type : UA_ConnectionConfig */
	@Field(1) 
	public UA_ConnectionConfig localConf() {
		return this.io.getNativeObjectField(this, 1);
	}
	/** C type : UA_ConnectionConfig */
	@Field(1) 
	public UA_Connection localConf(UA_ConnectionConfig localConf) {
		this.io.setNativeObjectField(this, 1, localConf);
		return this;
	}
	/** C type : UA_ConnectionConfig */
	@Field(2) 
	public UA_ConnectionConfig remoteConf() {
		return this.io.getNativeObjectField(this, 2);
	}
	/** C type : UA_ConnectionConfig */
	@Field(2) 
	public UA_Connection remoteConf(UA_ConnectionConfig remoteConf) {
		this.io.setNativeObjectField(this, 2, remoteConf);
		return this;
	}
	/**
	 * > The securechannel that is attached to this connection (or null)<br>
	 * C type : UA_SecureChannel*
	 */
	@Field(3) 
	public Pointer<UA_SecureChannel > channel() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * > The securechannel that is attached to this connection (or null)<br>
	 * C type : UA_SecureChannel*
	 */
	@Field(3) 
	public UA_Connection channel(Pointer<UA_SecureChannel > channel) {
		this.io.setPointerField(this, 3, channel);
		return this;
	}
	/**
	 * > Most connectivity solutions run on sockets. Having the socket id here simplifies the design.<br>
	 * C type : UA_Int32
	 */
	@Field(4) 
	public int sockfd() {
		return this.io.getIntField(this, 4);
	}
	/**
	 * > Most connectivity solutions run on sockets. Having the socket id here simplifies the design.<br>
	 * C type : UA_Int32
	 */
	@Field(4) 
	public UA_Connection sockfd(int sockfd) {
		this.io.setIntField(this, 4, sockfd);
		return this;
	}
	/**
	 * > A pointer to the networklayer<br>
	 * C type : void*
	 */
	@Field(5) 
	public Pointer<? > handle() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * > A pointer to the networklayer<br>
	 * C type : void*
	 */
	@Field(5) 
	public UA_Connection handle(Pointer<? > handle) {
		this.io.setPointerField(this, 5, handle);
		return this;
	}
	/**
	 * > Half-received messages (tcp is a streaming protocol) get stored here<br>
	 * C type : UA_ByteString
	 */
	@Field(6) 
	public UA_String incompleteMessage() {
		return this.io.getNativeObjectField(this, 6);
	}
	/**
	 * > Half-received messages (tcp is a streaming protocol) get stored here<br>
	 * C type : UA_ByteString
	 */
	@Field(6) 
	public UA_Connection incompleteMessage(UA_String incompleteMessage) {
		this.io.setNativeObjectField(this, 6, incompleteMessage);
		return this;
	}
	/**
	 * > Attach the data array to the buffer. Fails if minSize is larger than remoteConf allows<br>
	 * C type : getBuffer_callback*
	 */
	@Field(7) 
	public Pointer<UA_Connection.getBuffer_callback > getBuffer() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * > Attach the data array to the buffer. Fails if minSize is larger than remoteConf allows<br>
	 * C type : getBuffer_callback*
	 */
	@Field(7) 
	public UA_Connection getBuffer(Pointer<UA_Connection.getBuffer_callback > getBuffer) {
		this.io.setPointerField(this, 7, getBuffer);
		return this;
	}
	/**
	 * > Release the buffer<br>
	 * C type : releaseBuffer_callback*
	 */
	@Field(8) 
	public Pointer<UA_Connection.releaseBuffer_callback > releaseBuffer() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * > Release the buffer<br>
	 * C type : releaseBuffer_callback*
	 */
	@Field(8) 
	public UA_Connection releaseBuffer(Pointer<UA_Connection.releaseBuffer_callback > releaseBuffer) {
		this.io.setPointerField(this, 8, releaseBuffer);
		return this;
	}
	/**
	 * > The bytestrings cannot be reused after sending!<br>
	 * C type : write_callback*
	 */
	@Field(9) 
	public Pointer<org.point85.open62541.UA_DataSource.write_callback > write() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * > The bytestrings cannot be reused after sending!<br>
	 * C type : write_callback*
	 */
	@Field(9) 
	public UA_Connection write(Pointer<org.point85.open62541.UA_DataSource.write_callback > write) {
		this.io.setPointerField(this, 9, write);
		return this;
	}
	/** C type : recv_callback* */
	@Field(10) 
	public Pointer<UA_Connection.recv_callback > recv() {
		return this.io.getPointerField(this, 10);
	}
	/** C type : recv_callback* */
	@Field(10) 
	public UA_Connection recv(Pointer<UA_Connection.recv_callback > recv) {
		this.io.setPointerField(this, 10, recv);
		return this;
	}
	/** C type : close_callback* */
	@Field(11) 
	public Pointer<UA_Connection.close_callback > close() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : close_callback* */
	@Field(11) 
	public UA_Connection close(Pointer<UA_Connection.close_callback > close) {
		this.io.setPointerField(this, 11, close);
		return this;
	}
	/** <i>native declaration : open62541.h:1926</i> */
	public static abstract class getBuffer_callback extends Callback<getBuffer_callback > {
		public IntValuedEnum<UA_StatusCode > apply(Pointer<UA_Connection > connection, Pointer<UA_String > buf, @Ptr long minSize) {
			return FlagSet.fromValue(apply(Pointer.getPeer(connection), Pointer.getPeer(buf), minSize), UA_StatusCode.class);
		}
		public int apply(@Ptr long connection, @Ptr long buf, @Ptr long minSize) {
			return (int)apply((Pointer)Pointer.pointerToAddress(connection, UA_Connection.class), (Pointer)Pointer.pointerToAddress(buf, UA_String.class), minSize).value();
		}
	};
	/** <i>native declaration : open62541.h:1927</i> */
	public static abstract class releaseBuffer_callback extends Callback<releaseBuffer_callback > {
		public void apply(Pointer<UA_Connection > connection, Pointer<UA_String > buf) {
			apply(Pointer.getPeer(connection), Pointer.getPeer(buf));
		}
		public void apply(@Ptr long connection, @Ptr long buf) {
			apply((Pointer)Pointer.pointerToAddress(connection, UA_Connection.class), (Pointer)Pointer.pointerToAddress(buf, UA_String.class));
		}
	};
	/** <i>native declaration : open62541.h:1928</i> */
	public static abstract class write_callback extends Callback<write_callback > {
		public IntValuedEnum<UA_StatusCode > apply(Pointer<UA_Connection > connection, Pointer<UA_String > buf) {
			return FlagSet.fromValue(apply(Pointer.getPeer(connection), Pointer.getPeer(buf)), UA_StatusCode.class);
		}
		public int apply(@Ptr long connection, @Ptr long buf) {
			return (int)apply((Pointer)Pointer.pointerToAddress(connection, UA_Connection.class), (Pointer)Pointer.pointerToAddress(buf, UA_String.class)).value();
		}
	};
	/** <i>native declaration : open62541.h:1929</i> */
	public static abstract class recv_callback extends Callback<recv_callback > {
		public IntValuedEnum<UA_StatusCode > apply(Pointer<UA_Connection > connection, Pointer<UA_String > response, int timeout) {
			return FlagSet.fromValue(apply(Pointer.getPeer(connection), Pointer.getPeer(response), timeout), UA_StatusCode.class);
		}
		public int apply(@Ptr long connection, @Ptr long response, int timeout) {
			return (int)apply((Pointer)Pointer.pointerToAddress(connection, UA_Connection.class), (Pointer)Pointer.pointerToAddress(response, UA_String.class), timeout).value();
		}
	};
	/** <i>native declaration : open62541.h:1930</i> */
	public static abstract class close_callback extends Callback<close_callback > {
		public void apply(Pointer<UA_Connection > connection) {
			apply(Pointer.getPeer(connection));
		}
		public void apply(@Ptr long connection) {
			apply((Pointer)Pointer.pointerToAddress(connection, UA_Connection.class));
		}
	};
	public UA_Connection() {
		super();
	}
	public UA_Connection(Pointer pointer) {
		super(pointer);
	}
}
