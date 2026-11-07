package h9;

import androidx.room.a;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12825c;

    public /* synthetic */ v0(String str, int i10, Object obj) {
        this.f12823a = i10;
        this.f12825c = obj;
        this.f12824b = str;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12823a) {
            case 0:
                ((eh.l) this.f12825c).invoke(this.f12824b);
                return pg.f0.f21461a;
            default:
                return ((a.C0039a) this.f12825c).a(this.f12824b);
        }
    }
}
