package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yh2 extends zg2 {

    /* renamed from: r, reason: collision with root package name */
    public static final tc f10985r;

    /* renamed from: k, reason: collision with root package name */
    public final qh2[] f10986k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10987l;

    /* renamed from: m, reason: collision with root package name */
    public final zy[] f10988m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f10989n;

    /* renamed from: o, reason: collision with root package name */
    public int f10990o = -1;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f10991p;

    /* renamed from: q, reason: collision with root package name */
    public wh2 f10992q;

    static {
        zn1 zn1Var = bo1.f3236t;
        cp1 cp1Var = cp1.f3636w;
        List list = Collections.EMPTY_LIST;
        ga gaVar = ga.f4956a;
        f10985r = new tc("MergingMediaSource", new l5(), null, new t7(), lf.f6679z);
    }

    public yh2(aa1 aa1Var, qh2... qh2VarArr) {
        this.f10986k = qh2VarArr;
        this.f10989n = new ArrayList(Arrays.asList(qh2VarArr));
        this.f10987l = new ArrayList(qh2VarArr.length);
        int i6 = 0;
        while (true) {
            int length = qh2VarArr.length;
            if (i6 >= length) {
                this.f10988m = new zy[length];
                this.f10991p = new long[0][];
                new HashMap();
                sl1.d(new nn1().isEmpty());
                return;
            }
            this.f10987l.add(new ArrayList());
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void b(nh2 nh2Var) {
        vh2 vh2Var = (vh2) nh2Var;
        int i6 = 0;
        while (true) {
            qh2[] qh2VarArr = this.f10986k;
            if (i6 >= qh2VarArr.length) {
                return;
            }
            List list = (List) this.f10987l.get(i6);
            int i7 = 0;
            while (true) {
                if (i7 >= list.size()) {
                    break;
                }
                if (((xh2) list.get(i7)).f10603b.equals(nh2Var)) {
                    list.remove(i7);
                    break;
                }
                i7++;
            }
            qh2 qh2Var = qh2VarArr[i6];
            nh2 nh2Var2 = vh2Var.s[i6];
            if (nh2Var2 instanceof si2) {
                nh2Var2 = ((si2) nh2Var2).s;
            }
            qh2Var.b(nh2Var2);
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void c(tc tcVar) {
        this.f10986k[0].c(tcVar);
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final nh2 e(oh2 oh2Var, u1 u1Var, long j6) {
        qh2[] qh2VarArr = this.f10986k;
        int length = qh2VarArr.length;
        nh2[] nh2VarArr = new nh2[length];
        zy[] zyVarArr = this.f10988m;
        int iA = zyVarArr[0].a(oh2Var.f7769a);
        for (int i6 = 0; i6 < length; i6++) {
            oh2 oh2VarA = oh2Var.a(zyVarArr[i6].f(iA));
            nh2VarArr[i6] = qh2VarArr[i6].e(oh2VarA, u1Var, j6 - this.f10991p[iA][i6]);
            ((List) this.f10987l.get(i6)).add(new xh2(oh2VarA, nh2VarArr[i6]));
        }
        return new vh2(this.f10991p[iA], nh2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final tc g() {
        qh2[] qh2VarArr = this.f10986k;
        return qh2VarArr.length > 0 ? qh2VarArr[0].g() : f10985r;
    }

    @Override // com.google.android.gms.internal.ads.sg2
    public final void o(o52 o52Var) {
        this.f11291j = o52Var;
        int i6 = j31.f5914a;
        Looper looperMyLooper = Looper.myLooper();
        y5.k(looperMyLooper);
        this.f11290i = new Handler(looperMyLooper, null);
        int i7 = 0;
        while (true) {
            qh2[] qh2VarArr = this.f10986k;
            if (i7 >= qh2VarArr.length) {
                return;
            }
            s(Integer.valueOf(i7), qh2VarArr[i7]);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zg2, com.google.android.gms.internal.ads.sg2
    public final void q() {
        super.q();
        Arrays.fill(this.f10988m, (Object) null);
        this.f10990o = -1;
        this.f10992q = null;
        ArrayList arrayList = this.f10989n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f10986k);
    }

    @Override // com.google.android.gms.internal.ads.zg2
    public final void r(Object obj, sg2 sg2Var, zy zyVar) {
        int iB;
        Integer num = (Integer) obj;
        if (this.f10992q != null) {
            return;
        }
        if (this.f10990o == -1) {
            iB = zyVar.b();
            this.f10990o = iB;
        } else {
            int iB2 = zyVar.b();
            int i6 = this.f10990o;
            if (iB2 != i6) {
                this.f10992q = new wh2();
                return;
            }
            iB = i6;
        }
        int length = this.f10991p.length;
        zy[] zyVarArr = this.f10988m;
        if (length == 0) {
            this.f10991p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iB, zyVarArr.length);
        }
        ArrayList arrayList = this.f10989n;
        arrayList.remove(sg2Var);
        zyVarArr[num.intValue()] = zyVar;
        if (arrayList.isEmpty()) {
            p(zyVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zg2
    public final /* bridge */ /* synthetic */ oh2 v(Object obj, oh2 oh2Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f10987l;
        List list = (List) arrayList.get(iIntValue);
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (((xh2) list.get(i6)).f10602a.equals(oh2Var)) {
                return ((xh2) ((List) arrayList.get(0)).get(i6)).f10602a;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.qh2
    public final void zzz() throws wh2 {
        wh2 wh2Var = this.f10992q;
        if (wh2Var != null) {
            throw wh2Var;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((yg2) it.next()).f10977a.zzz();
        }
    }
}
