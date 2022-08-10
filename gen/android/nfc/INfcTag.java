/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.nfc;
/**
 * @hide
 */
public interface INfcTag extends android.os.IInterface
{
  /** Default implementation for INfcTag. */
  public static class Default implements android.nfc.INfcTag
  {
    @Override public int connect(int nativeHandle, int technology) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int reconnect(int nativeHandle) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int[] getTechList(int nativeHandle) throws android.os.RemoteException
    {
      return null;
    }
    @Override public boolean isNdef(int nativeHandle) throws android.os.RemoteException
    {
      return false;
    }
    @Override public boolean isPresent(int nativeHandle) throws android.os.RemoteException
    {
      return false;
    }
    @Override public android.nfc.TransceiveResult transceive(int nativeHandle, byte[] data, boolean raw) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.nfc.NdefMessage ndefRead(int nativeHandle) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int ndefWrite(int nativeHandle, android.nfc.NdefMessage msg) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int ndefMakeReadOnly(int nativeHandle) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public boolean ndefIsWritable(int nativeHandle) throws android.os.RemoteException
    {
      return false;
    }
    @Override public int formatNdef(int nativeHandle, byte[] key) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public android.nfc.Tag rediscover(int nativehandle) throws android.os.RemoteException
    {
      return null;
    }
    @Override public int setTimeout(int technology, int timeout) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getTimeout(int technology) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void resetTimeouts() throws android.os.RemoteException
    {
    }
    @Override public boolean canMakeReadOnly(int ndefType) throws android.os.RemoteException
    {
      return false;
    }
    @Override public int getMaxTransceiveLength(int technology) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public boolean getExtendedLengthApdusSupported() throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.nfc.INfcTag
  {
    private static final java.lang.String DESCRIPTOR = "android.nfc.INfcTag";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.nfc.INfcTag interface,
     * generating a proxy if needed.
     */
    public static android.nfc.INfcTag asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.nfc.INfcTag))) {
        return ((android.nfc.INfcTag)iin);
      }
      return new android.nfc.INfcTag.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_connect:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.connect(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_reconnect:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.reconnect(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getTechList:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int[] _result = this.getTechList(_arg0);
          reply.writeNoException();
          reply.writeIntArray(_result);
          return true;
        }
        case TRANSACTION_isNdef:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.isNdef(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_isPresent:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.isPresent(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_transceive:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          boolean _arg2;
          _arg2 = (0!=data.readInt());
          android.nfc.TransceiveResult _result = this.transceive(_arg0, _arg1, _arg2);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_ndefRead:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.nfc.NdefMessage _result = this.ndefRead(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_ndefWrite:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.nfc.NdefMessage _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.nfc.NdefMessage.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _result = this.ndefWrite(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_ndefMakeReadOnly:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.ndefMakeReadOnly(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_ndefIsWritable:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.ndefIsWritable(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_formatNdef:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.formatNdef(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_rediscover:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.nfc.Tag _result = this.rediscover(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_setTimeout:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.setTimeout(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getTimeout:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getTimeout(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_resetTimeouts:
        {
          data.enforceInterface(descriptor);
          this.resetTimeouts();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_canMakeReadOnly:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.canMakeReadOnly(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getMaxTransceiveLength:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getMaxTransceiveLength(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getExtendedLengthApdusSupported:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.getExtendedLengthApdusSupported();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.nfc.INfcTag
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public int connect(int nativeHandle, int technology) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          _data.writeInt(technology);
          boolean _status = mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().connect(nativeHandle, technology);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int reconnect(int nativeHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reconnect, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().reconnect(nativeHandle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int[] getTechList(int nativeHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTechList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTechList(nativeHandle);
          }
          _reply.readException();
          _result = _reply.createIntArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean isNdef(int nativeHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isNdef, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isNdef(nativeHandle);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean isPresent(int nativeHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isPresent, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isPresent(nativeHandle);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.nfc.TransceiveResult transceive(int nativeHandle, byte[] data, boolean raw) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.nfc.TransceiveResult _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          _data.writeByteArray(data);
          _data.writeInt(((raw)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_transceive, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().transceive(nativeHandle, data, raw);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.nfc.TransceiveResult.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.nfc.NdefMessage ndefRead(int nativeHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.nfc.NdefMessage _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ndefRead, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ndefRead(nativeHandle);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.nfc.NdefMessage.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int ndefWrite(int nativeHandle, android.nfc.NdefMessage msg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          if ((msg!=null)) {
            _data.writeInt(1);
            msg.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_ndefWrite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ndefWrite(nativeHandle, msg);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int ndefMakeReadOnly(int nativeHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ndefMakeReadOnly, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ndefMakeReadOnly(nativeHandle);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean ndefIsWritable(int nativeHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ndefIsWritable, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().ndefIsWritable(nativeHandle);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int formatNdef(int nativeHandle, byte[] key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativeHandle);
          _data.writeByteArray(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_formatNdef, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().formatNdef(nativeHandle, key);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.nfc.Tag rediscover(int nativehandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.nfc.Tag _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nativehandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rediscover, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().rediscover(nativehandle);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = android.nfc.Tag.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int setTimeout(int technology, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(technology);
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTimeout, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().setTimeout(technology, timeout);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getTimeout(int technology) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(technology);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTimeout, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTimeout(technology);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void resetTimeouts() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resetTimeouts, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().resetTimeouts();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean canMakeReadOnly(int ndefType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(ndefType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_canMakeReadOnly, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().canMakeReadOnly(ndefType);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getMaxTransceiveLength(int technology) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(technology);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMaxTransceiveLength, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getMaxTransceiveLength(technology);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean getExtendedLengthApdusSupported() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getExtendedLengthApdusSupported, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getExtendedLengthApdusSupported();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static android.nfc.INfcTag sDefaultImpl;
    }
    static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_reconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getTechList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_isNdef = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_isPresent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_transceive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_ndefRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_ndefWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_ndefMakeReadOnly = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_ndefIsWritable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_formatNdef = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_rediscover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_resetTimeouts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_canMakeReadOnly = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getMaxTransceiveLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getExtendedLengthApdusSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    public static boolean setDefaultImpl(android.nfc.INfcTag impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static android.nfc.INfcTag getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public int connect(int nativeHandle, int technology) throws android.os.RemoteException;
  public int reconnect(int nativeHandle) throws android.os.RemoteException;
  public int[] getTechList(int nativeHandle) throws android.os.RemoteException;
  public boolean isNdef(int nativeHandle) throws android.os.RemoteException;
  public boolean isPresent(int nativeHandle) throws android.os.RemoteException;
  public android.nfc.TransceiveResult transceive(int nativeHandle, byte[] data, boolean raw) throws android.os.RemoteException;
  public android.nfc.NdefMessage ndefRead(int nativeHandle) throws android.os.RemoteException;
  public int ndefWrite(int nativeHandle, android.nfc.NdefMessage msg) throws android.os.RemoteException;
  public int ndefMakeReadOnly(int nativeHandle) throws android.os.RemoteException;
  public boolean ndefIsWritable(int nativeHandle) throws android.os.RemoteException;
  public int formatNdef(int nativeHandle, byte[] key) throws android.os.RemoteException;
  public android.nfc.Tag rediscover(int nativehandle) throws android.os.RemoteException;
  public int setTimeout(int technology, int timeout) throws android.os.RemoteException;
  public int getTimeout(int technology) throws android.os.RemoteException;
  public void resetTimeouts() throws android.os.RemoteException;
  public boolean canMakeReadOnly(int ndefType) throws android.os.RemoteException;
  public int getMaxTransceiveLength(int technology) throws android.os.RemoteException;
  public boolean getExtendedLengthApdusSupported() throws android.os.RemoteException;
}
