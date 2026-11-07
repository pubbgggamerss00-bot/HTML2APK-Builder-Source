package b9;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class d4 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3790a;

    public /* synthetic */ d4(int i10) {
        this.f3790a = i10;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f3790a) {
            case 0:
                File it = (File) obj;
                kotlin.jvm.internal.r.e(it, "it");
                return Boolean.valueOf(it.isFile());
            case 1:
                mh.h it2 = (mh.h) obj;
                kotlin.jvm.internal.r.e(it2, "it");
                return new h8.w(it2.a().get(1), it2.a().get(2));
            default:
                return t8.y3.a((t8.y3) obj, null, null, null, null, null, null, false, null, null, null, null, 0, null, null, null, 4193663);
        }
    }
}
