package x8;

import androidx.compose.ui.d;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t0.md;
import x0.j;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f32836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f32837b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p f32838c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s.b f32839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.m0 f32840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.l f32841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.k1 f32843h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Map f32844j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(List list, Long l10, eh.p pVar, s.b bVar, b0.m0 m0Var, eh.l lVar, x0.n1 n1Var, x0.k1 k1Var, Map map) {
        super(4);
        this.f32836a = list;
        this.f32837b = l10;
        this.f32838c = pVar;
        this.f32839d = bVar;
        this.f32840e = m0Var;
        this.f32841f = lVar;
        this.f32842g = n1Var;
        this.f32843h = k1Var;
        this.f32844j = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fa  */
    @Override // eh.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
        int i10;
        long jC;
        h0.e eVar2;
        androidx.compose.ui.d dVarA;
        Object obj;
        boolean zK;
        Object objG;
        eh.l lVar;
        boolean zK2;
        Object objG2;
        b0.e eVar3 = eVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (jVar2.K(eVar3) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
            FolderEntity folderEntity = (FolderEntity) this.f32836a.get(iIntValue);
            jVar2.L(-1197560495);
            long id2 = folderEntity.getId();
            Long l10 = this.f32837b;
            boolean z10 = l10 != null && l10.longValue() == id2;
            Long l11 = (Long) this.f32842g.getValue();
            boolean z11 = l11 != null && l11.longValue() == folderEntity.getId();
            Long lValueOf = Long.valueOf(folderEntity.getId());
            jVar2.L(1901033272);
            eh.p pVar = this.f32838c;
            boolean zK3 = jVar2.K(pVar) | jVar2.K(folderEntity);
            Object objG3 = jVar2.g();
            Object obj2 = j.a.f31715a;
            if (zK3 || objG3 == obj2) {
                objG3 = new d0(pVar, folderEntity);
                jVar2.C(objG3);
            }
            jVar2.B();
            x0.o0.a(lValueOf, (eh.l) objG3, jVar2);
            float f10 = CropImageView.DEFAULT_ASPECT_RATIO;
            if (z10) {
                f10 = 1.0f;
            }
            x0.r3 r3VarB = s.g.b(f10, null, "folder_drop", jVar2, 3072, 22);
            h0.e eVarA = h0.f.a(16);
            x0.e2 e2Var = t0.f2.f25858a;
            long jC2 = q1.b1.c(0.85f, ((t0.e2) jVar2.f(e2Var)).f25770p);
            float f11 = z10 ? 2 : (float) 0.75d;
            if (z10) {
                jVar2.L(1901048816);
                jC = ((t0.e2) jVar2.f(e2Var)).f25751a;
            } else {
                jVar2.L(1901050396);
                jC = q1.b1.c(0.06f, ((t0.e2) jVar2.f(e2Var)).f25771q);
            }
            jVar2.B();
            t.v vVarA = a9.d2.a(f11, jC);
            if (z11) {
                dVarA = j1.l.c(d.a.f1143b, 1.0f);
                eVar2 = eVarA;
            } else {
                long j10 = 1;
                eVar2 = eVarA;
                dVarA = eVar3.a(s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.m((j10 << 32) | (j10 & BodyPartID.bodyIdMax)), 1), s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5));
            }
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.r(e.a(dVarA, this.f32839d), 148), s.f33139a);
            jVar2.L(1901061143);
            boolean zK4 = jVar2.K(pVar) | jVar2.K(folderEntity);
            Object objG4 = jVar2.g();
            if (zK4) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objG4 == obj) {
                }
                jVar2.B();
                androidx.compose.ui.d dVarA2 = androidx.compose.ui.layout.c.a(dVarF, (eh.l) objG4);
                jVar2.L(1901064413);
                zK = jVar2.K(r3VarB) | jVar2.c(z11) | jVar2.K(this.f32840e) | jVar2.K(folderEntity);
                objG = jVar2.g();
                if (!zK || objG == obj) {
                    Object f0Var = new f0(z11, this.f32840e, r3VarB, folderEntity, this.f32843h);
                    jVar2.C(f0Var);
                    objG = f0Var;
                }
                jVar2.B();
                androidx.compose.ui.d dVarA3 = androidx.compose.ui.graphics.a.a(dVarA2, (eh.l) objG);
                jVar2.L(1901039227);
                lVar = this.f32841f;
                zK2 = jVar2.K(lVar) | jVar2.K(folderEntity);
                objG2 = jVar2.g();
                if (!zK2 || objG2 == obj) {
                    objG2 = new g0(lVar, folderEntity);
                    jVar2.C(objG2);
                }
                jVar2.B();
                md.b((eh.a) objG2, dVarA3, false, eVar2, jC2, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, vVarA, null, f1.c.b(-1908049425, new h0(folderEntity, this.f32844j), jVar2), jVar2, 0, 740);
                jVar2.B();
            }
            objG4 = new e0(pVar, folderEntity);
            jVar2.C(objG4);
            jVar2.B();
            androidx.compose.ui.d dVarA22 = androidx.compose.ui.layout.c.a(dVarF, (eh.l) objG4);
            jVar2.L(1901064413);
            zK = jVar2.K(r3VarB) | jVar2.c(z11) | jVar2.K(this.f32840e) | jVar2.K(folderEntity);
            objG = jVar2.g();
            if (!zK) {
                Object f0Var2 = new f0(z11, this.f32840e, r3VarB, folderEntity, this.f32843h);
                jVar2.C(f0Var2);
                objG = f0Var2;
                jVar2.B();
                androidx.compose.ui.d dVarA32 = androidx.compose.ui.graphics.a.a(dVarA22, (eh.l) objG);
                jVar2.L(1901039227);
                lVar = this.f32841f;
                zK2 = jVar2.K(lVar) | jVar2.K(folderEntity);
                objG2 = jVar2.g();
                if (!zK2) {
                    objG2 = new g0(lVar, folderEntity);
                    jVar2.C(objG2);
                    jVar2.B();
                    md.b((eh.a) objG2, dVarA32, false, eVar2, jC2, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, vVarA, null, f1.c.b(-1908049425, new h0(folderEntity, this.f32844j), jVar2), jVar2, 0, 740);
                    jVar2.B();
                }
            }
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
