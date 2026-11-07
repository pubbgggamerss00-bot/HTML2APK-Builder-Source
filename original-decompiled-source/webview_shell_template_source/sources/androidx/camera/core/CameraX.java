package androidx.camera.core;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraProviderExecutionState;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import q0.f;
import y.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class CameraX {
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    final CameraRepository mCameraRepository;
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final c5.a<Void> mInitInternalFuture;
    private InternalInitState mInitState;
    private final Object mInitializeLock;
    private final Integer mMinLogLevel;
    private final RetryPolicy mRetryPolicy;
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;
    private c5.a<Void> mShutdownInternalFuture;
    private CameraDeviceSurfaceManager mSurfaceManager;
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(Context context, CameraXConfig.Provider provider) {
        this(context, provider, new QuirkSettingsLoader());
    }

    private static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                updateOrResetMinLogLevel();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) {
        ComponentCallbacks2 applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            Logger.e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e6) {
            e = e6;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e7) {
            e = e7;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e8) {
            e = e8;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e9) {
            e = e9;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e10) {
            e = e10;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e11) {
            e = e11;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e12) {
            e = e12;
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void increaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num == null) {
                    return;
                }
                androidx.work.j.c("minLogLevel", num.intValue(), 3, 6);
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                updateOrResetMinLogLevel();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void initAndRetryRecursively(final Executor executor, final long j6, final int i6, final Context context, final b.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.g
            @Override // java.lang.Runnable
            public final void run() {
                b.a aVar2 = aVar;
                long j7 = j6;
                int i7 = i6;
                this.lambda$initAndRetryRecursively$2(context, executor, i7, aVar2, j7);
            }
        });
    }

    private c5.a<Void> initInternal(final Context context) {
        b.d dVarA;
        synchronized (this.mInitializeLock) {
            androidx.work.j.f("CameraX.initInternal() should only be called once per instance", this.mInitState == InternalInitState.UNINITIALIZED);
            this.mInitState = InternalInitState.INITIALIZING;
            dVarA = y.b.a(new b.c() { // from class: androidx.camera.core.h
                @Override // y.b.c
                public final Object attachCompleter(b.a aVar) {
                    return this.s.lambda$initInternal$0(context, aVar);
                }
            });
        }
        return dVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAndRetryRecursively$1(Executor executor, long j6, int i6, Context context, b.a aVar) {
        initAndRetryRecursively(executor, j6, i6 + 1, context, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117 A[Catch: all -> 0x0073, TryCatch #2 {all -> 0x0073, blocks: (B:3:0x001c, B:5:0x0024, B:7:0x0046, B:9:0x0060, B:11:0x006a, B:20:0x007c, B:22:0x008b, B:23:0x008e, B:26:0x0098, B:27:0x00a4, B:28:0x00a5, B:29:0x00b1, B:30:0x00b2, B:31:0x00be, B:32:0x00bf, B:36:0x00d8, B:38:0x0109, B:39:0x010d, B:40:0x0117, B:41:0x0119, B:44:0x011f, B:46:0x0125, B:47:0x012c, B:49:0x0130, B:50:0x0157, B:52:0x015b, B:53:0x015f, B:58:0x016d, B:42:0x011a, B:43:0x011e), top: B:61:0x001c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.camera.core.f, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lambda$initAndRetryRecursively$2(Context context, final Executor executor, final int i6, final b.a aVar, final long j6) {
        RetryPolicy.RetryConfig retryConfigOnRetryDecisionRequested;
        Trace.beginSection(d2.a.d("CX:initAndRetryRecursively"));
        final Context applicationContext = ContextUtil.getApplicationContext(context);
        try {
            try {
                CameraFactory.Provider cameraFactoryProvider = this.mCameraXConfig.getCameraFactoryProvider(null);
                if (cameraFactoryProvider == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                CameraThreadConfig cameraThreadConfigCreate = CameraThreadConfig.create(this.mCameraExecutor, this.mSchedulerHandler);
                CameraSelector availableCamerasLimiter = this.mCameraXConfig.getAvailableCamerasLimiter(null);
                this.mCameraFactory = cameraFactoryProvider.newInstance(applicationContext, cameraThreadConfigCreate, availableCamerasLimiter, this.mCameraXConfig.getCameraOpenRetryMaxTimeoutInMillisWhileResuming());
                CameraDeviceSurfaceManager.Provider deviceSurfaceManagerProvider = this.mCameraXConfig.getDeviceSurfaceManagerProvider(null);
                if (deviceSurfaceManagerProvider == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                this.mSurfaceManager = deviceSurfaceManagerProvider.newInstance(applicationContext, this.mCameraFactory.getCameraManager(), this.mCameraFactory.getAvailableCameraIds());
                UseCaseConfigFactory.Provider useCaseConfigFactoryProvider = this.mCameraXConfig.getUseCaseConfigFactoryProvider(null);
                if (useCaseConfigFactoryProvider == null) {
                    throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                this.mDefaultConfigFactory = useCaseConfigFactoryProvider.newInstance(applicationContext);
                if (executor instanceof CameraExecutor) {
                    ((CameraExecutor) executor).init(this.mCameraFactory);
                }
                this.mCameraRepository.init(this.mCameraFactory);
                CameraValidator.validateCameras(applicationContext, this.mCameraRepository, availableCamerasLimiter);
                if (i6 > 1) {
                    traceExecutionState(null);
                }
                setStateToInitialized();
                aVar.a(null);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (InitializationException e6) {
            e = e6;
            CameraProviderExecutionState cameraProviderExecutionState = new CameraProviderExecutionState(j6, i6, e);
            retryConfigOnRetryDecisionRequested = this.mRetryPolicy.onRetryDecisionRequested(cameraProviderExecutionState);
            traceExecutionState(cameraProviderExecutionState);
            if (!retryConfigOnRetryDecisionRequested.shouldRetry() || i6 >= Integer.MAX_VALUE) {
                synchronized (this.mInitializeLock) {
                    this.mInitState = InternalInitState.INITIALIZING_ERROR;
                }
                if (retryConfigOnRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                    setStateToInitialized();
                    aVar.a(null);
                } else if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e).getAvailableCameraCount();
                    Logger.e(TAG, str, e);
                    aVar.b(new InitializationException(new CameraUnavailableException(3, str)));
                } else if (e instanceof InitializationException) {
                    aVar.b(e);
                } else {
                    aVar.b(new InitializationException(e));
                }
            } else {
                Logger.w(TAG, "Retry init. Start time " + j6 + " current time " + SystemClock.elapsedRealtime(), e);
                Handler handler = this.mSchedulerHandler;
                ?? r02 = new Runnable() { // from class: androidx.camera.core.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = applicationContext;
                        b.a aVar2 = aVar;
                        int i7 = i6;
                        this.lambda$initAndRetryRecursively$1(executor, j6, i7, context2, aVar2);
                    }
                };
                long retryDelayInMillis = retryConfigOnRetryDecisionRequested.getRetryDelayInMillis();
                if (Build.VERSION.SDK_INT >= 28) {
                    f.a.b(handler, r02, retryDelayInMillis);
                } else {
                    Message messageObtain = Message.obtain(handler, (Runnable) r02);
                    messageObtain.obj = RETRY_TOKEN;
                    handler.sendMessageDelayed(messageObtain, retryDelayInMillis);
                }
            }
            Trace.endSection();
        } catch (CameraValidator.CameraIdListIncorrectException e7) {
            e = e7;
            CameraProviderExecutionState cameraProviderExecutionState2 = new CameraProviderExecutionState(j6, i6, e);
            retryConfigOnRetryDecisionRequested = this.mRetryPolicy.onRetryDecisionRequested(cameraProviderExecutionState2);
            traceExecutionState(cameraProviderExecutionState2);
            if (retryConfigOnRetryDecisionRequested.shouldRetry()) {
                synchronized (this.mInitializeLock) {
                }
            }
            Trace.endSection();
        } catch (RuntimeException e8) {
            e = e8;
            CameraProviderExecutionState cameraProviderExecutionState22 = new CameraProviderExecutionState(j6, i6, e);
            retryConfigOnRetryDecisionRequested = this.mRetryPolicy.onRetryDecisionRequested(cameraProviderExecutionState22);
            traceExecutionState(cameraProviderExecutionState22);
            if (retryConfigOnRetryDecisionRequested.shouldRetry()) {
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$initInternal$0(Context context, b.a aVar) {
        initAndRetryRecursively(this.mCameraExecutor, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shutdownInternal$3(b.a aVar) {
        if (this.mSchedulerThread != null) {
            Executor executor = this.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
        }
        aVar.a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$shutdownInternal$4(b.a aVar) {
        this.mCameraRepository.deinit().addListener(new e(0, this, aVar), this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private c5.a<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            try {
                this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
                int iOrdinal = this.mInitState.ordinal();
                if (iOrdinal == 0) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    return Futures.immediateFuture(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    decreaseMinLogLevelReference(this.mMinLogLevel);
                    this.mShutdownInternalFuture = y.b.a(new b.c() { // from class: androidx.camera.core.i
                        @Override // y.b.c
                        public final Object attachCompleter(b.a aVar) {
                            return this.s.lambda$shutdownInternal$4(aVar);
                        }
                    });
                }
                return this.mShutdownInternalFuture;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void traceExecutionState(RetryPolicy.ExecutionState executionState) {
        if (d2.a.b()) {
            d2.a.c(executionState != null ? executionState.getStatus() : -1, "CX:CameraProvider-RetryStatus");
        }
    }

    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
            return;
        }
        if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }

    private static void updateQuirkSettings(Context context, QuirkSettings quirkSettings, o.a<Context, QuirkSettings> aVar) {
        if (quirkSettings != null) {
            Logger.d(TAG, "QuirkSettings from CameraXConfig: " + quirkSettings);
        } else {
            quirkSettings = aVar.apply(context);
            Logger.d(TAG, "QuirkSettings from app metadata: " + quirkSettings);
        }
        if (quirkSettings == null) {
            quirkSettings = QuirkSettingsHolder.DEFAULT;
            Logger.d(TAG, "QuirkSettings by default: " + quirkSettings);
        }
        QuirkSettingsHolder.instance().set(quirkSettings);
    }

    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public c5.a<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public boolean isInitialized() {
        boolean z6;
        synchronized (this.mInitializeLock) {
            z6 = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z6;
    }

    public c5.a<Void> shutdown() {
        return shutdownInternal();
    }

    public CameraX(Context context, CameraXConfig.Provider provider, o.a<Context, QuirkSettings> aVar) {
        this.mCameraRepository = new CameraRepository();
        this.mInitializeLock = new Object();
        this.mInitState = InternalInitState.UNINITIALIZED;
        this.mShutdownInternalFuture = Futures.immediateFuture(null);
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.mCameraXConfig = configProvider.getCameraXConfig();
        }
        updateQuirkSettings(context, this.mCameraXConfig.getQuirkSettings(), aVar);
        Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor(null);
        Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler(null);
        this.mCameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = q0.f.a(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        Integer num = (Integer) this.mCameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mRetryPolicy = new RetryPolicy.Builder(this.mCameraXConfig.getCameraProviderInitRetryPolicy()).build();
        this.mInitInternalFuture = initInternal(context);
    }
}
