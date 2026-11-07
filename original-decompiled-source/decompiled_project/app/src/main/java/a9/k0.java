package a9;

import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247a;

    public /* synthetic */ k0(int i10) {
        this.f247a = i10;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f247a) {
            case 0:
                return bg.b.h(Boolean.FALSE);
            default:
                return new v7.b(new OkHttpClient());
        }
    }
}
