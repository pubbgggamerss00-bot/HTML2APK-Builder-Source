package j2;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class z5 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.c f15021a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(rh.c cVar, Handler handler) {
        super(handler);
        this.f15021a = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        this.f15021a.g(pg.f0.f21461a);
    }
}
