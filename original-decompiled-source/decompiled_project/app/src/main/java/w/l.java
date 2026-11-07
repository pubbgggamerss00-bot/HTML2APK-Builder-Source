package w;

import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.s;
import pg.f0;
import v.b1;

/* loaded from: classes.dex */
public final class l extends s implements eh.l<s.k<Float, s.o>, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f31025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f31026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f31027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, f0> f31028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(float f10, d0 d0Var, b1 b1Var, eh.l<? super Float, f0> lVar) {
        super(1);
        this.f31025a = f10;
        this.f31026b = d0Var;
        this.f31027c = b1Var;
        this.f31028d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final f0 invoke(s.k<Float, s.o> kVar) {
        float fE;
        s.k<Float, s.o> kVar2 = kVar;
        float fD = m.d(((Number) kVar2.f23791e.getValue()).floatValue(), this.f31025a);
        d0 d0Var = this.f31026b;
        float f10 = fD - d0Var.f16322a;
        try {
            fE = this.f31027c.e(f10);
        } catch (CancellationException unused) {
            kVar2.a();
            fE = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        this.f31028d.invoke(Float.valueOf(fE));
        if (Math.abs(f10 - fE) > 0.5f || fD != ((Number) kVar2.f23791e.getValue()).floatValue()) {
            kVar2.a();
        }
        d0Var.f16322a += fE;
        return f0.f21461a;
    }
}
