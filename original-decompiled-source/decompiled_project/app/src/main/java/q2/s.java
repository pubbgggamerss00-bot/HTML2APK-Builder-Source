package q2;

import pg.f0;
import s.y1;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21807b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, int i10) {
        super(1);
        this.f21806a = i10;
        this.f21807b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f21806a) {
            case 0:
                a0.d((d0) obj, (String) this.f21807b);
                return f0.f21461a;
            default:
                return Boolean.valueOf(!kotlin.jvm.internal.r.a(obj, ((y1) this.f21807b).f24004d.getValue()));
        }
    }
}
