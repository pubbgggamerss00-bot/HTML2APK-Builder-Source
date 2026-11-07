package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class b<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile ya.a zzB;
    private pa.a zzC;
    private boolean zzD;
    private volatile y0 zzE;
    i1 zza;
    final Handler zzb;
    protected c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final h zzn;
    private final pa.e zzo;
    private final Object zzp;
    private final Object zzq;
    private l zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private v0 zzu;
    private int zzv;
    private final a zzw;
    private final InterfaceC0065b zzx;
    private final int zzy;
    private final String zzz;
    private static final pa.c[] zze = new pa.c[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface a {
        void a(Bundle bundle);

        void c(int i10);
    }

    /* renamed from: com.google.android.gms.common.internal.b$b, reason: collision with other inner class name */
    public interface InterfaceC0065b {
        void b(pa.a aVar);
    }

    public interface c {
        void a(pa.a aVar);
    }

    public class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(pa.a aVar) {
            int i10 = aVar.f21377b;
            b bVar = b.this;
            if (i10 == 0) {
                bVar.getRemoteService(null, bVar.getScopes());
            } else if (bVar.zzx != null) {
                bVar.zzx.b(aVar);
            }
        }
    }

    public interface e {
    }

    public b(Context context, Handler handler, h hVar, pa.e eVar, int i10, a aVar, InterfaceC0065b interfaceC0065b) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        p.g(context, "Context must not be null");
        this.zzl = context;
        p.g(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        p.g(hVar, "Supervisor must not be null");
        this.zzn = hVar;
        p.g(eVar, "API availability must not be null");
        this.zzo = eVar;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = interfaceC0065b;
        this.zzz = null;
    }

    public static void zzj(b bVar, y0 y0Var) {
        bVar.zzE = y0Var;
        if (bVar.usesClientTelemetry()) {
            com.google.android.gms.common.internal.e eVar = y0Var.f6213d;
            q qVarA = q.a();
            r rVar = eVar == null ? null : eVar.f6110a;
            synchronized (qVarA) {
                if (rVar == null) {
                    qVarA.f6185a = q.f6184c;
                    return;
                }
                r rVar2 = qVarA.f6185a;
                if (rVar2 == null || rVar2.f6187a < rVar.f6187a) {
                    qVarA.f6185a = rVar;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(b bVar, int i10) {
        int i11;
        int i12;
        synchronized (bVar.zzp) {
            i11 = bVar.zzv;
        }
        if (i11 == 3) {
            bVar.zzD = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = bVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, bVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.zzp) {
            try {
                if (bVar.zzv != i10) {
                    return false;
                }
                bVar.zzp(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(b bVar) throws ClassNotFoundException {
        if (bVar.zzD || TextUtils.isEmpty(bVar.getServiceDescriptor()) || TextUtils.isEmpty(bVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(bVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i10, IInterface iInterface) {
        i1 i1Var;
        p.b((i10 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    v0 v0Var = this.zzu;
                    if (v0Var != null) {
                        h hVar = this.zzn;
                        String str = this.zza.f6153a;
                        p.f(str);
                        String str2 = this.zza.f6154b;
                        zze();
                        boolean z10 = this.zza.f6155c;
                        hVar.getClass();
                        hVar.c(new c1(str, str2, z10), v0Var);
                        this.zzu = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    v0 v0Var2 = this.zzu;
                    if (v0Var2 != null && (i1Var = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + i1Var.f6153a + " on " + i1Var.f6154b);
                        h hVar2 = this.zzn;
                        String str3 = this.zza.f6153a;
                        p.f(str3);
                        String str4 = this.zza.f6154b;
                        zze();
                        boolean z11 = this.zza.f6155c;
                        hVar2.getClass();
                        hVar2.c(new c1(str3, str4, z11), v0Var2);
                        this.zzd.incrementAndGet();
                    }
                    v0 v0Var3 = new v0(this, this.zzd.get());
                    this.zzu = v0Var3;
                    i1 i1Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new i1(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new i1(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = i1Var2;
                    if (i1Var2.f6155c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f6153a)));
                    }
                    h hVar3 = this.zzn;
                    String str5 = this.zza.f6153a;
                    p.f(str5);
                    pa.a aVarB = hVar3.b(new c1(str5, this.zza.f6154b, this.zza.f6155c), v0Var3, zze(), getBindServiceExecutor());
                    if (!(aVarB.f21377b == 0)) {
                        i1 i1Var3 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + i1Var3.f6153a + " on " + i1Var3.f6154b);
                        int i11 = aVarB.f21377b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (aVarB.f21378c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, aVarB.f21378c);
                        }
                        zzl(i11, bundle, this.zzd.get());
                    }
                } else if (i10 == 4) {
                    p.f(iInterface);
                    onConnectedLocked(iInterface);
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int iC = this.zzo.c(this.zzl, getMinApkVersion());
        if (iC == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), iC, null);
        }
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        p.g(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i10 = 0; i10 < size; i10++) {
                    t0 t0Var = (t0) this.zzt.get(i10);
                    synchronized (t0Var) {
                        t0Var.f6197a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        l lVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            lVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (lVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(lVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public pa.c[] getApiFeatures() {
        return zze;
    }

    public ya.a getAttributionSourceWrapper() {
        return null;
    }

    public final pa.c[] getAvailableFeatures() {
        y0 y0Var = this.zzE;
        if (y0Var == null) {
            return null;
        }
        return y0Var.f6211b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        i1 i1Var;
        if (!isConnected() || (i1Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return i1Var.f6154b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return pa.e.f21388a;
    }

    public void getRemoteService(j jVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i10 = this.zzy;
        int i11 = pa.e.f21388a;
        Scope[] scopeArr = f.f6119q;
        Bundle bundle = new Bundle();
        pa.c[] cVarArr = f.f6120r;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.f6124d = this.zzl.getPackageName();
        fVar.f6127g = getServiceRequestExtraArgs;
        if (set != null) {
            fVar.f6126f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            fVar.f6128h = account;
            if (jVar != null) {
                fVar.f6125e = jVar.asBinder();
            }
        } else if (requiresAccount()) {
            fVar.f6128h = getAccount();
        }
        fVar.f6129j = zze;
        fVar.f6130k = getApiFeatures();
        if (usesClientTelemetry()) {
            fVar.f6133n = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    l lVar = this.zzr;
                    if (lVar != null) {
                        lVar.e(new u0(this, this.zzd.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final T getService() throws DeadObjectException {
        T t3;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                IInterface iInterface = this.zzs;
                p.g(iInterface, "Client is connected but service is null");
                t3 = (T) iInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t3;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                l lVar = this.zzr;
                if (lVar == null) {
                    return null;
                }
                return lVar.asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public com.google.android.gms.common.internal.e getTelemetryConfiguration() {
        y0 y0Var = this.zzE;
        if (y0Var == null) {
            return null;
        }
        return y0Var.f6213d;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(T t3) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(pa.a aVar) {
        this.zzi = aVar.f21377b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i11, -1, new w0(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        com.google.android.gms.common.api.internal.i0 i0Var = (com.google.android.gms.common.api.internal.i0) eVar;
        i0Var.f5988a.f6004o.f5981n.post(new com.google.android.gms.common.api.internal.h0(i0Var));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(ya.a aVar) {
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        p.g(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i11, -1, new x0(this, i10, bundle)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, Looper looper, int i10, a aVar, InterfaceC0065b interfaceC0065b, String str) {
        f1 f1VarA = h.a(context);
        pa.e eVar = pa.e.f21389b;
        p.f(aVar);
        p.f(interfaceC0065b);
        this(context, looper, f1VarA, eVar, i10, aVar, interfaceC0065b, str);
    }

    public b(Context context, Looper looper, h hVar, pa.e eVar, int i10, a aVar, InterfaceC0065b interfaceC0065b, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        p.g(context, "Context must not be null");
        this.zzl = context;
        p.g(looper, "Looper must not be null");
        this.zzm = looper;
        p.g(hVar, "Supervisor must not be null");
        this.zzn = hVar;
        p.g(eVar, "API availability must not be null");
        this.zzo = eVar;
        this.zzb = new s0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = interfaceC0065b;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
