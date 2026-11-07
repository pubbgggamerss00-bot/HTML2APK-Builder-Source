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

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile j3.a zzB;
    private c3.b zzC;
    private boolean zzD;
    private volatile q0 zzE;
    z0 zza;
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
    private final g zzn;
    private final c3.h zzo;
    private final Object zzp;
    private final Object zzq;
    private i zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private n0 zzu;
    private int zzv;
    private final a zzw;
    private final InterfaceC0030b zzx;
    private final int zzy;
    private final String zzz;
    private static final c3.d[] zze = new c3.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface a {
        void n(int i6);

        void o(Bundle bundle);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: com.google.android.gms.common.internal.b$b, reason: collision with other inner class name */
    public interface InterfaceC0030b {
        void r(c3.b bVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
        void a(c3.b bVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.b.c
        public final void a(c3.b bVar) {
            boolean zL = bVar.l();
            b bVar2 = b.this;
            if (zL) {
                bVar2.getRemoteService(null, bVar2.getScopes());
            } else if (bVar2.zzl() != null) {
                bVar2.zzl().r(bVar);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface e {
    }

    public b(Context context, Handler handler, g gVar, c3.h hVar, int i6, a aVar, InterfaceC0030b interfaceC0030b) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        l.g("Context must not be null", context);
        this.zzl = context;
        l.g("Handler must not be null", handler);
        this.zzb = handler;
        this.zzm = handler.getLooper();
        l.g("Supervisor must not be null", gVar);
        this.zzn = gVar;
        l.g("API availability must not be null", hVar);
        this.zzo = hVar;
        this.zzy = i6;
        this.zzw = aVar;
        this.zzx = interfaceC0030b;
        this.zzz = null;
    }

    private final void zzp(int i6, IInterface iInterface) {
        z0 z0Var;
        l.b((i6 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i6;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i6 == 1) {
                    n0 n0Var = this.zzu;
                    if (n0Var != null) {
                        g gVar = this.zzn;
                        String str = this.zza.f2506a;
                        l.f(str);
                        String str2 = this.zza.f2507b;
                        zza();
                        boolean z6 = this.zza.f2508c;
                        gVar.getClass();
                        gVar.c(new u0(str, str2, z6), n0Var);
                        this.zzu = null;
                    }
                } else if (i6 == 2 || i6 == 3) {
                    n0 n0Var2 = this.zzu;
                    if (n0Var2 != null && (z0Var = this.zza) != null) {
                        String str3 = z0Var.f2506a;
                        String str4 = z0Var.f2507b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        g gVar2 = this.zzn;
                        String str5 = this.zza.f2506a;
                        l.f(str5);
                        String str6 = this.zza.f2507b;
                        zza();
                        boolean z7 = this.zza.f2508c;
                        gVar2.getClass();
                        gVar2.c(new u0(str5, str6, z7), n0Var2);
                        this.zzd.incrementAndGet();
                    }
                    n0 n0Var3 = new n0(this, this.zzd.get());
                    this.zzu = n0Var3;
                    z0 z0Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new z0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new z0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    this.zza = z0Var2;
                    if (z0Var2.f2508c && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f2506a)));
                    }
                    g gVar3 = this.zzn;
                    String str7 = this.zza.f2506a;
                    l.f(str7);
                    c3.b bVarB = gVar3.b(new u0(str7, this.zza.f2507b, this.zza.f2508c), n0Var3, zza(), getBindServiceExecutor());
                    if (!bVarB.l()) {
                        z0 z0Var3 = this.zza;
                        String str8 = z0Var3.f2506a;
                        String str9 = z0Var3.f2507b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str8);
                        sb2.append(" on ");
                        sb2.append(str9);
                        Log.w("GmsClient", sb2.toString());
                        int i7 = bVarB.f2166t;
                        if (i7 == -1) {
                            i7 = 16;
                        }
                        if (bVarB.f2167u != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, bVarB.f2167u);
                        }
                        zzb(i7, bundle, this.zzd.get());
                    }
                } else if (i6 == 4) {
                    l.f(iInterface);
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
        l.g("Connection progress callbacks cannot be null.", cVar);
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    l0 l0Var = (l0) arrayList.get(i6);
                    synchronized (l0Var) {
                        l0Var.f2463a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i6;
        IInterface iInterface;
        i iVar;
        long j6;
        synchronized (this.zzp) {
            i6 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            iVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i6 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i6 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i6 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i6 == 4) {
            printWriter.print("CONNECTED");
        } else if (i6 != 5) {
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
        if (iVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j7 = this.zzh;
            String str2 = simpleDateFormat.format(new Date(j7));
            j6 = 0;
            StringBuilder sb = new StringBuilder(String.valueOf(j7).length() + 1 + String.valueOf(str2).length());
            sb.append(j7);
            sb.append(" ");
            sb.append(str2);
            printWriterAppend.println(sb.toString());
        } else {
            j6 = 0;
        }
        if (this.zzg > j6) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i7 = this.zzf;
            if (i7 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i7 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i7 != 3) {
                printWriter.append((CharSequence) String.valueOf(i7));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j8 = this.zzg;
            String str3 = simpleDateFormat.format(new Date(j8));
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 1 + String.valueOf(str3).length());
            sb2.append(j8);
            sb2.append(" ");
            sb2.append(str3);
            printWriterAppend2.println(sb2.toString());
        }
        if (this.zzj > j6) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) d3.c.a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j9 = this.zzj;
            String str4 = simpleDateFormat.format(new Date(j9));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j9).length() + 1 + String.valueOf(str4).length());
            sb3.append(j9);
            sb3.append(" ");
            sb3.append(str4);
            printWriterAppend3.println(sb3.toString());
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public c3.d[] getApiFeatures() {
        return zze;
    }

    public j3.a getAttributionSourceWrapper() {
        return null;
    }

    public final c3.d[] getAvailableFeatures() {
        q0 q0Var = this.zzE;
        if (q0Var == null) {
            return null;
        }
        return q0Var.f2480t;
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
        z0 z0Var;
        if (!isConnected() || (z0Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return z0Var.f2507b;
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
        return c3.h.f2183a;
    }

    public void getRemoteService(h hVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i6 = this.zzy;
        int i7 = c3.h.f2183a;
        Scope[] scopeArr = com.google.android.gms.common.internal.e.G;
        Bundle bundle = new Bundle();
        c3.d[] dVarArr = com.google.android.gms.common.internal.e.H;
        com.google.android.gms.common.internal.e eVar = new com.google.android.gms.common.internal.e(6, i6, i7, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        eVar.f2436v = this.zzl.getPackageName();
        eVar.f2439y = getServiceRequestExtraArgs;
        if (set != null) {
            eVar.f2438x = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            eVar.f2440z = account;
            if (hVar != null) {
                eVar.f2437w = hVar.asBinder();
            }
        } else if (requiresAccount()) {
            eVar.f2440z = getAccount();
        }
        eVar.A = zze;
        eVar.B = getApiFeatures();
        if (usesClientTelemetry()) {
            eVar.E = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    i iVar = this.zzr;
                    if (iVar != null) {
                        iVar.N(new m0(this, this.zzd.get()), eVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            triggerConnectionSuspended(3);
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final T getService() {
        T t6;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                t6 = (T) this.zzs;
                l.g("Client is connected but service is null", t6);
            } catch (Throwable th) {
                throw th;
            }
        }
        return t6;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                i iVar = this.zzr;
                if (iVar == null) {
                    return null;
                }
                return iVar.asBinder();
            } catch (Throwable th) {
                throw th;
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

    public com.google.android.gms.common.internal.d getTelemetryConfiguration() {
        q0 q0Var = this.zzE;
        if (q0Var == null) {
            return null;
        }
        return q0Var.f2482v;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z6;
        synchronized (this.zzp) {
            z6 = this.zzv == 4;
        }
        return z6;
    }

    public boolean isConnecting() {
        boolean z6;
        synchronized (this.zzp) {
            int i6 = this.zzv;
            z6 = true;
            if (i6 != 2 && i6 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    public void onConnectedLocked(T t6) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(c3.b bVar) {
        this.zzi = bVar.f2166t;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i6) {
        this.zzf = i6;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i6, IBinder iBinder, Bundle bundle, int i7) {
        o0 o0Var = new o0(this, i6, iBinder, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i7, -1, o0Var));
    }

    public void onUserSignOut(e eVar) {
        e3.q qVar = (e3.q) eVar;
        qVar.f12893a.E.E.post(new e3.p(qVar));
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

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i6) {
        int i7 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, i7, i6));
    }

    public void triggerNotAvailable(c cVar, int i6, PendingIntent pendingIntent) {
        l.g("Connection progress callbacks cannot be null.", cVar);
        this.zzc = cVar;
        int i7 = this.zzd.get();
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, i7, i6, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zza() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzb(int i6, Bundle bundle, int i7) {
        p0 p0Var = new p0(this, i6, bundle);
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i7, -1, p0Var));
    }

    public final void zzc(q0 q0Var) {
        this.zzE = q0Var;
        if (usesClientTelemetry()) {
            com.google.android.gms.common.internal.d dVar = q0Var.f2482v;
            m mVarA = m.a();
            n nVar = dVar == null ? null : dVar.s;
            synchronized (mVarA) {
                if (nVar == null) {
                    mVarA.f2468a = m.f2467c;
                    return;
                }
                n nVar2 = mVarA.f2468a;
                if (nVar2 == null || nVar2.s < nVar.s) {
                    mVarA.f2468a = nVar;
                }
            }
        }
    }

    public final /* synthetic */ void zzd(int i6, IInterface iInterface) {
        zzp(i6, null);
    }

    public final /* synthetic */ boolean zze(int i6, int i7, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i6) {
                    return false;
                }
                zzp(i7, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzf(int i6) {
        int i7;
        int i8;
        synchronized (this.zzp) {
            i7 = this.zzv;
        }
        if (i7 == 3) {
            this.zzD = true;
            i8 = 5;
        } else {
            i8 = 4;
        }
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(i8, this.zzd.get(), 16));
    }

    public final /* synthetic */ boolean zzg() throws ClassNotFoundException {
        if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final /* synthetic */ Object zzh() {
        return this.zzq;
    }

    public final /* synthetic */ void zzi(i iVar) {
        this.zzr = iVar;
    }

    public final /* synthetic */ ArrayList zzj() {
        return this.zzt;
    }

    public final /* synthetic */ a zzk() {
        return this.zzw;
    }

    public final /* synthetic */ InterfaceC0030b zzl() {
        return this.zzx;
    }

    public final /* synthetic */ c3.b zzm() {
        return this.zzC;
    }

    public final /* synthetic */ void zzn(c3.b bVar) {
        this.zzC = bVar;
    }

    public final /* synthetic */ boolean zzo() {
        return this.zzD;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, Looper looper, int i6, a aVar, InterfaceC0030b interfaceC0030b, String str) {
        x0 x0VarA = g.a(context);
        c3.h hVar = c3.h.f2184b;
        l.f(aVar);
        l.f(interfaceC0030b);
        this(context, looper, x0VarA, hVar, i6, aVar, interfaceC0030b, str);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public b(Context context, Looper looper, g gVar, c3.h hVar, int i6, a aVar, InterfaceC0030b interfaceC0030b, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        l.g("Context must not be null", context);
        this.zzl = context;
        l.g("Looper must not be null", looper);
        this.zzm = looper;
        l.g("Supervisor must not be null", gVar);
        this.zzn = gVar;
        l.g("API availability must not be null", hVar);
        this.zzo = hVar;
        this.zzb = new k0(this, looper);
        this.zzy = i6;
        this.zzw = aVar;
        this.zzx = interfaceC0030b;
        this.zzz = str;
    }

    public void setAttributionSourceWrapper(j3.a aVar) {
    }
}
