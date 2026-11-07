package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements eh.l<Integer, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s8.c2 f22918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl<Object> f22919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(s8.c2 c2Var, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        super(1);
        this.f22918a = c2Var;
        this.f22919b = animatedContentTransitionScopeImpl;
    }

    @Override // eh.l
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        AnimatedContentTransitionScopeImpl<Object> animatedContentTransitionScopeImpl = this.f22919b;
        long j10 = iIntValue;
        return (Integer) this.f22918a.invoke(Integer.valueOf(((int) (AnimatedContentTransitionScopeImpl.f(animatedContentTransitionScopeImpl) & BodyPartID.bodyIdMax)) - ((int) (animatedContentTransitionScopeImpl.f726b.a((j10 << 32) | (j10 & BodyPartID.bodyIdMax), AnimatedContentTransitionScopeImpl.f(animatedContentTransitionScopeImpl), f3.r.f8828a) & BodyPartID.bodyIdMax))));
    }
}
