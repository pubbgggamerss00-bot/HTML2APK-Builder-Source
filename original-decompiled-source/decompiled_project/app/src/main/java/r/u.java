package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.r3;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22954c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, Object obj, Object obj2) {
        super(1);
        this.f22952a = i10;
        this.f22953b = obj;
        this.f22954c = obj2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f22952a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) this.f22953b;
                r3 r3Var = (r3) animatedContentTransitionScopeImpl.f729e.d(animatedContentTransitionScopeImpl.f725a.f24004d.getValue());
                long j10 = iIntValue;
                return (Integer) ((b9.w0) this.f22954c).invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.f726b.a((j10 << 32) | (j10 & BodyPartID.bodyIdMax), r3Var != null ? ((f3.p) r3Var.getValue()).f8826a : 0L, f3.r.f8828a) & BodyPartID.bodyIdMax))) - iIntValue));
            default:
                return ((x8.q) this.f22953b).invoke(((List) this.f22954c).get(((Number) obj).intValue()));
        }
    }
}
