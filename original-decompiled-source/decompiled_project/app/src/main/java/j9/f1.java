package j9;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.r3;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15400c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(int i10, Object obj, Object obj2) {
        super(1);
        this.f15398a = i10;
        this.f15399b = obj;
        this.f15400c = obj2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f15398a) {
            case 0:
                return ((eh.l) this.f15399b).invoke(((List) this.f15400c).get(((Number) obj).intValue()));
            default:
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) this.f15399b;
                r3 r3Var = (r3) animatedContentTransitionScopeImpl.f729e.d(animatedContentTransitionScopeImpl.f725a.f24004d.getValue());
                long j10 = iIntValue;
                return (Integer) ((b9.w0) this.f15400c).invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.f726b.a((j10 << 32) | (j10 & BodyPartID.bodyIdMax), r3Var != null ? ((f3.p) r3Var.getValue()).f8826a : 0L, f3.r.f8828a) >> 32))) - iIntValue));
        }
    }
}
