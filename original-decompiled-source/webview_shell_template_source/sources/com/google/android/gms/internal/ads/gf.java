package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class gf implements ff {
    public static volatile dg M;
    public double B;
    public double C;
    public double D;
    public float E;
    public float F;
    public float G;
    public float H;
    public final DisplayMetrics K;
    public final xj0 L;
    public MotionEvent s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedList f5017t = new LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public long f5018u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f5019v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f5020w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f5021x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f5022y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f5023z = 0;
    public long A = 0;
    public boolean I = false;
    public boolean J = false;

    public gf(Context context) {
        try {
            ue.b();
            this.K = context.getResources().getDisplayMetrics();
            if (((Boolean) zzbe.zzc().a(zn.T2)).booleanValue()) {
                this.L = new xj0(3);
            }
        } catch (Throwable unused) {
        }
    }

    public abstract long a(StackTraceElement[] stackTraceElementArr);

    public abstract kd b(Context context, View view, Activity activity);

    public abstract kd c(Context context);

    public abstract kd d(Context context, View view, Activity activity);

    public abstract fg e(MotionEvent motionEvent);

    public final void f() {
        this.f5022y = 0L;
        this.f5018u = 0L;
        this.f5019v = 0L;
        this.f5020w = 0L;
        this.f5021x = 0L;
        this.f5023z = 0L;
        this.A = 0L;
        LinkedList linkedList = this.f5017t;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.s;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String g(Context context, String str, int i6, View view, Activity activity) {
        ef efVar;
        String str2;
        int i7;
        Exception exc;
        kd kdVarC;
        int i8;
        int i9;
        byte[] bArrI;
        int i10;
        int i11 = i6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.G2)).booleanValue();
        if (zBooleanValue) {
            efVar = M != null ? M.f3908m : null;
            str2 = "be";
        } else {
            efVar = null;
            str2 = null;
        }
        try {
            if (i11 == 3) {
                kdVarC = b(context, view, activity);
                try {
                    this.I = true;
                    i10 = 1002;
                } catch (Exception e6) {
                    exc = e6;
                    i7 = 3;
                    if (zBooleanValue) {
                        if (i11 != i7) {
                        }
                        i8 = i9;
                        efVar.a(i8, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (kdVarC != null) {
                    }
                    return Integer.toString(5);
                }
            } else if (i11 == 2) {
                kdVarC = d(context, view, activity);
                i10 = 1008;
            } else {
                kdVarC = c(context);
                i10 = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
            }
            if (!zBooleanValue || efVar == null) {
                i7 = 3;
            } else {
                try {
                    i7 = 3;
                } catch (Exception e7) {
                    e = e7;
                    i7 = 3;
                }
                try {
                    efVar.a(i10, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e8) {
                    e = e8;
                    exc = e;
                    if (zBooleanValue && efVar != null) {
                        if (i11 != i7) {
                            i9 = 1003;
                        } else if (i11 == 2) {
                            i9 = 1009;
                        } else {
                            i8 = 1001;
                            i11 = 1;
                            efVar.a(i8, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i8 = i9;
                        efVar.a(i8, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                    long jCurrentTimeMillis22 = System.currentTimeMillis();
                    if (kdVarC != null) {
                    }
                    return Integer.toString(5);
                }
            }
        } catch (Exception e9) {
            i7 = 3;
            exc = e9;
            kdVarC = null;
        }
        long jCurrentTimeMillis222 = System.currentTimeMillis();
        if (kdVarC != null) {
            try {
                if (((yd) kdVarC.g()).f(null) != 0) {
                    yd ydVar = (yd) kdVarC.g();
                    boolean z6 = ue.f9539a;
                    ke keVarA = ue.a(str, ydVar.i());
                    if (keVarA == null) {
                        kd kdVarB0 = yd.b0();
                        kdVarB0.i();
                        yd.M((yd) kdVarB0.f4126t, 4096L);
                        bArrI = ue.d(((yd) kdVarB0.g()).i(), str, true);
                    } else {
                        bArrI = ((le) keVarA.g()).i();
                    }
                    String strEncodeToString = Base64.encodeToString(bArrI, 11);
                    if (!zBooleanValue || efVar == null) {
                        return strEncodeToString;
                    }
                    efVar.a(i11 == i7 ? 1006 : i11 == 2 ? 1010 : 1004, -1, System.currentTimeMillis() - jCurrentTimeMillis222, str2, null);
                    return strEncodeToString;
                }
            } catch (Exception e10) {
                String string = Integer.toString(7);
                if (!zBooleanValue || efVar == null) {
                    return string;
                }
                efVar.a(i11 == i7 ? 1007 : i11 == 2 ? 1011 : 1005, -1, System.currentTimeMillis() - jCurrentTimeMillis222, str2, e10);
                return string;
            }
        }
        return Integer.toString(5);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzd(Context context, String str, View view) {
        return g(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zze(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzf(Context context) {
        char[] cArr = gg.f5032a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return g(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final String zzh(Context context, View view, Activity activity) {
        return g(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final synchronized void zzk(MotionEvent motionEvent) {
        Long l4;
        try {
            if (this.I) {
                f();
                this.I = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.B = 0.0d;
                this.C = motionEvent.getRawX();
                this.D = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d7 = rawX - this.C;
                double d8 = rawY - this.D;
                this.B += Math.sqrt((d8 * d8) + (d7 * d7));
                this.C = rawX;
                this.D = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.s = motionEventObtain;
                        this.f5017t.add(motionEventObtain);
                        if (this.f5017t.size() > 6) {
                            ((MotionEvent) this.f5017t.remove()).recycle();
                        }
                        this.f5020w++;
                        this.f5022y = a(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f5019v += motionEvent.getHistorySize() + 1;
                        fg fgVarE = e(motionEvent);
                        Long l6 = fgVarE.f4647w;
                        if (l6 != null && fgVarE.f4650z != null) {
                            this.f5023z = l6.longValue() + fgVarE.f4650z.longValue() + this.f5023z;
                        }
                        if (this.K != null && (l4 = fgVarE.f4648x) != null && fgVarE.A != null) {
                            this.A = l4.longValue() + fgVarE.A.longValue() + this.A;
                        }
                    } else if (action2 == 3) {
                        this.f5021x++;
                    }
                } catch (wf unused) {
                }
            } else {
                this.E = motionEvent.getX();
                this.F = motionEvent.getY();
                this.G = motionEvent.getRawX();
                this.H = motionEvent.getRawY();
                this.f5018u++;
            }
            this.J = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final synchronized void zzl(int i6, int i7, int i8) {
        try {
            if (this.s != null) {
                if (((Boolean) zzbe.zzc().a(zn.E2)).booleanValue()) {
                    f();
                } else {
                    this.s.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.K;
            if (displayMetrics != null) {
                float f6 = displayMetrics.density;
                this.s = MotionEvent.obtain(0L, i8, 1, i6 * f6, i7 * f6, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.s = null;
            }
            this.J = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        xj0 xj0Var;
        if (!((Boolean) zzbe.zzc().a(zn.T2)).booleanValue() || (xj0Var = this.L) == null) {
            return;
        }
        xj0Var.f10617t = new ArrayList(Arrays.asList(stackTraceElementArr));
    }
}
