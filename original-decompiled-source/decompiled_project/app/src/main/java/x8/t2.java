package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class t2 implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f33189a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33190b;

    public t2(n8 n8Var, ProjectEntity projectEntity) {
        this.f33189a = n8Var;
        this.f33190b = projectEntity;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        q1.l1 graphicsLayer = l1Var;
        kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
        long jI = this.f33189a.i(this.f33190b.getId());
        graphicsLayer.j(Float.intBitsToFloat((int) (jI >> 32)));
        graphicsLayer.c(Float.intBitsToFloat((int) (jI & BodyPartID.bodyIdMax)));
        return pg.f0.f21461a;
    }
}
