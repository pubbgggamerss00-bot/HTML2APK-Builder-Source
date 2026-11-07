package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.r3;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.s implements eh.l<Integer, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f22926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9.w0 f22927b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, b9.w0 w0Var) {
        super(1);
        this.f22926a = animatedContentTransitionScopeImpl;
        this.f22927b = w0Var;
    }

    @Override // eh.l
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.f22926a;
        r3<f3.p> r3VarD = animatedContentTransitionScopeImpl.f729e.d(animatedContentTransitionScopeImpl.f725a.f24004d.getValue());
        long j10 = r3VarD != null ? r3VarD.getValue().f8826a : 0L;
        long j11 = iIntValue;
        return (Integer) this.f22927b.invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.f726b.a((j11 << 32) | (j11 & BodyPartID.bodyIdMax), j10, f3.r.f8828a) >> 32))) + ((int) (j10 >> 32))));
    }
}
