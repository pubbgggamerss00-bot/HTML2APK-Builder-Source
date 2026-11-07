package b9;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4101b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.f4100a = i10;
        this.f4101b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f4100a;
        Object obj = this.f4101b;
        switch (i10) {
            case 0:
                ((x0.n1) obj).setValue(Boolean.FALSE);
                return pg.f0.f21461a;
            case 1:
                List<String> list = f9.d1.f9265a;
                ((x0.n1) obj).setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
                return pg.f0.f21461a;
            default:
                String str = ((p5.h0) obj).f21216a;
                return Boolean.valueOf(str != null && p5.h0.f21215r.e(str));
        }
    }
}
