package r;

import com.yalantis.ucrop.view.CropImageView;
import j1.d;
import j1.f;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.o2 f22973a;

    /* renamed from: b, reason: collision with root package name */
    public static final s.l1<Float> f22974b;

    /* renamed from: c, reason: collision with root package name */
    public static final s.l1<f3.m> f22975c;

    /* renamed from: d, reason: collision with root package name */
    public static final s.l1<f3.p> f22976d;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<q1.l2, s.p> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f22977a = new a(1);

        @Override // eh.l
        public final s.p invoke(q1.l2 l2Var) {
            long j10 = l2Var.f21720a;
            return new s.p(q1.l2.b(j10), q1.l2.c(j10));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<s.p, q1.l2> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f22978a = new b(1);

        @Override // eh.l
        public final q1.l2 invoke(s.p pVar) {
            s.p pVar2 = pVar;
            return new q1.l2(b3.e.a(pVar2.f23859a, pVar2.f23860b));
        }
    }

    static {
        s.o2 o2Var = s.p2.f23868a;
        f22973a = new s.o2(a.f22977a, b.f22978a);
        f22974b = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
        long j10 = 1;
        long j11 = (j10 & BodyPartID.bodyIdMax) | (j10 << 32);
        f22975c = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.m(j11), 1);
        f22976d = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.p(j11), 1);
    }

    public static final v1 a(eh.l lVar, j1.d dVar, s.e0 e0Var) {
        return new v1(new p2((y1) null, (l2) null, new j0(lVar, dVar, e0Var), (f2) null, (LinkedHashMap) null, 59));
    }

    public static v1 b(s.m2 m2Var, int i10) {
        s.e0 e0VarC = m2Var;
        if ((i10 & 1) != 0) {
            long j10 = 1;
            e0VarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.p((j10 & BodyPartID.bodyIdMax) | (j10 << 32)), 1);
        }
        Object obj = d.a.f14611j;
        f.b bVar = d.a.f14613l;
        return a(new j1(i1.f22853a), bVar.equals(obj) ? d.a.f14603b : bVar.equals(bVar) ? d.a.f14609h : d.a.f14606e, e0VarC);
    }

    public static v1 c(s.m2 m2Var, int i10) {
        s.e0 e0VarC = m2Var;
        if ((i10 & 1) != 0) {
            e0VarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
        }
        return new v1(new p2(new y1(e0VarC), (l2) null, (j0) null, (f2) null, (LinkedHashMap) null, 62));
    }

    public static x1 d(s.m2 m2Var, int i10) {
        s.e0 e0VarC = m2Var;
        if ((i10 & 1) != 0) {
            e0VarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, null, 5);
        }
        return new x1(new p2(new y1(e0VarC), (l2) null, (j0) null, (f2) null, (LinkedHashMap) null, 62));
    }

    public static v1 e(s.e0 e0Var, float f10, long j10, int i10) {
        if ((i10 & 2) != 0) {
            f10 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        if ((i10 & 4) != 0) {
            j10 = q1.l2.f21718b;
        }
        return new v1(new p2((y1) null, (l2) null, (j0) null, new f2(f10, j10, e0Var), (LinkedHashMap) null, 55));
    }

    public static final x1 f(eh.l lVar, j1.d dVar, s.e0 e0Var) {
        return new x1(new p2((y1) null, (l2) null, new j0(lVar, dVar, e0Var), (f2) null, (LinkedHashMap) null, 59));
    }

    public static x1 g(s.m2 m2Var, int i10) {
        s.e0 e0VarC = m2Var;
        if ((i10 & 1) != 0) {
            long j10 = 1;
            e0VarC = s.m.c(CropImageView.DEFAULT_ASPECT_RATIO, 400.0f, new f3.p((j10 & BodyPartID.bodyIdMax) | (j10 << 32)), 1);
        }
        Object obj = d.a.f14611j;
        f.b bVar = d.a.f14613l;
        return f(new o1(n1.f22892a), bVar.equals(obj) ? d.a.f14603b : bVar.equals(bVar) ? d.a.f14609h : d.a.f14606e, e0VarC);
    }
}
