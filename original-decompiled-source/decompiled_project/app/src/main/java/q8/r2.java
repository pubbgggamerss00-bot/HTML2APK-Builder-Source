package q8;

import h8.m;
import org.bouncycastle.asn1.cmc.BodyPartID;
import t8.y3;

/* loaded from: classes.dex */
public final /* synthetic */ class r2 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22378b;

    public /* synthetic */ r2(Object obj, int i10) {
        this.f22377a = i10;
        this.f22378b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f22377a) {
            case 0:
                s.b bVar = (s.b) this.f22378b;
                f3.d offset = (f3.d) obj;
                kotlin.jvm.internal.r.e(offset, "$this$offset");
                return new f3.m((0 << 32) | (gh.a.b(((Number) bVar.d()).floatValue()) & BodyPartID.bodyIdMax));
            default:
                y3 y3Var = (y3) obj;
                return y3.a(y3Var, null, null, null, null, null, null, false, null, null, qg.x.O(((m.a) this.f22378b).f12421a, y3Var.f28595o), null, 0, null, null, null, 4145151);
        }
    }
}
