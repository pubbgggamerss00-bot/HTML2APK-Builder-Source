package x8;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c0.b;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import f9.hc;
import f9.ic;
import f9.qc;
import i2.e0;
import i2.g;
import j1.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import t0.ff;
import t0.nf;
import t0.of;
import t0.z9;
import x0.j;
import x8.j6;
import z.b;

/* loaded from: classes.dex */
public final class o3 implements eh.q<z.f1, x0.j, Integer, pg.f0> {
    public final /* synthetic */ j6 A;
    public final /* synthetic */ b0.m0 B;
    public final /* synthetic */ HashMap<Long, q8.e0> C;
    public final /* synthetic */ p5.x D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ q8.d0 F;
    public final /* synthetic */ long G;
    public final /* synthetic */ q8.w0 H;
    public final /* synthetic */ float I;
    public final /* synthetic */ x0.n1<String> K;
    public final /* synthetic */ x0.n1<Long> L;
    public final /* synthetic */ x0.n1<String> M;
    public final /* synthetic */ x0.n1<Long> N;
    public final /* synthetic */ x0.n1<Boolean> O;
    public final /* synthetic */ x0.n1<Boolean> P;
    public final /* synthetic */ x0.n1<Long> Q;
    public final /* synthetic */ x0.n1<p1.c> R;
    public final /* synthetic */ x0.n1<Boolean> S;
    public final /* synthetic */ x0.n1<Long> T;
    public final /* synthetic */ x0.n1<List<Long>> U;
    public final /* synthetic */ x0.n1<Long> V;
    public final /* synthetic */ x0.n1<p1.e> W;
    public final /* synthetic */ x0.n1<ProjectEntity> X;
    public final /* synthetic */ x0.n1<ProjectEntity> Y;
    public final /* synthetic */ Long Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<ProjectEntity> f33012a;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ c0.w0 f33013a0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33014b;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33015b0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33016c;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.e> f33017c0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33018d;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f33019d0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33020e;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ v8.q f33021e0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<p1.c> f33022f;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ long f33023f0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.w0 f33024g;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ c.k<String[], Uri> f33025g0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f33026h;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ c.k<String[], Uri> f33027h0;

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ eh.l<j6.a, pg.f0> f33028i0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f33029j;

