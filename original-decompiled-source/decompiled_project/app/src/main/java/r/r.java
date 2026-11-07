package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.s implements eh.l<Integer, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s8.c2 f22912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f22913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s8.c2 c2Var, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        super(1);
        this.f22912a = c2Var;
        this.f22913b = animatedContentTransitionScopeImpl;
    }

    @Override // eh.l
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        long j10 = iIntValue;
        long j11 = (j10 << 32) | (j10 & BodyPartID.bodyIdMax);
        AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.f22913b;
        return (Integer) this.f22912a.invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.f726b.a(j11, AnimatedContentTransitionScopeImpl.f(animatedContentTransitionScopeImpl), f3.r.f8828a) >> 32))) - iIntValue));
    }
}
