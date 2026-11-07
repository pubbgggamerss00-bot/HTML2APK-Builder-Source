package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import o1.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vf0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9844a;

    /* renamed from: b, reason: collision with root package name */
    public final zzg f9845b;

    /* renamed from: c, reason: collision with root package name */
    public final wz0 f9846c;

    /* renamed from: d, reason: collision with root package name */
    public final it0 f9847d;

    /* renamed from: e, reason: collision with root package name */
    public final hs1 f9848e;

    /* renamed from: f, reason: collision with root package name */
    public final hs1 f9849f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f9850g;
    public u20 h;

    /* renamed from: i, reason: collision with root package name */
    public u20 f9851i;

    public vf0(Context context, zzj zzjVar, wz0 wz0Var, it0 it0Var, hs1 hs1Var, hs1 hs1Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f9844a = context;
        this.f9845b = zzjVar;
        this.f9846c = wz0Var;
        this.f9847d = it0Var;
        this.f9848e = hs1Var;
        this.f9849f = hs1Var2;
        this.f9850g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) zzbe.zzc().a(zn.aa));
    }

    public final c5.a a(String str, Random random) {
        return TextUtils.isEmpty(str) ? bs1.m(str) : bs1.k(c(str, this.f9847d.f5841a, random), Throwable.class, new of0(0, this, str), this.f9848e);
    }

    public final c5.a c(final String str, final MotionEvent motionEvent, Random random) {
        c5.a<Integer> aVarL;
        try {
            if (!str.contains((CharSequence) zzbe.zzc().a(zn.aa)) || this.f9845b.zzN()) {
                return bs1.m(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) zzbe.zzc().a(zn.ba), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                builderBuildUpon.appendQueryParameter((String) zzbe.zzc().a(zn.ca), "11");
                return bs1.m(builderBuildUpon.toString());
            }
            wz0 wz0Var = this.f9846c;
            wz0Var.getClass();
            try {
                a.C0081a c0081aA = o1.a.a(wz0Var.f10319b);
                wz0Var.f10318a = c0081aA;
                aVarL = c0081aA == null ? bs1.l(new IllegalStateException("MeasurementManagerFutures is null")) : c0081aA.c();
            } catch (Exception e6) {
                aVarL = bs1.l(e6);
            }
            return bs1.k(bs1.p(xr1.p(aVarL), new pr1() { // from class: com.google.android.gms.internal.ads.pf0
                @Override // com.google.android.gms.internal.ads.pr1
                public final c5.a zza(Object obj) {
                    c5.a<d5.j> aVarL2;
                    InputEvent inputEvent = motionEvent;
                    int iIntValue = ((Integer) obj).intValue();
                    Uri.Builder builder = builderBuildUpon;
                    if (iIntValue != 1) {
                        builder.appendQueryParameter((String) zzbe.zzc().a(zn.ca), "10");
                        return bs1.m(builder.toString());
                    }
                    Uri.Builder builderBuildUpon2 = builder.build().buildUpon();
                    builderBuildUpon2.appendQueryParameter((String) zzbe.zzc().a(zn.da), "1");
                    builderBuildUpon2.appendQueryParameter((String) zzbe.zzc().a(zn.ca), "12");
                    if (str.contains((CharSequence) zzbe.zzc().a(zn.ea))) {
                        builderBuildUpon2.authority((String) zzbe.zzc().a(zn.fa));
                    }
                    vf0 vf0Var = this.f8055a;
                    wz0 wz0Var2 = vf0Var.f9846c;
                    Uri uriBuild = builderBuildUpon2.build();
                    wz0Var2.getClass();
                    try {
                        a.C0081a c0081a = wz0Var2.f10318a;
                        Objects.requireNonNull(c0081a);
                        aVarL2 = c0081a.d(uriBuild, inputEvent);
                    } catch (Exception e7) {
                        aVarL2 = bs1.l(e7);
                    }
                    return bs1.p(xr1.p(aVarL2), new rf0(0, builder), vf0Var.f9849f);
                }
            }, this.f9849f), Throwable.class, new qf0(0, this, builderBuildUpon), this.f9848e);
        } catch (Exception e7) {
            return bs1.l(e7);
        }
    }
}
