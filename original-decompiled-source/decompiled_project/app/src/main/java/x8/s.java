package x8;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.yalantis.ucrop.view.CropImageView;
import f9.xg;
import i2.e0;
import i2.g;
import j1.d;
import j1.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import q1.y1;
import t0.ff;
import t0.nf;
import t0.of;
import t0.ua;
import t0.w9;
import x0.j;
import x8.s;
import z.b;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33139a = 100;

    public static final class a implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f33140a;

        public a(eh.a<pg.f0> aVar) {
            this.f33140a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f33140a, null, false, null, null, null, x8.b.f32260l, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class b implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f33141a;

        public b(eh.a<pg.f0> aVar) {
            this.f33141a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f33141a, null, false, null, null, null, x8.b.f32261m, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class c implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FolderEntity f33142a;

        public c(FolderEntity folderEntity) {
            this.f33142a = folderEntity;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(f3.q.d(R.string.folder_delete_message, new Object[]{this.f33142a.getName()}, jVar2), null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25773s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class d implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f33143a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f33144b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(eh.l<? super String, pg.f0> lVar, x0.n1<String> n1Var) {
            this.f33143a = lVar;
            this.f33144b = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                x0.n1<String> n1Var = this.f33144b;
                boolean z10 = !mh.x.A(n1Var.getValue());
                jVar2.L(-1475047053);
                Object obj = this.f33143a;
                boolean zK = jVar2.K(obj) | jVar2.K(n1Var);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new androidx.credentials.playservices.l(2, obj, n1Var);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.x0.d((eh.a) objG, null, z10, null, null, null, x8.b.f32257i, jVar2, 805306368, 506);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class e implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f33145a;

        public e(eh.a<pg.f0> aVar) {
            this.f33145a = aVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                t0.x0.d(this.f33145a, null, false, null, null, null, x8.b.f32258j, jVar2, 805306368, 510);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33146a;

        public f(String str) {
            this.f33146a = str;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                ff.b(this.f33146a, null, ((t0.e2) jVar2.f(t0.f2.f25858a)).f25769o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131066);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class g implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0.n1<String> f33147a;

        public g(x0.n1<String> n1Var) {
            this.f33147a = n1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                x0.n1<String> n1Var = this.f33147a;
                String value = n1Var.getValue();
                jVar2.L(-1475054986);
                boolean zK = jVar2.K(n1Var);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new w(n1Var, 0);
                    jVar2.C(objG);
                }
                jVar2.B();
                w9.a(value, (eh.l) objG, null, false, false, null, x8.b.f32259k, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, jVar2, 1572864, 12582912, 8257468);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class h implements eh.q<b0.e, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33148a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f33149b;

        public h(eh.l lVar, String str) {
            this.f33148a = str;
            this.f33149b = lVar;
        }

        @Override // eh.q
        public final pg.f0 b(b0.e eVar, x0.j jVar, Integer num) {
            b0.e item = eVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(item, "$this$item");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                boolean z10 = this.f33148a == null;
                jVar2.L(1864767581);
                eh.l<String, pg.f0> lVar = this.f33149b;
                boolean zK = jVar2.K(lVar);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new h9.y2(lVar, 2);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.d2.b(z10, (eh.a) objG, x8.b.f32249a, null, false, null, null, null, null, null, jVar2, 384, 4088);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class i implements eh.a<pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l<String, pg.f0> f33150a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33151b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33152c;

        /* JADX WARN: Multi-variable type inference failed */
        public i(eh.l<? super String, pg.f0> lVar, String str, String str2) {
            this.f33150a = lVar;
            this.f33151b = str;
            this.f33152c = str2;
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            String str = this.f33151b;
            String str2 = this.f33152c;
            if (kotlin.jvm.internal.r.a(str, str2)) {
                str2 = null;
            }
            this.f33150a.invoke(str2);
            return pg.f0.f21461a;
        }
    }

    public static final class j implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f33153a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q8.l1 f33154b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33155c;

        public j(boolean z10, q8.l1 l1Var, int i10) {
            this.f33153a = z10;
            this.f33154b = l1Var;
            this.f33155c = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            String str;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            int i10 = this.f33154b.f22294c;
            if ((iIntValue & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                boolean z10 = this.f33153a;
                int i11 = this.f33155c;
                if (z10) {
                    jVar2.L(-1361088399);
                    str = f3.q.c(i10, jVar2) + " " + i11;
                    jVar2.B();
                } else {
                    jVar2.L(-1361086160);
                    str = f3.q.c(i10, jVar2) + " " + i11 + "/5";
                    jVar2.B();
                }
                ff.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jVar2, 0, 0, 131070);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class k implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q8.l1 f33156a;

        public k(q8.l1 l1Var) {
            this.f33156a = l1Var;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            x0.j jVar2 = jVar;
            if ((num.intValue() & 3) == 2 && jVar2.s()) {
                jVar2.v();
            } else {
                z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.n(d.a.f1143b, 8), this.f33156a.f22292a, h0.f.a(4)), jVar2, 0);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class l extends kotlin.jvm.internal.s implements eh.l {

        /* renamed from: a, reason: collision with root package name */
        public static final l f33157a = new l(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    public static final class m extends kotlin.jvm.internal.s implements eh.l<Integer, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.l f33158a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f33159b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(eh.l lVar, List list) {
            super(1);
            this.f33158a = lVar;
            this.f33159b = list;
        }

        @Override // eh.l
        public final Object invoke(Integer num) {
            return this.f33158a.invoke(this.f33159b.get(num.intValue()));
        }
    }

    public static final class n extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f33160a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map f33161b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33162c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.l f33163d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f33164e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List list, Map map, String str, eh.l lVar, boolean z10) {
            super(4);
            this.f33160a = list;
            this.f33161b = map;
            this.f33162c = str;
            this.f33163d = lVar;
            this.f33164e = z10;
        }

        @Override // eh.r
        public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
            int i10;
            b0.e eVar2 = eVar;
            int iIntValue = num.intValue();
            x0.j jVar2 = jVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
            } else {
                i10 = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i10 |= jVar2.i(iIntValue) ? 32 : 16;
            }
            if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
                String str = (String) this.f33160a.get(iIntValue);
                jVar2.L(1973410444);
                q8.l1 l1VarB = q8.o1.b(str);
                Integer num3 = (Integer) this.f33161b.get(str);
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                String str2 = this.f33162c;
                boolean zA = kotlin.jvm.internal.r.a(str2, str);
                float f10 = t0.v3.f27221a;
                ua uaVarA = t0.v3.a(0L, q1.b1.c(0.18f, l1VarB.f22292a), 0L, 0L, jVar2, 3967);
                jVar2.L(1864778461);
                eh.l lVar = this.f33163d;
                boolean zK = jVar2.K(lVar) | jVar2.K(str2) | jVar2.K(str);
                Object objG = jVar2.g();
                if (zK || objG == j.a.f31715a) {
                    objG = new i(lVar, str2, str);
                    jVar2.C(objG);
                }
                jVar2.B();
                t0.d2.b(zA, (eh.a) objG, f1.c.b(-964501319, new j(this.f33164e, l1VarB, iIntValue3), jVar2), null, false, f1.c.b(327298364, new k(l1VarB), jVar2), null, uaVarA, null, null, jVar2, 196992, 3800);
                jVar2.B();
            } else {
                jVar2.v();
            }
            return pg.f0.f21461a;
        }
    }

    public static final class o implements eh.q<z.r, x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Long f33165a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<Long, pg.f0> f33166b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<FolderEntity> f33167c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f33168d;

        /* JADX WARN: Multi-variable type inference failed */
        public o(Long l10, eh.l<? super Long, pg.f0> lVar, List<FolderEntity> list, eh.a<pg.f0> aVar) {
            this.f33165a = l10;
            this.f33166b = lVar;
            this.f33167c = list;
            this.f33168d = aVar;
        }

        @Override // eh.q
        public final pg.f0 b(z.r rVar, x0.j jVar, Integer num) {
            z.r ModalBottomSheet = rVar;
            x0.j jVar2 = jVar;
            int iIntValue = num.intValue();
            kotlin.jvm.internal.r.e(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((iIntValue & 17) == 16 && jVar2.s()) {
                jVar2.v();
            } else {
                d.a aVar = d.a.f1143b;
                androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(d0.h.f(aVar), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 12, 7);
                z.q qVarA = z.o.a(z.b.f34446c, d.a.f14614m, jVar2, 0);
                int iD = jVar2.D();
                x0.a2 a2VarY = jVar2.y();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarL, jVar2);
                i2.g.f13861o.getClass();
                e0.a aVar2 = g.a.f13863b;
                if (jVar2.t() == null) {
                    c9.u1.d();
                    throw null;
                }
                jVar2.r();
                if (jVar2.m()) {
                    jVar2.w(aVar2);
                } else {
                    jVar2.z();
                }
                ph.v1.j(g.a.f13867f, qVarA, jVar2);
                ph.v1.j(g.a.f13866e, a2VarY, jVar2);
                g.a.C0128a c0128a = g.a.f13868g;
                if (jVar2.m() || !kotlin.jvm.internal.r.a(jVar2.g(), Integer.valueOf(iD))) {
                    l9.i.a(iD, jVar2, iD, c0128a);
                }
                ph.v1.j(g.a.f13865d, dVarC, jVar2);
                ff.b(f3.q.c(R.string.menu_move_to_folder, jVar2), androidx.compose.foundation.layout.f.i(aVar, 24, 8), 0L, 0L, x2.p.f32033f, null, 0L, null, 0L, 0, false, 0, 0, ((nf) jVar2.f(of.f26647a)).f26545h, jVar2, 196656, 0, 65500);
                float f10 = t0.y4.f27459a;
                long jE = q1.b1.f21653g;
                if ((510 & 1) != 0) {
                    float f11 = v0.r.f30458a;
                    jE = t0.f2.e(v0.d.f30253s, jVar2);
                }
                t0.x4 x4Var = new t0.x4(jE, t0.f2.e(v0.r.f30466i, jVar2), t0.f2.e(v0.r.f30468k, jVar2), t0.f2.e(v0.r.f30471n, jVar2), t0.f2.e(v0.r.f30472o, jVar2), t0.f2.e(v0.r.f30474q, jVar2), q1.b1.c(v0.r.f30461d, t0.f2.e(v0.r.f30460c, jVar2)), q1.b1.c(v0.r.f30463f, t0.f2.e(v0.r.f30462e, jVar2)), q1.b1.c(v0.r.f30465h, t0.f2.e(v0.r.f30464g, jVar2)));
                jVar2.L(833588225);
                Object obj = j.a.f31715a;
                Long l10 = this.f33165a;
                Object obj2 = this.f33166b;
                if (l10 != null) {
                    jVar2.L(833598547);
                    boolean zK = jVar2.K(obj2);
                    Object objG = jVar2.g();
                    if (zK || objG == obj) {
                        objG = new m9.f1(obj2, 1);
                        jVar2.C(objG);
                    }
                    jVar2.B();
                    t0.h5.a(x8.b.f32263o, androidx.compose.foundation.b.c(aVar, false, null, null, (eh.a) objG, 7), x8.b.f32264p, x4Var, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, jVar2, 24582);
                }
                jVar2.B();
                jVar2.L(833602280);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : this.f33167c) {
                    long id2 = ((FolderEntity) obj3).getId();
                    if (l10 == null || id2 != l10.longValue()) {
                        arrayList.add(obj3);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    FolderEntity folderEntity = (FolderEntity) arrayList.get(i10);
                    jVar2.L(-842383113);
                    boolean zK2 = jVar2.K(obj2) | jVar2.K(folderEntity);
                    Object objG2 = jVar2.g();
                    if (zK2 || objG2 == obj) {
                        objG2 = new androidx.credentials.playservices.controllers.identityauth.beginsignin.e(1, obj2, folderEntity);
                        jVar2.C(objG2);
                    }
                    jVar2.B();
                    t0.h5.a(f1.c.b(-1000627477, new l0(folderEntity), jVar2), androidx.compose.foundation.b.c(aVar, false, null, null, (eh.a) objG2, 7), x8.b.f32265q, x4Var, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, jVar2, 24582);
                    i10 = i11;
                }
                jVar2.B();
                t0.h5.a(x8.b.f32266r, androidx.compose.foundation.b.c(aVar, false, null, null, this.f33168d, 7), x8.b.f32267s, x4Var, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, jVar2, 24582);
                jVar2.H();
            }
            return pg.f0.f21461a;
        }
    }

    public static final void a(final FolderEntity folderEntity, final eh.a<pg.f0> onConfirm, final eh.a<pg.f0> onDismiss, x0.j jVar, final int i10) {
        x0.k kVar;
        kotlin.jvm.internal.r.e(onConfirm, "onConfirm");
        kotlin.jvm.internal.r.e(onDismiss, "onDismiss");
        x0.k kVarP = jVar.p(466327900);
        int i11 = i10 | (kVarP.K(folderEntity) ? 4 : 2) | (kVarP.l(onConfirm) ? 32 : 16) | (kVarP.l(onDismiss) ? 256 : 128);
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            t0.r.a(onDismiss, f1.c.b(99687332, new a(onConfirm), kVarP), null, f1.c.b(-56293210, new b(onDismiss), kVarP), null, x8.b.f32262n, f1.c.b(-290264023, new c(folderEntity), kVarP), null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25770p, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i11 >> 6) & 14) | 1772592, 0, 16020);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(onConfirm, onDismiss, i10) { // from class: x8.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f32627b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f32628c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    s.a(this.f32626a, this.f32627b, this.f32628c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final FolderEntity folder, final eh.a onBack, final eh.a onRename, final eh.a onDelete, final androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        x0.n1 n1Var;
        kotlin.jvm.internal.r.e(folder, "folder");
        kotlin.jvm.internal.r.e(onBack, "onBack");
        kotlin.jvm.internal.r.e(onRename, "onRename");
        kotlin.jvm.internal.r.e(onDelete, "onDelete");
        x0.k kVarP = jVar.p(-154139729);
        int i11 = i10 | (kVarP.K(folder) ? 4 : 2) | (kVarP.l(onBack) ? 32 : 16) | (kVarP.l(onRename) ? 256 : 128) | (kVarP.l(onDelete) ? 2048 : 1024) | (kVarP.K(dVar) ? 16384 : 8192);
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
        } else {
            kVarP.L(1632584157);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(Boolean.FALSE);
                kVarP.C(objG);
            }
            x0.n1 n1Var2 = (x0.n1) objG;
            kVarP.T(false);
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(dVar, 1.0f);
            z.m1 m1VarA = z.k1.a(z.b.f34444a, d.a.f14612k, kVarP, 48);
            int i12 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarD, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            g.a.b bVar = g.a.f13867f;
            ph.v1.j(bVar, m1VarA, kVarP);
            g.a.d dVar2 = g.a.f13866e;
            ph.v1.j(dVar2, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            t0.s4.c(onBack, null, false, null, x8.b.f32251c, kVarP, ((i11 >> 3) & 14) | 196608, 30);
            w1.d dVarA = p0.k4.a();
            x0.s3 s3Var = t0.f2.f25858a;
            t0.t4.b(dVarA, null, null, ((t0.e2) kVarP.f(s3Var)).f25751a, kVarP, 48, 4);
            d.a aVar2 = d.a.f1143b;
            p1.d.b(androidx.compose.foundation.layout.g.r(aVar2, 8), kVarP);
            String name = folder.getName();
            t2.l0 l0Var = ((nf) kVarP.f(of.f26647a)).f26545h;
            x2.p pVar = x2.p.f32033f;
            long j10 = ((t0.e2) kVarP.f(s3Var)).f25769o;
            if (1.0f <= 0.0d) {
                a0.a.a("invalid weight; must be greater than zero");
            }
            kVarP = kVarP;
            ff.b(name, new LayoutWeightElement(1.0f, true), j10, 0L, pVar, null, 0L, null, 0L, 2, false, 1, 0, l0Var, kVarP, 196608, 3120, 55256);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i13 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(aVar2, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar, l0VarD, kVarP);
            ph.v1.j(dVar2, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            kVarP.L(852492968);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                n1Var = n1Var2;
                objG2 = new x8.m(n1Var, 0);
                kVarP.C(objG2);
            } else {
                n1Var = n1Var2;
            }
            kVarP.T(false);
            t0.s4.c((eh.a) objG2, null, false, null, x8.b.f32252d, kVarP, 196614, 30);
            boolean zBooleanValue = ((Boolean) n1Var.getValue()).booleanValue();
            kVarP.L(852499401);
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = new m9.f0(n1Var, 1);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            q8.g.a(zBooleanValue, (eh.a) objG3, f1.c.b(795956589, new u(onRename, onDelete, n1Var), kVarP), kVarP, 432);
            kVarP.T(true);
            kVarP.T(true);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(onBack, onRename, onDelete, dVar, i10) { // from class: x8.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f32945b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.a f32946c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f32947d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f32948e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    s.b(this.f32944a, this.f32945b, this.f32946c, this.f32947d, this.f32948e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(eh.a onCreate, eh.a onLater, x0.j jVar, final int i10) {
        s.b bVar;
        final eh.a aVar;
        final eh.a aVar2;
        Iterator it;
        int i11;
        int i12;
        x0.k kVar;
        kotlin.jvm.internal.r.e(onCreate, "onCreate");
        kotlin.jvm.internal.r.e(onLater, "onLater");
        x0.k kVarP = jVar.p(-133809927);
        int i13 = i10 | (kVarP.l(onCreate) ? 32 : 16) | (kVarP.l(onLater) ? 256 : 128);
        if ((i13 & 147) == 146 && kVarP.s()) {
            kVarP.v();
            aVar = onCreate;
            aVar2 = onLater;
            kVar = kVarP;
        } else {
            boolean zA = q8.x1.a(kVarP);
            kVarP.L(242811309);
            Object objG = kVarP.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objG);
            }
            s.b bVar2 = (s.b) objG;
            Object objA = p0.h.a(kVarP, false, 242812729);
            Object obj2 = objA;
            if (objA == obj) {
                ArrayList arrayList = new ArrayList(3);
                for (int i14 = 0; i14 < 3; i14++) {
                    arrayList.add(s.d.a(CropImageView.DEFAULT_ASPECT_RATIO));
                }
                kVarP.C(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            Object objA2 = p0.h.a(kVarP, false, 242814477);
            if (objA2 == obj) {
                objA2 = s.d.a(CropImageView.DEFAULT_ASPECT_RATIO);
                kVarP.C(objA2);
            }
            s.b bVar3 = (s.b) objA2;
            kVarP.T(false);
            pg.f0 f0Var = pg.f0.f21461a;
            kVarP.L(242816595);
            boolean zL = kVarP.l(bVar2) | kVarP.c(zA) | kVarP.l(list) | kVarP.l(bVar3);
            Object objG2 = kVarP.g();
            if (zL || objG2 == obj) {
                bVar = bVar3;
                Object vVar = new v(bVar2, zA, list, bVar, null);
                kVarP.C(vVar);
                objG2 = vVar;
            } else {
                bVar = bVar3;
            }
            kVarP.T(false);
            x0.o0.d((eh.p) objG2, f0Var, kVarP);
            androidx.compose.foundation.layout.b bVar4 = androidx.compose.foundation.layout.b.f961a;
            androidx.compose.ui.d dVarE = bVar4.e();
            kVarP.L(242833641);
            boolean zL2 = kVarP.l(bVar2);
            Object objG3 = kVarP.g();
            if (zL2 || objG3 == obj) {
                objG3 = new xg(bVar2, 1);
                kVarP.C(objG3);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarA = androidx.compose.ui.graphics.a.a(dVarE, (eh.l) objG3);
            long jC = q1.b1.c(0.62f, q1.b1.f21648b);
            y1.a aVar3 = q1.y1.f21750a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarA, jC, aVar3);
            kVarP.L(242837625);
            Object objG4 = kVarP.g();
            if (objG4 == obj) {
                objG4 = new x.n();
                kVarP.C(objG4);
            }
            x.m mVar = (x.m) objG4;
            Object objA3 = p0.h.a(kVarP, false, 242839508);
            if (objA3 == obj) {
                objA3 = new x8.i();
                kVarP.C(objA3);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.b.b(dVarB, mVar, null, false, null, (eh.a) objA3, 28);
            g2.l0 l0VarD = z.g.d(d.a.f14606e, false);
            int i15 = kVarP.P;
            x0.a2 a2VarP = kVarP.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarB2, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar4 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            g.a.b bVar5 = g.a.f13867f;
            ph.v1.j(bVar5, l0VarD, kVarP);
            g.a.d dVar = g.a.f13866e;
            ph.v1.j(dVar, a2VarP, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i15))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i15, kVarP, i15, c0128a);
            }
            g.a.c cVar = g.a.f13865d;
            ph.v1.j(cVar, dVarC, kVarP);
            d.a aVar5 = d.a.f1143b;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.f.h(aVar5, 32);
            b.k kVar2 = z.b.f34446c;
            f.a aVar6 = d.a.f14615n;
            z.q qVarA = z.o.a(kVar2, aVar6, kVarP, 48);
            int i16 = kVarP.P;
            x0.a2 a2VarP2 = kVarP.P();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(dVarH, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar5, qVarA, kVarP);
            ph.v1.j(dVar, a2VarP2, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i16))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i16, kVarP, i16, c0128a);
            }
            ph.v1.j(cVar, dVarC2, kVarP);
            androidx.compose.ui.d dVarO = androidx.compose.foundation.layout.g.o(aVar5, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 170);
            g2.l0 l0VarD2 = z.g.d(d.a.f14609h, false);
            int i17 = kVarP.P;
            x0.a2 a2VarP3 = kVarP.P();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(dVarO, kVarP);
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar4);
            } else {
                kVarP.z();
            }
            ph.v1.j(bVar5, l0VarD2, kVarP);
            ph.v1.j(dVar, a2VarP3, kVarP);
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i17))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i17, kVarP, i17, c0128a);
            }
            ph.v1.j(cVar, dVarC3, kVarP);
            List listJ = qg.p.j(ProjectKind.APK, ProjectKind.HTML, ProjectKind.PDF);
            kVarP.L(-1136203936);
            Iterator it2 = listJ.iterator();
            final int i18 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    qg.p.o();
                    throw null;
                }
                String str = (String) next;
                final float fFloatValue = ((Number) ((s.b) list.get(i18)).d()).floatValue();
                final float f10 = (i18 - 1) * 62.0f;
                androidx.compose.ui.d dVarB3 = bVar4.b(aVar5, d.a.f14603b);
                kVarP.L(1916078996);
                boolean zH = kVarP.h(f10) | kVarP.h(fFloatValue) | kVarP.i(i18);
                Object objG5 = kVarP.g();
                if (zH || objG5 == obj) {
                    objG5 = new eh.l() { // from class: x8.j
                        @Override // eh.l
                        public final Object invoke(Object obj3) {
                            q1.l1 graphicsLayer = (q1.l1) obj3;
                            kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                            float fN0 = graphicsLayer.N0(f10);
                            float f11 = fFloatValue;
                            float f12 = 1.0f - f11;
                            graphicsLayer.j(fN0 * f12);
                            graphicsLayer.c(graphicsLayer.N0(70) * f11);
                            float f13 = 1.0f - (0.45f * f11);
                            graphicsLayer.h(f13);
                            graphicsLayer.d(f13);
                            graphicsLayer.b((i18 - 1) * 8.0f * f12);
                            graphicsLayer.f(1.0f - (jh.j.l((f11 - 0.75f) / 0.25f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * 0.8f));
                            return pg.f0.f21461a;
                        }
                    };
                    kVarP.C(objG5);
                }
                kVarP.T(false);
                androidx.compose.ui.d dVarB4 = androidx.compose.foundation.a.b(e1.d.d(androidx.compose.foundation.layout.g.o(androidx.compose.ui.graphics.a.a(dVarB3, (eh.l) objG5), 56, 72), h0.f.a(10)), q1.b1.f21650d, aVar3);
                g2.l0 l0VarD3 = z.g.d(d.a.f14602a, false);
                int i20 = kVarP.P;
                x0.a2 a2VarP4 = kVarP.P();
                androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(dVarB4, kVarP);
                i2.g.f13861o.getClass();
                e0.a aVar7 = g.a.f13863b;
                kVarP.r();
                if (kVarP.O) {
                    kVarP.w(aVar7);
                } else {
                    kVarP.z();
                }
                g.a.b bVar6 = g.a.f13867f;
                ph.v1.j(bVar6, l0VarD3, kVarP);
                g.a.d dVar2 = g.a.f13866e;
                ph.v1.j(dVar2, a2VarP4, kVarP);
                g.a.C0128a c0128a2 = g.a.f13868g;
                if (kVarP.O) {
                    it = it2;
                } else {
                    it = it2;
                    if (!kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i20))) {
                    }
                    g.a.c cVar2 = g.a.f13865d;
                    ph.v1.j(cVar2, dVarC4, kVarP);
                    float f11 = 5;
                    androidx.compose.foundation.layout.b bVar7 = bVar4;
                    z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.r(androidx.compose.foundation.layout.g.f975b, f11), q8.o1.b(str).f22292a, aVar3), kVarP, 0);
                    float f12 = 12;
                    d.a aVar8 = aVar5;
                    androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.f.l(aVar8, f12, f12, 8, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                    List list2 = list;
                    z.q qVarA2 = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
                    i11 = kVarP.P;
                    x0.a2 a2VarP5 = kVarP.P();
                    androidx.compose.ui.d dVarC5 = androidx.compose.ui.c.c(dVarL, kVarP);
                    kVarP.r();
                    if (kVarP.O) {
                        kVarP.z();
                    } else {
                        kVarP.w(aVar7);
                    }
                    ph.v1.j(bVar6, qVarA2, kVarP);
                    ph.v1.j(dVar2, a2VarP5, kVarP);
                    if (!kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i11))) {
                        org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a2);
                    }
                    ph.v1.j(cVar2, dVarC5, kVarP);
                    kVarP.L(160029);
                    i12 = 0;
                    while (i12 < 3) {
                        z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.layout.g.d(aVar8, i12 == 0 ? 1.0f : 0.7f), f11), c2.n0.c(4292533472L), h0.f.a(3)), kVarP, 0);
                        p1.d.b(androidx.compose.foundation.layout.g.f(aVar8, 6), kVarP);
                        i12++;
                    }
                    kVarP.T(false);
                    kVarP.T(true);
                    kVarP.T(true);
                    aVar5 = aVar8;
                    bVar4 = bVar7;
                    list = list2;
                    i18 = i19;
                    it2 = it;
                }
                org.bouncycastle.jcajce.provider.digest.e.a(i20, kVarP, i20, c0128a2);
                g.a.c cVar22 = g.a.f13865d;
                ph.v1.j(cVar22, dVarC4, kVarP);
                float f112 = 5;
                androidx.compose.foundation.layout.b bVar72 = bVar4;
                z.g.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.g.r(androidx.compose.foundation.layout.g.f975b, f112), q8.o1.b(str).f22292a, aVar3), kVarP, 0);
                float f122 = 12;
                d.a aVar82 = aVar5;
                androidx.compose.ui.d dVarL2 = androidx.compose.foundation.layout.f.l(aVar82, f122, f122, 8, CropImageView.DEFAULT_ASPECT_RATIO, 8);
                List list22 = list;
                z.q qVarA22 = z.o.a(z.b.f34446c, d.a.f14614m, kVarP, 0);
                i11 = kVarP.P;
                x0.a2 a2VarP52 = kVarP.P();
                androidx.compose.ui.d dVarC52 = androidx.compose.ui.c.c(dVarL2, kVarP);
                kVarP.r();
                if (kVarP.O) {
                }
                ph.v1.j(bVar6, qVarA22, kVarP);
                ph.v1.j(dVar2, a2VarP52, kVarP);
                if (!kVarP.O) {
                    org.bouncycastle.jcajce.provider.digest.e.a(i11, kVarP, i11, c0128a2);
                }
                ph.v1.j(cVar22, dVarC52, kVarP);
                kVarP.L(160029);
                i12 = 0;
                while (i12 < 3) {
                }
                kVarP.T(false);
                kVarP.T(true);
                kVarP.T(true);
                aVar5 = aVar82;
                bVar4 = bVar72;
                list = list22;
                i18 = i19;
                it2 = it;
            }
            d.a aVar9 = aVar5;
            kVarP.T(false);
            float f13 = 8;
            s.b bVar8 = bVar;
            t0.t4.b(p0.k4.a(), null, androidx.compose.foundation.layout.e.c(androidx.compose.foundation.layout.g.n(aVar9, 96), CropImageView.DEFAULT_ASPECT_RATIO, f13, 1), c2.n0.c(4294953293L), kVarP, 3504, 0);
            kVarP.T(true);
            float f14 = 20;
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar9, f14), kVarP);
            kVarP.L(1847057550);
            boolean zL3 = kVarP.l(bVar8);
            Object objG6 = kVarP.g();
            if (zL3 || objG6 == obj) {
                objG6 = new f9.e8(bVar8, 2);
                kVarP.C(objG6);
            }
            kVarP.T(false);
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.graphics.a.a(aVar9, (eh.l) objG6);
            z.q qVarA3 = z.o.a(z.b.f34446c, aVar6, kVarP, 48);
            int i21 = kVarP.P;
            x0.a2 a2VarP6 = kVarP.P();
            androidx.compose.ui.d dVarC6 = androidx.compose.ui.c.c(dVarA2, kVarP);
            i2.g.f13861o.getClass();
            e0.a aVar10 = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar10);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, qVarA3, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP6, kVarP);
            g.a.C0128a c0128a3 = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i21))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i21, kVarP, i21, c0128a3);
            }
            ph.v1.j(g.a.f13865d, dVarC6, kVarP);
            String strC = f3.q.c(R.string.folder_intro_title, kVarP);
            x0.e2 e2Var = of.f26647a;
            t2.l0 l0Var = ((nf) kVarP.f(e2Var)).f26544g;
            x2.p pVar = x2.p.f32033f;
            long j10 = q1.b1.f21650d;
            ff.b(strC, null, j10, 0L, pVar, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, l0Var, kVarP, 196992, 0, 64986);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar9, f13), kVarP);
            ff.b(f3.q.c(R.string.folder_intro_body, kVarP), null, q1.b1.c(0.85f, j10), 0L, null, null, 0L, new e3.h(3), 0L, 0, false, 0, 0, ((nf) kVarP.f(e2Var)).f26548k, kVarP, 384, 0, 65018);
            p1.d.b(androidx.compose.foundation.layout.g.f(aVar9, f14), kVarP);
            t0.x0.a(onCreate, null, ((Number) bVar8.d()).floatValue() > 0.5f, null, null, null, null, null, x8.b.f32268t, kVarP, ((i13 >> 3) & 14) | 805306368, 506);
            aVar = onCreate;
            x0.k kVar3 = kVarP;
            aVar2 = onLater;
            t0.x0.d(aVar2, null, ((Number) bVar8.d()).floatValue() > 0.5f, null, null, null, x8.b.f32269u, kVar3, ((i13 >> 6) & 14) | 805306368, 506);
            kVar3.T(true);
            kVar3.T(true);
            kVar3.T(true);
            kVar = kVar3;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(aVar2, i10) { // from class: x8.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.a f32835b;

                @Override // eh.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iN = f3.i.n(7);
                    s.c(this.f32834a, this.f32835b, (x0.j) obj3, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void d(final String title, String str, final eh.l<? super String, pg.f0> onConfirm, final eh.a<pg.f0> onDismiss, x0.j jVar, final int i10, final int i11) {
        String str2;
        int i12;
        final String str3;
        x0.k kVar;
        kotlin.jvm.internal.r.e(title, "title");
        kotlin.jvm.internal.r.e(onConfirm, "onConfirm");
        kotlin.jvm.internal.r.e(onDismiss, "onDismiss");
        x0.k kVarP = jVar.p(-1614580334);
        int i13 = i10 | (kVarP.K(title) ? 4 : 2);
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 = i13 | 48;
            str2 = str;
        } else {
            str2 = str;
            i12 = i13 | (kVarP.K(str2) ? 32 : 16);
        }
        int i15 = i12 | (kVarP.l(onConfirm) ? 256 : 128) | (kVarP.l(onDismiss) ? 2048 : 1024);
        if ((i15 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
            str3 = str2;
            kVar = kVarP;
        } else {
            str3 = i14 != 0 ? "" : str2;
            Object[] objArr = new Object[0];
            kVarP.L(-1905573828);
            boolean z10 = (i15 & 112) == 32;
            Object objG = kVarP.g();
            if (z10 || objG == j.a.f31715a) {
                objG = new j9.i0(str3, 1);
                kVarP.C(objG);
            }
            kVarP.T(false);
            x0.n1 n1Var = (x0.n1) b0.a0.d(objArr, null, (eh.a) objG, kVarP, 0, 6);
            kVar = kVarP;
            t0.r.a(onDismiss, f1.c.b(1698728522, new d(onConfirm, n1Var), kVarP), null, f1.c.b(2109338888, new e(onDismiss), kVarP), null, f1.c.b(-1775018042, new f(title), kVarP), f1.c.b(577770789, new g(n1Var), kVarP), null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25770p, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, kVar, ((i15 >> 9) & 14) | 1772592, 0, 16020);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(title, str3, onConfirm, onDismiss, i10, i11) { // from class: x8.r

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f33111a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f33112b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f33113c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f33114d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f33115e;

                {
                    this.f33115e = i11;
                }

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    s.d(this.f33111a, this.f33112b, this.f33113c, this.f33114d, (x0.j) obj, iN, this.f33115e);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [x0.j, x0.k] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public static final void e(final List folders, final Map projectCounts, final Long l10, final eh.p onTileBounds, final eh.l onOpen, final eh.a onCreate, final eh.l onReorder, final s.b entranceAnim, final b0.m0 listState, androidx.compose.ui.d dVar, x0.j jVar, final int i10) {
        ?? arrayList;
        x0.n1 n1Var;
        Object b0Var;
        int i11;
        boolean z10;
        int i12;
        x0.k kVar;
        int i13;
        final androidx.compose.ui.d dVar2;
        kotlin.jvm.internal.r.e(folders, "folders");
        kotlin.jvm.internal.r.e(projectCounts, "projectCounts");
        kotlin.jvm.internal.r.e(onTileBounds, "onTileBounds");
        kotlin.jvm.internal.r.e(onOpen, "onOpen");
        kotlin.jvm.internal.r.e(onCreate, "onCreate");
        kotlin.jvm.internal.r.e(onReorder, "onReorder");
        kotlin.jvm.internal.r.e(entranceAnim, "entranceAnim");
        kotlin.jvm.internal.r.e(listState, "listState");
        ?? P = jVar.p(-1091467532);
        int i14 = i10 | (P.l(folders) ? 4 : 2) | (P.l(projectCounts) ? 32 : 16) | (P.K(l10) ? 256 : 128) | (P.l(onTileBounds) ? 2048 : 1024) | (P.l(onOpen) ? 16384 : 8192) | (P.l(onCreate) ? 131072 : 65536) | (P.l(onReorder) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (P.l(entranceAnim) ? 8388608 : 4194304) | (P.K(listState) ? 67108864 : 33554432) | 805306368;
        if ((306783379 & i14) == 306783378 && P.s()) {
            P.v();
            dVar2 = dVar;
            kVar = P;
        } else {
            y1.a aVar = (y1.a) P.f(j2.j2.f14783l);
            P.L(1113452794);
            Object objG = P.g();
            Object obj = j.a.f31715a;
            if (objG == obj) {
                objG = bg.b.h(null);
                P.C(objG);
            }
            x0.n1 n1Var2 = (x0.n1) objG;
            Object objA = p0.h.a(P, false, 1113454996);
            if (objA == obj) {
                objA = bg.b.h(null);
                P.C(objA);
            }
            x0.n1 n1Var3 = (x0.n1) objA;
            Object objA2 = p0.h.a(P, false, 1113457040);
            if (objA2 == obj) {
                objA2 = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
                P.C(objA2);
            }
            P.T(false);
            int iA = qg.j0.a(qg.p.h(folders, 10));
            x0.k1 k1Var = (x0.k1) objA2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            Iterator it = folders.iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                Object next = it2.next();
                linkedHashMap.put(Long.valueOf(((FolderEntity) next).getId()), next);
                it = it2;
            }
            List list = (List) n1Var2.getValue();
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Iterator it4 = it3;
                    FolderEntity folderEntity = (FolderEntity) linkedHashMap.get(Long.valueOf(((Number) it3.next()).longValue()));
                    if (folderEntity != null) {
                        arrayList.add(folderEntity);
                    }
                    it3 = it4;
                }
            } else {
                arrayList = folders;
            }
            x0.n1 n1VarK = bg.b.k(arrayList, P);
            x0.n1 n1VarK2 = bg.b.k(onReorder, P);
            x0.n1 n1VarK3 = bg.b.k(folders, P);
            P.L(1113470666);
            boolean zL = P.l(folders);
            Object objG2 = P.g();
            if (zL || objG2 == obj) {
                objG2 = new x(folders, n1Var3, n1Var2, null);
                P.C(objG2);
            }
            P.T(false);
            x0.o0.d((eh.p) objG2, folders, P);
            b.i iVarH = z.b.h(10);
            pg.f0 f0Var = pg.f0.f21461a;
            P.L(1113480176);
            int i15 = 234881024 & i14;
            boolean zK = (i15 == 67108864) | P.K(n1VarK) | P.l(aVar) | P.K(n1VarK3) | P.K(n1VarK2);
            Object objG3 = P.g();
            if (zK || objG3 == obj) {
                n1Var = n1Var3;
                i11 = 256;
                z10 = false;
                i12 = 2048;
                b0Var = new b0(listState, n1VarK, aVar, n1Var, n1Var2, k1Var, n1VarK3, n1VarK2);
                k1Var = k1Var;
                P.C(b0Var);
            } else {
                b0Var = objG3;
                n1Var = n1Var3;
                z10 = false;
                i11 = 256;
                i12 = 2048;
            }
            P.T(z10);
            d.a aVar2 = d.a.f1143b;
            androidx.compose.ui.d dVarA = c2.s0.a(aVar2, f0Var, (PointerInputEventHandler) b0Var);
            P.L(1113540094);
            boolean zL2 = ((i14 & 896) == i11 ? true : z10) | P.l(arrayList) | ((i14 & V4Signature.MAX_SIGNING_INFOS_SIZE) == i12 ? true : z10) | (((29360128 & i14) == 8388608 || P.l(entranceAnim)) ? true : z10) | (i15 == 67108864 ? true : z10) | ((57344 & i14) == 16384 ? true : z10) | P.l(projectCounts) | ((458752 & i14) != 131072 ? z10 : true);
            Object objG4 = P.g();
            if (zL2 || objG4 == obj) {
                kVar = P;
                i13 = i14;
                final List list2 = arrayList;
                final x0.n1 n1Var4 = n1Var;
                final x0.k1 k1Var2 = k1Var;
                eh.l lVar = new eh.l() { // from class: x8.o
                    @Override // eh.l
                    public final Object invoke(Object obj2) {
                        b0.j0 LazyRow = (b0.j0) obj2;
                        kotlin.jvm.internal.r.e(LazyRow, "$this$LazyRow");
                        q qVar = new q();
                        List list3 = list2;
                        int size = list3.size();
                        r.u uVar = new r.u(1, qVar, list3);
                        r.v vVar = new r.v(1, j0.f32756a, list3);
                        Long l11 = l10;
                        eh.p pVar = onTileBounds;
                        s.b bVar = entranceAnim;
                        LazyRow.d(size, uVar, vVar, new f1.b(-632812321, true, new k0(list3, l11, pVar, bVar, listState, onOpen, n1Var4, k1Var2, projectCounts)));
                        b0.j0.b(LazyRow, null, new f1.b(-1021068457, true, new i0(bVar, onCreate)), 3);
                        return pg.f0.f21461a;
                    }
                };
                kVar.C(lVar);
                objG4 = lVar;
            } else {
                kVar = P;
                i13 = i14;
            }
            kVar.T(z10);
            b0.d.b(dVarA, listState, null, iVarH, null, null, false, null, (eh.l) objG4, kVar, ((i13 >> 21) & 112) | 24576, 492);
            dVar2 = aVar2;
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(folders, projectCounts, l10, onTileBounds, onOpen, onCreate, onReorder, entranceAnim, listState, dVar2, i10) { // from class: x8.p

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f33060a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Map f33061b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Long f33062c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.p f33063d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.l f33064e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ eh.a f33065f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ eh.l f33066g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ s.b f33067h;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ b0.m0 f33068j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.d f33069k;

                @Override // eh.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iN = f3.i.n(16777217);
                    s.e(this.f33060a, this.f33061b, this.f33062c, this.f33063d, this.f33064e, this.f33065f, this.f33066g, this.f33067h, this.f33068j, this.f33069k, (x0.j) obj2, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void f(final String str, final Map<String, Integer> counts, final boolean z10, final eh.l<? super String, pg.f0> onSelect, x0.j jVar, final int i10) {
        kotlin.jvm.internal.r.e(counts, "counts");
        kotlin.jvm.internal.r.e(onSelect, "onSelect");
        x0.k kVarP = jVar.p(1241658956);
        int i11 = i10 | (kVarP.K(str) ? 4 : 2) | (kVarP.l(counts) ? 32 : 16) | (kVarP.c(z10) ? 256 : 128) | (kVarP.l(onSelect) ? 2048 : 1024);
        if ((i11 & 1171) == 1170 && kVarP.s()) {
            kVarP.v();
        } else {
            b.i iVarH = z.b.h(8);
            z.g1 g1VarC = androidx.compose.foundation.layout.f.c(CropImageView.DEFAULT_ASPECT_RATIO, 2, 1);
            kVarP.L(1457638177);
            boolean zL = ((i11 & 14) == 4) | ((i11 & V4Signature.MAX_SIGNING_INFOS_SIZE) == 2048) | kVarP.l(counts) | ((i11 & 896) == 256);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new eh.l() { // from class: x8.f
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        b0.j0 LazyRow = (b0.j0) obj;
                        kotlin.jvm.internal.r.e(LazyRow, "$this$LazyRow");
                        eh.l lVar = onSelect;
                        String str2 = str;
                        b0.j0.b(LazyRow, null, new f1.b(-808998583, true, new s.h(lVar, str2)), 3);
                        List<String> all = ProjectKind.INSTANCE.getAll();
                        LazyRow.d(all.size(), null, new s.m(s.l.f33157a, all), new f1.b(-632812321, true, new s.n(all, counts, str2, lVar, z10)));
                        return pg.f0.f21461a;
                    }
                };
                kVarP.C(objG);
            }
            kVarP.T(false);
            b0.d.b(null, null, g1VarC, iVarH, null, null, false, null, (eh.l) objG, kVarP, 24960, 491);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(str, counts, z10, onSelect, i10) { // from class: x8.l

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f32900a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Map f32901b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f32902c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.l f32903d;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    s.f(this.f32900a, this.f32901b, this.f32902c, this.f32903d, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void g(final List<FolderEntity> folders, final Long l10, final eh.l<? super Long, pg.f0> onMove, final eh.a<pg.f0> onCreateFolder, final eh.a<pg.f0> onDismiss, x0.j jVar, final int i10) {
        x0.k kVar;
        kotlin.jvm.internal.r.e(folders, "folders");
        kotlin.jvm.internal.r.e(onMove, "onMove");
        kotlin.jvm.internal.r.e(onCreateFolder, "onCreateFolder");
        kotlin.jvm.internal.r.e(onDismiss, "onDismiss");
        x0.k kVarP = jVar.p(2143235488);
        int i11 = i10 | (kVarP.l(folders) ? 4 : 2) | (kVarP.K(l10) ? 32 : 16) | (kVarP.l(onMove) ? 256 : 128) | (kVarP.l(onCreateFolder) ? 2048 : 1024) | (kVarP.l(onDismiss) ? 16384 : 8192);
        if ((i11 & 9363) == 9362 && kVarP.s()) {
            kVarP.v();
            kVar = kVarP;
        } else {
            kVar = kVarP;
            t0.p7.a(onDismiss, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, ((t0.e2) kVarP.f(t0.f2.f25858a)).f25770p, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, f1.c.b(1191749283, new o(l10, onMove, folders, onCreateFolder), kVarP), kVar, (i11 >> 12) & 14, 4062);
        }
        x0.h2 h2VarV = kVar.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(folders, l10, onMove, onCreateFolder, onDismiss, i10) { // from class: x8.h

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f32696a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Long f32697b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ eh.l f32698c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ eh.a f32699d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ eh.a f32700e;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    s.g(this.f32696a, this.f32697b, this.f32698c, this.f32699d, this.f32700e, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
