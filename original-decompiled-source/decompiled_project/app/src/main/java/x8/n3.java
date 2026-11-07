package x8;

import android.content.Context;
import androidx.compose.ui.d;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashMap;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class n3 extends kotlin.jvm.internal.s implements eh.r<c0.v, Integer, x0.j, Integer, pg.f0> {
    public final /* synthetic */ x0.r3 A;
    public final /* synthetic */ x0.n1 B;
    public final /* synthetic */ x0.n1 C;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f32950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n8 f32952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f32953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j6 f32954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p5.x f32955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f32956g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q8.d0 f32957h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f32958j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q8.w0 f32959k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f32960l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f32961m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32962n;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32963p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32964q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32965r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32966s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32967t;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32968v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32969w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32970x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f32971y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ List f32972z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(List list, int i10, n8 n8Var, HashMap map, j6 j6Var, p5.x xVar, Context context, q8.d0 d0Var, long j10, q8.w0 w0Var, float f10, boolean z10, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6, x0.n1 n1Var7, x0.n1 n1Var8, x0.n1 n1Var9, List list2, List list3, x0.r3 r3Var, x0.n1 n1Var10, x0.n1 n1Var11) {
        super(4);
        this.f32950a = list;
        this.f32951b = i10;
        this.f32952c = n8Var;
        this.f32953d = map;
        this.f32954e = j6Var;
        this.f32955f = xVar;
        this.f32956g = context;
        this.f32957h = d0Var;
        this.f32958j = j10;
        this.f32959k = w0Var;
        this.f32960l = f10;
        this.f32961m = z10;
        this.f32962n = n1Var;
        this.f32963p = n1Var2;
        this.f32964q = n1Var3;
        this.f32965r = n1Var4;
        this.f32966s = n1Var5;
        this.f32967t = n1Var6;
        this.f32968v = n1Var7;
        this.f32969w = n1Var8;
        this.f32970x = n1Var9;
        this.f32971y = list2;
        this.f32972z = list3;
        this.A = r3Var;
        this.B = n1Var10;
        this.C = n1Var11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0200  */
    @Override // eh.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 f(c0.v vVar, Integer num, x0.j jVar, Integer num2) {
        int i10;
        int i11;
        boolean z10;
        rg.b bVar;
        String str;
        String str2;
        androidx.compose.ui.d dVar;
        boolean z11;
        eh.a aVar;
        eh.a aVar2;
        String sourcePath;
        String str3;
        c0.v vVar2 = vVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (jVar2.K(vVar2) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        int i12 = i10;
        if (jVar2.A(i12 & 1, (i12 & 147) != 146)) {
            ProjectEntity projectEntity = (ProjectEntity) this.f32950a.get(iIntValue);
            jVar2.L(-1904488605);
            String strC = f3.q.c(R.string.home_duplicate_suffix, jVar2);
            Long lValueOf = Long.valueOf(projectEntity.getId());
            boolean z12 = g5.f32665a;
            s.b<Float, s.o> bVarB = e.b(lValueOf, ((Boolean) this.f32969w.getValue()).booleanValue(), this.f32951b + iIntValue, (Long) this.f32970x.getValue(), jVar2, 0);
            n8 n8Var = this.f32952c;
            Long lF = n8Var.f();
            boolean z13 = lF != null && lF.longValue() == projectEntity.getId();
            String strC2 = f3.q.c(R.string.home_project_move_up, jVar2);
            String strC3 = f3.q.c(R.string.home_project_move_down, jVar2);
            jVar2.L(354223179);
            rg.b bVarB2 = c0.g0.b();
            jVar2.L(354224188);
            List list = this.f32971y;
            List list2 = this.f32972z;
            j6 j6Var = this.f32954e;
            Object obj = j.a.f31715a;
            if (iIntValue > 0) {
                jVar2.L(-443194688);
                i11 = i12;
                boolean zL = ((((i12 & 112) ^ 48) > 32 && jVar2.i(iIntValue)) || (i11 & 48) == 32) | jVar2.l(j6Var) | jVar2.l(list) | jVar2.l(list2) | jVar2.K(projectEntity);
                Object objG = jVar2.g();
                if (zL || objG == obj) {
                    str3 = strC2;
                    z10 = z13;
                    str = strC;
                    str2 = strC3;
                    bVar = bVarB2;
                    objG = new c3(this.f32972z, projectEntity, iIntValue, j6Var, list);
                    jVar2.C(objG);
                } else {
                    str3 = strC2;
                    z10 = z13;
                    bVar = bVarB2;
                    str = strC;
                    str2 = strC3;
                }
                jVar2.B();
                bVar.add(new q2.e(str3, (eh.a) objG));
            } else {
                i11 = i12;
                z10 = z13;
                bVar = bVarB2;
                str = strC;
                str2 = strC3;
            }
            jVar2.B();
            jVar2.L(354233875);
            if (iIntValue < qg.p.i(list2)) {
                jVar2.L(-443184288);
                boolean zL2 = jVar2.l(j6Var) | jVar2.l(list) | jVar2.l(list2) | jVar2.K(projectEntity) | ((((i11 & 112) ^ 48) > 32 && jVar2.i(iIntValue)) || (i11 & 48) == 32);
                Object objG2 = jVar2.g();
                if (zL2 || objG2 == obj) {
                    Object d3Var = new d3(this.f32972z, projectEntity, iIntValue, j6Var, list);
                    jVar2.C(d3Var);
                    objG2 = d3Var;
                }
                jVar2.B();
                bVar.add(new q2.e(str2, (eh.a) objG2));
            }
            jVar2.B();
            rg.b bVarA = c0.g0.a(bVar);
            jVar2.B();
            Long lValueOf2 = Long.valueOf(projectEntity.getId());
            HashMap map = this.f32953d;
            Object e0Var = map.get(lValueOf2);
            if (e0Var == null) {
                e0Var = new q8.e0();
                map.put(lValueOf2, e0Var);
            }
            androidx.compose.ui.d dVarC = q8.p0.c(d.a.f1143b, (q8.e0) e0Var);
            float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            eh.a aVar3 = null;
            if (!z10) {
                Long lG = n8Var.g();
                s.l1 l1VarC = (lG != null && lG.longValue() == projectEntity.getId()) ? null : s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
                androidx.compose.ui.d dVarA = vVar2.a(dVarC, null, l1VarC, null);
                if (!z10) {
                    Long lG2 = n8Var.g();
                    long id2 = projectEntity.getId();
                    if (lG2 != null && lG2.longValue() == id2) {
                        f10 = 1.0f;
                    }
                    androidx.compose.ui.d dVarC2 = j1.l.c(dVarA, f10);
                    jVar2.L(354264430);
                    boolean zL3 = jVar2.l(bVarA);
                    Object objG3 = jVar2.g();
                    if (zL3 || objG3 == obj) {
                        objG3 = new s2(bVarA);
                        jVar2.C(objG3);
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarA2 = q2.q.a(dVarC2, false, (eh.l) objG3);
                    jVar2.L(354267324);
                    boolean zK = jVar2.K(n8Var) | jVar2.K(projectEntity);
                    Object objG4 = jVar2.g();
                    if (zK || objG4 == obj) {
                        objG4 = new t2(n8Var, projectEntity);
                        jVar2.C(objG4);
                    }
                    jVar2.B();
                    androidx.compose.ui.d dVarA3 = e.a(androidx.compose.ui.graphics.a.a(dVarA2, (eh.l) objG4), bVarB);
                    boolean zE = g5.E(this.A);
                    boolean zContains = j6Var.f32781h.f12419d.contains(String.valueOf(projectEntity.getId()));
                    jVar2.L(354346666);
                    boolean zA = kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(projectEntity.getKind()), ProjectKind.APK);
                    p5.x xVar = this.f32955f;
                    if (zA && kotlin.jvm.internal.r.a(projectEntity.getContentSourceType(), "local") && (sourcePath = projectEntity.getSourcePath()) != null && (mh.t.i(sourcePath, ".html", true) || mh.t.i(sourcePath, ".htm", true))) {
                        jVar2.L(354348978);
                        boolean zL4 = jVar2.l(xVar) | jVar2.K(projectEntity);
                        Object objG5 = jVar2.g();
                        if (zL4 || objG5 == obj) {
                            objG5 = new u2(xVar, projectEntity);
                            jVar2.C(objG5);
                        }
                        aVar3 = (eh.a) objG5;
                        jVar2.B();
                    }
                    jVar2.B();
                    jVar2.L(354283383);
                    boolean zL5 = jVar2.l(map) | jVar2.K(projectEntity) | jVar2.l(xVar);
                    Context context = this.f32956g;
                    boolean zL6 = zL5 | jVar2.l(context) | jVar2.K(this.f32957h) | jVar2.j(this.f32958j) | jVar2.K(this.f32959k) | jVar2.h(this.f32960l) | jVar2.c(this.f32961m);
                    Object objG6 = jVar2.g();
                    if (zL6 || objG6 == obj) {
                        dVar = dVarA3;
                        z11 = zContains;
                        objG6 = new x2(this.f32953d, projectEntity, this.f32957h, this.f32958j, this.f32959k, this.f32956g, this.f32955f, this.f32960l, this.f32961m);
                        jVar2.C(objG6);
                    } else {
                        dVar = dVarA3;
                        z11 = zContains;
                    }
                    eh.a aVar4 = (eh.a) objG6;
                    jVar2.B();
                    jVar2.L(354317520);
                    String str4 = str;
                    boolean zL7 = jVar2.l(j6Var) | jVar2.K(projectEntity) | jVar2.l(context) | jVar2.K(str4);
                    Object obj2 = this.f32962n;
                    boolean zK2 = zL7 | jVar2.K(obj2);
                    Object objG7 = jVar2.g();
                    if (zK2 || objG7 == obj) {
                        objG7 = new y2(j6Var, projectEntity, this.f32956g, str4, this.f32962n);
                        jVar2.C(objG7);
                    }
                    eh.a aVar5 = (eh.a) objG7;
                    x0.n1 n1Var = this.f32963p;
                    boolean zB = androidx.datastore.preferences.protobuf.e.b(jVar2, 354337900, n1Var) | jVar2.K(projectEntity);
                    x0.n1 n1Var2 = this.f32964q;
                    boolean zK3 = zB | jVar2.K(n1Var2);
                    Object objG8 = jVar2.g();
                    if (zK3 || objG8 == obj) {
                        objG8 = new z2(projectEntity, n1Var, n1Var2);
                        jVar2.C(objG8);
                    }
                    eh.a aVar6 = (eh.a) objG8;
                    x0.n1 n1Var3 = this.f32965r;
                    boolean zB2 = androidx.datastore.preferences.protobuf.e.b(jVar2, 354341265, n1Var3) | jVar2.K(projectEntity);
                    Object objG9 = jVar2.g();
                    if (zB2 || objG9 == obj) {
                        objG9 = new a3(projectEntity, n1Var3);
                        jVar2.C(objG9);
                    }
                    eh.a aVar7 = (eh.a) objG9;
                    jVar2.B();
                    jVar2.L(354354069);
                    boolean zK4 = jVar2.K(projectEntity);
                    x0.n1 n1Var4 = this.f32966s;
                    boolean zK5 = zK4 | jVar2.K(n1Var4);
                    Object objG10 = jVar2.g();
                    if (zK5 || objG10 == obj) {
                        aVar = aVar3;
                        objG10 = new b3(projectEntity, this.B, n1Var4);
                        jVar2.C(objG10);
                    } else {
                        aVar = aVar3;
                    }
                    eh.a aVar8 = (eh.a) objG10;
                    jVar2.B();
                    jVar2.L(354361008);
                    boolean zL8 = jVar2.l(j6Var) | jVar2.l(context) | jVar2.K(projectEntity);
                    Object objG11 = jVar2.g();
                    if (zL8 || objG11 == obj) {
                        objG11 = new l2(j6Var, context, projectEntity);
                        jVar2.C(objG11);
                    }
                    eh.a aVar9 = (eh.a) objG11;
                    jVar2.B();
                    jVar2.L(354366767);
                    boolean zK6 = jVar2.K(projectEntity);
                    x0.n1 n1Var5 = this.f32967t;
                    boolean zK7 = zK6 | jVar2.K(n1Var5);
                    Object objG12 = jVar2.g();
                    if (zK7 || objG12 == obj) {
                        aVar2 = aVar9;
                        objG12 = new m2(projectEntity, this.C, n1Var5);
                        jVar2.C(objG12);
                    } else {
                        aVar2 = aVar9;
                    }
                    eh.a aVar10 = (eh.a) objG12;
                    jVar2.B();
                    jVar2.L(354373311);
                    boolean zL9 = jVar2.l(xVar);
                    Object objG13 = jVar2.g();
                    if (zL9 || objG13 == obj) {
                        objG13 = new n2(xVar);
                        jVar2.C(objG13);
                    }
                    eh.a aVar11 = (eh.a) objG13;
                    x0.n1 n1Var6 = this.f32968v;
                    boolean zB3 = androidx.datastore.preferences.protobuf.e.b(jVar2, 354376461, n1Var6) | jVar2.K(projectEntity);
                    Object objG14 = jVar2.g();
                    if (zB3 || objG14 == obj) {
                        objG14 = new o2(projectEntity, n1Var6);
                        jVar2.C(objG14);
                    }
                    eh.a aVar12 = (eh.a) objG14;
                    jVar2.B();
                    jVar2.L(354382899);
                    boolean zL10 = jVar2.l(j6Var) | jVar2.K(projectEntity) | jVar2.l(xVar) | jVar2.l(context) | jVar2.K(obj2);
                    Object objG15 = jVar2.g();
                    if (zL10 || objG15 == obj) {
                        objG15 = new q2(j6Var, projectEntity, this.f32956g, this.f32955f, this.f32962n);
                        jVar2.C(objG15);
                    }
                    eh.a aVar13 = (eh.a) objG15;
                    jVar2.B();
                    jVar2.L(354379195);
                    boolean zL11 = jVar2.l(j6Var) | jVar2.K(projectEntity);
                    Object objG16 = jVar2.g();
                    if (zL11 || objG16 == obj) {
                        objG16 = new r2(j6Var, projectEntity);
                        jVar2.C(objG16);
                    }
                    jVar2.B();
                    g5.A(dVar, z10, projectEntity, zE, aVar4, aVar5, aVar6, aVar7, aVar8, aVar2, aVar10, aVar11, aVar12, aVar13, (eh.a) objG16, z11, aVar, jVar2, 0);
                    jVar2.B();
                }
            }
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
