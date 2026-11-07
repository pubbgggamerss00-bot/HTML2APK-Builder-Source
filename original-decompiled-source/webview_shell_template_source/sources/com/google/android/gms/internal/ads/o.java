package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final j f7540a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7541b = new i();

    /* renamed from: c, reason: collision with root package name */
    public final t01 f7542c = new t01();

    /* renamed from: d, reason: collision with root package name */
    public final t01 f7543d = new t01();

    /* renamed from: e, reason: collision with root package name */
    public final pt0 f7544e;

    /* renamed from: f, reason: collision with root package name */
    public n90 f7545f;

    /* renamed from: g, reason: collision with root package name */
    public n90 f7546g;
    public long h;

    /* renamed from: i, reason: collision with root package name */
    public long f7547i;

    /* renamed from: j, reason: collision with root package name */
    public final s70 f7548j;

    public o(s70 s70Var, j jVar) {
        this.f7548j = s70Var;
        this.f7540a = jVar;
        pt0 pt0Var = new pt0();
        int i6 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i6 = iHighestOneBit + iHighestOneBit;
        }
        pt0Var.f8145a = 0;
        pt0Var.f8146b = 0;
        pt0Var.f8147c = new long[i6];
        pt0Var.f8148d = i6 - 1;
        this.f7544e = pt0Var;
        this.f7546g = n90.f7346d;
        this.f7547i = -9223372036854775807L;
    }

    public final void a(long j6, long j7) {
        s70 s70Var = this.f7548j;
        g gVar = (g) s70Var.f8824u;
        pt0 pt0Var = this.f7544e;
        int i6 = pt0Var.f8146b;
        if (i6 == 0) {
            return;
        }
        if (i6 == 0) {
            throw new NoSuchElementException();
        }
        long j8 = pt0Var.f8147c[pt0Var.f8145a];
        Long l4 = (Long) this.f7543d.c(j8);
        j jVar = this.f7540a;
        if (l4 != null && l4.longValue() != this.h) {
            this.h = l4.longValue();
            jVar.f(2);
        }
        int iA = this.f7540a.a(j8, j6, j7, this.h, false, this.f7541b);
        if (iA != 0 && iA != 1) {
            if (iA == 2 || iA == 3 || iA == 4) {
                this.f7547i = j8;
                pt0Var.a();
                Iterator it = gVar.f4841i.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).zzz();
                }
                y5.k(null);
                throw null;
            }
            return;
        }
        this.f7547i = j8;
        n90 n90Var = (n90) this.f7542c.c(pt0Var.a());
        if (n90Var != null && !n90Var.equals(n90.f7346d) && !n90Var.equals(this.f7546g)) {
            this.f7546g = n90Var;
            tk2 tk2Var = new tk2();
            tk2Var.s = n90Var.f7347a;
            tk2Var.f9337t = n90Var.f7348b;
            tk2Var.c("video/raw");
            s70Var.f8823t = new w(tk2Var);
            Iterator it2 = gVar.f4841i.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).k(n90Var);
            }
        }
        int i7 = jVar.f5884d;
        jVar.f5884d = 3;
        jVar.f5886f = j31.s(jVar.f5890k.zzb());
        if ((i7 != 3) && gVar.f4844l != null) {
            Iterator it3 = gVar.f4841i.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).j();
            }
        }
        if (gVar.f4842j != null) {
            if (((w) s70Var.f8823t) == null) {
                new w(new tk2());
            }
            h hVar = gVar.f4842j;
            gVar.h.zzc();
            hVar.getClass();
        }
        y5.k(null);
        throw null;
    }
}
