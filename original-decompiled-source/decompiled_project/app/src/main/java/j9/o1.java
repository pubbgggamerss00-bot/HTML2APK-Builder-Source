package j9;

import android.net.Uri;
import s8.e2;

/* loaded from: classes.dex */
public final class o1 implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.x f15486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15487b;

    public o1(String str, p5.x xVar) {
        this.f15486a = xVar;
        this.f15487b = str;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        e2.a0.f24630c.getClass();
        p5.x.c("templates_api_list/" + Uri.encode(this.f15487b), this.f15486a);
        return pg.f0.f21461a;
    }
}