    /* renamed from: j0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f33030j0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33031k;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f33032k0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<ProjectEntity> f33033l;

    /* renamed from: l0, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f33034l0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n8 f33035m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f33036n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ph.i0 f33037p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ HashMap<Long, p1.e> f33038q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f33039r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33040s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33041t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f33042v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f33043w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map<String, Integer> f33044x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Boolean> f33045y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Map<Long, Integer> f33046z;

    public o3(List list, boolean z10, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4, c0.w0 w0Var, s.b bVar, x0.r3 r3Var, x0.n1 n1Var5, List list2, n8 n8Var, float f10, ph.i0 i0Var, HashMap map, boolean z11, x0.n1 n1Var6, x0.n1 n1Var7, x0.n1 n1Var8, x0.n1 n1Var9, Map map2, x0.n1 n1Var10, Map map3, j6 j6Var, b0.m0 m0Var, HashMap map4, p5.x xVar, Context context, q8.d0 d0Var, long j10, q8.w0 w0Var2, float f11, x0.n1 n1Var11, x0.n1 n1Var12, x0.n1 n1Var13, x0.n1 n1Var14, x0.n1 n1Var15, x0.n1 n1Var16, x0.n1 n1Var17, x0.n1 n1Var18, x0.n1 n1Var19, x0.n1 n1Var20, x0.n1 n1Var21, x0.n1 n1Var22, x0.n1 n1Var23, x0.n1 n1Var24, x0.n1 n1Var25, Long l10, c0.w0 w0Var3, x0.n1 n1Var26, x0.n1 n1Var27, s.b bVar2, v8.q qVar, long j11, c.k kVar, c.k kVar2, eh.l lVar, x0.n1 n1Var28, x0.n1 n1Var29, x0.n1 n1Var30) {
        this.f33012a = list;
        this.f33014b = z10;
        this.f33016c = n1Var;
        this.f33018d = n1Var2;
        this.f33020e = n1Var3;
        this.f33022f = n1Var4;
        this.f33024g = w0Var;
        this.f33026h = bVar;
        this.f33029j = r3Var;
        this.f33031k = n1Var5;
        this.f33033l = list2;
        this.f33035m = n8Var;
        this.f33036n = f10;
        this.f33037p = i0Var;
        this.f33038q = map;
        this.f33039r = z11;
        this.f33040s = n1Var6;
        this.f33041t = n1Var7;
        this.f33042v = n1Var8;
        this.f33043w = n1Var9;
        this.f33044x = map2;
        this.f33045y = n1Var10;
        this.f33046z = map3;
        this.A = j6Var;
        this.B = m0Var;
        this.C = map4;
        this.D = xVar;
        this.E = context;
        this.F = d0Var;
        this.G = j10;
        this.H = w0Var2;
        this.I = f11;
        this.K = n1Var11;
        this.L = n1Var12;
        this.M = n1Var13;
        this.N = n1Var14;
        this.O = n1Var15;
        this.P = n1Var16;
        this.Q = n1Var17;
        this.R = n1Var18;
        this.S = n1Var19;
        this.T = n1Var20;
        this.U = n1Var21;
        this.V = n1Var22;
        this.W = n1Var23;
        this.X = n1Var24;
        this.Y = n1Var25;
        this.Z = l10;
        this.f33013a0 = w0Var3;
        this.f33015b0 = n1Var26;
        this.f33017c0 = n1Var27;
        this.f33019d0 = bVar2;
        this.f33021e0 = qVar;
        this.f33023f0 = j11;
        this.f33025g0 = kVar;
        this.f33027h0 = kVar2;
        this.f33028i0 = lVar;
        this.f33030j0 = n1Var28;
        this.f33032k0 = n1Var29;
        this.f33034l0 = n1Var30;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List list, List list2, final n8 n8Var, float f10, final x0.n1 n1Var, final s.b bVar, final ph.i0 i0Var, final HashMap map, final boolean z10, final x0.n1 n1Var2, final x0.n1 n1Var3, final x0.n1 n1Var4, final x0.n1 n1Var5, final Map map2, final x0.r3 r3Var, final x0.n1 n1Var6, final Map map3, final x0.n1 n1Var7, final j6 j6Var, final b0.m0 m0Var, final HashMap map4, final p5.x xVar, final Context context, final q8.d0 d0Var, final long j10, final q8.w0 w0Var, final float f11, final x0.n1 n1Var8, final x0.n1 n1Var9, final x0.n1 n1Var10, final x0.n1 n1Var11, final x0.n1 n1Var12, final x0.n1 n1Var13, final x0.n1 n1Var14, x0.n1 n1Var15, final x0.n1 n1Var16, final x0.n1 n1Var17, final x0.n1 n1Var18, final x0.n1 n1Var19, final x0.n1 n1Var20, final x0.n1 n1Var21, final x0.n1 n1Var22, final x0.n1 n1Var23, final FolderEntity folderEntity, c0.w0 state, boolean z11, x0.j jVar, int i10) {
        t.i1 i1Var;
        b.a aVar;
        x0.j jVar2;
        x0.j jVar3 = jVar;
        jVar3.L(-1828074251);
        Long lValueOf = folderEntity != null ? Long.valueOf(folderEntity.getId()) : null;
        boolean z12 = g5.f32665a;
        String str = (String) n1Var5.getValue();
        jVar3.L(-1042433128);
        boolean zK = jVar3.K(str) | jVar3.K(list) | jVar3.K(lValueOf);
        Object objG = jVar3.g();
        j.a.C0321a c0321a = j.a.f31715a;
        Object obj = objG;
        if (zK || objG == c0321a) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                ProjectEntity projectEntity = (ProjectEntity) obj2;
                if (kotlin.jvm.internal.r.a(projectEntity.getFolderId(), lValueOf) && (((String) n1Var5.getValue()) == null || kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(projectEntity.getKind()), (String) n1Var5.getValue()))) {
                    arrayList.add(obj2);
                }
            }
            jVar3.C(arrayList);
            obj = arrayList;
        }
        List list3 = (List) obj;
        jVar3.B();
        if (z11) {
            list3 = list2;
        }
        t.i1 i1VarA = t.k1.a(jVar3);
        kotlin.jvm.internal.r.e(state, "state");
        jVar3.L(-523294824);
        jVar3.L(901506590);
        boolean zK2 = jVar3.K(state) | jVar3.K(i1VarA);
        Object objG2 = jVar3.g();
        if (zK2 || objG2 == c0321a) {
            objG2 = new v7(state, i1VarA);
            jVar3.C(objG2);
        }
        v7 v7Var = (v7) objG2;
        jVar3.B();
        jVar3.B();
        int i11 = (folderEntity == null && ((List) n1Var6.getValue()).isEmpty()) ? 1 : 2;
        b.a aVar2 = new b.a(DilithiumEngine.DilithiumPolyT1PackedBytes);
        androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(androidx.compose.foundation.layout.g.f976c, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
        jVar3.L(-1042387424);
        androidx.compose.ui.d dVarA = d.a.f1143b;
        if (z11) {
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.input.nestedscroll.a.a(dVarA, v7Var, null);
            jVar3.L(-1042382858);
            Object objG3 = jVar3.g();
            if (objG3 == c0321a) {
                objG3 = new ic(n1Var15, 2);
                jVar3.C(objG3);
            }
            jVar3.B();
            androidx.compose.ui.d dVarA3 = androidx.compose.ui.layout.c.a(dVarA2, (eh.l) objG3);
            kotlin.jvm.internal.r.e(dVarA3, "<this>");
            jVar3.L(1740232042);
            y1.a aVar3 = (y1.a) jVar3.f(j2.j2.f14783l);
            jVar3.L(-1689042572);
            boolean zK3 = jVar3.K(n8Var) | jVar3.l(aVar3);
            Object objG4 = jVar3.g();
            if (zK3 || objG4 == c0321a) {
                objG4 = new r8(n8Var, aVar3);
                jVar3.C(objG4);
            }
            jVar3.B();
            dVarA = c2.s0.a(dVarA3, n8Var, (PointerInputEventHandler) objG4);
            jVar3.B();
        }
        jVar3.B();
        androidx.compose.ui.d dVarH = dVarJ.h(dVarA);
        z.g1 g1VarD = androidx.compose.foundation.layout.f.d(74, 16 + f10, 5);
        float f12 = 12;
        b.i iVarH = z.b.h(f12);
        b.i iVarH2 = z.b.h(f12);
        jVar3.L(-1042357867);
        boolean zK4 = jVar3.K(w0Var) | jVar3.K(n1Var) | ((((i10 & 14) ^ 6) > 4 && jVar3.K(folderEntity)) || (i10 & 6) == 4) | jVar3.l(bVar) | jVar3.l(i0Var) | jVar3.l(map) | jVar3.c(z10) | jVar3.K(n1Var2) | jVar3.K(n1Var3) | jVar3.K(n1Var4) | jVar3.l(list) | jVar3.K(n1Var5) | jVar3.l(map2) | jVar3.K(r3Var) | jVar3.K(n1Var6) | jVar3.K(n8Var) | jVar3.l(map3) | jVar3.K(n1Var7) | jVar3.l(j6Var) | jVar3.K(m0Var) | jVar3.l(list3) | jVar3.i(i11) | jVar3.l(map4) | jVar3.l(xVar) | jVar3.l(context) | jVar3.K(d0Var) | jVar3.j(j10) | jVar3.h(f11) | jVar3.K(n1Var8) | jVar3.K(n1Var9) | jVar3.K(n1Var10) | jVar3.K(n1Var11) | jVar3.K(n1Var12) | jVar3.K(n1Var13) | jVar3.K(n1Var14);
        Object objG5 = jVar3.g();
        if (zK4 || objG5 == c0321a) {
            i1Var = i1VarA;
            final List list4 = list3;
            final int i12 = i11;
            aVar = aVar2;
            objG5 = new eh.l() { // from class: x8.b2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
                /* JADX WARN: Type inference failed for: r0v1 */
                /* JADX WARN: Type inference failed for: r0v15 */
                /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
                @Override // eh.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj3) {
                    x0.n1 n1Var24;
                    x0.n1 n1Var25;
                    boolean z13;
                    ?? r02;
                    x0.n1 n1Var26;
                    x0.n1 n1Var27;
                    FolderEntity folderEntity2;
                    List list5;
                    x0.n1 n1Var28;
                    x0.r3 r3Var2;
                    n8 n8Var2;
                    c0.p0 LazyVerticalGrid = (c0.p0) obj3;
                    kotlin.jvm.internal.r.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                    FolderEntity folderEntity3 = folderEntity;
                    x0.n1 n1Var29 = n1Var;
                    s.b bVar2 = bVar;
                    ph.i0 i0Var2 = i0Var;
                    HashMap map5 = map;
                    boolean z14 = z10;
                    x0.n1 n1Var30 = n1Var16;
                    x0.n1 n1Var31 = n1Var17;
                    x0.n1 n1Var32 = n1Var18;
                    x0.n1 n1Var33 = n1Var19;
                    x0.n1 n1Var34 = n1Var20;
                    x0.n1 n1Var35 = n1Var21;
                    if (folderEntity3 != null) {
                        n1Var25 = n1Var35;
                        r02 = 1;
                        n1Var24 = n1Var34;
                        z13 = z14;
                        n1Var26 = n1Var30;
                        n1Var27 = n1Var31;
                        LazyVerticalGrid.c("folder_header", new g9.v(1), new f1.b(33299780, true, new f3(folderEntity3, n1Var29, bVar2, i0Var2, map5, z14, n1Var2, n1Var3, n1Var30, n1Var31, n1Var32, n1Var33, n1Var24, n1Var25)));
                    } else {
                        n1Var24 = n1Var34;
                        n1Var25 = n1Var35;
                        z13 = z14;
                        r02 = 1;
                        n1Var26 = n1Var30;
                        n1Var27 = n1Var31;
                    }
                    boolean z15 = g5.f32665a;
                    boolean zBooleanValue = ((Boolean) n1Var4.getValue()).booleanValue();
                    List list6 = list;
                    x0.n1 n1Var36 = n1Var5;
                    x0.r3 r3Var3 = r3Var;
                    if (!zBooleanValue || list6.isEmpty()) {
                        folderEntity2 = folderEntity3;
                    } else {
                        folderEntity2 = folderEntity3;
                        LazyVerticalGrid.c("kind_filters", new q8.q(r02), new f1.b(1233876475, r02, new h3(map2, n1Var36, r3Var3, n1Var32)));
                    }
                    n8 n8Var3 = n8Var;
                    j6 j6Var2 = j6Var;
                    if (folderEntity2 == null) {
                        x0.n1 n1Var37 = n1Var6;
                        if (((List) n1Var37.getValue()).isEmpty()) {
                            list5 = list6;
                            n1Var28 = n1Var36;
                            r3Var2 = r3Var3;
                            n8Var2 = n8Var3;
                        } else {
                            r3Var2 = r3Var3;
                            list5 = list6;
                            n1Var28 = n1Var36;
                            n8Var2 = n8Var3;
                            boolean z16 = z13;
                            z13 = z16;
                            LazyVerticalGrid.c("folders", new c2(0), new f1.b(410065660, r02, new k3(n8Var2, map3, map5, bVar2, n1Var29, i0Var2, z16, n1Var7, j6Var2, m0Var, n1Var26, n1Var27, n1Var37, n1Var33, n1Var32, n1Var24, n1Var25)));
                        }
                    }
                    List list7 = list4;
                    if (list7.isEmpty() && (folderEntity2 != null || ((String) n1Var28.getValue()) != null)) {
                        LazyVerticalGrid.c("empty_filter", new d2(0), new f1.b(-413745155, r02, new l3(n1Var28)));
                    }
                    LazyVerticalGrid.e(list7.size(), new m3(new c9.y(r02), list7), new j3.b(list7, r02), new f1.b(1229287273, true, new n3(list7, i12, n8Var2, map4, j6Var2, xVar, context, d0Var, j10, w0Var, f11, z13, n1Var8, n1Var9, n1Var10, n1Var11, n1Var12, n1Var13, n1Var14, n1Var26, n1Var27, list5, list7, r3Var2, n1Var22, n1Var23)));
                    return pg.f0.f21461a;
                }
            };
            x0.j jVar4 = jVar;
            jVar4.C(objG5);
            jVar2 = jVar4;
        } else {
            i1Var = i1VarA;
            aVar = aVar2;
            jVar2 = jVar3;
        }
        jVar2.B();
        c0.h.a(aVar, dVarH, state, g1VarD, iVarH2, iVarH, null, z11, i1Var, (eh.l) objG5, jVar2, 1769472, 144);
        jVar.B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a40  */
    /* JADX WARN: Type inference failed for: r2v45, types: [androidx.compose.ui.d] */
    @Override // eh.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 b(z.f1 f1Var, x0.j jVar, Integer num) {
        x0.n1<String> n1Var;
        Object obj;
        List<ProjectEntity> list;
        x0.n1 n1Var2;
        j1.f fVar;
        d.a aVar;
        x0.n1<Long> n1Var3;
        Map<Long, Integer> map;
        b0.m0 m0Var;
        HashMap<Long, q8.e0> map2;
        long j10;
        long j11;
        q8.d0 d0Var;
        q8.w0 w0Var;
        x0.n1<p1.c> n1Var4;
        x0.n1<List<Long>> n1Var5;
        x0.n1<ProjectEntity> n1Var6;
        float f10;
        List<ProjectEntity> list2;
        final x0.n1<p1.e> n1Var7;
        List<ProjectEntity> list3;
        Object next;
        List<ProjectEntity> list4;
        float f11;
        x0.n1<Long> n1Var8;
        x0.n1 n1Var9;
        j6 j6Var;
        p5.x xVar;
        j1.f fVar2;
        int i10;
        d.a aVar2;
        d.a aVarA;
        boolean z10;
        x0.n1<Boolean> n1Var10;
        boolean zL;
        Object objG;
        boolean z11;
        List<ProjectEntity> list5;
        d.a aVar3;
        Object obj2;
        androidx.compose.ui.d dVarA;
        FillElement fillElement;
        boolean z12;
        Object objG2;
        x0.n1<Long> n1Var11;
        d.a aVar4;
        g.a.d dVar;
        Object obj3;
        e0.a aVar5;
        final x0.n1<Boolean> n1Var12;
        int i11;
        g.a.b bVar;
        g.a.C0128a c0128a;
        z.f1 padding = f1Var;
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        kotlin.jvm.internal.r.e(padding, "padding");
        if ((iIntValue & 6) == 0) {
            iIntValue |= jVar2.K(padding) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && jVar2.s()) {
            jVar2.v();
        } else {
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.f.g(androidx.compose.foundation.layout.g.f976c, padding);
            j1.f fVar3 = d.a.f14602a;
            g2.l0 l0VarD = z.g.d(fVar3, false);
            int iD = jVar2.D();
            x0.a2 a2VarY = jVar2.y();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarG, jVar2);
            i2.g.f13861o.getClass();
            e0.a aVar6 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar6);
            } else {
                jVar2.z();
            }
            g.a.b bVar2 = g.a.f13867f;
            ph.v1.j(bVar2, l0VarD, jVar2);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarY, jVar2);
            g.a.C0128a c0128a2 = g.a.f13868g;
            if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                l9.i.a(iD, jVar2, iD, c0128a2);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, jVar2);
            jVar2.L(1094562139);
            List<ProjectEntity> list6 = this.f33012a;
            boolean zIsEmpty = list6.isEmpty();
            d.a aVar7 = d.a.f1143b;
            androidx.compose.foundation.layout.b bVar3 = androidx.compose.foundation.layout.b.f961a;
            Object obj4 = j.a.f31715a;
            x0.n1<Boolean> n1Var13 = this.f33018d;
            x0.n1 n1Var14 = this.f33020e;
            x0.n1<Long> n1Var15 = this.f33031k;
            float f12 = this.f33036n;
            j6 j6Var2 = this.A;
            p5.x xVar2 = this.D;
            final Context context = this.E;
            x0.n1<String> n1Var16 = this.K;
            if (zIsEmpty && ((List) n1Var14.getValue()).isEmpty()) {
                n1Var = n1Var16;
                fVar2 = fVar3;
                n1Var9 = n1Var14;
                n1Var8 = n1Var15;
                aVar = aVar7;
                f11 = f12;
                obj = obj4;
                list4 = list6;
                j6Var = j6Var2;
                xVar = xVar2;
                i10 = 0;
            } else {
                x0.s3 s3Var = t0.f2.f25858a;
                n1Var = n1Var16;
                long j12 = ((t0.e2) jVar2.f(s3Var)).f25768n;
                long jF = c2.n0.f(q1.b1.c(0.85f, ((t0.e2) jVar2.f(s3Var)).f25770p), j12);
                final float fN0 = ((f3.d) jVar2.f(j2.j2.f14779h)).N0(16);
                androidx.compose.ui.d dVarE = bVar3.e();
                jVar2.L(1094961009);
                Object objG3 = jVar2.g();
                x0.n1<p1.c> n1Var17 = this.f33022f;
                if (objG3 == obj4) {
                    objG3 = new hc(n1Var17, 2);
                    jVar2.C(objG3);
                }
                jVar2.B();
                androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.c.a(dVarE, (eh.l) objG3);
                g2.l0 l0VarD2 = z.g.d(fVar3, false);
                int iD2 = jVar2.D();
                x0.a2 a2VarY2 = jVar2.y();
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarA2, jVar2);
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar6);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar2, l0VarD2, jVar2);
                ph.v1.j(dVar2, a2VarY2, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD2))) {
                    l9.i.a(iD2, jVar2, iD2, c0128a2);
                }
                ph.v1.j(cVar, dVarC2, jVar2);
                jVar2.L(-1153565644);
                boolean zBooleanValue = this.f33029j.getValue().booleanValue();
                final s.b<Float, s.o> bVar4 = this.f33026h;
                List<ProjectEntity> list7 = this.f33033l;
                n8 n8Var = this.f33035m;
                ph.i0 i0Var = this.f33037p;
                HashMap<Long, p1.e> map3 = this.f33038q;
                boolean z13 = this.f33039r;
                x0.n1<Boolean> n1Var18 = this.f33040s;
                x0.n1<Boolean> n1Var19 = this.f33041t;
                x0.n1 n1Var20 = this.f33042v;
                x0.n1<String> n1Var21 = this.f33043w;
                Map<String, Integer> map4 = this.f33044x;
                x0.r3<Boolean> r3Var = this.f33045y;
                Map<Long, Integer> map5 = this.f33046z;
                b0.m0 m0Var2 = this.B;
                HashMap<Long, q8.e0> map6 = this.C;
                q8.d0 d0Var2 = this.F;
                long j13 = this.G;
                q8.w0 w0Var2 = this.H;
                float f13 = this.I;
                x0.n1<Long> n1Var22 = this.L;
                x0.n1<String> n1Var23 = this.M;
                x0.n1<Long> n1Var24 = this.N;
                x0.n1<Boolean> n1Var25 = this.O;
                x0.n1<Boolean> n1Var26 = this.P;
                x0.n1<Long> n1Var27 = this.Q;
                x0.n1<p1.c> n1Var28 = this.R;
                x0.n1<Boolean> n1Var29 = this.S;
                x0.n1<Long> n1Var30 = this.T;
                x0.n1<List<Long>> n1Var31 = this.U;
                x0.n1<Long> n1Var32 = this.V;
                x0.n1<p1.e> n1Var33 = this.W;
                x0.n1<ProjectEntity> n1Var34 = this.X;
                x0.n1<ProjectEntity> n1Var35 = this.Y;
                if (zBooleanValue) {
                    if (n1Var15.getValue() == null) {
                        d0Var = d0Var2;
                        n1Var4 = n1Var28;
                        z11 = true;
                    } else {
                        d0Var = d0Var2;
                        n1Var4 = n1Var28;
                        z11 = false;
                    }
                    n1Var3 = n1Var15;
                    fVar = fVar3;
                    aVar = aVar7;
                    m0Var = m0Var2;
                    map2 = map6;
                    j10 = jF;
                    obj = obj4;
                    j11 = j12;
                    f10 = f13;
                    list2 = list7;
                    n1Var2 = n1Var14;
                    map = map5;
                    w0Var = w0Var2;
                    n1Var5 = n1Var31;
                    a(list6, list2, n8Var, f12, n1Var3, bVar4, i0Var, map3, z13, n1Var18, n1Var19, n1Var20, n1Var21, map4, r3Var, n1Var2, map, n1Var13, j6Var2, m0Var, map2, xVar2, context, d0Var, j13, w0Var, f10, n1Var, n1Var22, n1Var23, n1Var24, n1Var25, n1Var26, n1Var27, n1Var4, n1Var29, n1Var30, n1Var5, n1Var32, n1Var17, n1Var33, n1Var34, n1Var35, null, this.f33024g, z11, jVar2, 6);
                    list = list6;
                    n1Var26 = n1Var26;
                    n1Var27 = n1Var27;
                    n1Var29 = n1Var29;
                    n1Var7 = n1Var33;
                    j13 = j13;
                    n1Var22 = n1Var22;
                    n1Var23 = n1Var23;
                    n1Var24 = n1Var24;
                    n1Var6 = n1Var35;
                    r3Var = r3Var;
                    n1Var25 = n1Var25;
                } else {
                    obj = obj4;
                    list = list6;
                    n1Var2 = n1Var14;
                    fVar = fVar3;
                    aVar = aVar7;
                    n1Var3 = n1Var15;
                    map = map5;
                    m0Var = m0Var2;
                    map2 = map6;
                    j10 = jF;
                    j11 = j12;
                    d0Var = d0Var2;
                    w0Var = w0Var2;
                    n1Var4 = n1Var28;
                    n1Var5 = n1Var31;
                    n1Var6 = n1Var35;
                    f10 = f13;
                    list2 = list7;
                    n1Var7 = n1Var33;
                }
                jVar2 = jVar2;
                jVar2.B();
                Iterator it = ((List) n1Var2.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list3 = list2;
                        next = null;
                        break;
                    }
                    next = it.next();
                    long id2 = ((FolderEntity) next).getId();
                    list3 = list2;
                    Long l10 = this.Z;
                    if (l10 != null && id2 == l10.longValue()) {
                        break;
                    }
                    list2 = list3;
                }
                FolderEntity folderEntity = (FolderEntity) next;
                jVar2.L(-1153556439);
                if (folderEntity != null) {
                    androidx.compose.ui.d dVarE2 = bVar3.e();
                    jVar2.L(-1153552282);
                    boolean zL2 = jVar2.l(bVar4) | jVar2.h(fN0);
                    Object objG4 = jVar2.g();
                    Object obj5 = obj;
                    if (zL2 || objG4 == obj5) {
                        objG4 = new eh.l() { // from class: x8.e2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // eh.l
                            public final Object invoke(Object obj6) {
                                q1.l1 graphicsLayer = (q1.l1) obj6;
                                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                                float fFloatValue = ((Number) bVar4.d()).floatValue();
                                if (fFloatValue >= 1.0f) {
                                    return pg.f0.f21461a;
                                }
                                boolean z14 = g5.f32665a;
                                p1.e eVar = (p1.e) n1Var7.getValue();
                                graphicsLayer.C(true);
                                if (eVar == null) {
                                    graphicsLayer.f(fFloatValue);
                                } else {
                                    graphicsLayer.p1(new v8(p1.f.b(eVar, p1.f.a(0L, graphicsLayer.i()), fFloatValue), h3.b.b(fN0, CropImageView.DEFAULT_ASPECT_RATIO, fFloatValue)));
                                }
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG4);
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarA3 = androidx.compose.ui.graphics.a.a(dVarE2, (eh.l) objG4);
                    jVar2.L(-1153527695);
                    x0.n1<p1.e> n1Var36 = n1Var7;
                    final long j14 = j11;
                    boolean zJ = jVar2.j(j10) | jVar2.j(j14) | jVar2.l(bVar4);
                    Object objG5 = jVar2.g();
                    if (zJ || objG5 == obj5) {
                        final long j15 = j10;
                        objG5 = new eh.l() { // from class: x8.f2
                            @Override // eh.l
                            public final Object invoke(Object obj6) {
                                s1.e drawBehind = (s1.e) obj6;
                                kotlin.jvm.internal.r.e(drawBehind, "$this$drawBehind");
                                s1.e.X0(drawBehind, c2.n0.g(j15, j14, jh.j.l(((Number) bVar4.d()).floatValue() / 0.6f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f)), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar2.C(objG5);
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarA4 = androidx.compose.ui.draw.a.a(dVarA3, (eh.l) objG5);
                    jVar2.L(-1153508799);
                    if (bVar4.e() || n1Var32.getValue() != null) {
                        pg.f0 f0Var = pg.f0.f21461a;
                        jVar2.L(-1153506240);
                        Object objG6 = jVar2.g();
                        if (objG6 == obj5) {
                            objG6 = j2.f32757a;
                            jVar2.C(objG6);
                        }
                        jVar2.B();
                        aVar2 = aVar;
                        aVarA = c2.s0.a(aVar2, f0Var, (PointerInputEventHandler) objG6);
                    } else {
                        d.a aVar8 = aVar;
                        aVar2 = aVar8;
                        aVarA = aVar8;
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarH = dVarA4.h(aVarA);
                    aVar = aVar2;
                    j1.f fVar4 = fVar;
                    g2.l0 l0VarD3 = z.g.d(fVar4, false);
                    int iD3 = jVar2.D();
                    x0.n1<Long> n1Var37 = n1Var3;
                    x0.a2 a2VarY3 = jVar2.y();
                    androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarH, jVar2);
                    i2.g.f13861o.getClass();
                    e0.a aVar9 = g.a.f13863b;
                    if (jVar2.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar2.r();
                    if (jVar2.m()) {
                        jVar2.w(aVar9);
                    } else {
                        jVar2.z();
                    }
                    g.a.b bVar5 = g.a.f13867f;
                    ph.v1.j(bVar5, l0VarD3, jVar2);
                    g.a.d dVar3 = g.a.f13866e;
                    ph.v1.j(dVar3, a2VarY3, jVar2);
                    g.a.C0128a c0128a3 = g.a.f13868g;
                    if (jVar2.m()) {
                        z10 = z13;
                        n1Var10 = n1Var18;
                    } else {
                        z10 = z13;
                        n1Var10 = n1Var18;
                        if (!kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD3))) {
                        }
                        g.a.c cVar2 = g.a.f13865d;
                        ph.v1.j(cVar2, dVarC3, jVar2);
                        androidx.compose.ui.d dVarE3 = bVar3.e();
                        jVar2.L(-430470209);
                        zL = jVar2.l(bVar4);
                        objG = jVar2.g();
                        if (!zL || objG == obj5) {
                            objG = new p5.q0(bVar4, 1);
                            jVar2.C(objG);
                        }
                        jVar2.B();
                        androidx.compose.ui.d dVarA5 = androidx.compose.ui.graphics.a.a(dVarE3, (eh.l) objG);
                        g2.l0 l0VarD4 = z.g.d(fVar4, false);
                        int iD4 = jVar2.D();
                        x0.a2 a2VarY4 = jVar2.y();
                        androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarA5, jVar2);
                        if (jVar2.t() != null) {
                            c9.u1.d();
                            throw null;
                        }
                        jVar2.r();
                        if (jVar2.m()) {
                            jVar2.w(aVar9);
                        } else {
                            jVar2.z();
                        }
                        ph.v1.j(bVar5, l0VarD4, jVar2);
                        ph.v1.j(dVar3, a2VarY4, jVar2);
                        if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD4))) {
                            l9.i.a(iD4, jVar2, iD4, c0128a3);
                        }
                        ph.v1.j(cVar2, dVarC4, jVar2);
                        List<ProjectEntity> list8 = list;
                        obj = obj5;
                        fVar2 = fVar4;
                        i10 = 0;
                        List<ProjectEntity> list9 = list3;
                        a(list8, list9, n8Var, f12, n1Var37, bVar4, i0Var, map3, z10, n1Var10, n1Var19, n1Var20, n1Var21, map4, r3Var, n1Var2, map, n1Var13, j6Var2, m0Var, map2, xVar2, context, d0Var, j13, w0Var, f10, n1Var, n1Var22, n1Var23, n1Var24, n1Var25, n1Var26, n1Var27, n1Var4, n1Var29, n1Var30, n1Var5, n1Var32, n1Var17, n1Var36, n1Var34, n1Var6, folderEntity, this.f33013a0, n1Var37.getValue() != null, jVar2, 0);
                        list4 = list8;
                        n1Var8 = n1Var37;
                        n1Var9 = n1Var2;
                        n1Var13 = n1Var13;
                        j6Var = j6Var2;
                        xVar = xVar2;
                        jVar2 = jVar2;
                        f11 = f12;
                        jVar2.H();
                        jVar2.H();
                    }
                    l9.i.a(iD3, jVar2, iD3, c0128a3);
                    g.a.c cVar22 = g.a.f13865d;
                    ph.v1.j(cVar22, dVarC3, jVar2);
                    androidx.compose.ui.d dVarE32 = bVar3.e();
                    jVar2.L(-430470209);
                    zL = jVar2.l(bVar4);
                    objG = jVar2.g();
                    if (!zL) {
                        objG = new p5.q0(bVar4, 1);
                        jVar2.C(objG);
                        jVar2.B();
                        androidx.compose.ui.d dVarA52 = androidx.compose.ui.graphics.a.a(dVarE32, (eh.l) objG);
                        g2.l0 l0VarD42 = z.g.d(fVar4, false);
                        int iD42 = jVar2.D();
                        x0.a2 a2VarY42 = jVar2.y();
                        androidx.compose.ui.d dVarC42 = androidx.compose.ui.c.c(dVarA52, jVar2);
                        if (jVar2.t() != null) {
                        }
                    }
                } else {
                    list4 = list;
                    f11 = f12;
                    n1Var8 = n1Var3;
                    n1Var9 = n1Var2;
                    n1Var13 = n1Var13;
                    j6Var = j6Var2;
                    xVar = xVar2;
                    fVar2 = fVar;
                    i10 = 0;
                }
                jVar2.B();
                jVar2.H();
            }
            jVar2.B();
            float fN02 = ((f3.d) jVar2.f(j2.j2.f14779h)).N0(36);
            androidx.compose.ui.d dVarE4 = bVar3.e();
            x0.s3 s3Var2 = t0.f2.f25858a;
            z.g.a(q8.b1.a(dVarE4, ((t0.e2) jVar2.f(s3Var2)).f25768n, fN02, 8), jVar2, i10);
            FillElement fillElement2 = androidx.compose.foundation.layout.g.f976c;
            androidx.compose.ui.d dVarJ = androidx.compose.foundation.layout.f.j(fillElement2, 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            jVar2.L(1095071634);
            boolean z14 = this.f33014b;
            if (z14) {
                list5 = list4;
                aVar3 = aVar;
                obj2 = obj;
                dVarA = aVar3;
            } else {
                jVar2.L(1095073294);
                Object objG7 = jVar2.g();
                obj2 = obj;
                if (objG7 == obj2) {
                    list5 = list4;
                    objG7 = new qc(this.f33015b0, 1);
                    jVar2.C(objG7);
                } else {
                    list5 = list4;
                }
                jVar2.B();
                aVar3 = aVar;
                dVarA = androidx.compose.ui.layout.c.a(aVar3, (eh.l) objG7);
            }
            jVar2.B();
            androidx.compose.ui.d dVarH2 = dVarJ.h(dVarA);
            b.k kVar = z.b.f34446c;
            z.q qVarA = z.o.a(kVar, d.a.f14614m, jVar2, i10);
            int iD5 = jVar2.D();
            x0.a2 a2VarY5 = jVar2.y();
            androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarH2, jVar2);
            i2.g.f13861o.getClass();
            x0.n1<Boolean> n1Var38 = n1Var13;
            e0.a aVar10 = g.a.f13863b;
            if (jVar2.t() == null) {
                c9.u1.d();
                throw null;
            }
            jVar2.r();
            if (jVar2.m()) {
                jVar2.w(aVar10);
            } else {
                jVar2.z();
            }
            g.a.b bVar6 = g.a.f13867f;
            ph.v1.j(bVar6, qVarA, jVar2);
            g.a.d dVar4 = g.a.f13866e;
            ph.v1.j(dVar4, a2VarY5, jVar2);
            g.a.C0128a c0128a4 = g.a.f13868g;
            if (jVar2.m()) {
                fillElement = fillElement2;
                z12 = z14;
            } else {
                fillElement = fillElement2;
                z12 = z14;
                if (!kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD5))) {
                }
                g.a.c cVar3 = g.a.f13865d;
                ph.v1.j(cVar3, dVarC5, jVar2);
                p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, 8), jVar2);
                float f14 = 56;
                androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), f14);
                jVar2.L(-1153441326);
                objG2 = jVar2.g();
                final p5.x xVar3 = xVar;
                final x0.n1<p1.e> n1Var39 = this.f33017c0;
                if (objG2 != obj2) {
                    n1Var11 = n1Var8;
                    objG2 = new q8.h0(n1Var39, 1);
                    jVar2.C(objG2);
                } else {
                    n1Var11 = n1Var8;
                }
                jVar2.B();
                androidx.compose.ui.d dVarA6 = androidx.compose.ui.layout.c.a(dVarF, (eh.l) objG2);
                j1.f fVar5 = d.a.f14606e;
                Object obj6 = obj2;
                g2.l0 l0VarD5 = z.g.d(fVar5, false);
                int iD6 = jVar2.D();
                x0.a2 a2VarY6 = jVar2.y();
                androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarA6, jVar2);
                if (jVar2.t() != null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar10);
                } else {
                    jVar2.z();
                }
                ph.v1.j(bVar6, l0VarD5, jVar2);
                ph.v1.j(dVar4, a2VarY6, jVar2);
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD6))) {
                    l9.i.a(iD6, jVar2, iD6, c0128a4);
                }
                ph.v1.j(cVar3, dVarC6, jVar2);
                boolean z15 = !z12;
                androidx.compose.ui.d dVarA7 = e.a(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), f14), this.f33019d0);
                h0.e eVarA = h0.f.a(16);
                z.g1 g1Var = t0.m0.f26400a;
                long j16 = ((t0.e2) jVar2.f(s3Var2)).f25751a;
                long j17 = ((t0.e2) jVar2.f(s3Var2)).f25753b;
                d.a aVar11 = aVar3;
                x0.j jVar3 = jVar2;
                FillElement fillElement3 = fillElement;
                final x0.n1<String> n1Var40 = n1Var;
                boolean z16 = z12;
                t0.l0 l0VarA = t0.m0.a(j16, j17, 0L, jVar3, 12);
                float f15 = 0;
                z.g1 g1Var2 = new z.g1(f15, f15, f15, f15);
                jVar3.L(-430414357);
                boolean zL3 = jVar3.l(j6Var);
                final v8.q qVar = this.f33021e0;
                boolean zK = zL3 | jVar3.K(qVar);
                final long j18 = this.f33023f0;
                final x0.n1<Long> n1Var41 = n1Var11;
                boolean zJ2 = zK | jVar3.j(j18) | jVar3.K(n1Var41) | jVar3.K(n1Var40) | jVar3.l(xVar3);
                final c.k<String[], Uri> kVar2 = this.f33025g0;
                boolean zL4 = zJ2 | jVar3.l(kVar2);
                final c.k<String[], Uri> kVar3 = this.f33027h0;
                boolean zL5 = zL4 | jVar3.l(kVar3) | jVar3.l(context);
                final eh.l<j6.a, pg.f0> lVar = this.f33028i0;
                boolean zK2 = zL5 | jVar3.K(lVar);
                Object objG8 = jVar3.g();
                if (zK2 || objG8 == obj6) {
                    final j6 j6Var3 = j6Var;
                    objG8 = new eh.a() { // from class: x8.g2
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // eh.a
                        public final Object invoke() {
                            j6 j6Var4 = j6Var3;
                            ph.h.c(androidx.lifecycle.x0.a(j6Var4), null, null, new t6(j6Var4, null), 3);
                            v8.q qVar2 = qVar;
                            if (qVar2 != null) {
                                boolean z17 = g5.f32665a;
                                p1.e bounds = (p1.e) n1Var39.getValue();
                                k2 k2Var = new k2(j6Var4, xVar3, qVar2, kVar2, kVar3, context, lVar, n1Var41, n1Var40);
                                kotlin.jvm.internal.r.e(bounds, "bounds");
                                qVar2.f30742f.setValue(null);
                                qVar2.f30737a.setValue(bounds);
                                qVar2.f30738b.setValue(new q1.b1(j18));
                                qVar2.f30741e = k2Var;
                                qVar2.f30740d.setValue(Boolean.FALSE);
                                qVar2.f30739c.setValue(Boolean.TRUE);
                            }
                            return pg.f0.f21461a;
                        }
                    };
                    jVar3.C(objG8);
                }
                jVar3.B();
                x0.j jVar4 = jVar3;
                t0.x0.a((eh.a) objG8, dVarA7, z15, eVarA, l0VarA, null, null, g1Var2, c.f32351i, jVar4, 817889280, 352);
                jVar4.H();
                if (z16 || !list5.isEmpty() || this.f33030j0.getValue().booleanValue()) {
                    aVar4 = aVar11;
                    jVar4.L(-1394638103);
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, 10), jVar4);
                    jVar4.B();
                } else {
                    jVar4.L(-1394828195);
                    float f16 = 5;
                    aVar4 = aVar11;
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f16), jVar4);
                    g5.a(0, jVar4);
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, f16), jVar4);
                    jVar4.B();
                }
                jVar4.L(-1153363664);
                if (!z16 && list5.isEmpty() && ((List) n1Var9.getValue()).isEmpty()) {
                    aVar5 = aVar10;
                    dVar = dVar4;
                    n1Var12 = n1Var38;
                    obj3 = obj6;
                    i11 = 1;
                    androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7);
                    g2.l0 l0VarD6 = z.g.d(fVar2, false);
                    int iD7 = jVar4.D();
                    x0.a2 a2VarY7 = jVar4.y();
                    androidx.compose.ui.d dVarC7 = androidx.compose.ui.c.c(dVarL, jVar4);
                    if (jVar4.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar4.r();
                    if (jVar4.m()) {
                        jVar4.w(aVar5);
                    } else {
                        jVar4.z();
                    }
                    bVar = bVar6;
                    ph.v1.j(bVar, l0VarD6, jVar4);
                    ph.v1.j(dVar, a2VarY7, jVar4);
                    if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD7))) {
                        c0128a = c0128a4;
                        l9.i.a(iD7, jVar4, iD7, c0128a);
                    } else {
                        c0128a = c0128a4;
                    }
                    ph.v1.j(cVar3, dVarC7, jVar4);
                    g5.b(0, jVar4);
                    jVar4.H();
                } else {
                    dVar = dVar4;
                    obj3 = obj6;
                    aVar5 = aVar10;
                    n1Var12 = n1Var38;
                    i11 = 1;
                    bVar = bVar6;
                    c0128a = c0128a4;
                }
                jVar4.B();
                jVar4.H();
                jVar4.L(1095173505);
                final x0.n1<Boolean> n1Var42 = this.f33016c;
                if (n1Var42.getValue().booleanValue()) {
                    jVar4.L(1095176294);
                    boolean zK3 = jVar4.K(n1Var42) | jVar4.K(n1Var12);
                    Object objG9 = jVar4.g();
                    if (zK3 || objG9 == obj3) {
                        objG9 = new eh.a() { // from class: x8.h2
                            @Override // eh.a
                            public final Object invoke() {
                                boolean z17 = g5.f32665a;
                                n1Var42.setValue(Boolean.FALSE);
                                n1Var12.setValue(Boolean.TRUE);
                                return pg.f0.f21461a;
                            }
                        };
                        jVar4.C(objG9);
                    }
                    eh.a aVar12 = (eh.a) objG9;
                    boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar4, 1095181223, n1Var42);
                    Object objG10 = jVar4.g();
                    if (zB || objG10 == obj3) {
                        objG10 = new b9.k1(n1Var42, i11);
                        jVar4.C(objG10);
                    }
                    jVar4.B();
                    s.c(aVar12, (eh.a) objG10, jVar4, 6);
                }
                jVar4.B();
                jVar4.L(1095184754);
                boolean zBooleanValue2 = this.f33032k0.getValue().booleanValue();
                x0.r3<Boolean> r3Var2 = this.f33034l0;
                if (zBooleanValue2 || r3Var2.getValue().booleanValue()) {
                    androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(fillElement3, q1.b1.c(0.6f, ((t0.e2) jVar4.f(s3Var2)).C), q1.y1.f21750a);
                    jVar4.L(1095192395);
                    Object objG11 = jVar4.g();
                    if (objG11 == obj3) {
                        objG11 = new i2();
                        jVar4.C(objG11);
                    }
                    jVar4.B();
                    androidx.compose.ui.d dVarC8 = androidx.compose.foundation.b.c(dVarB, false, null, null, (eh.a) objG11, 6);
                    g2.l0 l0VarD7 = z.g.d(fVar5, false);
                    int iD8 = jVar4.D();
                    x0.a2 a2VarY8 = jVar4.y();
                    androidx.compose.ui.d dVarC9 = androidx.compose.ui.c.c(dVarC8, jVar4);
                    if (jVar4.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar4.r();
                    if (jVar4.m()) {
                        jVar4.w(aVar5);
                    } else {
                        jVar4.z();
                    }
                    ph.v1.j(bVar, l0VarD7, jVar4);
                    ph.v1.j(dVar, a2VarY8, jVar4);
                    if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD8))) {
                        l9.i.a(iD8, jVar4, iD8, c0128a);
                    }
                    ph.v1.j(cVar3, dVarC9, jVar4);
                    z.q qVarA2 = z.o.a(kVar, d.a.f14615n, jVar4, 48);
                    int iD9 = jVar4.D();
                    x0.a2 a2VarY9 = jVar4.y();
                    androidx.compose.ui.d dVarC10 = androidx.compose.ui.c.c(aVar4, jVar4);
                    if (jVar4.t() == null) {
                        c9.u1.d();
                        throw null;
                    }
                    jVar4.r();
                    if (jVar4.m()) {
                        jVar4.w(aVar5);
                    } else {
                        jVar4.z();
                    }
                    ph.v1.j(bVar, qVarA2, jVar4);
                    ph.v1.j(dVar, a2VarY9, jVar4);
                    if (jVar4.m() || !kotlin.jvm.internal.r.a(jVar4.g(), Integer.valueOf(iD9))) {
                        l9.i.a(iD9, jVar4, iD9, c0128a);
                    }
                    ph.v1.j(cVar3, dVarC10, jVar4);
                    z9.a(3, 0, 384, 25, ((t0.e2) jVar4.f(s3Var2)).f25751a, 0L, null, jVar4);
                    p1.d.b(androidx.compose.foundation.layout.g.f(aVar4, 12), jVar4);
                    ff.b(f3.q.c(r3Var2.getValue().booleanValue() ? R.string.home_importing : R.string.home_exporting, jVar4), null, ((t0.e2) jVar4.f(s3Var2)).f25771q, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar4.f(of.f26647a)).f26547j, jVar4, 196608, 0, 65498);
                    jVar4 = jVar4;
                    jVar4.H();
                    jVar4.H();
                }
                jVar4.B();
                jVar4.H();
            }
            l9.i.a(iD5, jVar2, iD5, c0128a4);
            g.a.c cVar32 = g.a.f13865d;
            ph.v1.j(cVar32, dVarC5, jVar2);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar3, 8), jVar2);
            float f142 = 56;
            androidx.compose.ui.d dVarF2 = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar3, 1.0f), f142);
            jVar2.L(-1153441326);
            objG2 = jVar2.g();
            final p5.x xVar32 = xVar;
            final x0.n1 n1Var392 = this.f33017c0;
            if (objG2 != obj2) {
            }
            jVar2.B();
            androidx.compose.ui.d dVarA62 = androidx.compose.ui.layout.c.a(dVarF2, (eh.l) objG2);
            j1.f fVar52 = d.a.f14606e;
            Object obj62 = obj2;
            g2.l0 l0VarD52 = z.g.d(fVar52, false);
            int iD62 = jVar2.D();
            x0.a2 a2VarY62 = jVar2.y();
            androidx.compose.ui.d dVarC62 = androidx.compose.ui.c.c(dVarA62, jVar2);
            if (jVar2.t() != null) {
            }
        }
        return pg.f0.f21461a;
    }
}
