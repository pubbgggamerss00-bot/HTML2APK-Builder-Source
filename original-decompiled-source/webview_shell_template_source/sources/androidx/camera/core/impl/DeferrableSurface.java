package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class DeferrableSurface {
    private b.a<Void> mCloseCompleter;
    private final c5.a<Void> mCloseFuture;
    private boolean mClosed;
    Class<?> mContainerClass;
    private final Object mLock;
    private final Size mPrescribedSize;
    private final int mPrescribedStreamFormat;
    private b.a<Void> mTerminationCompleter;
    private final c5.a<Void> mTerminationFuture;
    private int mUseCount;
    public static final Size SIZE_UNDEFINED = new Size(0, 0);
    private static final String TAG = "DeferrableSurface";
    private static final boolean DEBUG = Logger.isDebugEnabled(TAG);
    private static final AtomicInteger USED_COUNT = new AtomicInteger(0);
    private static final AtomicInteger TOTAL_COUNT = new AtomicInteger(0);

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(b.a aVar) {
        synchronized (this.mLock) {
            this.mTerminationCompleter = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$1(b.a aVar) {
        synchronized (this.mLock) {
            this.mCloseCompleter = aVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(String str) throws ExecutionException, InterruptedException {
        try {
            this.mTerminationFuture.get();
            printGlobalDebugCounts("Surface terminated", TOTAL_COUNT.decrementAndGet(), USED_COUNT.get());
        } catch (Exception e6) {
            Logger.e(TAG, "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.mLock) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.mClosed), Integer.valueOf(this.mUseCount)), e6);
            }
        }
    }

    private void printGlobalDebugCounts(String str, int i6, int i7) {
        if (!DEBUG && Logger.isDebugEnabled(TAG)) {
            Logger.d(TAG, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.d(TAG, str + "[total_surfaces=" + i6 + ", used_surfaces=" + i7 + "](" + this + "}");
    }

    public void close() {
        b.a<Void> aVar;
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    aVar = null;
                } else {
                    this.mClosed = true;
                    this.mCloseCompleter.a(null);
                    if (this.mUseCount == 0) {
                        aVar = this.mTerminationCompleter;
                        this.mTerminationCompleter = null;
                    } else {
                        aVar = null;
                    }
                    if (Logger.isDebugEnabled(TAG)) {
                        Logger.d(TAG, "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public void decrementUseCount() {
        b.a<Void> aVar;
        synchronized (this.mLock) {
            try {
                int i6 = this.mUseCount;
                if (i6 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i7 = i6 - 1;
                this.mUseCount = i7;
                if (i7 == 0 && this.mClosed) {
                    aVar = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    aVar = null;
                }
                if (Logger.isDebugEnabled(TAG)) {
                    Logger.d(TAG, "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + " " + this);
                    if (this.mUseCount == 0) {
                        printGlobalDebugCounts("Surface no longer in use", TOTAL_COUNT.get(), USED_COUNT.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.a(null);
        }
    }

    public c5.a<Void> getCloseFuture() {
        return Futures.nonCancellationPropagating(this.mCloseFuture);
    }

    public Class<?> getContainerClass() {
        return this.mContainerClass;
    }

    public Size getPrescribedSize() {
        return this.mPrescribedSize;
    }

    public int getPrescribedStreamFormat() {
        return this.mPrescribedStreamFormat;
    }

    public final c5.a<Surface> getSurface() {
        synchronized (this.mLock) {
            try {
                if (this.mClosed) {
                    return Futures.immediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return provideSurface();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c5.a<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    public int getUseCount() {
        int i6;
        synchronized (this.mLock) {
            i6 = this.mUseCount;
        }
        return i6;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            try {
                int i6 = this.mUseCount;
                if (i6 == 0 && this.mClosed) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.mUseCount = i6 + 1;
                if (Logger.isDebugEnabled(TAG)) {
                    if (this.mUseCount == 1) {
                        printGlobalDebugCounts("New surface in use", TOTAL_COUNT.get(), USED_COUNT.incrementAndGet());
                    }
                    Logger.d(TAG, "use count+1, useCount=" + this.mUseCount + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean z6;
        synchronized (this.mLock) {
            z6 = this.mClosed;
        }
        return z6;
    }

    public abstract c5.a<Surface> provideSurface();

    public void setContainerClass(Class<?> cls) {
        this.mContainerClass = cls;
    }

    public DeferrableSurface(Size size, int i6) {
        this.mLock = new Object();
        this.mUseCount = 0;
        this.mClosed = false;
        this.mPrescribedSize = size;
        this.mPrescribedStreamFormat = i6;
        b.d dVarA = y.b.a(new e(0, this));
        this.mTerminationFuture = dVarA;
        this.mCloseFuture = y.b.a(new androidx.camera.camera2.interop.f(2, this));
        if (Logger.isDebugEnabled(TAG)) {
            printGlobalDebugCounts("Surface created", TOTAL_COUNT.incrementAndGet(), USED_COUNT.get());
            dVarA.f15194t.addListener(new i(1, this, Log.getStackTraceString(new Exception())), CameraXExecutors.directExecutor());
        }
    }
}
