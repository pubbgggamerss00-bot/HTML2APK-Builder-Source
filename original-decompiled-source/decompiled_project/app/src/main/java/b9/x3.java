package b9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b9.e3;

/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4150c;

    public /* synthetic */ x3(int i10, Object obj, Object obj2) {
        this.f4148a = i10;
        this.f4149b = obj;
        this.f4150c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f4148a) {
            case 0:
                e3.a aVar = (e3.a) this.f4149b;
                try {
                    ((Context) this.f4150c).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aVar.f3800d)));
                } catch (Exception unused) {
                }
                break;
            default:
                ((h1.u) this.f4149b).remove((q8.d1) this.f4150c);
                break;
        }
        return pg.f0.f21461a;
    }
}
