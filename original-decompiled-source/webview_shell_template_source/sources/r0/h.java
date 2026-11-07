package r0;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;
import r0.j;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h implements Callable<j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f14236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f14237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14238d;

    public h(String str, Context context, List list, int i6) {
        this.f14235a = str;
        this.f14236b = context;
        this.f14237c = list;
        this.f14238d = i6;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() {
        try {
            return j.b(this.f14235a, this.f14236b, this.f14237c, this.f14238d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
