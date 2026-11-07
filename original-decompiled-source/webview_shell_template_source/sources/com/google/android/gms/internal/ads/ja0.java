package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.SparseBooleanArray;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ja0 extends i80 implements o52, yc2 {
    public static final /* synthetic */ int O = 0;
    public uc2 A;
    public ByteBuffer B;
    public boolean C;
    public h80 D;
    public int E;
    public int F;
    public long G;
    public final String H;
    public final int I;
    public Integer K;
    public final ArrayList L;
    public volatile da0 M;

    /* renamed from: u, reason: collision with root package name */
    public final Context f5988u;

    /* renamed from: v, reason: collision with root package name */
    public final ca0 f5989v;

    /* renamed from: w, reason: collision with root package name */
    public final yj2 f5990w;

    /* renamed from: x, reason: collision with root package name */
    public final o80 f5991x;

    /* renamed from: y, reason: collision with root package name */
    public final WeakReference f5992y;

    /* renamed from: z, reason: collision with root package name */
    public final gi2 f5993z;
    public final Object J = new Object();
    public final HashSet N = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ja0(Context context, o80 o80Var, p80 p80Var, Integer num) {
        rn1 ni0Var;
        this.f5988u = context;
        this.f5991x = o80Var;
        this.K = num;
        this.f5992y = new WeakReference(p80Var);
        ca0 ca0Var = new ca0();
        this.f5989v = ca0Var;
        yj2 yj2Var = new yj2(context);
        this.f5990w = yj2Var;
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        i80.s.incrementAndGet();
        xa2 xa2Var = new xa2(context, new xj0(5, this));
        final boolean z6 = true;
        y5.r(!xa2Var.f10470q);
        xa2Var.f10459e = new ej0(22, yj2Var);
        y5.r(!xa2Var.f10470q);
        xa2Var.f10460f = new ej0(21, ca0Var);
        y5.r(!xa2Var.f10470q);
        xa2Var.f10470q = true;
        uc2 uc2Var = new uc2(xa2Var);
        this.A = uc2Var;
        uc2Var.f9530v.a();
        uc2Var.f9529u.R(this);
        this.E = 0;
        this.G = 0L;
        this.F = 0;
        this.L = new ArrayList();
        this.M = null;
        String strZzr = p80Var != null ? p80Var.zzr() : null;
        this.H = (String) (strZzr == null ? kl1.s : new vl1(strZzr)).b();
        this.I = p80Var != null ? p80Var.zzf() : 0;
        final String strZzc = zzv.zzq().zzc(context, p80Var.zzn().afmaVersion);
        if (!this.C || this.B.limit() <= 0) {
            if (((Boolean) zzbe.zzc().a(zn.f11398g2)).booleanValue()) {
                if (!((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue()) {
                    if (o80Var.f7638i) {
                        z6 = false;
                    }
                }
                rn1 hfVar = o80Var.f7641l ? new hf(this, strZzc, z6) : o80Var.h > 0 ? new rn1() { // from class: com.google.android.gms.internal.ads.ga0
                    @Override // com.google.android.gms.internal.ads.rn1
                    public final lo1 zza() {
                        boolean z7 = z6;
                        ja0 ja0Var = this.s;
                        ja0 ja0Var2 = true != z7 ? null : ja0Var;
                        o80 o80Var2 = ja0Var.f5991x;
                        ba0 ba0Var = new ba0(strZzc, ja0Var2, o80Var2.f7634d, o80Var2.f7635e, o80Var2.h);
                        ja0Var.N.add(new WeakReference(ba0Var));
                        return ba0Var;
                    }
                } : new ha0(this, strZzc, z6);
                ni0Var = o80Var.f7638i ? new ni0(6, this, hfVar) : hfVar;
                ByteBuffer byteBuffer = this.B;
                if (byteBuffer != null && byteBuffer.limit() > 0) {
                    byte[] bArr = new byte[this.B.limit()];
                    this.B.get(bArr);
                    ni0Var = new lo(1, ni0Var, bArr);
                }
            }
        } else {
            byte[] bArr2 = new byte[this.B.limit()];
            this.B.get(bArr2);
            ni0Var = new fa0(bArr2);
        }
        this.f5993z = new gi2(ni0Var, new v31(21, ((Boolean) zzbe.zzc().a(zn.f11428l)).booleanValue() ? new bq(18, (byte) 0) : new ed0(15)));
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void b(int i6) {
        h80 h80Var = this.D;
        if (h80Var != null) {
            h80Var.a(i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void e(no noVar) {
        h80 h80Var = this.D;
        if (h80Var != null) {
            h80Var.e("onPlayerError", noVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.o52
    public final void f(wj1 wj1Var, os1 os1Var, boolean z6) {
        if (wj1Var instanceof f22) {
            synchronized (this.J) {
                this.L.add((f22) wj1Var);
            }
        } else if (wj1Var instanceof da0) {
            this.M = (da0) wj1Var;
            p80 p80Var = (p80) this.f5992y.get();
            if (((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue() && p80Var != null && this.M.f3814n) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.M.f3816p));
                map.put("gcacheDownloaded", String.valueOf(this.M.f3817q));
                zzs.zza.post(new q(3, p80Var, map));
            }
        }
    }

    public final void finalize() {
        i80.s.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void h(IOException iOException) {
        h80 h80Var = this.D;
        if (h80Var != null) {
            if (this.f5991x.f7639j) {
                h80Var.c(iOException);
            } else {
                h80Var.e("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void i(int i6) {
        this.F += i6;
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void k(w wVar) {
        p80 p80Var = (p80) this.f5992y.get();
        if (!((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue() || p80Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = wVar.f9977l;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = wVar.f9978m;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = wVar.f9975j;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        p80Var.G("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void l(n90 n90Var) {
        h80 h80Var = this.D;
        if (h80Var != null) {
            h80Var.g(n90Var.f7347a, n90Var.f7348b);
        }
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void m() {
        h80 h80Var = this.D;
        if (h80Var != null) {
            h80Var.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final void n(w wVar) {
        p80 p80Var = (p80) this.f5992y.get();
        if (!((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue() || p80Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(wVar.f9986v));
        map.put("bitRate", String.valueOf(wVar.f9974i));
        map.put("resolution", wVar.f9984t + "x" + wVar.f9985u);
        String str = wVar.f9977l;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = wVar.f9978m;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = wVar.f9975j;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        p80Var.G("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.o52
    public final void o(os1 os1Var, boolean z6, int i6) {
        this.E += i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long q() {
        if (this.M != null && this.M.f3815o) {
            da0 da0Var = this.M;
            if (da0Var.f3813m != null) {
                if (da0Var.f3819t.get() != -1) {
                    return da0Var.f3819t.get();
                }
                synchronized (da0Var) {
                    try {
                        if (da0Var.s == null) {
                            da0Var.s = i70.f5586a.u(new i90(1, da0Var));
                        }
                    } finally {
                    }
                }
                if (da0Var.s.isDone()) {
                    try {
                        da0Var.f3819t.compareAndSet(-1L, ((Long) da0Var.s.get()).longValue());
                        return da0Var.f3819t.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.J) {
            while (!this.L.isEmpty()) {
                long j6 = this.G;
                Map mapZze = ((f22) this.L.remove(0)).zze();
                long j7 = 0;
                if (mapZze != null) {
                    Iterator it = mapZze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && rj1.p("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j7 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused2) {
                                continue;
                            }
                        }
                    }
                }
                this.G = j6 + j7;
            }
        }
        return this.G;
    }

    public final void r(Uri[] uriArr, ByteBuffer byteBuffer, boolean z6) {
        Object yh2Var;
        if (this.A != null) {
            this.B = byteBuffer;
            this.C = z6;
            int length = uriArr.length;
            if (length == 1) {
                yh2Var = t(uriArr[0]);
            } else {
                qh2[] qh2VarArr = new qh2[length];
                for (int i6 = 0; i6 < uriArr.length; i6++) {
                    qh2VarArr[i6] = t(uriArr[i6]);
                }
                yh2Var = new yh2(new aa1(24), qh2VarArr);
            }
            uc2 uc2Var = this.A;
            uc2Var.f9530v.a();
            gb2 gb2Var = uc2Var.f9529u;
            gb2Var.N();
            List listSingletonList = Collections.singletonList(yh2Var);
            gb2Var.N();
            gb2Var.N();
            gb2Var.B(gb2Var.f4982i0);
            gb2Var.t();
            gb2Var.Q++;
            ArrayList arrayList = gb2Var.G;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    arrayList.remove(i7);
                }
                oi2 oi2Var = gb2Var.f4986m0;
                int[] iArr = oi2Var.f7781b;
                int[] iArr2 = new int[iArr.length - size];
                int i8 = 0;
                for (int i9 = 0; i9 < iArr.length; i9++) {
                    int i10 = iArr[i9];
                    if (i10 < 0 || i10 >= size) {
                        int i11 = i9 - i8;
                        if (i10 >= 0) {
                            i10 -= size;
                        }
                        iArr2[i11] = i10;
                    } else {
                        i8++;
                    }
                }
                gb2Var.f4986m0 = new oi2(iArr2, new Random(oi2Var.f7780a.nextLong()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < listSingletonList.size(); i12++) {
                fc2 fc2Var = new fc2((qh2) listSingletonList.get(i12), gb2Var.H);
                arrayList2.add(fc2Var);
                arrayList.add(i12, new fb2(fc2Var.f4608b, fc2Var.f4607a));
            }
            gb2Var.f4986m0 = gb2Var.f4986m0.a(arrayList2.size());
            oc2 oc2Var = new oc2(arrayList, gb2Var.f4986m0);
            boolean zO = oc2Var.o();
            int i13 = oc2Var.f7708d;
            if (!zO && i13 < 0) {
                throw new n0();
            }
            int iG = oc2Var.g(false);
            ic2 ic2VarG = gb2Var.G(gb2Var.f4982i0, oc2Var, gb2Var.F(oc2Var, iG, -9223372036854775807L));
            int i14 = ic2VarG.f5665e;
            if (iG != -1 && i14 != 1) {
                i14 = 4;
                if (!oc2Var.o() && iG < i13) {
                    i14 = 2;
                }
            }
            ic2 ic2VarE = ic2VarG.e(i14);
            ob2 ob2Var = gb2Var.C;
            long jS = j31.s(-9223372036854775807L);
            oi2 oi2Var2 = gb2Var.f4986m0;
            ob2Var.getClass();
            ob2Var.f7701z.d(17, new jb2(arrayList2, oi2Var2, iG, jS)).a();
            gb2Var.M(ic2VarE, 0, (gb2Var.f4982i0.f5662b.f7769a.equals(ic2VarE.f5662b.f7769a) || gb2Var.f4982i0.f5661a.o()) ? false : true, 4, gb2Var.D(ic2VarE), -1);
            uc2 uc2Var2 = this.A;
            uc2Var2.f9530v.a();
            gb2 gb2Var2 = uc2Var2.f9529u;
            gb2Var2.N();
            oa2 oa2Var = gb2Var2.O;
            boolean zX = gb2Var2.x();
            oa2Var.a();
            oa2Var.c(0);
            gb2Var2.L(1, 1, zX);
            ic2 ic2Var = gb2Var2.f4982i0;
            if (ic2Var.f5665e == 1) {
                ic2 ic2VarD = ic2Var.d(null);
                ic2 ic2VarE2 = ic2VarD.e(true != ic2VarD.f5661a.o() ? 2 : 4);
                gb2Var2.Q++;
                gb2Var2.C.f7701z.zzb(29).a();
                gb2Var2.M(ic2VarE2, 1, false, 5, -9223372036854775807L, -1);
            }
            i80.f5598t.incrementAndGet();
        }
    }

    public final void s(boolean z6) {
        jj2 jj2Var;
        boolean zEquals;
        if (this.A == null) {
            return;
        }
        int i6 = 0;
        while (true) {
            uc2 uc2Var = this.A;
            uc2Var.f9530v.a();
            gb2 gb2Var = uc2Var.f9529u;
            gb2Var.N();
            int length = gb2Var.f4992z.length;
            if (i6 >= 2) {
                return;
            }
            yj2 yj2Var = this.f5990w;
            synchronized (yj2Var.f11012c) {
                jj2Var = yj2Var.f11015f;
            }
            jj2Var.getClass();
            ij2 ij2Var = new ij2(jj2Var);
            boolean z7 = !z6;
            SparseBooleanArray sparseBooleanArray = ij2Var.f5790t;
            if (sparseBooleanArray.get(i6) != z7) {
                if (z6) {
                    sparseBooleanArray.delete(i6);
                } else {
                    sparseBooleanArray.put(i6, true);
                }
            }
            jj2 jj2Var2 = new jj2(ij2Var);
            synchronized (yj2Var.f11012c) {
                zEquals = yj2Var.f11015f.equals(jj2Var2);
                yj2Var.f11015f = jj2Var2;
            }
            if (!zEquals) {
                if (jj2Var2.f6091p && yj2Var.f11013d == null) {
                    qs0.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                ob2 ob2Var = yj2Var.f4717a;
                if (ob2Var != null) {
                    ob2Var.f7701z.h(10);
                }
            }
            i6++;
        }
    }

    public final hi2 t(Uri uri) {
        zn1 zn1Var = bo1.f3236t;
        cp1 cp1Var = cp1.f3636w;
        List list = Collections.EMPTY_LIST;
        cp1 cp1Var2 = cp1.f3636w;
        ga gaVar = ga.f4956a;
        tc tcVar = new tc(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new l5(), uri != null ? new q8(uri, cp1Var2) : null, new t7(), lf.f6679z);
        int i6 = this.f5991x.f7636f;
        gi2 gi2Var = this.f5993z;
        gi2Var.f5061b = i6;
        tcVar.f9223b.getClass();
        return new hi2(tcVar, gi2Var.f5060a, gi2Var.f5062c, gi2Var.f5063d, gi2Var.f5061b);
    }

    public final long u() {
        if (this.M != null && this.M.f3815o && this.M.f3816p) {
            return Math.min(this.E, this.M.f3818r);
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void j(qa2 qa2Var) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void p(int i6) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void a(xc2 xc2Var, lh2 lh2Var) {
    }

    @Override // com.google.android.gms.internal.ads.o52
    public final void d(os1 os1Var, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void g(q72 q72Var, lo loVar) {
    }

    @Override // com.google.android.gms.internal.ads.yc2
    public final /* synthetic */ void c(xc2 xc2Var, int i6, long j6) {
    }
}
