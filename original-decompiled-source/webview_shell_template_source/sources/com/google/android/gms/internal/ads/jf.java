package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class jf extends gf {
    public static final Object Q = new Object();
    public static boolean R = false;
    public static long S;
    public static sf T;
    public static mg U;
    public static eg V;
    public static se W;
    public static pf X;
    public final hf N;
    public jg O;
    public final HashMap P;

    public jf(Context context, hf hfVar) {
        super(context);
        this.P = new HashMap();
        this.N = hfVar;
    }

    public static dg h(Context context, boolean z6) {
        if (gf.M == null) {
            synchronized (Q) {
                try {
                    if (gf.M == null) {
                        dg dgVarC = dg.c(context, z6, X);
                        if (dgVarC.f3912q) {
                            try {
                                if (((Boolean) zzbe.zzc().a(zn.s3)).booleanValue()) {
                                    dgVarC.e("w4g9FXzOzEwcEeCpaSre5nXuOUCFa92GFetfeeKgPQcF4KCZSoB1ybtd0ZEBGNIA", "edZBbMBYITINvHy1TGuBnyHrwyVIJEJzJQocfZ8d7ZI=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            dgVarC.e("mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", Context.class);
                            dgVarC.e("dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", Context.class);
                            dgVarC.e("fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", Context.class);
                            dgVarC.e("BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", Context.class);
                            dgVarC.e("P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", Context.class);
                            Class cls = Boolean.TYPE;
                            dgVarC.e("GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", Context.class, cls);
                            dgVarC.e("rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", Context.class);
                            dgVarC.e("IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", Context.class);
                            dgVarC.e("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=", MotionEvent.class, DisplayMetrics.class);
                            dgVarC.e("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=", MotionEvent.class, DisplayMetrics.class);
                            dgVarC.e("y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", new Class[0]);
                            dgVarC.e("ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", new Class[0]);
                            dgVarC.e("IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", new Class[0]);
                            dgVarC.e("bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", new Class[0]);
                            dgVarC.e("bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", new Class[0]);
                            dgVarC.e("SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", new Class[0]);
                            dgVarC.e("oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", Context.class, cls, String.class);
                            dgVarC.e("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", StackTraceElement[].class);
                            dgVarC.e("mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", View.class, DisplayMetrics.class, cls, cls);
                            dgVarC.e("dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", Context.class, cls);
                            dgVarC.e("gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", View.class, Activity.class, cls);
                            dgVarC.e("IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", Long.TYPE);
                            dgVarC.e("3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", new Class[0]);
                            try {
                                if (((Boolean) zzbe.zzc().a(zn.f11492v3)).booleanValue()) {
                                    dgVarC.e("VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            dgVarC.e("yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) zzbe.zzc().a(zn.f11499w3)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        dgVarC.e("zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) zzbe.zzc().a(zn.T2)).booleanValue()) {
                                    dgVarC.e("nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                            } catch (IllegalStateException unused5) {
                            }
                            if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                dgVarC.e("e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", cls3, cls3, cls3, cls3);
                            } else {
                                try {
                                    if (((Boolean) zzbe.zzc().a(zn.L2)).booleanValue()) {
                                        dgVarC.e("SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", long[].class, Context.class, View.class);
                                    }
                                } catch (IllegalStateException unused6) {
                                }
                            }
                        }
                        gf.M = dgVarC;
                    }
                } finally {
                }
            }
        }
        return gf.M;
    }

    public static fg i(dg dgVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws wf {
        Method methodD = dgVar.d("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=");
        if (methodD == null || motionEvent == null) {
            throw new wf();
        }
        try {
            return new fg((String) methodD.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new wf(e6);
        }
    }

    public static final void l(List list) throws InterruptedException {
        ExecutorService executorService;
        if (gf.M == null || (executorService = gf.M.f3898b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) zzbe.zzc().a(zn.H2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            StringWriter stringWriter = new StringWriter();
            e6.printStackTrace(new PrintWriter(stringWriter));
            Log.d("jf", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.gf
    public final long a(StackTraceElement[] stackTraceElementArr) throws wf {
        Method methodD = gf.M.d("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new wf();
        }
        try {
            return new xf((String) methodD.invoke(null, stackTraceElementArr)).f10552t.longValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new wf(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.gf
    public final kd b(Context context, View view, Activity activity) throws InterruptedException {
        mg mgVar = U;
        if (mgVar != null && mgVar.f7143d) {
            mgVar.f7141b = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
            eg egVar = V;
            egVar.h = egVar.f4278g;
            egVar.f4278g = SystemClock.uptimeMillis();
        }
        kd kdVarB0 = yd.b0();
        hf hfVar = this.N;
        if (!TextUtils.isEmpty(hfVar.s)) {
            String str = hfVar.s;
            kdVarB0.i();
            yd.H0((yd) kdVarB0.f4126t, str);
        }
        k(h(context, hfVar.f5373t), kdVarB0, view, activity, true, context);
        return kdVarB0;
    }

    @Override // com.google.android.gms.internal.ads.gf
    public final kd c(Context context) throws InterruptedException {
        mg mgVar = U;
        if (mgVar != null && mgVar.f7143d) {
            mgVar.f7141b = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
            eg egVar = V;
            egVar.f4273b = egVar.f4272a;
            egVar.f4272a = SystemClock.uptimeMillis();
        }
        kd kdVarB0 = yd.b0();
        hf hfVar = this.N;
        if (!TextUtils.isEmpty(hfVar.s)) {
            String str = hfVar.s;
            kdVarB0.i();
            yd.H0((yd) kdVarB0.f4126t, str);
        }
        dg dgVarH = h(context, hfVar.f5373t);
        if (dgVarH.f3898b != null) {
            l(j(dgVarH, context, kdVarB0));
        }
        return kdVarB0;
    }

    @Override // com.google.android.gms.internal.ads.gf
    public final kd d(Context context, View view, Activity activity) throws IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        mg mgVar = U;
        if (mgVar != null && mgVar.f7143d) {
            mgVar.f7141b = System.currentTimeMillis();
        }
        if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
            V.a(context, view);
        }
        kd kdVarB0 = yd.b0();
        hf hfVar = this.N;
        String str = hfVar.s;
        kdVarB0.i();
        yd.H0((yd) kdVarB0.f4126t, str);
        k(h(context, hfVar.f5373t), kdVarB0, view, activity, false, context);
        return kdVarB0;
    }

    @Override // com.google.android.gms.internal.ads.gf
    public final fg e(MotionEvent motionEvent) throws wf {
        Method methodD = gf.M.d("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=");
        if (methodD == null || motionEvent == null) {
            throw new wf();
        }
        try {
            return new fg((String) methodD.invoke(null, motionEvent, this.K));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new wf(e6);
        }
    }

    public ArrayList j(dg dgVar, Context context, kd kdVar) {
        long j6;
        int iA = dgVar.a();
        ArrayList arrayList = new ArrayList();
        if (!dgVar.f3912q) {
            kdVar.i();
            yd.M((yd) kdVar.f4126t, 16384L);
            return arrayList;
        }
        qg qgVar = new qg(dgVar, kdVar, iA, context, (gd) this.N.f5374u, W);
        int i6 = iA;
        arrayList.add(qgVar);
        arrayList.add(new tg(dgVar, kdVar, S, i6));
        arrayList.add(new dh(dgVar, kdVar, i6));
        arrayList.add(new eh(dgVar, kdVar, i6, context));
        kd kdVar2 = kdVar;
        arrayList.add(new ih(dgVar, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", kdVar, i6, 33));
        arrayList.add(new pg(dgVar, kdVar2, i6, context));
        arrayList.add(new rg(dgVar, kdVar2, i6));
        arrayList.add(new ch(dgVar, kdVar2, i6, 0));
        arrayList.add(new ih(dgVar, kdVar2, i6, 2));
        arrayList.add(new sg(dgVar, kdVar2, i6));
        arrayList.add(new yg(dgVar, kdVar2, i6, 0));
        arrayList.add(new yg(dgVar, kdVar2, i6, 2));
        arrayList.add(new og(dgVar, kdVar2, i6));
        arrayList.add(new ch(dgVar, kdVar2, i6, 1));
        arrayList.add(new fh(dgVar, kdVar2, i6));
        if (((Boolean) zzbe.zzc().a(zn.f11499w3)).booleanValue()) {
            mg mgVar = U;
            long j7 = -1;
            if (mgVar != null) {
                long j8 = mgVar.f7143d ? mgVar.f7141b - mgVar.f7140a : -1L;
                long j9 = mgVar.f7142c;
                mgVar.f7142c = -1L;
                j7 = j8;
                j6 = j9;
            } else {
                j6 = -1;
            }
            bh bhVar = new bh(dgVar, kdVar2, i6, T, j7, j6);
            i6 = i6;
            arrayList.add(bhVar);
        }
        if (((Boolean) zzbe.zzc().a(zn.f11492v3)).booleanValue()) {
            yg ygVar = new yg(dgVar, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", kdVar2, i6, 73);
            kdVar2 = kdVar2;
            arrayList.add(ygVar);
        }
        kd kdVar3 = kdVar2;
        arrayList.add(new rg(dgVar, "yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", kdVar3, i6, 76));
        if (((Boolean) zzbe.zzc().a(zn.f11519z3)).booleanValue()) {
            arrayList.add(new ih(dgVar, kdVar3, i6, 1));
        }
        return arrayList;
    }

    public final void k(dg dgVar, kd kdVar, View view, Activity activity, boolean z6, Context context) throws InterruptedException {
        List listAsList;
        MotionEvent motionEvent;
        int i6 = 0;
        if (dgVar.f3912q) {
            synchronized (this) {
                try {
                    try {
                        fg fgVarI = i(dgVar, this.s, this.K);
                        Long l4 = fgVarI.f4644t;
                        if (l4 != null) {
                            long jLongValue = l4.longValue();
                            kdVar.i();
                            yd.W((yd) kdVar.f4126t, jLongValue);
                        }
                        Long l6 = fgVarI.f4645u;
                        if (l6 != null) {
                            long jLongValue2 = l6.longValue();
                            kdVar.i();
                            yd.X((yd) kdVar.f4126t, jLongValue2);
                        }
                        Long l7 = fgVarI.f4646v;
                        if (l7 != null) {
                            long jLongValue3 = l7.longValue();
                            kdVar.i();
                            yd.U((yd) kdVar.f4126t, jLongValue3);
                        }
                        if (this.J) {
                            Long l8 = fgVarI.f4647w;
                            if (l8 != null) {
                                long jLongValue4 = l8.longValue();
                                kdVar.i();
                                yd.T((yd) kdVar.f4126t, jLongValue4);
                            }
                            Long l9 = fgVarI.f4648x;
                            if (l9 != null) {
                                long jLongValue5 = l9.longValue();
                                kdVar.i();
                                yd.Q((yd) kdVar.f4126t, jLongValue5);
                            }
                        }
                    } catch (wf unused) {
                    }
                    ud udVarB = vd.B();
                    if (this.f5018u > 0) {
                        DisplayMetrics displayMetrics = this.K;
                        char[] cArr = gg.f5032a;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long jA = gg.a(this.B, displayMetrics);
                            udVarB.i();
                            vd.F((vd) udVarB.f4126t, jA);
                            long jA2 = gg.a(this.G - this.E, this.K);
                            udVarB.i();
                            vd.S((vd) udVarB.f4126t, jA2);
                            long jA3 = gg.a(this.H - this.F, this.K);
                            udVarB.i();
                            vd.T((vd) udVarB.f4126t, jA3);
                            long jA4 = gg.a(this.E, this.K);
                            udVarB.i();
                            vd.L((vd) udVarB.f4126t, jA4);
                            long jA5 = gg.a(this.F, this.K);
                            udVarB.i();
                            vd.N((vd) udVarB.f4126t, jA5);
                            if (this.J && (motionEvent = this.s) != null) {
                                long jA6 = gg.a(((this.E - this.G) + motionEvent.getRawX()) - this.s.getX(), this.K);
                                if (jA6 != 0) {
                                    udVarB.i();
                                    vd.Q((vd) udVarB.f4126t, jA6);
                                }
                                long jA7 = gg.a(((this.F - this.H) + this.s.getRawY()) - this.s.getY(), this.K);
                                if (jA7 != 0) {
                                    udVarB.i();
                                    vd.R((vd) udVarB.f4126t, jA7);
                                }
                            }
                        }
                    }
                    try {
                        fg fgVarE = e(this.s);
                        Long l10 = fgVarE.f4644t;
                        if (l10 != null) {
                            long jLongValue6 = l10.longValue();
                            udVarB.i();
                            vd.M((vd) udVarB.f4126t, jLongValue6);
                        }
                        Long l11 = fgVarE.f4645u;
                        if (l11 != null) {
                            long jLongValue7 = l11.longValue();
                            udVarB.i();
                            vd.O((vd) udVarB.f4126t, jLongValue7);
                        }
                        long jLongValue8 = fgVarE.f4646v.longValue();
                        udVarB.i();
                        vd.K((vd) udVarB.f4126t, jLongValue8);
                        if (this.J) {
                            Long l12 = fgVarE.f4648x;
                            if (l12 != null) {
                                long jLongValue9 = l12.longValue();
                                udVarB.i();
                                vd.I((vd) udVarB.f4126t, jLongValue9);
                            }
                            Long l13 = fgVarE.f4647w;
                            if (l13 != null) {
                                long jLongValue10 = l13.longValue();
                                udVarB.i();
                                vd.J((vd) udVarB.f4126t, jLongValue10);
                            }
                            Long l14 = fgVarE.f4649y;
                            if (l14 != null) {
                                int i7 = l14.longValue() != 0 ? 2 : 1;
                                udVarB.i();
                                vd.V((vd) udVarB.f4126t, i7);
                            }
                            long j6 = this.f5019v;
                            if (j6 > 0) {
                                DisplayMetrics displayMetrics2 = this.K;
                                char[] cArr2 = gg.f5032a;
                                Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.A / j6)) : null;
                                if (lValueOf != null) {
                                    long jLongValue11 = lValueOf.longValue();
                                    udVarB.i();
                                    vd.D((vd) udVarB.f4126t, jLongValue11);
                                } else {
                                    udVarB.i();
                                    vd.C((vd) udVarB.f4126t);
                                }
                                long jRound = Math.round(this.f5023z / this.f5019v);
                                udVarB.i();
                                vd.E((vd) udVarB.f4126t, jRound);
                            }
                            Long l15 = fgVarE.B;
                            if (l15 != null) {
                                long jLongValue12 = l15.longValue();
                                udVarB.i();
                                vd.G((vd) udVarB.f4126t, jLongValue12);
                            }
                            Long l16 = fgVarE.C;
                            if (l16 != null) {
                                long jLongValue13 = l16.longValue();
                                udVarB.i();
                                vd.P((vd) udVarB.f4126t, jLongValue13);
                            }
                            Long l17 = fgVarE.D;
                            if (l17 != null) {
                                int i8 = l17.longValue() != 0 ? 2 : 1;
                                udVarB.i();
                                vd.U((vd) udVarB.f4126t, i8);
                            }
                        }
                    } catch (wf unused2) {
                    }
                    long j7 = this.f5022y;
                    if (j7 > 0) {
                        udVarB.i();
                        vd.H((vd) udVarB.f4126t, j7);
                    }
                    vd vdVar = (vd) udVarB.g();
                    kdVar.i();
                    yd.a0((yd) kdVar.f4126t, vdVar);
                    long j8 = this.f5018u;
                    if (j8 > 0) {
                        kdVar.i();
                        yd.R((yd) kdVar.f4126t, j8);
                    }
                    long j9 = this.f5019v;
                    if (j9 > 0) {
                        kdVar.i();
                        yd.S((yd) kdVar.f4126t, j9);
                    }
                    long j10 = this.f5020w;
                    if (j10 > 0) {
                        kdVar.i();
                        yd.V((yd) kdVar.f4126t, j10);
                    }
                    long j11 = this.f5021x;
                    if (j11 > 0) {
                        kdVar.i();
                        yd.P((yd) kdVar.f4126t, j11);
                    }
                    try {
                        int size = this.f5017t.size() - 1;
                        if (size > 0) {
                            kdVar.i();
                            yd.B0((yd) kdVar.f4126t);
                            for (int i9 = 0; i9 < size; i9++) {
                                fg fgVarI2 = i(gf.M, (MotionEvent) this.f5017t.get(i9), this.K);
                                ud udVarB2 = vd.B();
                                long jLongValue14 = fgVarI2.f4644t.longValue();
                                udVarB2.i();
                                vd.M((vd) udVarB2.f4126t, jLongValue14);
                                long jLongValue15 = fgVarI2.f4645u.longValue();
                                udVarB2.i();
                                vd.O((vd) udVarB2.f4126t, jLongValue15);
                                vd vdVar2 = (vd) udVarB2.g();
                                kdVar.i();
                                yd.A0((yd) kdVar.f4126t, vdVar2);
                            }
                        }
                    } catch (wf unused3) {
                        kdVar.i();
                        yd.B0((yd) kdVar.f4126t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (dgVar.f3898b != null) {
                int iA = dgVar.a();
                arrayList.add(new vg(i6, dgVar, kdVar));
                arrayList.add(new dh(dgVar, kdVar, iA));
                arrayList.add(new tg(dgVar, kdVar, S, iA));
                arrayList.add(new sg(dgVar, kdVar, iA));
                arrayList.add(new ch(dgVar, kdVar, iA, 0));
                arrayList.add(new ih(dgVar, kdVar, iA, 2));
                arrayList.add(new yg(dgVar, kdVar, iA, 0));
                arrayList.add(new rg(dgVar, kdVar, iA));
                arrayList.add(new yg(dgVar, kdVar, iA, 2));
                arrayList.add(new og(dgVar, kdVar, iA));
                arrayList.add(new ch(dgVar, kdVar, iA, 1));
                arrayList.add(new gh(dgVar, kdVar, iA, new Throwable().getStackTrace()));
                arrayList.add(new jh(dgVar, kdVar, iA, view));
                arrayList.add(new fh(dgVar, kdVar, iA));
                if (((Boolean) zzbe.zzc().a(zn.I2)).booleanValue()) {
                    arrayList.add(new ng(dgVar, kdVar, iA, view, activity));
                }
                if (((Boolean) zzbe.zzc().a(zn.f11519z3)).booleanValue()) {
                    arrayList.add(new ih(dgVar, kdVar, iA, 1));
                }
                if (!z6) {
                    try {
                        if (((Boolean) zzbe.zzc().a(zn.L2)).booleanValue()) {
                            arrayList.add(new xg(dgVar, kdVar, iA, this.P, view, context));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) zzbe.zzc().a(zn.M2)).booleanValue()) {
                            arrayList.add(new wg(dgVar, kdVar, iA, V));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    if (((Boolean) zzbe.zzc().a(zn.T2)).booleanValue()) {
                        arrayList.add(new ah(dgVar, kdVar, iA, this.L));
                    }
                } else if (((Boolean) zzbe.zzc().a(zn.K2)).booleanValue()) {
                    arrayList.add(new hh(dgVar, kdVar, iA, this.O));
                }
            }
            listAsList = arrayList;
        } else {
            kdVar.i();
            yd.M((yd) kdVar.f4126t, 16384L);
            listAsList = Arrays.asList(new vg(i6, dgVar, kdVar));
        }
        l(listAsList);
    }

    @Override // com.google.android.gms.internal.ads.ff
    public final void zzo(View view) {
        if (((Boolean) zzbe.zzc().a(zn.K2)).booleanValue()) {
            if (this.O == null) {
                dg dgVar = gf.M;
                this.O = new jg(dgVar.f3897a, dgVar.f3913r);
            }
            this.O.a(view);
        }
    }
}
