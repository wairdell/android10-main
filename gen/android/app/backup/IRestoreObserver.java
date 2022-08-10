/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.app.backup;
/**
 * Callback class for receiving progress reports during a restore operation.
 *
 * @hide
 */
public interface IRestoreObserver extends android.os.IInterface
{
  /** Default implementation for IRestoreObserver. */
  public static class Default implements android.app.backup.IRestoreObserver
  {
    /**
         * Supply a list of the restore datasets available from the current transport.  This
         * method is invoked as a callback following the application's use of the
         * {@link android.app.backup.IRestoreSession.getAvailableRestoreSets} method.
         *
         * @param result An array of {@link android.app.backup.RestoreSet RestoreSet} objects
         *   describing all of the available datasets that are candidates for restoring to
         *   the current device.  If no applicable datasets exist, {@code result} will be
         *   {@code null}.
         */
    @Override public void restoreSetsAvailable(android.app.backup.RestoreSet[] result) throws android.os.RemoteException
    {
    }
    /**
         * The restore operation has begun.
         *
         * @param numPackages The total number of packages being processed in
         *   this restore operation.
         */
    @Override public void restoreStarting(int numPackages) throws android.os.RemoteException
    {
    }
    /**
         * An indication of which package is being restored currently, out of the
         * total number provided in the {@link #restoreStarting(int numPackages)} callback.
         * This method is not guaranteed to be called.
         *
         * @param nowBeingRestored The index, between 1 and the numPackages parameter
         *   to the restoreStarting() callback, of the package now being restored.
         * @param currentPackage The name of the package now being restored.
         */
    @Override public void onUpdate(int nowBeingRestored, java.lang.String curentPackage) throws android.os.RemoteException
    {
    }
    /**
         * The restore operation has completed.
         *
         * @param error Zero on success; a nonzero error code if the restore operation
         *   as a whole failed.
         */
    @Override public void restoreFinished(int error) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.app.backup.IRestoreObserver
  {
    private static final java.lang.String DESCRIPTOR = "android.app.backup.IRestoreObserver";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.app.backup.IRestoreObserver interface,
     * generating a proxy if needed.
     */
    public static android.app.backup.IRestoreObserver asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.app.backup.IRestoreObserver))) {
        return ((android.app.backup.IRestoreObserver)iin);
      }
      return new android.app.backup.IRestoreObserver.Stub.Proxy(obj);
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
        case TRANSACTION_restoreSetsAvailable:
        {
          data.enforceInterface(descriptor);
          android.app.backup.RestoreSet[] _arg0;
          _arg0 = data.createTypedArray(android.app.backup.RestoreSet.CREATOR);
          this.restoreSetsAvailable(_arg0);
          return true;
        }
        case TRANSACTION_restoreStarting:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.restoreStarting(_arg0);
          return true;
        }
        case TRANSACTION_onUpdate:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onUpdate(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_restoreFinished:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.restoreFinished(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.app.backup.IRestoreObserver
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
      /**
           * Supply a list of the restore datasets available from the current transport.  This
           * method is invoked as a callback following the application's use of the
           * {@link android.app.backup.IRestoreSession.getAvailableRestoreSets} method.
           *
           * @param result An array of {@link android.app.backup.RestoreSet RestoreSet} objects
           *   describing all of the available datasets that are candidates for restoring to
           *   the current device.  If no applicable datasets exist, {@code result} will be
           *   {@code null}.
           */
      @Override public void restoreSetsAvailable(android.app.backup.RestoreSet[] result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(result, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restoreSetsAvailable, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().restoreSetsAvailable(result);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * The restore operation has begun.
           *
           * @param numPackages The total number of packages being processed in
           *   this restore operation.
           */
      @Override public void restoreStarting(int numPackages) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(numPackages);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restoreStarting, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().restoreStarting(numPackages);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * An indication of which package is being restored currently, out of the
           * total number provided in the {@link #restoreStarting(int numPackages)} callback.
           * This method is not guaranteed to be called.
           *
           * @param nowBeingRestored The index, between 1 and the numPackages parameter
           *   to the restoreStarting() callback, of the package now being restored.
           * @param currentPackage The name of the package now being restored.
           */
      @Override public void onUpdate(int nowBeingRestored, java.lang.String curentPackage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(nowBeingRestored);
          _data.writeString(curentPackage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUpdate, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onUpdate(nowBeingRestored, curentPackage);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * The restore operation has completed.
           *
           * @param error Zero on success; a nonzero error code if the restore operation
           *   as a whole failed.
           */
      @Override public void restoreFinished(int error) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(error);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restoreFinished, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().restoreFinished(error);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static android.app.backup.IRestoreObserver sDefaultImpl;
    }
    static final int TRANSACTION_restoreSetsAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_restoreStarting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_restoreFinished = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    public static boolean setDefaultImpl(android.app.backup.IRestoreObserver impl) {
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
    public static android.app.backup.IRestoreObserver getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Supply a list of the restore datasets available from the current transport.  This
       * method is invoked as a callback following the application's use of the
       * {@link android.app.backup.IRestoreSession.getAvailableRestoreSets} method.
       *
       * @param result An array of {@link android.app.backup.RestoreSet RestoreSet} objects
       *   describing all of the available datasets that are candidates for restoring to
       *   the current device.  If no applicable datasets exist, {@code result} will be
       *   {@code null}.
       */
  public void restoreSetsAvailable(android.app.backup.RestoreSet[] result) throws android.os.RemoteException;
  /**
       * The restore operation has begun.
       *
       * @param numPackages The total number of packages being processed in
       *   this restore operation.
       */
  public void restoreStarting(int numPackages) throws android.os.RemoteException;
  /**
       * An indication of which package is being restored currently, out of the
       * total number provided in the {@link #restoreStarting(int numPackages)} callback.
       * This method is not guaranteed to be called.
       *
       * @param nowBeingRestored The index, between 1 and the numPackages parameter
       *   to the restoreStarting() callback, of the package now being restored.
       * @param currentPackage The name of the package now being restored.
       */
  public void onUpdate(int nowBeingRestored, java.lang.String curentPackage) throws android.os.RemoteException;
  /**
       * The restore operation has completed.
       *
       * @param error Zero on success; a nonzero error code if the restore operation
       *   as a whole failed.
       */
  public void restoreFinished(int error) throws android.os.RemoteException;
}
