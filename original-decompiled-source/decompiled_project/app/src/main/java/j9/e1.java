package j9;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import s8.c2;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l f15358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(eh.l lVar, Object obj, int i10) {
        super(1);
        this.f15357a = i10;
        this.f15358b = lVar;
        this.f15359c = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f15357a) {
            case 0:
                return ((a1) this.f15358b).invoke(((List) this.f15359c).get(((Number) obj).intValue()));
            default:
                int iIntValue = ((Number) obj).intValue();
                c2 c2Var = (c2) this.f15358b;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) this.f15359c;
                long j10 = iIntValue;
                return (Integer) c2Var.invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.f726b.a((j10 << 32) | (j10 & BodyPartID.bodyIdMax), AnimatedContentTransitionScopeImpl.f(animatedContentTransitionScopeImpl), f3.r.f8828a) & BodyPartID.bodyIdMax))) - iIntValue));
        }
    }
}
