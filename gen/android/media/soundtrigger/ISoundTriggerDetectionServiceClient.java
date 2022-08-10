/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.media.soundtrigger;
/**
 * AIDL for the callbacks from a ISoundTriggerDetectionService.
 *
 * {@hide}
 */
public interface ISoundTriggerDetectionServiceClient extends android.os.IInterface
{
  /** Default implementation for ISoundTriggerDetectionServiceClient. */
  public static class Default implements android.media.soundtrigger.ISoundTriggerDetectionServiceClient
  {
    @Override public void onOpFinished(int opId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger.ISoundTriggerDetectionServiceClient
  {
    private static final java.lang.String DESCRIPTOR = "android.media.soundtrigger.ISoundTriggerDetectionServiceClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.media.soundtrigger.ISoundTriggerDetectionServiceClient interface,
     * generating a proxy if needed.
     */
    public static android.media.soundtrigger.ISoundTriggerDetectionServiceClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.media.soundtrigger.ISoundTriggerDetectionServiceClient))) {
        return ((android.media.soundtrigger.ISoundTriggerDetectionServiceClient)iin);
      }
      return new android.media.soundtrigger.ISoundTriggerDetectionServiceClient.Stub.Proxy(obj);
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
        case TRANSACTION_onOpFinished:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onOpFinished(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.media.soundtrigger.ISoundTriggerDetectionServiceClient
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
      @Override public void onOpFinished(int opId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(opId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onOpFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onOpFinished(opId);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static android.media.soundtrigger.ISoundTriggerDetectionServiceClient sDefaultImpl;
    }
    static final int TRANSACTION_onOpFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(android.media.soundtrigger.ISoundTriggerDetectionServiceClient impl) {
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
    public static android.media.soundtrigger.ISoundTriggerDetectionServiceClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void onOpFinished(int opId) throws android.os.RemoteException;
}
