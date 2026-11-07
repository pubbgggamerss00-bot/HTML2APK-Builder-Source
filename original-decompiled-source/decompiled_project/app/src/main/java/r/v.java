package r;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.r3;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22960a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        super(1);
        this.f22960a = i10;
        this.f22961b = obj;
        this.f22962c = obj2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f22960a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) this.f22961b;
                r3 r3Var = (r3) animatedContentTransitionScopeImpl.f729e.d(animatedContentTransitionScopeImpl.f725a.f24004d.getValue());
                long j10 = r3Var != null ? ((f3.p) r3Var.getValue()).f8826a : 0L;
                long j11 = iIntValue;
                return (Integer) ((b9.w0) this.f22962c).invoke(Integer.valueOf((-((int) (animatedContentTransitionScopeImpl.f726b.a((j11 << 32) | (j11 & BodyPartID.bodyIdMax), j10, f3.r.f8828a) & BodyPartID.bodyIdMax))) + ((int) (j10 & BodyPartID.bodyIdMax))));
            default:
                return ((eh.l) this.f22961b).invoke(((List) this.f22962c).get(((Number) obj).intValue()));
        }
    }
}
