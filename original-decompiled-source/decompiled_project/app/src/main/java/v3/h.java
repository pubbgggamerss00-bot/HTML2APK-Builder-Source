package v3;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import v3.j;

/* loaded from: classes.dex */
public final class h implements Callable<j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f30580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f30581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f30582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30583d;

    public h(String str, Context context, ArrayList arrayList, int i10) {
        this.f30580a = str;
        this.f30581b = context;
        this.f30582c = arrayList;
        this.f30583d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final j.a call() throws Exception {
        try {
            return j.b(this.f30580a, this.f30581b, this.f30582c, this.f30583d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
