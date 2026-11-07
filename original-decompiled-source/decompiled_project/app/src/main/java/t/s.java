package t;

import org.bouncycastle.asn1.cmc.BodyPartID;
import s1.a;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.u0 f25332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f25334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f25335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f25336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f25337g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.i f25338h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z10, q1.u0 u0Var, long j10, float f10, float f11, long j11, long j12, s1.i iVar) {
        super(1);
        this.f25331a = z10;
        this.f25332b = u0Var;
        this.f25333c = j10;
        this.f25334d = f10;
        this.f25335e = f11;
        this.f25336f = j11;
        this.f25337g = j12;
        this.f25338h = iVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        cVar2.z1();
        if (this.f25331a) {
            s1.e.a1(cVar2, this.f25332b, 0L, 0L, this.f25333c, null, 246);
        } else {
            long j10 = this.f25333c;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float f10 = this.f25334d;
            if (fIntBitsToFloat < f10) {
                float f11 = this.f25335e;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar2.i() >> 32));
                float f12 = this.f25335e;
                float f13 = fIntBitsToFloat2 - f12;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar2.i() & BodyPartID.bodyIdMax)) - f12;
                q1.u0 u0Var = this.f25332b;
                long j11 = this.f25333c;
                a.b bVarQ0 = cVar2.Q0();
                long jD = bVarQ0.d();
                bVarQ0.a().d();
                try {
                    bVarQ0.f24180a.b(f11, f11, f13, fIntBitsToFloat3, 0);
                    s1.e.a1(cVar2, u0Var, 0L, 0L, j11, null, 246);
                } finally {
                    r.a(bVarQ0, jD);
                }
            } else {
                s1.e.a1(cVar2, this.f25332b, this.f25336f, this.f25337g, o.c(f10, j10), this.f25338h, 208);
            }
        }
        return pg.f0.f21461a;
    }
}
