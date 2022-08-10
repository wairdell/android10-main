/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.view.inputmethod.cts.util;
public interface IWindowFocusStealer extends android.os.IInterface
{
  /** Default implementation for IWindowFocusStealer. */
  public static class Default implements android.view.inputmethod.cts.util.IWindowFocusStealer
  {
    @Override public void stealWindowFocus(android.os.IBinder parentAppWindowToken, android.os.ResultReceiver resultReceiver) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.view.inputmethod.cts.util.IWindowFocusStealer
  {
    private static final java.lang.String DESCRIPTOR = "android.view.inputmethod.cts.util.IWindowFocusStealer";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.view.inputmethod.cts.util.IWindowFocusStealer interface,
     * generating a proxy if needed.
     */
    public static android.view.inputmethod.cts.util.IWindowFocusStealer asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.view.inputmethod.cts.util.IWindowFocusStealer))) {
        return ((android.view.inputmethod.cts.util.IWindowFocusStealer)iin);
      }
      return new android.view.inputmethod.cts.util.IWindowFocusStealer.Stub.Proxy(obj);
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
        case TRANSACTION_stealWindowFocus:
        {
          data.enforceInterface(descriptor);
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          android.os.ResultReceiver _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.ResultReceiver.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.stealWindowFocus(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.view.inputmethod.cts.util.IWindowFocusStealer
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
      @Override public void stealWindowFocus(android.os.IBinder parentAppWindowToken, android.os.ResultReceiver resultReceiver) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(parentAppWindowToken);
          if ((resultReceiver!=null)) {
            _data.writeInt(1);
            resultReceiver.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_stealWindowFocus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stealWindowFocus(parentAppWindowToken, resultReceiver);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static android.view.inputmethod.cts.util.IWindowFocusStealer sDefaultImpl;
    }
    static final int TRANSACTION_stealWindowFocus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(android.view.inputmethod.cts.util.IWindowFocusStealer impl) {
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
    public static android.view.inputmethod.cts.util.IWindowFocusStealer getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void stealWindowFocus(android.os.IBinder parentAppWindowToken, android.os.ResultReceiver resultReceiver) throws android.os.RemoteException;
}
