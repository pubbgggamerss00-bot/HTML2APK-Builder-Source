package f9;

import kotlinx.serialization.PolymorphicSerializer;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final /* synthetic */ class yc implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11034b;

    public /* synthetic */ yc(Object obj, int i10) {
        this.f11033a = i10;
        this.f11034b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f11033a;
        Object obj2 = this.f11034b;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                sh.z0 z0Var = ((fg) obj2).F0;
                z0Var.getClass();
                z0Var.j(null, bool);
                return pg.f0.f21461a;
            case 1:
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                return Boolean.valueOf(((mh.k) obj2).a(it));
            case 2:
                int i11 = (int) (((f3.p) obj).f8826a & BodyPartID.bodyIdMax);
                mh.k kVar = t8.v2.f28495e;
                ((x0.l1) obj2).f(i11);
                return pg.f0.f21461a;
            default:
                return PolymorphicSerializer.descriptor_delegate$lambda$1$lambda$0((PolymorphicSerializer) obj2, (bi.a) obj);
        }
    }
}
