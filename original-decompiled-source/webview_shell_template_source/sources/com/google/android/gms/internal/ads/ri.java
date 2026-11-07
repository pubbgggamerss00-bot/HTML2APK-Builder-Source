package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ri extends Thread {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8639t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f8640u;

    /* renamed from: v, reason: collision with root package name */
    public final ji f8641v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8642w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8643x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8644y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8645z;

    public ri() {
        ji jiVar = new ji();
        this.s = false;
        this.f8639t = false;
        this.f8641v = jiVar;
        this.f8640u = new Object();
        this.f8643x = ((Long) kp.f6462d.c()).intValue();
        this.f8644y = ((Long) kp.f6459a.c()).intValue();
        this.f8645z = ((Long) kp.f6463e.c()).intValue();
        this.A = ((Long) kp.f6461c.c()).intValue();
        this.B = ((Integer) zzbe.zzc().a(zn.f11382e0)).intValue();
        this.C = ((Integer) zzbe.zzc().a(zn.f11389f0)).intValue();
        this.D = ((Integer) zzbe.zzc().a(zn.f11396g0)).intValue();
        this.f8642w = ((Long) kp.f6464f.c()).intValue();
        this.E = (String) zzbe.zzc().a(zn.f11408i0);
        this.F = ((Boolean) zzbe.zzc().a(zn.f11415j0)).booleanValue();
        this.G = ((Boolean) zzbe.zzc().a(zn.f11422k0)).booleanValue();
        ((Boolean) zzbe.zzc().a(zn.f11429l0)).getClass();
        setName("ContentFetchTask");
    }

    public final qi a(View view, hi hiVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    hiVar.c(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new qi(1, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof xa0)) {
                    WebView webView = (WebView) view;
                    synchronized (hiVar.f5405g) {
                        hiVar.f5410m++;
                    }
                    webView.post(new pi(this, hiVar, webView, globalVisibleRect));
                    return new qi(0, 1);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i6 = 0;
                    int i7 = 0;
                    for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                        qi qiVarA = a(viewGroup.getChildAt(i8), hiVar);
                        i6 += qiVarA.f8390a;
                        i7 += qiVarA.f8391b;
                    }
                    return new qi(i6, i7);
                }
            }
        }
        return new qi(0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r5.importance != 100) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r4.inKeyguardRestrictedInputMode() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r1 = (android.os.PowerManager) r1.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (r1 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r1.isScreenOn() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r1 = com.google.android.gms.ads.internal.zzv.zzb().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r1 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: no activity. Sleeping.");
        r1 = r8.f8640u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        r8.f8639t = true;
        com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0086, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0088, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008f, code lost:
    
        if (r1.getWindow() == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
    
        if (r1.getWindow().getDecorView() == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009b, code lost:
    
        r3 = r1.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzp().h("ContentFetchTask.extractContent", r0);
        com.google.android.gms.ads.internal.util.client.zzo.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ef, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzv.zzp().h("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fe, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3 A[Catch: Exception -> 0x0086, InterruptedException -> 0x0088, TryCatch #9 {InterruptedException -> 0x0088, Exception -> 0x0086, blocks: (B:34:0x0068, B:36:0x0072, B:37:0x0079, B:68:0x00e3, B:43:0x0085, B:57:0x00bc, B:55:0x00ac, B:64:0x00d3, B:65:0x00da, B:72:0x00ee, B:63:0x00ca, B:38:0x007a, B:39:0x0081, B:48:0x008b, B:50:0x0091, B:52:0x009b, B:3:0x0001, B:4:0x0007, B:16:0x001a, B:19:0x002e, B:21:0x0034, B:22:0x0038, B:24:0x003e, B:26:0x004c, B:28:0x0052, B:30:0x0058, B:32:0x0062, B:62:0x00c9, B:5:0x0008, B:7:0x000d, B:8:0x000f, B:12:0x0014, B:66:0x00db, B:67:0x00e2), top: B:102:0x0068, inners: #2, #3, #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106 A[EXC_TOP_SPLITTER, LOOP:2: B:96:0x0106->B:108:0x0106, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws InterruptedException {
        View viewFindViewById;
        Application application;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        while (true) {
            try {
                mi miVarZzb = zzv.zzb();
                synchronized (miVarZzb.f7160a) {
                    try {
                        ki kiVar = miVarZzb.f7161b;
                        viewFindViewById = null;
                        application = kiVar != null ? kiVar.f6423t : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                zzv.zzp().h("ContentFetchTask.isInForeground", th2);
            }
            if (application == null) {
                zzo.zze("ContentFetchTask: sleeping");
                synchronized (this.f8640u) {
                    this.f8639t = true;
                    zzo.zze("ContentFetchThread: paused, pause = true");
                }
                Thread.sleep(this.f8642w * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
            } else {
                ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
                KeyguardManager keyguardManager = (KeyguardManager) application.getSystemService("keyguard");
                if (activityManager != null && keyguardManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (Process.myPid() == next.pid) {
                            break;
                        }
                    }
                    zzo.zze("ContentFetchTask: sleeping");
                    synchronized (this.f8640u) {
                    }
                }
            }
            synchronized (this.f8640u) {
                while (this.f8639t) {
                    try {
                        zzo.zze("ContentFetchTask: waiting");
                        this.f8640u.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
        if (viewFindViewById != null) {
            viewFindViewById.post(new ni(0, this, viewFindViewById));
        }
        Thread.sleep(this.f8642w * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL);
        synchronized (this.f8640u) {
        }
    }
}
